// Generated from C:\Users\Thiago\Documents\NetBeansProjects\Compiladores\Kleber\grammar\kleber\parser\Kleber.g4 by ANTLR 4.6

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
	 * Enter a parse tree produced by {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(KleberParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(KleberParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfstm(KleberParser.IfstmContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfstm(KleberParser.IfstmContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#forstm}.
	 * @param ctx the parse tree
	 */
	void enterForstm(KleberParser.ForstmContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#forstm}.
	 * @param ctx the parse tree
	 */
	void exitForstm(KleberParser.ForstmContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KleberParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KleberParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(KleberParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(KleberParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(KleberParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(KleberParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(KleberParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(KleberParser.BoolExprContext ctx);
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
	 * Enter a parse tree produced by {@link KleberParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(KleberParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link KleberParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(KleberParser.RetContext ctx);
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