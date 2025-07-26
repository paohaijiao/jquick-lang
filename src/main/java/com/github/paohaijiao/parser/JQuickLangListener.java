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
	 * Enter a parse tree produced by {@link JQuickLangParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(JQuickLangParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(JQuickLangParser.LogicalContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(JQuickLangParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(JQuickLangParser.ArithmeticContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#functionVar}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVar(JQuickLangParser.FunctionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#functionVar}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVar(JQuickLangParser.FunctionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(JQuickLangParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(JQuickLangParser.ParamTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code standardCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterStandardCall(JQuickLangParser.StandardCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitStandardCall(JQuickLangParser.StandardCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructorCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(JQuickLangParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructorCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(JQuickLangParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterInstanceMethodCall(JQuickLangParser.InstanceMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitInstanceMethodCall(JQuickLangParser.InstanceMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#instanceName}.
	 * @param ctx the parse tree
	 */
	void enterInstanceName(JQuickLangParser.InstanceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#instanceName}.
	 * @param ctx the parse tree
	 */
	void exitInstanceName(JQuickLangParser.InstanceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JQuickLangParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JQuickLangParser.MethodNameContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#importVar}.
	 * @param ctx the parse tree
	 */
	void enterImportVar(JQuickLangParser.ImportVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#importVar}.
	 * @param ctx the parse tree
	 */
	void exitImportVar(JQuickLangParser.ImportVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JQuickLangParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JQuickLangParser.IdentifierContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#short}.
	 * @param ctx the parse tree
	 */
	void enterShort(JQuickLangParser.ShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#short}.
	 * @param ctx the parse tree
	 */
	void exitShort(JQuickLangParser.ShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(JQuickLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(JQuickLangParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(JQuickLangParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(JQuickLangParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(JQuickLangParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(JQuickLangParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#long}.
	 * @param ctx the parse tree
	 */
	void enterLong(JQuickLangParser.LongContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#long}.
	 * @param ctx the parse tree
	 */
	void exitLong(JQuickLangParser.LongContext ctx);
}