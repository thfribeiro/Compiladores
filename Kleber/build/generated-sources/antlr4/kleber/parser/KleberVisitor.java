// Generated from C:\Users\Thiago\Documents\NetBeansProjects\Compiladores\Kleber\grammar\kleber\parser\Kleber.g4 by ANTLR 4.6

package kleber.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KleberParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KleberVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KleberParser#progr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgr(KleberParser.ProgrContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#bibcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBibcall(KleberParser.BibcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(KleberParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(KleberParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(KleberParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(KleberParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(KleberParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#printf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintf(KleberParser.PrintfContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#scanf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanf(KleberParser.ScanfContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(KleberParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KleberParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(KleberParser.AtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstm(KleberParser.IfstmContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#forstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstm(KleberParser.ForstmContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(KleberParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(KleberParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(KleberParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(KleberParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(KleberParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(KleberParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KleberParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(KleberParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(KleberParser.FunctionBlockContext ctx);
}