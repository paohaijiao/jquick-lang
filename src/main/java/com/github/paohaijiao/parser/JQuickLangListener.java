// Generated from D:/idea/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link JQuickLangParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JQuickLangParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JQuickLangParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JQuickLangParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JQuickLangParser.QualifiedNameContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlStatement(JQuickLangParser.ControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlStatement(JQuickLangParser.ControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JQuickLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JQuickLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JQuickLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JQuickLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JQuickLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JQuickLangParser.WhileStatementContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JQuickLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JQuickLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JQuickLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JQuickLangParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(JQuickLangParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(JQuickLangParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(JQuickLangParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(JQuickLangParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(JQuickLangParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(JQuickLangParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JQuickLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JQuickLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(JQuickLangParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(JQuickLangParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(JQuickLangParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(JQuickLangParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(JQuickLangParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(JQuickLangParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JQuickLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JQuickLangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(JQuickLangParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(JQuickLangParser.VariableDeclContext ctx);
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