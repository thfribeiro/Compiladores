// Generated from /home/thiago/Área de Trabalho/Compiladores/Kleber/grammar/kleber/parser/Kleber.g4 by ANTLR 4.6

package kleber.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KleberParser}.
 */
public interface KleberListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KleberParser#progr}.
	 * @param ctx the parse tree
	 */
	void enterProgr(KleberParser.ProgrContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#progr}.
	 * @param ctx the parse tree
	 */
	void exitProgr(KleberParser.ProgrContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#bibcall}.
	 * @param ctx the parse tree
	 */
	void enterBibcall(KleberParser.BibcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#bibcall}.
	 * @param ctx the parse tree
	 */
	void exitBibcall(KleberParser.BibcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(KleberParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(KleberParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(KleberParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(KleberParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(KleberParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(KleberParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(KleberParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(KleberParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(KleberParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(KleberParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#printf}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(KleberParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#printf}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(KleberParser.PrintfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printSTR}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 */
	void enterPrintSTR(KleberParser.PrintSTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printSTR}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 */
	void exitPrintSTR(KleberParser.PrintSTRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVAR}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 */
	void enterPrintVAR(KleberParser.PrintVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVAR}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 */
	void exitPrintVAR(KleberParser.PrintVARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prinExpr}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 */
	void enterPrinExpr(KleberParser.PrinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prinExpr}
	 * labeled alternative in {@link KleberParser#printparam}.
	 * @param ctx the parse tree
	 */
	void exitPrinExpr(KleberParser.PrinExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#scanf}.
	 * @param ctx the parse tree
	 */
	void enterScanf(KleberParser.ScanfContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#scanf}.
	 * @param ctx the parse tree
	 */
	void exitScanf(KleberParser.ScanfContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(KleberParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(KleberParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KleberParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KleberParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrExpr}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtrExpr(KleberParser.AtrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrExpr}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtrExpr(KleberParser.AtrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrString}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtrString(KleberParser.AtrStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrString}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtrString(KleberParser.AtrStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrChar}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtrChar(KleberParser.AtrCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrChar}
	 * labeled alternative in {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtrChar(KleberParser.AtrCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ift}
	 * labeled alternative in {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIft(KleberParser.IftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ift}
	 * labeled alternative in {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIft(KleberParser.IftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelset}
	 * labeled alternative in {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfelset(KleberParser.IfelsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelset}
	 * labeled alternative in {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfelset(KleberParser.IfelsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link KleberParser#forstm}.
	 * @param ctx the parse tree
	 */
	void enterFor(KleberParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link KleberParser#forstm}.
	 * @param ctx the parse tree
	 */
	void exitFor(KleberParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(KleberParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(KleberParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(KleberParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(KleberParser.ExprSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(KleberParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(KleberParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMult}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(KleberParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMult}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(KleberParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDiv}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void enterExprDiv(KleberParser.ExprDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDiv}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void exitExprDiv(KleberParser.ExprDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMod}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void enterExprMod(KleberParser.ExprModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMod}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void exitExprMod(KleberParser.ExprModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFact}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void enterExprFact(KleberParser.ExprFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFact}
	 * labeled alternative in {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void exitExprFact(KleberParser.ExprFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factVAR}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactVAR(KleberParser.FactVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factVAR}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactVAR(KleberParser.FactVARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factNUM}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactNUM(KleberParser.FactNUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factNUM}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactNUM(KleberParser.FactNUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactExpr(KleberParser.FactExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactExpr(KleberParser.FactExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(KleberParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(KleberParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprTrue(KleberParser.ExprTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprTrue(KleberParser.ExprTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprFalse(KleberParser.ExprFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprFalse(KleberParser.ExprFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(KleberParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(KleberParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(KleberParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(KleberParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KleberParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KleberParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return0}
	 * labeled alternative in {@link KleberParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterReturn0(KleberParser.Return0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code return0}
	 * labeled alternative in {@link KleberParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitReturn0(KleberParser.Return0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(KleberParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(KleberParser.FunctionBlockContext ctx);
}