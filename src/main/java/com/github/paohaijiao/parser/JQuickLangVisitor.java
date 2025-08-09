// Generated from D:/idea/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2

package com.github.paohaijiao.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JQuickLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JQuickLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JQuickLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JQuickLangParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#paramType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamType(JQuickLangParser.ParamTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(JQuickLangParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(JQuickLangParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JQuickLangParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JQuickLangParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(JQuickLangParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(JQuickLangParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(JQuickLangParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JQuickLangParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JQuickLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(JQuickLangParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(JQuickLangParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(JQuickLangParser.ControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JQuickLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#elseIfConExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfConExpression(JQuickLangParser.ElseIfConExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#elseIfAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfAction(JQuickLangParser.ElseIfActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#elseAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseAction(JQuickLangParser.ElseActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JQuickLangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#initExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitExpression(JQuickLangParser.InitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#conExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConExpression(JQuickLangParser.ConExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#stopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopExpression(JQuickLangParser.StopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JQuickLangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JQuickLangParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JQuickLangParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JQuickLangParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JQuickLangParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(JQuickLangParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JQuickLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#sout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSout(JQuickLangParser.SoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(JQuickLangParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JQuickLangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(JQuickLangParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(JQuickLangParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JQuickLangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(JQuickLangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#functionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVar(JQuickLangParser.FunctionVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#classsType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasssType(JQuickLangParser.ClasssTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JQuickLangParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#literalItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralItem(JQuickLangParser.LiteralItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticCall(JQuickLangParser.StaticCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(JQuickLangParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceMethodCall(JQuickLangParser.InstanceMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisMethodCall(JQuickLangParser.ThisMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessStaticMethodCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessStaticMethodCall(JQuickLangParser.AccessStaticMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#this}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(JQuickLangParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#instanceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceName(JQuickLangParser.InstanceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(JQuickLangParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JQuickLangParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#accessStaticVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessStaticVariable(JQuickLangParser.AccessStaticVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#accessObjectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessObjectName(JQuickLangParser.AccessObjectNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JQuickLangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(JQuickLangParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#mapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(JQuickLangParser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#mapEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntry(JQuickLangParser.MapEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#importVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportVar(JQuickLangParser.ImportVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JQuickLangParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(JQuickLangParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JQuickLangParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(JQuickLangParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(JQuickLangParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JQuickLangParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(JQuickLangParser.NullContext ctx);
}