// Generated from /home/thiago/Área de Trabalho/Compiladores/Kleber/grammar/kleber/parser/Kleber.g4 by ANTLR 4.6

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
	 * Visit a parse tree produced by the {@code printSTR}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSTR(KleberParser.PrintSTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVAR}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVAR(KleberParser.PrintVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prinExpr}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinExpr(KleberParser.PrinExprContext ctx);
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
	 * Visit a parse tree produced by the {@code atrExpr}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrExpr(KleberParser.AtrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrString}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrString(KleberParser.AtrStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrChar}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrChar(KleberParser.AtrCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ift}
	 * labeled alternative in {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIft(KleberParser.IftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelset}
	 * labeled alternative in {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelset(KleberParser.IfelsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link KleberParser#forstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(KleberParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(KleberParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(KleberParser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(KleberParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMult}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(KleberParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDiv}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDiv(KleberParser.ExprDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMod}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMod(KleberParser.ExprModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFact}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFact(KleberParser.ExprFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factVAR}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactVAR(KleberParser.FactVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factNUM}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactNUM(KleberParser.FactNUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactExpr(KleberParser.FactExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(KleberParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(KleberParser.ExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(KleberParser.ExprFalseContext ctx);
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
	 * Visit a parse tree produced by the {@code return0}
	 * labeled alternative in {@link KleberParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn0(KleberParser.Return0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KleberParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(KleberParser.FunctionBlockContext ctx);
}