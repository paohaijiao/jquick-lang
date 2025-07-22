// Generated from D:/my/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link JQuickLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JQuickLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JQuickLangParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(JQuickLangParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQuickLangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JQuickLangParser.LiteralContext ctx);
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