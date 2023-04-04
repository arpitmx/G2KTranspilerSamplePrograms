// Generated from /Users/apple/IdeaProjects/G2KTranspilerSample/src/main/kotlin/GroovyGradle.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GroovyGradleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GroovyGradleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GroovyGradleParser#dependencies_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencies_section(GroovyGradleParser.Dependencies_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyGradleParser#dependency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependency(GroovyGradleParser.DependencyContext ctx);
}