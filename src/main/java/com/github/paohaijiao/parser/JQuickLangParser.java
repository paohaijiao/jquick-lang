// Generated from D:/idea/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IMPORT=11, RETURN=12, ASSIGN=13, SEMICOLON=14, WITH=15, IF=16, 
		THEN=17, ELSEIF=18, ELSE=19, DOLLAR=20, LPAREN=21, RPAREN=22, LBRACE=23, 
		RBRACE=24, GT=25, GE=26, LT=27, LE=28, EQ=29, NE=30, AND=31, OR=32, ADD=33, 
		MINUS=34, MUL=35, DIV=36, CONTAIN=37, NOTCONTAIN=38, START=39, NOTSTART=40, 
		END=41, NOTEND=42, TRUE=43, FALSE=44, COLON=45, NUMBER=46, DATETIME=47, 
		DATE=48, YEAR=49, MONTH=50, DAY=51, TIME_ZONE=52, IDENTIFIER=53, STRING=54, 
		SINGLE_LINE_COMMENT=55, MULTI_LINE_COMMENT=56, WS=57, NEWLINE=58, NOT=59;
	public static final int
		RULE_program = 0, RULE_importDeclaration = 1, RULE_qualifiedName = 2, 
		RULE_statement = 3, RULE_rule = 4, RULE_functionDefinition = 5, RULE_parameterList = 6, 
		RULE_param = 7, RULE_functionCall = 8, RULE_argumentList = 9, RULE_action = 10, 
		RULE_controlStatement = 11, RULE_ifStatement = 12, RULE_forStatement = 13, 
		RULE_whileStatement = 14, RULE_returnStatement = 15, RULE_expressionStatement = 16, 
		RULE_expression = 17, RULE_assignment = 18, RULE_logicalOr = 19, RULE_logicalAnd = 20, 
		RULE_equality = 21, RULE_comparison = 22, RULE_addition = 23, RULE_multiplication = 24, 
		RULE_unary = 25, RULE_primary = 26, RULE_variableDecl = 27, RULE_literal = 28, 
		RULE_bool = 29, RULE_number = 30, RULE_string = 31, RULE_date = 32, RULE_variables = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDeclaration", "qualifiedName", "statement", "rule", 
			"functionDefinition", "parameterList", "param", "functionCall", "argumentList", 
			"action", "controlStatement", "ifStatement", "forStatement", "whileStatement", 
			"returnStatement", "expressionStatement", "expression", "assignment", 
			"logicalOr", "logicalAnd", "equality", "comparison", "addition", "multiplication", 
			"unary", "primary", "variableDecl", "literal", "bool", "number", "string", 
			"date", "variables"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'function'", "','", "'if'", "'else if'", "'else'", "'for'", 
			"'while'", "'var'", "'null'", "'import'", "'return'", "'='", "';'", "'WITH'", 
			"'IF'", "'THEN'", "'ELSEIF'", "'ELSE'", "'$'", "'('", "')'", "'{'", "'}'", 
			"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", 
			"'-'", "'*'", "'/'", "'CONTAIN'", "'NOTCONTAIN'", "'START'", "'NOTSTART'", 
			"'END'", "'NOTEND'", "'true'", "'false'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "IMPORT", 
			"RETURN", "ASSIGN", "SEMICOLON", "WITH", "IF", "THEN", "ELSEIF", "ELSE", 
			"DOLLAR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "GT", "GE", "LT", "LE", 
			"EQ", "NE", "AND", "OR", "ADD", "MINUS", "MUL", "DIV", "CONTAIN", "NOTCONTAIN", 
			"START", "NOTSTART", "END", "NOTEND", "TRUE", "FALSE", "COLON", "NUMBER", 
			"DATETIME", "DATE", "YEAR", "MONTH", "DAY", "TIME_ZONE", "IDENTIFIER", 
			"STRING", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS", "NEWLINE", 
			"NOT"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(68);
				importDeclaration();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==IDENTIFIER) {
				{
				{
				setState(74);
				statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(82);
			match(IMPORT);
			setState(83);
			qualifiedName();
			setState(84);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IDENTIFIER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(87);
				match(T__0);
				setState(88);
				match(IDENTIFIER);
				}
				}
				setState(93);
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
	public static class StatementContext extends ParserRuleContext {
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(94);
					rule_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				functionCall();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
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
		enterRule(_localctx, 10, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__1);
			setState(104);
			match(IDENTIFIER);
			setState(105);
			match(LPAREN);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(106);
				parameterList();
				}
			}

			setState(109);
			match(RPAREN);
			setState(110);
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
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			param();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(113);
				match(T__2);
				setState(114);
				param();
				}
				}
				setState(119);
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
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(COLON);
			setState(122);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(LPAREN);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18533367998841856L) != 0)) {
				{
				setState(126);
				argumentList();
				}
			}

			setState(129);
			match(RPAREN);
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
		enterRule(_localctx, 18, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			literal();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(132);
				match(T__2);
				setState(133);
				literal();
				}
				}
				setState(138);
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
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JQuickLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JQuickLangParser.RBRACE, 0); }
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
		enterRule(_localctx, 20, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LBRACE);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 604001336738977684L) != 0)) {
				{
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(140);
					statement();
					}
					break;
				case 2:
					{
					setState(141);
					controlStatement();
					}
					break;
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
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
		enterRule(_localctx, 22, RULE_controlStatement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				ifStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				forStatement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				returnStatement();
				}
				break;
			case T__8:
			case T__9:
			case DOLLAR:
			case LPAREN:
			case MINUS:
			case TRUE:
			case FALSE:
			case NUMBER:
			case DATETIME:
			case DATE:
			case IDENTIFIER:
			case STRING:
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
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
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__3);
			setState(157);
			match(LPAREN);
			setState(158);
			expression();
			setState(159);
			match(RPAREN);
			setState(160);
			action();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(161);
				match(T__4);
				setState(162);
				match(LPAREN);
				setState(163);
				expression();
				setState(164);
				match(RPAREN);
				setState(165);
				action();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(172);
				match(T__5);
				setState(173);
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
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__6);
			setState(177);
			match(LPAREN);
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(178);
				variableDecl();
				}
				break;
			case 2:
				{
				setState(179);
				expression();
				}
				break;
			}
			setState(182);
			match(SEMICOLON);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 604001336738973184L) != 0)) {
				{
				setState(183);
				expression();
				}
			}

			setState(186);
			match(SEMICOLON);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 604001336738973184L) != 0)) {
				{
				setState(187);
				expression();
				}
			}

			setState(190);
			match(RPAREN);
			setState(191);
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
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__7);
			setState(194);
			match(LPAREN);
			setState(195);
			expression();
			setState(196);
			match(RPAREN);
			setState(197);
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
		enterRule(_localctx, 30, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(RETURN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 604001336738973184L) != 0)) {
				{
				setState(200);
				expression();
				}
			}

			setState(203);
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
		enterRule(_localctx, 32, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expression();
			setState(206);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
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
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				logicalOr();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JQuickLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IDENTIFIER);
			setState(213);
			match(ASSIGN);
			setState(214);
			expression();
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
	public static class LogicalOrContext extends ParserRuleContext {
		public List<LogicalAndContext> logicalAnd() {
			return getRuleContexts(LogicalAndContext.class);
		}
		public LogicalAndContext logicalAnd(int i) {
			return getRuleContext(LogicalAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JQuickLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JQuickLangParser.OR, i);
		}
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			logicalAnd();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(OR);
					setState(218);
					logicalAnd();
					}
					} 
				}
				setState(223);
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
	public static class LogicalAndContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JQuickLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JQuickLangParser.AND, i);
		}
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			equality();
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(AND);
					setState(226);
					equality();
					}
					} 
				}
				setState(231);
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
	public static class EqualityContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(JQuickLangParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(JQuickLangParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(JQuickLangParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(JQuickLangParser.NE, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equality);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			comparison();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(234);
					comparison();
					}
					} 
				}
				setState(239);
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
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
		enterRule(_localctx, 44, RULE_comparison);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			addition();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(242);
					addition();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class AdditionContext extends ParserRuleContext {
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JQuickLangParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JQuickLangParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JQuickLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JQuickLangParser.MINUS, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			multiplication();
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(250);
					multiplication();
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class MultiplicationContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JQuickLangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JQuickLangParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JQuickLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JQuickLangParser.DIV, i);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiplication);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			unary();
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(258);
					unary();
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class UnaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(JQuickLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JQuickLangParser.MINUS, i);
		}
		public List<TerminalNode> NOT() { return getTokens(JQuickLangParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(JQuickLangParser.NOT, i);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==NOT) {
				{
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			primary();
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 52, RULE_primary);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(LPAREN);
				setState(276);
				expression();
				setState(277);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
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
	public static class VariableDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JQuickLangParser.ASSIGN, 0); }
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
		enterRule(_localctx, 54, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__8);
			setState(283);
			match(IDENTIFIER);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(284);
				match(ASSIGN);
				setState(285);
				expression();
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
	public static class LiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		enterRule(_localctx, 56, RULE_literal);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				string();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				number();
				}
				break;
			case DATETIME:
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				date();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				variables();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				bool();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				match(T__9);
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
		enterRule(_localctx, 58, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JQuickLangParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(NUMBER);
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
		enterRule(_localctx, 62, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 64, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 66, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(DOLLAR);
			setState(305);
			match(LBRACE);
			setState(306);
			match(IDENTIFIER);
			setState(307);
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

	public static final String _serializedATN =
		"\u0004\u0001;\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0005"+
		"\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0005\u0000L\b\u0000"+
		"\n\u0000\f\u0000O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"Z\b\u0002\n\u0002\f\u0002]\t\u0002\u0001\u0003\u0004\u0003`\b\u0003\u000b"+
		"\u0003\f\u0003a\u0001\u0004\u0001\u0004\u0003\u0004f\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005l\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"t\b\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0080\b\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u0087\b\t\n\t\f\t\u008a\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u008f\b\n\n\n\f\n\u0092\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009b\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00a8\b\f\n\f\f\f\u00ab\t\f\u0001\f\u0001\f"+
		"\u0003\f\u00af\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b5\b\r\u0001"+
		"\r\u0001\r\u0003\r\u00b9\b\r\u0001\r\u0001\r\u0003\r\u00bd\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00ca\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00d3\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00dc\b\u0013\n"+
		"\u0013\f\u0013\u00df\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00e4\b\u0014\n\u0014\f\u0014\u00e7\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00ec\b\u0015\n\u0015\f\u0015\u00ef\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00f4\b\u0016\n\u0016\f\u0016"+
		"\u00f7\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00fc\b"+
		"\u0017\n\u0017\f\u0017\u00ff\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0104\b\u0018\n\u0018\f\u0018\u0107\t\u0018\u0001\u0019\u0005"+
		"\u0019\u010a\b\u0019\n\u0019\f\u0019\u010d\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0119\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u011f\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0127\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0000\u0000\""+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0007\u0001\u0000\u001d\u001e\u0001"+
		"\u0000\u0019\u001c\u0001\u0000!\"\u0001\u0000#$\u0002\u0000\"\";;\u0001"+
		"\u0000+,\u0001\u0000/0\u013b\u0000G\u0001\u0000\u0000\u0000\u0002R\u0001"+
		"\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000"+
		"\u0000\be\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\fp\u0001"+
		"\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000"+
		"\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000"+
		"\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000"+
		"\u0000\u001a\u00b0\u0001\u0000\u0000\u0000\u001c\u00c1\u0001\u0000\u0000"+
		"\u0000\u001e\u00c7\u0001\u0000\u0000\u0000 \u00cd\u0001\u0000\u0000\u0000"+
		"\"\u00d2\u0001\u0000\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000&\u00d8"+
		"\u0001\u0000\u0000\u0000(\u00e0\u0001\u0000\u0000\u0000*\u00e8\u0001\u0000"+
		"\u0000\u0000,\u00f0\u0001\u0000\u0000\u0000.\u00f8\u0001\u0000\u0000\u0000"+
		"0\u0100\u0001\u0000\u0000\u00002\u010b\u0001\u0000\u0000\u00004\u0118"+
		"\u0001\u0000\u0000\u00006\u011a\u0001\u0000\u0000\u00008\u0126\u0001\u0000"+
		"\u0000\u0000:\u0128\u0001\u0000\u0000\u0000<\u012a\u0001\u0000\u0000\u0000"+
		">\u012c\u0001\u0000\u0000\u0000@\u012e\u0001\u0000\u0000\u0000B\u0130"+
		"\u0001\u0000\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HM\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0003"+
		"\u0006\u0003\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001"+
		"\u0000\u0000\u0000RS\u0005\u000b\u0000\u0000ST\u0003\u0004\u0002\u0000"+
		"TU\u0005\u000e\u0000\u0000U\u0003\u0001\u0000\u0000\u0000V[\u00055\u0000"+
		"\u0000WX\u0005\u0001\u0000\u0000XZ\u00055\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^`\u0003\b\u0004\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0007\u0001\u0000"+
		"\u0000\u0000cf\u0003\u0010\b\u0000df\u0003\n\u0005\u0000ec\u0001\u0000"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0002\u0000\u0000hi\u00055\u0000\u0000ik\u0005\u0015\u0000\u0000jl\u0003"+
		"\f\u0006\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0005\u0016\u0000\u0000no\u0003\u0014\n\u0000o\u000b"+
		"\u0001\u0000\u0000\u0000pu\u0003\u000e\u0007\u0000qr\u0005\u0003\u0000"+
		"\u0000rt\u0003\u000e\u0007\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\r\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u00055\u0000\u0000yz\u0005"+
		"-\u0000\u0000z{\u00055\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0005"+
		"5\u0000\u0000}\u007f\u0005\u0015\u0000\u0000~\u0080\u0003\u0012\t\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0016\u0000\u0000\u0082"+
		"\u0011\u0001\u0000\u0000\u0000\u0083\u0088\u00038\u001c\u0000\u0084\u0085"+
		"\u0005\u0003\u0000\u0000\u0085\u0087\u00038\u001c\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0013\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0090\u0005"+
		"\u0017\u0000\u0000\u008c\u008f\u0003\u0006\u0003\u0000\u008d\u008f\u0003"+
		"\u0016\u000b\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0018\u0000\u0000\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u009b\u0003"+
		"\u0018\f\u0000\u0096\u009b\u0003\u001a\r\u0000\u0097\u009b\u0003\u001c"+
		"\u000e\u0000\u0098\u009b\u0003\u001e\u000f\u0000\u0099\u009b\u0003 \u0010"+
		"\u0000\u009a\u0095\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000"+
		"\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0005\u0015\u0000"+
		"\u0000\u009e\u009f\u0003\"\u0011\u0000\u009f\u00a0\u0005\u0016\u0000\u0000"+
		"\u00a0\u00a9\u0003\u0014\n\u0000\u00a1\u00a2\u0005\u0005\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0015\u0000\u0000\u00a3\u00a4\u0003\"\u0011\u0000\u00a4\u00a5"+
		"\u0005\u0016\u0000\u0000\u00a5\u00a6\u0003\u0014\n\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ae\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0006\u0000\u0000\u00ad\u00af\u0003"+
		"\u0014\n\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0007"+
		"\u0000\u0000\u00b1\u00b4\u0005\u0015\u0000\u0000\u00b2\u00b5\u00036\u001b"+
		"\u0000\u00b3\u00b5\u0003\"\u0011\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005\u000e\u0000\u0000"+
		"\u00b7\u00b9\u0003\"\u0011\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0005\u000e\u0000\u0000\u00bb\u00bd\u0003\"\u0011\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0016\u0000\u0000\u00bf\u00c0"+
		"\u0003\u0014\n\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"\b\u0000\u0000\u00c2\u00c3\u0005\u0015\u0000\u0000\u00c3\u00c4\u0003\""+
		"\u0011\u0000\u00c4\u00c5\u0005\u0016\u0000\u0000\u00c5\u00c6\u0003\u0014"+
		"\n\u0000\u00c6\u001d\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\f\u0000"+
		"\u0000\u00c8\u00ca\u0003\"\u0011\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u001f\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0003\"\u0011\u0000\u00ce\u00cf\u0005\u000e\u0000\u0000\u00cf"+
		"!\u0001\u0000\u0000\u0000\u00d0\u00d3\u0003$\u0012\u0000\u00d1\u00d3\u0003"+
		"&\u0013\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3#\u0001\u0000\u0000\u0000\u00d4\u00d5\u00055\u0000\u0000"+
		"\u00d5\u00d6\u0005\r\u0000\u0000\u00d6\u00d7\u0003\"\u0011\u0000\u00d7"+
		"%\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003(\u0014\u0000\u00d9\u00da\u0005"+
		" \u0000\u0000\u00da\u00dc\u0003(\u0014\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\'\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003*\u0015\u0000\u00e1"+
		"\u00e2\u0005\u001f\u0000\u0000\u00e2\u00e4\u0003*\u0015\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6)\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ed\u0003"+
		",\u0016\u0000\u00e9\u00ea\u0007\u0000\u0000\u0000\u00ea\u00ec\u0003,\u0016"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee+\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f5\u0003.\u0017\u0000\u00f1\u00f2\u0007\u0001\u0000\u0000\u00f2"+
		"\u00f4\u0003.\u0017\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6-\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fd\u00030\u0018\u0000\u00f9\u00fa\u0007\u0002"+
		"\u0000\u0000\u00fa\u00fc\u00030\u0018\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe/\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0105\u00032\u0019\u0000\u0101"+
		"\u0102\u0007\u0003\u0000\u0000\u0102\u0104\u00032\u0019\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u01061\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010a\u0007"+
		"\u0004\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u00034\u001a\u0000\u010f3\u0001\u0000\u0000"+
		"\u0000\u0110\u0119\u00038\u001c\u0000\u0111\u0119\u00055\u0000\u0000\u0112"+
		"\u0119\u0003\u0010\b\u0000\u0113\u0114\u0005\u0015\u0000\u0000\u0114\u0115"+
		"\u0003\"\u0011\u0000\u0115\u0116\u0005\u0016\u0000\u0000\u0116\u0119\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u00036\u001b\u0000\u0118\u0110\u0001\u0000"+
		"\u0000\u0000\u0118\u0111\u0001\u0000\u0000\u0000\u0118\u0112\u0001\u0000"+
		"\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u01195\u0001\u0000\u0000\u0000\u011a\u011b\u0005\t\u0000"+
		"\u0000\u011b\u011e\u00055\u0000\u0000\u011c\u011d\u0005\r\u0000\u0000"+
		"\u011d\u011f\u0003\"\u0011\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f7\u0001\u0000\u0000\u0000\u0120\u0127"+
		"\u0003>\u001f\u0000\u0121\u0127\u0003<\u001e\u0000\u0122\u0127\u0003@"+
		" \u0000\u0123\u0127\u0003B!\u0000\u0124\u0127\u0003:\u001d\u0000\u0125"+
		"\u0127\u0005\n\u0000\u0000\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0121"+
		"\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u01279\u0001\u0000\u0000\u0000\u0128\u0129\u0007"+
		"\u0005\u0000\u0000\u0129;\u0001\u0000\u0000\u0000\u012a\u012b\u0005.\u0000"+
		"\u0000\u012b=\u0001\u0000\u0000\u0000\u012c\u012d\u00056\u0000\u0000\u012d"+
		"?\u0001\u0000\u0000\u0000\u012e\u012f\u0007\u0006\u0000\u0000\u012fA\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005\u0014\u0000\u0000\u0131\u0132\u0005"+
		"\u0017\u0000\u0000\u0132\u0133\u00055\u0000\u0000\u0133\u0134\u0005\u0018"+
		"\u0000\u0000\u0134C\u0001\u0000\u0000\u0000\u001dGM[aeku\u007f\u0088\u008e"+
		"\u0090\u009a\u00a9\u00ae\u00b4\u00b8\u00bc\u00c9\u00d2\u00dd\u00e5\u00ed"+
		"\u00f5\u00fd\u0105\u010b\u0118\u011e\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}