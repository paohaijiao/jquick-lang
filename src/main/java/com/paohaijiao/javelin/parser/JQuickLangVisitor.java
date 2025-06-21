// Generated from D:/idea/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
package com.paohaijiao.javelin.parser;
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
	 * Visit a parse tree produced by {@link JQuickLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JQuickLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#elseIfStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatment(JQuickLangParser.ElseIfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#elseAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseAction(JQuickLangParser.ElseActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(JQuickLangParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JQuickLangParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JQuickLangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(JQuickLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(JQuickLangParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#composeBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposeBoolean(JQuickLangParser.ComposeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(JQuickLangParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#singgelBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinggelBool(JQuickLangParser.SinggelBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#numberBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBool(JQuickLangParser.NumberBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#stringBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringBool(JQuickLangParser.StringBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#dateBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateBool(JQuickLangParser.DateBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(JQuickLangParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JQuickLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(JQuickLangParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JQuickLangParser.NumberContext ctx);
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
}