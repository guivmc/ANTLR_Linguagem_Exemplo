// Generated from experiment.g4 by ANTLR 4.8
 
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link experimentParser}.
 */
public interface experimentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link experimentParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(experimentParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(experimentParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(experimentParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(experimentParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(experimentParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(experimentParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#startIFExpr}.
	 * @param ctx the parse tree
	 */
	void enterStartIFExpr(experimentParser.StartIFExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#startIFExpr}.
	 * @param ctx the parse tree
	 */
	void exitStartIFExpr(experimentParser.StartIFExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(experimentParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(experimentParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#startWhileExpr}.
	 * @param ctx the parse tree
	 */
	void enterStartWhileExpr(experimentParser.StartWhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#startWhileExpr}.
	 * @param ctx the parse tree
	 */
	void exitStartWhileExpr(experimentParser.StartWhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#startDoWhileExpr}.
	 * @param ctx the parse tree
	 */
	void enterStartDoWhileExpr(experimentParser.StartDoWhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#startDoWhileExpr}.
	 * @param ctx the parse tree
	 */
	void exitStartDoWhileExpr(experimentParser.StartDoWhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#startLogExpr}.
	 * @param ctx the parse tree
	 */
	void enterStartLogExpr(experimentParser.StartLogExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#startLogExpr}.
	 * @param ctx the parse tree
	 */
	void exitStartLogExpr(experimentParser.StartLogExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#startReadExpr}.
	 * @param ctx the parse tree
	 */
	void enterStartReadExpr(experimentParser.StartReadExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#startReadExpr}.
	 * @param ctx the parse tree
	 */
	void exitStartReadExpr(experimentParser.StartReadExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#startExpr}.
	 * @param ctx the parse tree
	 */
	void enterStartExpr(experimentParser.StartExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#startExpr}.
	 * @param ctx the parse tree
	 */
	void exitStartExpr(experimentParser.StartExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(experimentParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(experimentParser.ExprContext ctx);
}