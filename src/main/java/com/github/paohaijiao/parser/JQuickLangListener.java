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
	 * Enter a parse tree produced by {@link JQuickLangParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(JQuickLangParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(JQuickLangParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(JQuickLangParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(JQuickLangParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JQuickLangParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JQuickLangParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JQuickLangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JQuickLangParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(JQuickLangParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(JQuickLangParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(JQuickLangParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(JQuickLangParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(JQuickLangParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(JQuickLangParser.MapTypeContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(JQuickLangParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(JQuickLangParser.MethodContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#elseIfConExpression}.
	 * @param ctx the parse tree
	 */
	void enterElseIfConExpression(JQuickLangParser.ElseIfConExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#elseIfConExpression}.
	 * @param ctx the parse tree
	 */
	void exitElseIfConExpression(JQuickLangParser.ElseIfConExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#elseIfAction}.
	 * @param ctx the parse tree
	 */
	void enterElseIfAction(JQuickLangParser.ElseIfActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#elseIfAction}.
	 * @param ctx the parse tree
	 */
	void exitElseIfAction(JQuickLangParser.ElseIfActionContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#initExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitExpression(JQuickLangParser.InitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#initExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitExpression(JQuickLangParser.InitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#conExpression}.
	 * @param ctx the parse tree
	 */
	void enterConExpression(JQuickLangParser.ConExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#conExpression}.
	 * @param ctx the parse tree
	 */
	void exitConExpression(JQuickLangParser.ConExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#stopExpression}.
	 * @param ctx the parse tree
	 */
	void enterStopExpression(JQuickLangParser.StopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#stopExpression}.
	 * @param ctx the parse tree
	 */
	void exitStopExpression(JQuickLangParser.StopExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JQuickLangParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JQuickLangParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JQuickLangParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JQuickLangParser.ContinueStatementContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#sout}.
	 * @param ctx the parse tree
	 */
	void enterSout(JQuickLangParser.SoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#sout}.
	 * @param ctx the parse tree
	 */
	void exitSout(JQuickLangParser.SoutContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#classsType}.
	 * @param ctx the parse tree
	 */
	void enterClasssType(JQuickLangParser.ClasssTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#classsType}.
	 * @param ctx the parse tree
	 */
	void exitClasssType(JQuickLangParser.ClasssTypeContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#literalItem}.
	 * @param ctx the parse tree
	 */
	void enterLiteralItem(JQuickLangParser.LiteralItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#literalItem}.
	 * @param ctx the parse tree
	 */
	void exitLiteralItem(JQuickLangParser.LiteralItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterStaticCall(JQuickLangParser.StaticCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitStaticCall(JQuickLangParser.StaticCallContext ctx);
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
	 * Enter a parse tree produced by the {@code thisMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterThisMethodCall(JQuickLangParser.ThisMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitThisMethodCall(JQuickLangParser.ThisMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessStaticMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterAccessStaticMethodCall(JQuickLangParser.AccessStaticMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessStaticMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitAccessStaticMethodCall(JQuickLangParser.AccessStaticMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#this}.
	 * @param ctx the parse tree
	 */
	void enterThis(JQuickLangParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#this}.
	 * @param ctx the parse tree
	 */
	void exitThis(JQuickLangParser.ThisContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#accessStaticVariable}.
	 * @param ctx the parse tree
	 */
	void enterAccessStaticVariable(JQuickLangParser.AccessStaticVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#accessStaticVariable}.
	 * @param ctx the parse tree
	 */
	void exitAccessStaticVariable(JQuickLangParser.AccessStaticVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#accessObjectName}.
	 * @param ctx the parse tree
	 */
	void enterAccessObjectName(JQuickLangParser.AccessObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#accessObjectName}.
	 * @param ctx the parse tree
	 */
	void exitAccessObjectName(JQuickLangParser.AccessObjectNameContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(JQuickLangParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(JQuickLangParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteral(JQuickLangParser.MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteral(JQuickLangParser.MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQuickLangParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(JQuickLangParser.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(JQuickLangParser.MapEntryContext ctx);
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
	 * Enter a parse tree produced by {@link JQuickLangParser#null}.
	 * @param ctx the parse tree
	 */
	void enterNull(JQuickLangParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQuickLangParser#null}.
	 * @param ctx the parse tree
	 */
	void exitNull(JQuickLangParser.NullContext ctx);
}