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
	 * Visit a parse tree produced by {@link JQuickLangParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(JQuickLangParser.RuleContext ctx);
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
	 * Visit a parse tree produced by {@link JQuickLangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JQuickLangParser.ForStatementContext ctx);
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
	 * Visit a parse tree produced by {@link JQuickLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JQuickLangParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JQuickLangParser.ExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link JQuickLangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JQuickLangParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardCall}
	 * labeled alternative in {@link JQuickLangParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardCall(JQuickLangParser.StandardCallContext ctx);
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
	 * Visit a parse tree produced by {@link JQuickLangParser#instanceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceName(JQuickLangParser.InstanceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JQuickLangParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#varArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArgumentList(JQuickLangParser.VarArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(JQuickLangParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JQuickLangParser.LiteralContext ctx);
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
	 * Visit a parse tree produced by {@link JQuickLangParser#importVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportVar(JQuickLangParser.ImportVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(JQuickLangParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(JQuickLangParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(JQuickLangParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(JQuickLangParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong(JQuickLangParser.LongContext ctx);
}