// Generated from D:/my/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
package com.github.paohaijiao.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JQuickLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IMPORT=7, NEW=8, VAR=9, 
		AS=10, RETURN=11, FUNCTION=12, WHILE=13, FOR=14, SHORT=15, INTEGER=16, 
		FLOAT=17, DOUBLE=18, LONG=19, ASSIGN=20, SEMICOLON=21, WITH=22, IF=23, 
		THEN=24, ELSEIF=25, ELSE=26, DOLLAR=27, LPAREN=28, RPAREN=29, LBRACE=30, 
		RBRACE=31, GT=32, GE=33, LT=34, LE=35, EQ=36, NE=37, AND=38, OR=39, ADD=40, 
		MINUS=41, MUL=42, DIV=43, CONTAIN=44, NOTCONTAIN=45, START=46, NOTSTART=47, 
		END=48, NOTEND=49, TRUE=50, FALSE=51, COLON=52, DATETIME=53, DATE=54, 
		YEAR=55, MONTH=56, DAY=57, TIME_ZONE=58, IDENTIFIER=59, STRING=60, SINGLE_LINE_COMMENT=61, 
		MULTI_LINE_COMMENT=62, WS=63, NEWLINE=64;
	public static final int
		RULE_program = 0, RULE_importDeclaration = 1, RULE_qualifiedName = 2, 
		RULE_statement = 3, RULE_rule = 4, RULE_action = 5, RULE_controlStatement = 6, 
		RULE_ifStatement = 7, RULE_forStatement = 8, RULE_whileStatement = 9, 
		RULE_returnStatement = 10, RULE_expressionStatement = 11, RULE_expression = 12, 
		RULE_logical = 13, RULE_comparison = 14, RULE_arithmetic = 15, RULE_functionDefinition = 16, 
		RULE_parameterList = 17, RULE_param = 18, RULE_primary = 19, RULE_methodInvocation = 20, 
		RULE_instanceName = 21, RULE_argumentList = 22, RULE_varArgumentList = 23, 
		RULE_variableDecl = 24, RULE_literal = 25, RULE_identifier = 26, RULE_bool = 27, 
		RULE_string = 28, RULE_date = 29, RULE_variables = 30, RULE_importVar = 31, 
		RULE_short = 32, RULE_int = 33, RULE_float = 34, RULE_double = 35, RULE_long = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDeclaration", "qualifiedName", "statement", "rule", 
			"action", "controlStatement", "ifStatement", "forStatement", "whileStatement", 
			"returnStatement", "expressionStatement", "expression", "logical", "comparison", 
			"arithmetic", "functionDefinition", "parameterList", "param", "primary", 
			"methodInvocation", "instanceName", "argumentList", "varArgumentList", 
			"variableDecl", "literal", "identifier", "bool", "string", "date", "variables", 
			"importVar", "short", "int", "float", "double", "long"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'if'", "'else if'", "'else'", "','", "'null'", "'import'", 
			"'new'", "'var'", "'as'", "'return'", "'function'", "'while'", "'for'", 
			null, null, null, null, null, "'='", "';'", "'WITH'", "'IF'", "'THEN'", 
			"'ELSEIF'", "'ELSE'", "'$'", "'('", "')'", "'{'", "'}'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", 
			"'CONTAIN'", "'NOTCONTAIN'", "'START'", "'NOTSTART'", "'END'", "'NOTEND'", 
			"'true'", "'false'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IMPORT", "NEW", "VAR", "AS", 
			"RETURN", "FUNCTION", "WHILE", "FOR", "SHORT", "INTEGER", "FLOAT", "DOUBLE", 
			"LONG", "ASSIGN", "SEMICOLON", "WITH", "IF", "THEN", "ELSEIF", "ELSE", 
			"DOLLAR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "GT", "GE", "LT", "LE", 
			"EQ", "NE", "AND", "OR", "ADD", "MINUS", "MUL", "DIV", "CONTAIN", "NOTCONTAIN", 
			"START", "NOTSTART", "END", "NOTEND", "TRUE", "FALSE", "COLON", "DATETIME", 
			"DATE", "YEAR", "MONTH", "DAY", "TIME_ZONE", "IDENTIFIER", "STRING", 
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JQuickLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JQuickLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JQuickLangParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(74);
				importDeclaration();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759781554798721860L) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JQuickLangParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(JQuickLangParser.AS, 0); }
		public ImportVarContext importVar() {
			return getRuleContext(ImportVarContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JQuickLangParser.SEMICOLON, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IMPORT);
			setState(89);
			qualifiedName();
			setState(90);
			match(AS);
			setState(91);
			importVar();
			setState(92);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JQuickLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JQuickLangParser.IDENTIFIER, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENTIFIER);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(T__0);
					setState(96);
					match(IDENTIFIER);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JQuickLangParser.SEMICOLON, 0); }
		public RuleContext rule_() {
			return getRuleContext(RuleContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				expression();
				setState(103);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				rule_();
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(106);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				controlStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				methodInvocation();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				functionDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JQuickLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JQuickLangParser.RBRACE, 0); }
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ControlStatementContext> controlStatement() {
			return getRuleContexts(ControlStatementContext.class);
		}
		public ControlStatementContext controlStatement(int i) {
			return getRuleContext(ControlStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JQuickLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JQuickLangParser.SEMICOLON, i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LBRACE);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759781554798721860L) != 0)) {
				{
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(117);
					variableDecl();
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(118);
						match(SEMICOLON);
						}
					}

					}
					break;
				case 2:
					{
					setState(121);
					statement();
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(122);
						match(SEMICOLON);
						}
					}

					}
					break;
				case 3:
					{
					setState(125);
					controlStatement();
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(126);
						match(SEMICOLON);
						}
					}

					}
					break;
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ControlStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_controlStatement);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				returnStatement();
				}
				break;
			case T__5:
			case NEW:
			case VAR:
			case SHORT:
			case INTEGER:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case DOLLAR:
			case LPAREN:
			case TRUE:
			case FALSE:
			case DATETIME:
			case DATE:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				expressionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(JQuickLangParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(JQuickLangParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(JQuickLangParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(JQuickLangParser.RPAREN, i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__1);
			setState(144);
			match(LPAREN);
			setState(145);
			expression();
			setState(146);
			match(RPAREN);
			setState(147);
			action();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(148);
				match(T__2);
				setState(149);
				match(LPAREN);
				setState(150);
				expression();
				setState(151);
				match(RPAREN);
				setState(152);
				action();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(159);
				match(T__3);
				setState(160);
				action();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JQuickLangParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(JQuickLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JQuickLangParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FOR);
			setState(164);
			match(LPAREN);
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(165);
				variableDecl();
				}
				break;
			case 2:
				{
				setState(166);
				expression();
				}
				break;
			}
			setState(169);
			match(SEMICOLON);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759781554798691136L) != 0)) {
				{
				setState(170);
				expression();
				}
			}

			setState(173);
			match(SEMICOLON);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759781554798691136L) != 0)) {
				{
				setState(174);
				expression();
				}
			}

			setState(177);
			match(RPAREN);
			setState(178);
			action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JQuickLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			match(LPAREN);
			setState(182);
			expression();
			setState(183);
			match(RPAREN);
			setState(184);
			action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JQuickLangParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JQuickLangParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(RETURN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759781554798691136L) != 0)) {
				{
				setState(187);
				expression();
				}
			}

			setState(190);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JQuickLangParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression();
			setState(193);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				logical();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JQuickLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JQuickLangParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(JQuickLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JQuickLangParser.AND, i);
		}
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logical);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			comparison();
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(203);
					comparison();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(JQuickLangParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JQuickLangParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(JQuickLangParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(JQuickLangParser.GE, i);
		}
		public List<TerminalNode> LT() { return getTokens(JQuickLangParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JQuickLangParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(JQuickLangParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(JQuickLangParser.LE, i);
		}
		public List<TerminalNode> EQ() { return getTokens(JQuickLangParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(JQuickLangParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(JQuickLangParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(JQuickLangParser.NE, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			primary();
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(211);
					primary();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JQuickLangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JQuickLangParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JQuickLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JQuickLangParser.DIV, i);
		}
		public List<TerminalNode> ADD() { return getTokens(JQuickLangParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JQuickLangParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JQuickLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JQuickLangParser.MINUS, i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithmetic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			primary();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674416640L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(219);
					primary();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JQuickLangParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FUNCTION);
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(LPAREN);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(228);
				parameterList();
				}
			}

			setState(231);
			match(RPAREN);
			setState(232);
			action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			param();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(235);
				match(T__4);
				setState(236);
				param();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JQuickLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JQuickLangParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(JQuickLangParser.COLON, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(IDENTIFIER);
			setState(243);
			match(COLON);
			setState(244);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(LPAREN);
				setState(250);
				expression();
				setState(251);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				variableDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
	 
		public MethodInvocationContext() { }
		public void copyFrom(MethodInvocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorCallContext extends MethodInvocationContext {
		public TerminalNode NEW() { return getToken(JQuickLangParser.NEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public VarArgumentListContext varArgumentList() {
			return getRuleContext(VarArgumentListContext.class,0);
		}
		public ConstructorCallContext(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardCallContext extends MethodInvocationContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public VarArgumentListContext varArgumentList() {
			return getRuleContext(VarArgumentListContext.class,0);
		}
		public StandardCallContext(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterStandardCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitStandardCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitStandardCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstanceMethodCallContext extends MethodInvocationContext {
		public InstanceNameContext instanceName() {
			return getRuleContext(InstanceNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public VarArgumentListContext varArgumentList() {
			return getRuleContext(VarArgumentListContext.class,0);
		}
		public InstanceMethodCallContext(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterInstanceMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitInstanceMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitInstanceMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodInvocation);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new StandardCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(256);
					qualifiedName();
					setState(257);
					match(T__0);
					}
					break;
				}
				setState(261);
				match(IDENTIFIER);
				setState(262);
				match(LPAREN);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(263);
					argumentList();
					}
					break;
				case 2:
					{
					setState(264);
					varArgumentList();
					}
					break;
				}
				setState(267);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ConstructorCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(NEW);
				setState(269);
				qualifiedName();
				setState(270);
				match(LPAREN);
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(271);
					argumentList();
					}
					break;
				case 2:
					{
					setState(272);
					varArgumentList();
					}
					break;
				}
				setState(275);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new InstanceMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				instanceName();
				setState(278);
				match(T__0);
				setState(279);
				match(IDENTIFIER);
				setState(280);
				match(LPAREN);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(281);
					argumentList();
					}
					break;
				case 2:
					{
					setState(282);
					varArgumentList();
					}
					break;
				}
				setState(285);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public InstanceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterInstanceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitInstanceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitInstanceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceNameContext instanceName() throws RecognitionException {
		InstanceNameContext _localctx = new InstanceNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instanceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			literal();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(292);
				match(T__4);
				setState(293);
				literal();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JQuickLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JQuickLangParser.IDENTIFIER, i);
		}
		public VarArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterVarArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitVarArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitVarArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarArgumentListContext varArgumentList() throws RecognitionException {
		VarArgumentListContext _localctx = new VarArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(IDENTIFIER);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(300);
				match(T__4);
				setState(301);
				match(IDENTIFIER);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JQuickLangParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(JQuickLangParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(307);
				match(VAR);
				}
			}

			setState(310);
			match(IDENTIFIER);
			setState(311);
			match(ASSIGN);
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(312);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShortContext short_() {
			return getRuleContext(ShortContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public DoubleContext double_() {
			return getRuleContext(DoubleContext.class,0);
		}
		public LongContext long_() {
			return getRuleContext(LongContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				string();
				}
				break;
			case DATETIME:
			case DATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				date();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				variables();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				bool();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				match(T__5);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				identifier();
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				short_();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				int_();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 9);
				{
				setState(323);
				float_();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 10);
				{
				setState(324);
				double_();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 11);
				{
				setState(325);
				long_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JQuickLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JQuickLangParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JQuickLangParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(JQuickLangParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(JQuickLangParser.DATETIME, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==DATETIME || _la==DATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(JQuickLangParser.DOLLAR, 0); }
		public TerminalNode LBRACE() { return getToken(JQuickLangParser.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode RBRACE() { return getToken(JQuickLangParser.RBRACE, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(DOLLAR);
			setState(337);
			match(LBRACE);
			setState(338);
			match(IDENTIFIER);
			setState(339);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public ImportVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterImportVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitImportVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitImportVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportVarContext importVar() throws RecognitionException {
		ImportVarContext _localctx = new ImportVarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_importVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortContext extends ParserRuleContext {
		public TerminalNode SHORT() { return getToken(JQuickLangParser.SHORT, 0); }
		public ShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(SHORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JQuickLangParser.INTEGER, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(JQuickLangParser.FLOAT, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(JQuickLangParser.DOUBLE, 0); }
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LongContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(JQuickLangParser.LONG, 0); }
		public LongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitLong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongContext long_() throws RecognitionException {
		LongContext _localctx = new LongContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LONG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002b\b"+
		"\u0002\n\u0002\f\u0002e\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003l\b\u0003\u0001\u0003\u0003\u0003o\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004s\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"|\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0080\b\u0005\u0005\u0005"+
		"\u0082\b\u0005\n\u0005\f\u0005\u0085\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008e"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u009b\b\u0007\n\u0007\f\u0007\u009e\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a2\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a8"+
		"\b\b\u0001\b\u0001\b\u0003\b\u00ac\b\b\u0001\b\u0001\b\u0003\b\u00b0\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0003\n\u00bd\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c8\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00cd\b\r\n\r\f\r\u00d0\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00d5\b\u000e\n\u000e\f\u000e\u00d8\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00dd\b\u000f\n\u000f"+
		"\f\u000f\u00e0\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e6\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00ee\b\u0011\n\u0011\f\u0011\u00f1"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00ff\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0104\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u010a\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0112\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u011c\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0120\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0127\b\u0016\n\u0016\f\u0016\u012a\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u012f\b\u0017\n\u0017\f\u0017\u0132\t\u0017\u0001\u0018"+
		"\u0003\u0018\u0135\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u013a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0147\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0000"+
		"\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0005\u0001\u0000&\'\u0001"+
		"\u0000 %\u0001\u0000(+\u0001\u000023\u0001\u000056\u0177\u0000M\u0001"+
		"\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000"+
		"\u0000\u0006n\u0001\u0000\u0000\u0000\br\u0001\u0000\u0000\u0000\nt\u0001"+
		"\u0000\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000\u000e\u008f\u0001\u0000"+
		"\u0000\u0000\u0010\u00a3\u0001\u0000\u0000\u0000\u0012\u00b4\u0001\u0000"+
		"\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000\u0016\u00c0\u0001\u0000"+
		"\u0000\u0000\u0018\u00c7\u0001\u0000\u0000\u0000\u001a\u00c9\u0001\u0000"+
		"\u0000\u0000\u001c\u00d1\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000"+
		"\u0000\u0000 \u00e1\u0001\u0000\u0000\u0000\"\u00ea\u0001\u0000\u0000"+
		"\u0000$\u00f2\u0001\u0000\u0000\u0000&\u00fe\u0001\u0000\u0000\u0000("+
		"\u011f\u0001\u0000\u0000\u0000*\u0121\u0001\u0000\u0000\u0000,\u0123\u0001"+
		"\u0000\u0000\u0000.\u012b\u0001\u0000\u0000\u00000\u0134\u0001\u0000\u0000"+
		"\u00002\u0146\u0001\u0000\u0000\u00004\u0148\u0001\u0000\u0000\u00006"+
		"\u014a\u0001\u0000\u0000\u00008\u014c\u0001\u0000\u0000\u0000:\u014e\u0001"+
		"\u0000\u0000\u0000<\u0150\u0001\u0000\u0000\u0000>\u0155\u0001\u0000\u0000"+
		"\u0000@\u0157\u0001\u0000\u0000\u0000B\u0159\u0001\u0000\u0000\u0000D"+
		"\u015b\u0001\u0000\u0000\u0000F\u015d\u0001\u0000\u0000\u0000H\u015f\u0001"+
		"\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NS\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0003\u0006"+
		"\u0003\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VW\u0005\u0000\u0000\u0001W\u0001\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0007\u0000\u0000YZ\u0003\u0004\u0002\u0000Z[\u0005"+
		"\n\u0000\u0000[\\\u0003>\u001f\u0000\\]\u0005\u0015\u0000\u0000]\u0003"+
		"\u0001\u0000\u0000\u0000^c\u0005;\u0000\u0000_`\u0005\u0001\u0000\u0000"+
		"`b\u0005;\u0000\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0005\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0003\u0018\f\u0000gh\u0005\u0015"+
		"\u0000\u0000ho\u0001\u0000\u0000\u0000ik\u0003\b\u0004\u0000jl\u0005\u0015"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mo\u0003\f\u0006\u0000nf\u0001\u0000\u0000\u0000ni\u0001"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0007\u0001\u0000\u0000"+
		"\u0000ps\u0003(\u0014\u0000qs\u0003 \u0010\u0000rp\u0001\u0000\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000s\t\u0001\u0000\u0000\u0000t\u0083\u0005\u001e"+
		"\u0000\u0000uw\u00030\u0018\u0000vx\u0005\u0015\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0082\u0001\u0000\u0000\u0000"+
		"y{\u0003\u0006\u0003\u0000z|\u0005\u0015\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u0082\u0001\u0000\u0000\u0000}\u007f"+
		"\u0003\f\u0006\u0000~\u0080\u0005\u0015\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000"+
		"\u0000\u0000\u0081u\u0001\u0000\u0000\u0000\u0081y\u0001\u0000\u0000\u0000"+
		"\u0081}\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u001f\u0000\u0000\u0087\u000b\u0001\u0000\u0000\u0000\u0088"+
		"\u008e\u0003\u000e\u0007\u0000\u0089\u008e\u0003\u0010\b\u0000\u008a\u008e"+
		"\u0003\u0012\t\u0000\u008b\u008e\u0003\u0014\n\u0000\u008c\u008e\u0003"+
		"\u0016\u000b\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u0089\u0001"+
		"\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\r\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u0002\u0000\u0000\u0090\u0091\u0005\u001c"+
		"\u0000\u0000\u0091\u0092\u0003\u0018\f\u0000\u0092\u0093\u0005\u001d\u0000"+
		"\u0000\u0093\u009c\u0003\n\u0005\u0000\u0094\u0095\u0005\u0003\u0000\u0000"+
		"\u0095\u0096\u0005\u001c\u0000\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097"+
		"\u0098\u0005\u001d\u0000\u0000\u0098\u0099\u0003\n\u0005\u0000\u0099\u009b"+
		"\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u00a1\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0\u00a2"+
		"\u0003\n\u0005\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u000f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u000e\u0000\u0000\u00a4\u00a7\u0005\u001c\u0000\u0000\u00a5\u00a8\u0003"+
		"0\u0018\u0000\u00a6\u00a8\u0003\u0018\f\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005\u0015"+
		"\u0000\u0000\u00aa\u00ac\u0003\u0018\f\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00af\u0005\u0015\u0000\u0000\u00ae\u00b0\u0003\u0018\f\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001d\u0000\u0000"+
		"\u00b2\u00b3\u0003\n\u0005\u0000\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\r\u0000\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000\u00b6\u00b7"+
		"\u0003\u0018\f\u0000\u00b7\u00b8\u0005\u001d\u0000\u0000\u00b8\u00b9\u0003"+
		"\n\u0005\u0000\u00b9\u0013\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u000b"+
		"\u0000\u0000\u00bb\u00bd\u0003\u0018\f\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u0015\u0000\u0000\u00bf\u0015\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0003\u0018\f\u0000\u00c1\u00c2\u0005\u0015\u0000\u0000"+
		"\u00c2\u0017\u0001\u0000\u0000\u0000\u00c3\u00c8\u0003\u001e\u000f\u0000"+
		"\u00c4\u00c8\u0003\u001a\r\u0000\u00c5\u00c8\u0003(\u0014\u0000\u00c6"+
		"\u00c8\u0003&\u0013\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u0019\u0001\u0000\u0000\u0000\u00c9\u00ce"+
		"\u0003\u001c\u000e\u0000\u00ca\u00cb\u0007\u0000\u0000\u0000\u00cb\u00cd"+
		"\u0003\u001c\u000e\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u001b\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d6\u0003&\u0013\u0000\u00d2\u00d3\u0007"+
		"\u0001\u0000\u0000\u00d3\u00d5\u0003&\u0013\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u001d\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00de\u0003&\u0013"+
		"\u0000\u00da\u00db\u0007\u0002\u0000\u0000\u00db\u00dd\u0003&\u0013\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u001f\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\f\u0000\u0000\u00e2\u00e3\u0005;\u0000\u0000\u00e3"+
		"\u00e5\u0005\u001c\u0000\u0000\u00e4\u00e6\u0003\"\u0011\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u001d\u0000\u0000\u00e8\u00e9"+
		"\u0003\n\u0005\u0000\u00e9!\u0001\u0000\u0000\u0000\u00ea\u00ef\u0003"+
		"$\u0012\u0000\u00eb\u00ec\u0005\u0005\u0000\u0000\u00ec\u00ee\u0003$\u0012"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0#\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005;\u0000\u0000\u00f3\u00f4\u00054\u0000\u0000\u00f4\u00f5"+
		"\u0005;\u0000\u0000\u00f5%\u0001\u0000\u0000\u0000\u00f6\u00ff\u00032"+
		"\u0019\u0000\u00f7\u00ff\u0005;\u0000\u0000\u00f8\u00ff\u0003(\u0014\u0000"+
		"\u00f9\u00fa\u0005\u001c\u0000\u0000\u00fa\u00fb\u0003\u0018\f\u0000\u00fb"+
		"\u00fc\u0005\u001d\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u00030\u0018\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000\u00fe\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\'\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0003\u0004\u0002\u0000\u0101\u0102\u0005"+
		"\u0001\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005;\u0000\u0000\u0106\u0109\u0005\u001c"+
		"\u0000\u0000\u0107\u010a\u0003,\u0016\u0000\u0108\u010a\u0003.\u0017\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u0120\u0005\u001d\u0000\u0000\u010c\u010d\u0005\b\u0000\u0000\u010d"+
		"\u010e\u0003\u0004\u0002\u0000\u010e\u0111\u0005\u001c\u0000\u0000\u010f"+
		"\u0112\u0003,\u0016\u0000\u0110\u0112\u0003.\u0017\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"\u001d\u0000\u0000\u0114\u0120\u0001\u0000\u0000\u0000\u0115\u0116\u0003"+
		"*\u0015\u0000\u0116\u0117\u0005\u0001\u0000\u0000\u0117\u0118\u0005;\u0000"+
		"\u0000\u0118\u011b\u0005\u001c\u0000\u0000\u0119\u011c\u0003,\u0016\u0000"+
		"\u011a\u011c\u0003.\u0017\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u001d\u0000\u0000\u011e"+
		"\u0120\u0001\u0000\u0000\u0000\u011f\u0103\u0001\u0000\u0000\u0000\u011f"+
		"\u010c\u0001\u0000\u0000\u0000\u011f\u0115\u0001\u0000\u0000\u0000\u0120"+
		")\u0001\u0000\u0000\u0000\u0121\u0122\u0005;\u0000\u0000\u0122+\u0001"+
		"\u0000\u0000\u0000\u0123\u0128\u00032\u0019\u0000\u0124\u0125\u0005\u0005"+
		"\u0000\u0000\u0125\u0127\u00032\u0019\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129-\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u0130\u0005;\u0000\u0000\u012c"+
		"\u012d\u0005\u0005\u0000\u0000\u012d\u012f\u0005;\u0000\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131/\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u0005"+
		"\t\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0005;\u0000"+
		"\u0000\u0137\u0139\u0005\u0014\u0000\u0000\u0138\u013a\u0003\u0018\f\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a1\u0001\u0000\u0000\u0000\u013b\u0147\u00038\u001c\u0000\u013c\u0147"+
		"\u0003:\u001d\u0000\u013d\u0147\u0003<\u001e\u0000\u013e\u0147\u00036"+
		"\u001b\u0000\u013f\u0147\u0005\u0006\u0000\u0000\u0140\u0147\u00034\u001a"+
		"\u0000\u0141\u0147\u0003@ \u0000\u0142\u0147\u0003B!\u0000\u0143\u0147"+
		"\u0003D\"\u0000\u0144\u0147\u0003F#\u0000\u0145\u0147\u0003H$\u0000\u0146"+
		"\u013b\u0001\u0000\u0000\u0000\u0146\u013c\u0001\u0000\u0000\u0000\u0146"+
		"\u013d\u0001\u0000\u0000\u0000\u0146\u013e\u0001\u0000\u0000\u0000\u0146"+
		"\u013f\u0001\u0000\u0000\u0000\u0146\u0140\u0001\u0000\u0000\u0000\u0146"+
		"\u0141\u0001\u0000\u0000\u0000\u0146\u0142\u0001\u0000\u0000\u0000\u0146"+
		"\u0143\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146"+
		"\u0145\u0001\u0000\u0000\u0000\u01473\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005;\u0000\u0000\u01495\u0001\u0000\u0000\u0000\u014a\u014b\u0007\u0003"+
		"\u0000\u0000\u014b7\u0001\u0000\u0000\u0000\u014c\u014d\u0005<\u0000\u0000"+
		"\u014d9\u0001\u0000\u0000\u0000\u014e\u014f\u0007\u0004\u0000\u0000\u014f"+
		";\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u001b\u0000\u0000\u0151\u0152"+
		"\u0005\u001e\u0000\u0000\u0152\u0153\u0005;\u0000\u0000\u0153\u0154\u0005"+
		"\u001f\u0000\u0000\u0154=\u0001\u0000\u0000\u0000\u0155\u0156\u0005;\u0000"+
		"\u0000\u0156?\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u000f\u0000\u0000"+
		"\u0158A\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0010\u0000\u0000\u015a"+
		"C\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0011\u0000\u0000\u015cE\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0005\u0012\u0000\u0000\u015eG\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0005\u0013\u0000\u0000\u0160I\u0001\u0000\u0000"+
		"\u0000#MScknrw{\u007f\u0081\u0083\u008d\u009c\u00a1\u00a7\u00ab\u00af"+
		"\u00bc\u00c7\u00ce\u00d6\u00de\u00e5\u00ef\u00fe\u0103\u0109\u0111\u011b"+
		"\u011f\u0128\u0130\u0134\u0139\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}