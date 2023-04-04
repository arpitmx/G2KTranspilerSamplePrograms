// Generated from /Users/apple/IdeaProjects/G2KTranspilerSample/src/main/kotlin/GroovyGradle.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GroovyGradleParser}.
 */
public interface GroovyGradleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GroovyGradleParser#dependencies_section}.
	 * @param ctx the parse tree
	 */
	void enterDependencies_section(GroovyGradleParser.Dependencies_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyGradleParser#dependencies_section}.
	 * @param ctx the parse tree
	 */
	void exitDependencies_section(GroovyGradleParser.Dependencies_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyGradleParser#dependency}.
	 * @param ctx the parse tree
	 */
	void enterDependency(GroovyGradleParser.DependencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyGradleParser#dependency}.
	 * @param ctx the parse tree
	 */
	void exitDependency(GroovyGradleParser.DependencyContext ctx);
}