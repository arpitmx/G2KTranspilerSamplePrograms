import org.antlr.v4.runtime.*
import GroovyGradleParser.STRING_LITERAL
import org.antlr.v4.runtime.tree.TerminalNode
import GroovyGradleParser.*
import org.antlr.v4.runtime.tree.ParseTree


fun main(args: Array<String>) {

    val input = """
         dependencies {
         implementation 'com.example:library:1.0'
         }
         """.trimMargin()

    println("Input Groovy (sample.gradle): \n\n${input}\n\n")
    val lexer = GroovyGradleLexer(CharStreams.fromString(input)) // Generated Lexer
    val tokens = CommonTokenStream(lexer)
    val parser = GroovyGradleParser(tokens) // GroovyGradle Parser
    parser.removeErrorListeners() // remove default error listeners
    val errorListener = SyntaxErrorListener()
    parser.addErrorListener(errorListener) // add custom error listener
    val tree = parser.dependencies_section() // start parsing from dependencies_section rule

    if (errorListener.hasSyntaxErrors()) {
        println("Groovy syntax errors found:")
        for (error in errorListener.getSyntaxErrors()) {
            println(error)
        }
    } else {

        val kotlinCode = generateKotlinCode(tree)
        print("Output -> Kotlin DSL (sample.gradle.kts):\n\n\t$kotlinCode")

    }
    }


class SyntaxErrorListener : BaseErrorListener() {
    private val syntaxErrors = mutableListOf<String>()

    fun hasSyntaxErrors() = syntaxErrors.isNotEmpty()
    fun getSyntaxErrors() = syntaxErrors.toList()

    override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, position: Int, msg: String?, e: RecognitionException?) {
        syntaxErrors.add("line $line:$position $msg")
    }
}

fun generateKotlinCode(tree: ParseTree): String {
    val codeGenerator = GroovyGradleCodeGenerator()
    return codeGenerator.visit(tree)
}

class GroovyGradleCodeGenerator : GroovyGradleBaseVisitor<String>() {
    override fun visitDependencies_section(ctx: Dependencies_sectionContext): String {
        val dependenciesCode = ctx.dependency().joinToString(separator = "") {
            visitDependency(it)
        }
        return "dependencies {\n$dependenciesCode \n}"
    }


    override fun visitDependency(ctx: DependencyContext): String {
        val ctxKeyword = ctx.children[0].text.trim()
        val dependencyType = when (ctxKeyword) {
            "implementation" -> "implementation"
            "testImplementation" -> "testImplementation"
            "androidTestImplementation" -> "androidTestImplementation"
            else -> throw IllegalStateException("Unknown dependency type")
        }
        val stringValue = ctx.STRING_LITERAL().text.replace("'", "\"")
        return " \t$dependencyType($stringValue)\n"
    }
}

