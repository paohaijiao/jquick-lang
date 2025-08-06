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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TYPESHORT=15, TYPENULL=16, 
		THIS=17, CONTINUE=18, BREAK=19, TYPEINT=20, TYPEFLOAT=21, TYPEDOUBLE=22, 
		TYPELONG=23, TYPEBOOLEAN=24, TYPEBYTE=25, IMPORT=26, NEW=27, VAR=28, AS=29, 
		RETURN=30, FUNCTION=31, WHILE=32, FOR=33, SHORT=34, INTEGER=35, FLOAT=36, 
		DOUBLE=37, LONG=38, ASSIGN=39, SEMICOLON=40, WITH=41, IF=42, THEN=43, 
		ELSEIF=44, ELSE=45, DOLLAR=46, LPAREN=47, RPAREN=48, LBRACE=49, RBRACE=50, 
		GT=51, GE=52, LT=53, LE=54, EQ=55, NE=56, AND=57, OR=58, ADD=59, MINUS=60, 
		MUL=61, DIV=62, CONTAIN=63, NOTCONTAIN=64, START=65, NOTSTART=66, END=67, 
		NOTEND=68, TRUE=69, FALSE=70, COLON=71, DATETIME=72, DATE=73, YEAR=74, 
		MONTH=75, DAY=76, TIME_ZONE=77, IDENTIFIER=78, STRING=79, SINGLE_LINE_COMMENT=80, 
		MULTI_LINE_COMMENT=81, WS=82, NEWLINE=83;
	public static final int
		RULE_program = 0, RULE_importDeclaration = 1, RULE_paramType = 2, RULE_genericType = 3, 
		RULE_simpleType = 4, RULE_arrayType = 5, RULE_listType = 6, RULE_setType = 7, 
		RULE_mapType = 8, RULE_qualifiedName = 9, RULE_typeArguments = 10, RULE_statement = 11, 
		RULE_method = 12, RULE_action = 13, RULE_controlStatement = 14, RULE_ifStatement = 15, 
		RULE_elseIfConExpression = 16, RULE_elseIfAction = 17, RULE_elseAction = 18, 
		RULE_forStatement = 19, RULE_initExpression = 20, RULE_conExpression = 21, 
		RULE_stopExpression = 22, RULE_whileStatement = 23, RULE_returnStatement = 24, 
		RULE_breakStatement = 25, RULE_continueStatement = 26, RULE_expressionStatement = 27, 
		RULE_variableDecl = 28, RULE_expression = 29, RULE_sout = 30, RULE_logical = 31, 
		RULE_comparison = 32, RULE_arithmetic = 33, RULE_functionDefinition = 34, 
		RULE_parameterList = 35, RULE_param = 36, RULE_functionVar = 37, RULE_classsType = 38, 
		RULE_primary = 39, RULE_methodInvocation = 40, RULE_this = 41, RULE_instanceName = 42, 
		RULE_methodName = 43, RULE_argumentList = 44, RULE_accessStaticVariable = 45, 
		RULE_accessObjectName = 46, RULE_literal = 47, RULE_listLiteral = 48, 
		RULE_mapLiteral = 49, RULE_mapEntry = 50, RULE_setLiteral = 51, RULE_importVar = 52, 
		RULE_identifier = 53, RULE_bool = 54, RULE_string = 55, RULE_date = 56, 
		RULE_variables = 57, RULE_short = 58, RULE_int = 59, RULE_float = 60, 
		RULE_double = 61, RULE_long = 62, RULE_null = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDeclaration", "paramType", "genericType", "simpleType", 
			"arrayType", "listType", "setType", "mapType", "qualifiedName", "typeArguments", 
			"statement", "method", "action", "controlStatement", "ifStatement", "elseIfConExpression", 
			"elseIfAction", "elseAction", "forStatement", "initExpression", "conExpression", 
			"stopExpression", "whileStatement", "returnStatement", "breakStatement", 
			"continueStatement", "expressionStatement", "variableDecl", "expression", 
			"sout", "logical", "comparison", "arithmetic", "functionDefinition", 
			"parameterList", "param", "functionVar", "classsType", "primary", "methodInvocation", 
			"this", "instanceName", "methodName", "argumentList", "accessStaticVariable", 
			"accessObjectName", "literal", "listLiteral", "mapLiteral", "mapEntry", 
			"setLiteral", "importVar", "identifier", "bool", "string", "date", "variables", 
			"short", "int", "float", "double", "long", "null"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'List'", "'Set'", "'Map'", "','", "'.'", "'if'", 
			"'else if'", "'else'", "'console.log('", "'@'", "'.class'", "'#'", "'short'", 
			"'null'", "'this'", "'continue'", "'break'", "'int'", "'float'", "'double'", 
			"'long'", "'boolean'", "'byte'", "'import'", "'new'", "'var'", "'as'", 
			"'return'", "'function'", "'while'", "'for'", null, null, null, null, 
			null, "'='", "';'", "'WITH'", "'IF'", "'THEN'", "'ELSEIF'", "'ELSE'", 
			"'$'", "'('", "')'", "'{'", "'}'", "'>'", "'>='", "'<'", "'<='", "'=='", 
			"'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'CONTAIN'", "'NOTCONTAIN'", 
			"'START'", "'NOTSTART'", "'END'", "'NOTEND'", "'true'", "'false'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TYPESHORT", "TYPENULL", "THIS", "CONTINUE", "BREAK", 
			"TYPEINT", "TYPEFLOAT", "TYPEDOUBLE", "TYPELONG", "TYPEBOOLEAN", "TYPEBYTE", 
			"IMPORT", "NEW", "VAR", "AS", "RETURN", "FUNCTION", "WHILE", "FOR", "SHORT", 
			"INTEGER", "FLOAT", "DOUBLE", "LONG", "ASSIGN", "SEMICOLON", "WITH", 
			"IF", "THEN", "ELSEIF", "ELSE", "DOLLAR", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "GT", "GE", "LT", "LE", "EQ", "NE", "AND", "OR", "ADD", "MINUS", 
			"MUL", "DIV", "CONTAIN", "NOTCONTAIN", "START", "NOTSTART", "END", "NOTEND", 
			"TRUE", "FALSE", "COLON", "DATETIME", "DATE", "YEAR", "MONTH", "DAY", 
			"TIME_ZONE", "IDENTIFIER", "STRING", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"WS", "NEWLINE"
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


	    public static boolean banner=true;
	    void start(){
	        if(banner){
	          System.out.println("########################################################################################################");
	          System.out.println("########################################\033[31m  welcome use jquick Language \033[0m##################################");
	          System.out.println("#########################\033[31m  for technical support, contact me via goudingcheng@gmail.com \033[0m################");
	          System.out.println("########################################################################################################");
	        }
	     }

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
			start();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(129);
				importDeclaration();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9781804324079930L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				{
				setState(135);
				statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
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
			setState(143);
			match(IMPORT);
			setState(144);
			paramType();
			setState(145);
			match(AS);
			setState(146);
			importVar();
			setState(147);
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
	public static class ParamTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitParamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitParamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramType);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				genericType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				listType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				mapType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				setType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				arrayType();
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
	public static class GenericTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			qualifiedName();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(158);
				typeArguments();
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
	public static class SimpleTypeContext extends ParserRuleContext {
		public TerminalNode TYPESHORT() { return getToken(JQuickLangParser.TYPESHORT, 0); }
		public TerminalNode TYPEINT() { return getToken(JQuickLangParser.TYPEINT, 0); }
		public TerminalNode TYPEFLOAT() { return getToken(JQuickLangParser.TYPEFLOAT, 0); }
		public TerminalNode TYPEDOUBLE() { return getToken(JQuickLangParser.TYPEDOUBLE, 0); }
		public TerminalNode TYPELONG() { return getToken(JQuickLangParser.TYPELONG, 0); }
		public TerminalNode TYPEBOOLEAN() { return getToken(JQuickLangParser.TYPEBOOLEAN, 0); }
		public TerminalNode TYPEBYTE() { return getToken(JQuickLangParser.TYPEBYTE, 0); }
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66093056L) != 0)) ) {
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESHORT:
			case TYPEINT:
			case TYPEFLOAT:
			case TYPEDOUBLE:
			case TYPELONG:
			case TYPEBOOLEAN:
			case TYPEBYTE:
				{
				setState(163);
				simpleType();
				}
				break;
			case IDENTIFIER:
				{
				setState(164);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(T__0);
				setState(168);
				match(T__1);
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JQuickLangParser.LT, 0); }
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(JQuickLangParser.GT, 0); }
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__2);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(174);
				match(LT);
				setState(175);
				paramType();
				setState(176);
				match(GT);
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
	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JQuickLangParser.LT, 0); }
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(JQuickLangParser.GT, 0); }
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__3);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(181);
				match(LT);
				setState(182);
				paramType();
				setState(183);
				match(GT);
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
	public static class MapTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JQuickLangParser.LT, 0); }
		public List<ParamTypeContext> paramType() {
			return getRuleContexts(ParamTypeContext.class);
		}
		public ParamTypeContext paramType(int i) {
			return getRuleContext(ParamTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(JQuickLangParser.GT, 0); }
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mapType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__4);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(188);
				match(LT);
				setState(189);
				paramType();
				setState(190);
				match(T__5);
				setState(191);
				paramType();
				setState(192);
				match(GT);
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
		enterRule(_localctx, 18, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IDENTIFIER);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(197);
				match(T__6);
				setState(198);
				match(IDENTIFIER);
				}
				}
				setState(203);
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
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JQuickLangParser.LT, 0); }
		public List<ParamTypeContext> paramType() {
			return getRuleContexts(ParamTypeContext.class);
		}
		public ParamTypeContext paramType(int i) {
			return getRuleContext(ParamTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(JQuickLangParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LT);
			setState(205);
			paramType();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(206);
				match(T__5);
				setState(207);
				paramType();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(GT);
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
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public SoutContext sout() {
			return getRuleContext(SoutContext.class,0);
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				expression();
				setState(216);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				method();
				setState(220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(219);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				controlStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				sout();
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
	public static class MethodContext extends ParserRuleContext {
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case TYPESHORT:
			case THIS:
			case TYPEINT:
			case TYPEFLOAT:
			case TYPEDOUBLE:
			case TYPELONG:
			case TYPEBOOLEAN:
			case TYPEBYTE:
			case NEW:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				methodInvocation();
				}
				break;
			case FUNCTION:
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
		public List<ControlStatementContext> controlStatement() {
			return getRuleContexts(ControlStatementContext.class);
		}
		public ControlStatementContext controlStatement(int i) {
			return getRuleContext(ControlStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 26, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LBRACE);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9781804324079930L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(231);
					variableDecl();
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(232);
						match(SEMICOLON);
						}
					}

					}
					break;
				case 2:
					{
					setState(235);
					controlStatement();
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(236);
						match(SEMICOLON);
						}
					}

					}
					break;
				case 3:
					{
					setState(239);
					statement();
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(240);
						match(SEMICOLON);
						}
					}

					}
					break;
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
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
		enterRule(_localctx, 28, RULE_controlStatement);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				returnStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				continueStatement();
				}
				break;
			case T__0:
			case T__2:
			case T__3:
			case T__4:
			case T__13:
			case TYPESHORT:
			case TYPENULL:
			case THIS:
			case TYPEINT:
			case TYPEFLOAT:
			case TYPEDOUBLE:
			case TYPELONG:
			case TYPEBOOLEAN:
			case TYPEBYTE:
			case NEW:
			case SHORT:
			case INTEGER:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case DOLLAR:
			case LPAREN:
			case LBRACE:
			case TRUE:
			case FALSE:
			case DATETIME:
			case DATE:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
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
		public ConExpressionContext conExpression() {
			return getRuleContext(ConExpressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(JQuickLangParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(JQuickLangParser.RPAREN, i);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<ElseIfConExpressionContext> elseIfConExpression() {
			return getRuleContexts(ElseIfConExpressionContext.class);
		}
		public ElseIfConExpressionContext elseIfConExpression(int i) {
			return getRuleContext(ElseIfConExpressionContext.class,i);
		}
		public List<ElseIfActionContext> elseIfAction() {
			return getRuleContexts(ElseIfActionContext.class);
		}
		public ElseIfActionContext elseIfAction(int i) {
			return getRuleContext(ElseIfActionContext.class,i);
		}
		public ElseActionContext elseAction() {
			return getRuleContext(ElseActionContext.class,0);
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
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__7);
			setState(260);
			match(LPAREN);
			setState(261);
			conExpression();
			setState(262);
			match(RPAREN);
			setState(263);
			action();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(264);
				match(T__8);
				setState(265);
				match(LPAREN);
				setState(266);
				elseIfConExpression();
				setState(267);
				match(RPAREN);
				setState(268);
				elseIfAction();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(275);
				match(T__9);
				setState(276);
				elseAction();
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
	public static class ElseIfConExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseIfConExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfConExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterElseIfConExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitElseIfConExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitElseIfConExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfConExpressionContext elseIfConExpression() throws RecognitionException {
		ElseIfConExpressionContext _localctx = new ElseIfConExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseIfConExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
	public static class ElseIfActionContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ElseIfActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterElseIfAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitElseIfAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitElseIfAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfActionContext elseIfAction() throws RecognitionException {
		ElseIfActionContext _localctx = new ElseIfActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseIfAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
	public static class ElseActionContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ElseActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterElseAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitElseAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitElseAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseActionContext elseAction() throws RecognitionException {
		ElseActionContext _localctx = new ElseActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		public InitExpressionContext initExpression() {
			return getRuleContext(InitExpressionContext.class,0);
		}
		public ConExpressionContext conExpression() {
			return getRuleContext(ConExpressionContext.class,0);
		}
		public StopExpressionContext stopExpression() {
			return getRuleContext(StopExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(FOR);
			setState(286);
			match(LPAREN);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(287);
				variableDecl();
				}
				break;
			case 2:
				{
				setState(288);
				initExpression();
				}
				break;
			}
			setState(291);
			match(SEMICOLON);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 774588962422842L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				setState(292);
				conExpression();
				}
			}

			setState(295);
			match(SEMICOLON);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 774588962422842L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				setState(296);
				stopExpression();
				}
			}

			setState(299);
			match(RPAREN);
			setState(300);
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
	public static class InitExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterInitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitInitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitInitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitExpressionContext initExpression() throws RecognitionException {
		InitExpressionContext _localctx = new InitExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
	public static class ConExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterConExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitConExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitConExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConExpressionContext conExpression() throws RecognitionException {
		ConExpressionContext _localctx = new ConExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
	public static class StopExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterStopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitStopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitStopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopExpressionContext stopExpression() throws RecognitionException {
		StopExpressionContext _localctx = new StopExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 46, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(WHILE);
			setState(309);
			match(LPAREN);
			setState(310);
			expression();
			setState(311);
			match(RPAREN);
			setState(312);
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
		enterRule(_localctx, 48, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(RETURN);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 774588962422842L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				setState(315);
				expression();
				}
			}

			setState(318);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JQuickLangParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(JQuickLangParser.SEMICOLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(BREAK);
			setState(321);
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JQuickLangParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(JQuickLangParser.SEMICOLON, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(CONTINUE);
			setState(324);
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
		enterRule(_localctx, 54, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			expression();
			setState(327);
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
	public static class VariableDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JQuickLangParser.ASSIGN, 0); }
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_variableDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(329);
				paramType();
				}
				break;
			}
			setState(332);
			match(IDENTIFIER);
			setState(333);
			match(ASSIGN);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(334);
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
		enterRule(_localctx, 58, RULE_expression);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				logical();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
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
	public static class SoutContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public SoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterSout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitSout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitSout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoutContext sout() throws RecognitionException {
		SoutContext _localctx = new SoutContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__10);
			setState(344);
			expression();
			setState(345);
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
	public static class LogicalContext extends ParserRuleContext {
		public Token op;
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
		enterRule(_localctx, 62, RULE_logical);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			comparison();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					((LogicalContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
					comparison();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public Token op;
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
		enterRule(_localctx, 64, RULE_comparison);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			primary();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					((ComparisonContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 141863388262170624L) != 0)) ) {
						((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(357);
					primary();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 66, RULE_arithmetic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			primary();
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(364);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8646911284551352320L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(365);
					primary();
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
		enterRule(_localctx, 68, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(371);
				typeArguments();
				}
			}

			setState(374);
			match(FUNCTION);
			setState(375);
			match(IDENTIFIER);
			setState(376);
			match(LPAREN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66093112L) != 0) || _la==IDENTIFIER) {
				{
				setState(377);
				parameterList();
				}
			}

			setState(380);
			match(RPAREN);


			       
			setState(382);
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
		enterRule(_localctx, 70, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			param();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(386);
				match(T__5);
				setState(387);
				param();
				}
				}
				setState(392);
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
		public ClasssTypeContext classsType() {
			return getRuleContext(ClasssTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JQuickLangParser.COLON, 0); }
		public FunctionVarContext functionVar() {
			return getRuleContext(FunctionVarContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			classsType();
			setState(394);
			match(COLON);
			setState(395);
			functionVar();
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
	public static class FunctionVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public FunctionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterFunctionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitFunctionVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitFunctionVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVarContext functionVar() throws RecognitionException {
		FunctionVarContext _localctx = new FunctionVarContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
	public static class ClasssTypeContext extends ParserRuleContext {
		public ImportVarContext importVar() {
			return getRuleContext(ImportVarContext.class,0);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ClasssTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classsType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterClasssType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitClasssType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitClasssType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasssTypeContext classsType() throws RecognitionException {
		ClasssTypeContext _localctx = new ClasssTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classsType);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				importVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				paramType();
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
		enterRule(_localctx, 78, RULE_primary);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(LPAREN);
				setState(407);
				expression();
				setState(408);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
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
	public static class StaticCallContext extends MethodInvocationContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(JQuickLangParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JQuickLangParser.COLON, i);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public StaticCallContext(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterStaticCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitStaticCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitStaticCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisMethodCallContext extends MethodInvocationContext {
		public ThisContext this_() {
			return getRuleContext(ThisContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ThisMethodCallContext(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterThisMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitThisMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitThisMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessStaticMethodCallContext extends MethodInvocationContext {
		public AccessStaticVariableContext accessStaticVariable() {
			return getRuleContext(AccessStaticVariableContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AccessStaticMethodCallContext(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterAccessStaticMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitAccessStaticMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitAccessStaticMethodCall(this);
			else return visitor.visitChildren(this);
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
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
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
	public static class InstanceMethodCallContext extends MethodInvocationContext {
		public InstanceNameContext instanceName() {
			return getRuleContext(InstanceNameContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JQuickLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JQuickLangParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
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
		enterRule(_localctx, 80, RULE_methodInvocation);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new StaticCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				qualifiedName();
				setState(414);
				match(COLON);
				setState(415);
				match(COLON);
				setState(416);
				methodName();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(417);
					typeArguments();
					}
				}

				setState(420);
				match(LPAREN);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 633851273625602L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
					{
					setState(421);
					argumentList();
					}
				}

				setState(424);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ConstructorCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(NEW);
				setState(427);
				qualifiedName();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(428);
					typeArguments();
					}
				}

				setState(431);
				match(LPAREN);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 633851273625602L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
					{
					setState(432);
					argumentList();
					}
				}

				setState(435);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new InstanceMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				instanceName();
				setState(438);
				match(T__6);
				setState(439);
				methodName();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(440);
					typeArguments();
					}
				}

				setState(443);
				match(LPAREN);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 633851273625602L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
					{
					setState(444);
					argumentList();
					}
				}

				setState(447);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ThisMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				this_();
				setState(450);
				match(T__6);
				setState(451);
				methodName();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(452);
					typeArguments();
					}
				}

				setState(455);
				match(LPAREN);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 633851273625602L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
					{
					setState(456);
					argumentList();
					}
				}

				setState(459);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new AccessStaticMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				accessStaticVariable();
				setState(462);
				match(T__6);
				setState(463);
				methodName();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(464);
					typeArguments();
					}
				}

				setState(467);
				match(LPAREN);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 633851273625602L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
					{
					setState(468);
					argumentList();
					}
				}

				setState(471);
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
	public static class ThisContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(JQuickLangParser.THIS, 0); }
		public ThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisContext this_() throws RecognitionException {
		ThisContext _localctx = new ThisContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_this);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(THIS);
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
		enterRule(_localctx, 84, RULE_instanceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
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
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JQuickLangParser.IDENTIFIER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
		enterRule(_localctx, 88, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			literal();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(482);
				match(T__5);
				setState(483);
				literal();
				}
				}
				setState(488);
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
	public static class AccessStaticVariableContext extends ParserRuleContext {
		public ClasssTypeContext classsType() {
			return getRuleContext(ClasssTypeContext.class,0);
		}
		public AccessObjectNameContext accessObjectName() {
			return getRuleContext(AccessObjectNameContext.class,0);
		}
		public AccessStaticVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessStaticVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterAccessStaticVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitAccessStaticVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitAccessStaticVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessStaticVariableContext accessStaticVariable() throws RecognitionException {
		AccessStaticVariableContext _localctx = new AccessStaticVariableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_accessStaticVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			classsType();
			setState(490);
			match(T__11);
			setState(491);
			accessObjectName();
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
	public static class AccessObjectNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessObjectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterAccessObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitAccessObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitAccessObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessObjectNameContext accessObjectName() throws RecognitionException {
		AccessObjectNameContext _localctx = new AccessObjectNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_accessObjectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			identifier();
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NullContext null_() {
			return getRuleContext(NullContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public MapLiteralContext mapLiteral() {
			return getRuleContext(MapLiteralContext.class,0);
		}
		public SetLiteralContext setLiteral() {
			return getRuleContext(SetLiteralContext.class,0);
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
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				date();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				null_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(500);
				variables();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(501);
				short_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(502);
				int_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(503);
				float_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(504);
				double_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(505);
				long_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(506);
				qualifiedName();
				setState(507);
				match(T__12);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(509);
				listLiteral();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(510);
				mapLiteral();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(511);
				setLiteral();
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
	public static class ListLiteralContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__0);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 774588962422842L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				setState(515);
				expression();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(516);
					match(T__5);
					setState(517);
					expression();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(525);
			match(T__1);
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
	public static class MapLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JQuickLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JQuickLangParser.RBRACE, 0); }
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public MapLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterMapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitMapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(LBRACE);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 774588962422842L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				setState(528);
				mapEntry();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(529);
					match(T__5);
					setState(530);
					mapEntry();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(538);
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
	public static class MapEntryContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JQuickLangParser.COLON, 0); }
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitMapEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitMapEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mapEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			expression();
			setState(541);
			match(COLON);
			setState(542);
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
	public static class SetLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JQuickLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JQuickLangParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitSetLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitSetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetLiteralContext setLiteral() throws RecognitionException {
		SetLiteralContext _localctx = new SetLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_setLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__13);
			setState(545);
			match(LBRACE);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 774588962422842L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1563L) != 0)) {
				{
				setState(546);
				expression();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(547);
					match(T__5);
					setState(548);
					expression();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(556);
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
		enterRule(_localctx, 104, RULE_importVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		enterRule(_localctx, 106, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		enterRule(_localctx, 108, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 110, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		enterRule(_localctx, 112, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 114, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(DOLLAR);
			setState(569);
			match(LBRACE);
			setState(570);
			match(IDENTIFIER);
			setState(571);
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
		enterRule(_localctx, 116, RULE_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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
		enterRule(_localctx, 118, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		enterRule(_localctx, 120, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		enterRule(_localctx, 122, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		enterRule(_localctx, 124, RULE_long);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends ParserRuleContext {
		public TerminalNode TYPENULL() { return getToken(JQuickLangParser.TYPENULL, 0); }
		public NullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullContext null_() throws RecognitionException {
		NullContext _localctx = new NullContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(TYPENULL);
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
		"\u0004\u0001S\u024a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0083\b\u0000\n\u0000\f\u0000\u0086\t\u0000\u0001\u0000\u0005"+
		"\u0000\u0089\b\u0000\n\u0000\f\u0000\u008c\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u009c\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00a0\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00a6"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00aa\b\u0005\u000b\u0005"+
		"\f\u0005\u00ab\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b3\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00ba\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00c3\b\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00c8\b\t\n\t\f\t\u00cb\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u00d1\b\n\n\n\f\n\u00d4\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00dd\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e1\b\u000b\u0001\f\u0001\f\u0003\f\u00e5\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00ea\b\r\u0001\r\u0001\r\u0003\r\u00ee\b\r"+
		"\u0001\r\u0001\r\u0003\r\u00f2\b\r\u0005\r\u00f4\b\r\n\r\f\r\u00f7\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0102\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u010f\b\u000f\n"+
		"\u000f\f\u000f\u0112\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0116"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0122"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0126\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u012a\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u013d\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c\u014b\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0150\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0156\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u015f\b\u001f\n\u001f\f\u001f\u0162\t\u001f\u0001 \u0001"+
		" \u0001 \u0005 \u0167\b \n \f \u016a\t \u0001!\u0001!\u0001!\u0005!\u016f"+
		"\b!\n!\f!\u0172\t!\u0001\"\u0003\"\u0175\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u017b\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0005#\u0185\b#\n#\f#\u0188\t#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u0192\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u019c\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01a3\b(\u0001(\u0001(\u0003(\u01a7\b(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u01ae\b(\u0001(\u0001(\u0003(\u01b2\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01ba\b(\u0001(\u0001(\u0003"+
		"(\u01be\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01c6\b(\u0001"+
		"(\u0001(\u0003(\u01ca\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u01d2\b(\u0001(\u0001(\u0003(\u01d6\b(\u0001(\u0001(\u0003(\u01da\b"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0005"+
		",\u01e5\b,\n,\f,\u01e8\t,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0201\b/\u00010\u0001"+
		"0\u00010\u00010\u00050\u0207\b0\n0\f0\u020a\t0\u00030\u020c\b0\u00010"+
		"\u00010\u00011\u00011\u00011\u00011\u00051\u0214\b1\n1\f1\u0217\t1\u0003"+
		"1\u0219\b1\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u0226\b3\n3\f3\u0229\t3\u00033\u022b\b3\u00013"+
		"\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001;\u0001"+
		";\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001?\u0000"+
		"\u0000@\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0000"+
		"\u0006\u0002\u0000\u000f\u000f\u0014\u0019\u0001\u00009:\u0001\u00003"+
		"8\u0001\u0000;>\u0001\u0000EF\u0001\u0000HI\u0263\u0000\u0080\u0001\u0000"+
		"\u0000\u0000\u0002\u008f\u0001\u0000\u0000\u0000\u0004\u009b\u0001\u0000"+
		"\u0000\u0000\u0006\u009d\u0001\u0000\u0000\u0000\b\u00a1\u0001\u0000\u0000"+
		"\u0000\n\u00a5\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000"+
		"\u000e\u00b4\u0001\u0000\u0000\u0000\u0010\u00bb\u0001\u0000\u0000\u0000"+
		"\u0012\u00c4\u0001\u0000\u0000\u0000\u0014\u00cc\u0001\u0000\u0000\u0000"+
		"\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000"+
		"\u001a\u00e6\u0001\u0000\u0000\u0000\u001c\u0101\u0001\u0000\u0000\u0000"+
		"\u001e\u0103\u0001\u0000\u0000\u0000 \u0117\u0001\u0000\u0000\u0000\""+
		"\u0119\u0001\u0000\u0000\u0000$\u011b\u0001\u0000\u0000\u0000&\u011d\u0001"+
		"\u0000\u0000\u0000(\u012e\u0001\u0000\u0000\u0000*\u0130\u0001\u0000\u0000"+
		"\u0000,\u0132\u0001\u0000\u0000\u0000.\u0134\u0001\u0000\u0000\u00000"+
		"\u013a\u0001\u0000\u0000\u00002\u0140\u0001\u0000\u0000\u00004\u0143\u0001"+
		"\u0000\u0000\u00006\u0146\u0001\u0000\u0000\u00008\u014a\u0001\u0000\u0000"+
		"\u0000:\u0155\u0001\u0000\u0000\u0000<\u0157\u0001\u0000\u0000\u0000>"+
		"\u015b\u0001\u0000\u0000\u0000@\u0163\u0001\u0000\u0000\u0000B\u016b\u0001"+
		"\u0000\u0000\u0000D\u0174\u0001\u0000\u0000\u0000F\u0181\u0001\u0000\u0000"+
		"\u0000H\u0189\u0001\u0000\u0000\u0000J\u018d\u0001\u0000\u0000\u0000L"+
		"\u0191\u0001\u0000\u0000\u0000N\u019b\u0001\u0000\u0000\u0000P\u01d9\u0001"+
		"\u0000\u0000\u0000R\u01db\u0001\u0000\u0000\u0000T\u01dd\u0001\u0000\u0000"+
		"\u0000V\u01df\u0001\u0000\u0000\u0000X\u01e1\u0001\u0000\u0000\u0000Z"+
		"\u01e9\u0001\u0000\u0000\u0000\\\u01ed\u0001\u0000\u0000\u0000^\u0200"+
		"\u0001\u0000\u0000\u0000`\u0202\u0001\u0000\u0000\u0000b\u020f\u0001\u0000"+
		"\u0000\u0000d\u021c\u0001\u0000\u0000\u0000f\u0220\u0001\u0000\u0000\u0000"+
		"h\u022e\u0001\u0000\u0000\u0000j\u0230\u0001\u0000\u0000\u0000l\u0232"+
		"\u0001\u0000\u0000\u0000n\u0234\u0001\u0000\u0000\u0000p\u0236\u0001\u0000"+
		"\u0000\u0000r\u0238\u0001\u0000\u0000\u0000t\u023d\u0001\u0000\u0000\u0000"+
		"v\u023f\u0001\u0000\u0000\u0000x\u0241\u0001\u0000\u0000\u0000z\u0243"+
		"\u0001\u0000\u0000\u0000|\u0245\u0001\u0000\u0000\u0000~\u0247\u0001\u0000"+
		"\u0000\u0000\u0080\u0084\u0006\u0000\uffff\uffff\u0000\u0081\u0083\u0003"+
		"\u0002\u0001\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u008a\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0003\u0016\u000b\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0000\u0000\u0001\u008e\u0001\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u001a\u0000\u0000\u0090\u0091\u0003\u0004\u0002\u0000\u0091\u0092\u0005"+
		"\u001d\u0000\u0000\u0092\u0093\u0003h4\u0000\u0093\u0094\u0005(\u0000"+
		"\u0000\u0094\u0003\u0001\u0000\u0000\u0000\u0095\u009c\u0003\b\u0004\u0000"+
		"\u0096\u009c\u0003\u0006\u0003\u0000\u0097\u009c\u0003\f\u0006\u0000\u0098"+
		"\u009c\u0003\u0010\b\u0000\u0099\u009c\u0003\u000e\u0007\u0000\u009a\u009c"+
		"\u0003\n\u0005\u0000\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0096\u0001"+
		"\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u0005\u0001\u0000\u0000\u0000\u009d\u009f\u0003"+
		"\u0012\t\u0000\u009e\u00a0\u0003\u0014\n\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0007\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0007\u0000\u0000\u0000\u00a2\t\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a6\u0003\b\u0004\u0000\u00a4\u00a6\u0003\u0012\t\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000"+
		"\u00a8\u00aa\u0005\u0002\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b2\u0005\u0003\u0000\u0000\u00ae\u00af\u00055\u0000\u0000\u00af"+
		"\u00b0\u0003\u0004\u0002\u0000\u00b0\u00b1\u00053\u0000\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\r\u0001\u0000\u0000\u0000\u00b4\u00b9\u0005"+
		"\u0004\u0000\u0000\u00b5\u00b6\u00055\u0000\u0000\u00b6\u00b7\u0003\u0004"+
		"\u0002\u0000\u00b7\u00b8\u00053\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u000f\u0001\u0000\u0000\u0000\u00bb\u00c2\u0005\u0005\u0000"+
		"\u0000\u00bc\u00bd\u00055\u0000\u0000\u00bd\u00be\u0003\u0004\u0002\u0000"+
		"\u00be\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c0\u0003\u0004\u0002\u0000"+
		"\u00c0\u00c1\u00053\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u0011\u0001\u0000\u0000\u0000\u00c4\u00c9\u0005N\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0007\u0000\u0000\u00c6\u00c8\u0005N\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u0013\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"5\u0000\u0000\u00cd\u00d2\u0003\u0004\u0002\u0000\u00ce\u00cf\u0005\u0006"+
		"\u0000\u0000\u00cf\u00d1\u0003\u0004\u0002\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u00053\u0000"+
		"\u0000\u00d6\u0015\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003:\u001d\u0000"+
		"\u00d8\u00d9\u0005(\u0000\u0000\u00d9\u00e1\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0003\u0018\f\u0000\u00db\u00dd\u0005(\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e1"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u0003\u001c\u000e\u0000\u00df\u00e1"+
		"\u0003<\u001e\u0000\u00e0\u00d7\u0001\u0000\u0000\u0000\u00e0\u00da\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001"+
		"\u0000\u0000\u0000\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e5\u0003"+
		"P(\u0000\u00e3\u00e5\u0003D\"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u0019\u0001\u0000\u0000\u0000"+
		"\u00e6\u00f5\u00051\u0000\u0000\u00e7\u00e9\u00038\u001c\u0000\u00e8\u00ea"+
		"\u0005(\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00f4\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003"+
		"\u001c\u000e\u0000\u00ec\u00ee\u0005(\u0000\u0000\u00ed\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f4\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f1\u0003\u0016\u000b\u0000\u00f0\u00f2\u0005(\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u00052\u0000\u0000"+
		"\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa\u0102\u0003\u001e\u000f\u0000"+
		"\u00fb\u0102\u0003&\u0013\u0000\u00fc\u0102\u0003.\u0017\u0000\u00fd\u0102"+
		"\u00030\u0018\u0000\u00fe\u0102\u00032\u0019\u0000\u00ff\u0102\u00034"+
		"\u001a\u0000\u0100\u0102\u00036\u001b\u0000\u0101\u00fa\u0001\u0000\u0000"+
		"\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0101\u00fc\u0001\u0000\u0000"+
		"\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u001d\u0001\u0000\u0000\u0000\u0103\u0104\u0005\b\u0000\u0000"+
		"\u0104\u0105\u0005/\u0000\u0000\u0105\u0106\u0003*\u0015\u0000\u0106\u0107"+
		"\u00050\u0000\u0000\u0107\u0110\u0003\u001a\r\u0000\u0108\u0109\u0005"+
		"\t\u0000\u0000\u0109\u010a\u0005/\u0000\u0000\u010a\u010b\u0003 \u0010"+
		"\u0000\u010b\u010c\u00050\u0000\u0000\u010c\u010d\u0003\"\u0011\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000\u0000"+
		"\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0115\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114"+
		"\u0116\u0003$\u0012\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u001f\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0003:\u001d\u0000\u0118!\u0001\u0000\u0000\u0000\u0119\u011a\u0003\u001a"+
		"\r\u0000\u011a#\u0001\u0000\u0000\u0000\u011b\u011c\u0003\u001a\r\u0000"+
		"\u011c%\u0001\u0000\u0000\u0000\u011d\u011e\u0005!\u0000\u0000\u011e\u0121"+
		"\u0005/\u0000\u0000\u011f\u0122\u00038\u001c\u0000\u0120\u0122\u0003("+
		"\u0014\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0125\u0005(\u0000\u0000\u0124\u0126\u0003*\u0015\u0000"+
		"\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0005(\u0000\u0000\u0128"+
		"\u012a\u0003,\u0016\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u00050\u0000\u0000\u012c\u012d\u0003\u001a\r\u0000\u012d\'\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0003:\u001d\u0000\u012f)\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0003:\u001d\u0000\u0131+\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0003:\u001d\u0000\u0133-\u0001\u0000\u0000\u0000\u0134\u0135\u0005 "+
		"\u0000\u0000\u0135\u0136\u0005/\u0000\u0000\u0136\u0137\u0003:\u001d\u0000"+
		"\u0137\u0138\u00050\u0000\u0000\u0138\u0139\u0003\u001a\r\u0000\u0139"+
		"/\u0001\u0000\u0000\u0000\u013a\u013c\u0005\u001e\u0000\u0000\u013b\u013d"+
		"\u0003:\u001d\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0005"+
		"(\u0000\u0000\u013f1\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0013\u0000"+
		"\u0000\u0141\u0142\u0005(\u0000\u0000\u01423\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005\u0012\u0000\u0000\u0144\u0145\u0005(\u0000\u0000\u01455\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0003:\u001d\u0000\u0147\u0148\u0005(\u0000"+
		"\u0000\u01487\u0001\u0000\u0000\u0000\u0149\u014b\u0003\u0004\u0002\u0000"+
		"\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0005N\u0000\u0000\u014d"+
		"\u014f\u0005\'\u0000\u0000\u014e\u0150\u0003:\u001d\u0000\u014f\u014e"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u01509\u0001"+
		"\u0000\u0000\u0000\u0151\u0156\u0003B!\u0000\u0152\u0156\u0003>\u001f"+
		"\u0000\u0153\u0156\u0003P(\u0000\u0154\u0156\u0003N\'\u0000\u0155\u0151"+
		"\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156;\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005\u000b\u0000\u0000\u0158\u0159\u0003"+
		":\u001d\u0000\u0159\u015a\u00050\u0000\u0000\u015a=\u0001\u0000\u0000"+
		"\u0000\u015b\u0160\u0003@ \u0000\u015c\u015d\u0007\u0001\u0000\u0000\u015d"+
		"\u015f\u0003@ \u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161?\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0163\u0168\u0003N\'\u0000\u0164\u0165\u0007\u0002\u0000"+
		"\u0000\u0165\u0167\u0003N\'\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169A\u0001\u0000\u0000\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016b\u0170\u0003N\'\u0000\u016c\u016d"+
		"\u0007\u0003\u0000\u0000\u016d\u016f\u0003N\'\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171C\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0175\u0003\u0014"+
		"\n\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u001f\u0000"+
		"\u0000\u0177\u0178\u0005N\u0000\u0000\u0178\u017a\u0005/\u0000\u0000\u0179"+
		"\u017b\u0003F#\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0005"+
		"0\u0000\u0000\u017d\u017e\u0006\"\uffff\uffff\u0000\u017e\u017f\u0003"+
		"\u001a\r\u0000\u017f\u0180\u0006\"\uffff\uffff\u0000\u0180E\u0001\u0000"+
		"\u0000\u0000\u0181\u0186\u0003H$\u0000\u0182\u0183\u0005\u0006\u0000\u0000"+
		"\u0183\u0185\u0003H$\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0188"+
		"\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0001\u0000\u0000\u0000\u0187G\u0001\u0000\u0000\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0003L&\u0000\u018a\u018b\u0005G\u0000"+
		"\u0000\u018b\u018c\u0003J%\u0000\u018cI\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0005N\u0000\u0000\u018eK\u0001\u0000\u0000\u0000\u018f\u0192\u0003"+
		"h4\u0000\u0190\u0192\u0003\u0004\u0002\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192M\u0001\u0000\u0000\u0000"+
		"\u0193\u019c\u0003^/\u0000\u0194\u019c\u0005N\u0000\u0000\u0195\u019c"+
		"\u0003P(\u0000\u0196\u0197\u0005/\u0000\u0000\u0197\u0198\u0003:\u001d"+
		"\u0000\u0198\u0199\u00050\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000"+
		"\u019a\u019c\u00038\u001c\u0000\u019b\u0193\u0001\u0000\u0000\u0000\u019b"+
		"\u0194\u0001\u0000\u0000\u0000\u019b\u0195\u0001\u0000\u0000\u0000\u019b"+
		"\u0196\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c"+
		"O\u0001\u0000\u0000\u0000\u019d\u019e\u0003\u0012\t\u0000\u019e\u019f"+
		"\u0005G\u0000\u0000\u019f\u01a0\u0005G\u0000\u0000\u01a0\u01a2\u0003V"+
		"+\u0000\u01a1\u01a3\u0003\u0014\n\u0000\u01a2\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a6\u0005/\u0000\u0000\u01a5\u01a7\u0003X,\u0000\u01a6"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u00050\u0000\u0000\u01a9\u01da"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005\u001b\u0000\u0000\u01ab\u01ad"+
		"\u0003\u0012\t\u0000\u01ac\u01ae\u0003\u0014\n\u0000\u01ad\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01b1\u0005/\u0000\u0000\u01b0\u01b2\u0003X,"+
		"\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u00050\u0000\u0000"+
		"\u01b4\u01da\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003T*\u0000\u01b6\u01b7"+
		"\u0005\u0007\u0000\u0000\u01b7\u01b9\u0003V+\u0000\u01b8\u01ba\u0003\u0014"+
		"\n\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd\u0005/\u0000\u0000"+
		"\u01bc\u01be\u0003X,\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u00050\u0000\u0000\u01c0\u01da\u0001\u0000\u0000\u0000\u01c1\u01c2\u0003"+
		"R)\u0000\u01c2\u01c3\u0005\u0007\u0000\u0000\u01c3\u01c5\u0003V+\u0000"+
		"\u01c4\u01c6\u0003\u0014\n\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c9\u0005/\u0000\u0000\u01c8\u01ca\u0003X,\u0000\u01c9\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u00050\u0000\u0000\u01cc\u01da\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0003Z-\u0000\u01ce\u01cf\u0005\u0007\u0000\u0000"+
		"\u01cf\u01d1\u0003V+\u0000\u01d0\u01d2\u0003\u0014\n\u0000\u01d1\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005/\u0000\u0000\u01d4\u01d6\u0003"+
		"X,\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u00050\u0000\u0000"+
		"\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u019d\u0001\u0000\u0000\u0000"+
		"\u01d9\u01aa\u0001\u0000\u0000\u0000\u01d9\u01b5\u0001\u0000\u0000\u0000"+
		"\u01d9\u01c1\u0001\u0000\u0000\u0000\u01d9\u01cd\u0001\u0000\u0000\u0000"+
		"\u01daQ\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u0011\u0000\u0000\u01dc"+
		"S\u0001\u0000\u0000\u0000\u01dd\u01de\u0005N\u0000\u0000\u01deU\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0005N\u0000\u0000\u01e0W\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e6\u0003^/\u0000\u01e2\u01e3\u0005\u0006\u0000\u0000\u01e3"+
		"\u01e5\u0003^/\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7Y\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0003L&\u0000\u01ea\u01eb\u0005\f\u0000\u0000"+
		"\u01eb\u01ec\u0003\\.\u0000\u01ec[\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0003j5\u0000\u01ee]\u0001\u0000\u0000\u0000\u01ef\u0201\u0003n7\u0000"+
		"\u01f0\u0201\u0003p8\u0000\u01f1\u0201\u0003l6\u0000\u01f2\u0201\u0003"+
		"~?\u0000\u01f3\u0201\u0003j5\u0000\u01f4\u0201\u0003r9\u0000\u01f5\u0201"+
		"\u0003t:\u0000\u01f6\u0201\u0003v;\u0000\u01f7\u0201\u0003x<\u0000\u01f8"+
		"\u0201\u0003z=\u0000\u01f9\u0201\u0003|>\u0000\u01fa\u01fb\u0003\u0012"+
		"\t\u0000\u01fb\u01fc\u0005\r\u0000\u0000\u01fc\u0201\u0001\u0000\u0000"+
		"\u0000\u01fd\u0201\u0003`0\u0000\u01fe\u0201\u0003b1\u0000\u01ff\u0201"+
		"\u0003f3\u0000\u0200\u01ef\u0001\u0000\u0000\u0000\u0200\u01f0\u0001\u0000"+
		"\u0000\u0000\u0200\u01f1\u0001\u0000\u0000\u0000\u0200\u01f2\u0001\u0000"+
		"\u0000\u0000\u0200\u01f3\u0001\u0000\u0000\u0000\u0200\u01f4\u0001\u0000"+
		"\u0000\u0000\u0200\u01f5\u0001\u0000\u0000\u0000\u0200\u01f6\u0001\u0000"+
		"\u0000\u0000\u0200\u01f7\u0001\u0000\u0000\u0000\u0200\u01f8\u0001\u0000"+
		"\u0000\u0000\u0200\u01f9\u0001\u0000\u0000\u0000\u0200\u01fa\u0001\u0000"+
		"\u0000\u0000\u0200\u01fd\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0201_\u0001\u0000\u0000"+
		"\u0000\u0202\u020b\u0005\u0001\u0000\u0000\u0203\u0208\u0003:\u001d\u0000"+
		"\u0204\u0205\u0005\u0006\u0000\u0000\u0205\u0207\u0003:\u001d\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208"+
		"\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b"+
		"\u0203\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0005\u0002\u0000\u0000\u020e"+
		"a\u0001\u0000\u0000\u0000\u020f\u0218\u00051\u0000\u0000\u0210\u0215\u0003"+
		"d2\u0000\u0211\u0212\u0005\u0006\u0000\u0000\u0212\u0214\u0003d2\u0000"+
		"\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000"+
		"\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000"+
		"\u0218\u0210\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u00052\u0000\u0000\u021b"+
		"c\u0001\u0000\u0000\u0000\u021c\u021d\u0003:\u001d\u0000\u021d\u021e\u0005"+
		"G\u0000\u0000\u021e\u021f\u0003:\u001d\u0000\u021fe\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0005\u000e\u0000\u0000\u0221\u022a\u00051\u0000\u0000"+
		"\u0222\u0227\u0003:\u001d\u0000\u0223\u0224\u0005\u0006\u0000\u0000\u0224"+
		"\u0226\u0003:\u001d\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0229"+
		"\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0001\u0000\u0000\u0000\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u0227"+
		"\u0001\u0000\u0000\u0000\u022a\u0222\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u00052\u0000\u0000\u022dg\u0001\u0000\u0000\u0000\u022e\u022f\u0005N"+
		"\u0000\u0000\u022fi\u0001\u0000\u0000\u0000\u0230\u0231\u0005N\u0000\u0000"+
		"\u0231k\u0001\u0000\u0000\u0000\u0232\u0233\u0007\u0004\u0000\u0000\u0233"+
		"m\u0001\u0000\u0000\u0000\u0234\u0235\u0005O\u0000\u0000\u0235o\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0007\u0005\u0000\u0000\u0237q\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0005.\u0000\u0000\u0239\u023a\u00051\u0000\u0000"+
		"\u023a\u023b\u0005N\u0000\u0000\u023b\u023c\u00052\u0000\u0000\u023cs"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0005\"\u0000\u0000\u023eu\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0005#\u0000\u0000\u0240w\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0005$\u0000\u0000\u0242y\u0001\u0000\u0000\u0000\u0243"+
		"\u0244\u0005%\u0000\u0000\u0244{\u0001\u0000\u0000\u0000\u0245\u0246\u0005"+
		"&\u0000\u0000\u0246}\u0001\u0000\u0000\u0000\u0247\u0248\u0005\u0010\u0000"+
		"\u0000\u0248\u007f\u0001\u0000\u0000\u00008\u0084\u008a\u009b\u009f\u00a5"+
		"\u00ab\u00b2\u00b9\u00c2\u00c9\u00d2\u00dc\u00e0\u00e4\u00e9\u00ed\u00f1"+
		"\u00f3\u00f5\u0101\u0110\u0115\u0121\u0125\u0129\u013c\u014a\u014f\u0155"+
		"\u0160\u0168\u0170\u0174\u017a\u0186\u0191\u019b\u01a2\u01a6\u01ad\u01b1"+
		"\u01b9\u01bd\u01c5\u01c9\u01d1\u01d5\u01d9\u01e6\u0200\u0208\u020b\u0215"+
		"\u0218\u0227\u022a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}