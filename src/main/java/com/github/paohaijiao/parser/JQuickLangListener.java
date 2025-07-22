// Generated from D:/my/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
package com.github.paohaijiao.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JQuickLangParser}.
 */
public interface JQuickLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JQuickLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JQuickLangParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(JQuickLangParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(JQuickLangParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JQuickLangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JQuickLangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(JQuickLangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(JQuickLangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JQuickLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JQuickLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JQuickLangParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JQuickLangParser.ArgumentListContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JQuickLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JQuickLangParser.LiteralContext ctx);
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