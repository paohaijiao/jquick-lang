// Generated from D:/idea/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
package com.paohaijiao.javelin.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JQuickLangParser}.
 */
public interface JQuickLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JQuickLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JQuickLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(JQuickLangParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(JQuickLangParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JQuickLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JQuickLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatment(JQuickLangParser.ElseIfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatment(JQuickLangParser.ElseIfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#elseAction}.
	 * @param ctx the parse tree
	 */
	void enterElseAction(JQuickLangParser.ElseActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#elseAction}.
	 * @param ctx the parse tree
	 */
	void exitElseAction(JQuickLangParser.ElseActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(JQuickLangParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(JQuickLangParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JQuickLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JQuickLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JQuickLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JQuickLangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(JQuickLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(JQuickLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(JQuickLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(JQuickLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#composeBoolean}.
	 * @param ctx the parse tree
	 */
	void enterComposeBoolean(JQuickLangParser.ComposeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#composeBoolean}.
	 * @param ctx the parse tree
	 */
	void exitComposeBoolean(JQuickLangParser.ComposeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(JQuickLangParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(JQuickLangParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#singgelBool}.
	 * @param ctx the parse tree
	 */
	void enterSinggelBool(JQuickLangParser.SinggelBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#singgelBool}.
	 * @param ctx the parse tree
	 */
	void exitSinggelBool(JQuickLangParser.SinggelBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#numberBool}.
	 * @param ctx the parse tree
	 */
	void enterNumberBool(JQuickLangParser.NumberBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#numberBool}.
	 * @param ctx the parse tree
	 */
	void exitNumberBool(JQuickLangParser.NumberBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#stringBool}.
	 * @param ctx the parse tree
	 */
	void enterStringBool(JQuickLangParser.StringBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#stringBool}.
	 * @param ctx the parse tree
	 */
	void exitStringBool(JQuickLangParser.StringBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#dateBool}.
	 * @param ctx the parse tree
	 */
	void enterDateBool(JQuickLangParser.DateBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#dateBool}.
	 * @param ctx the parse tree
	 */
	void exitDateBool(JQuickLangParser.DateBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(JQuickLangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(JQuickLangParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JQuickLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JQuickLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(JQuickLangParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(JQuickLangParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JQuickLangParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JQuickLangParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JQuickLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JQuickLangParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(JQuickLangParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(JQuickLangParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(JQuickLangParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(JQuickLangParser.VariablesContext ctx);
}