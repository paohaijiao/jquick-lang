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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, TYPESHORT=14, TYPENULL=15, THIS=16, 
		CONTINUE=17, BREAK=18, TYPEINT=19, TYPEFLOAT=20, TYPEDOUBLE=21, TYPELONG=22, 
		TYPEBOOLEAN=23, TYPEBYTE=24, IMPORT=25, NEW=26, VAR=27, AS=28, RETURN=29, 
		FUNCTION=30, WHILE=31, FOR=32, ASSIGN=33, SEMICOLON=34, WITH=35, IF=36, 
		THEN=37, ELSEIF=38, ELSE=39, DOLLAR=40, LPAREN=41, RPAREN=42, LBRACE=43, 
		RBRACE=44, GT=45, GE=46, LT=47, LE=48, EQ=49, NE=50, AND=51, OR=52, ADD=53, 
		MINUS=54, MUL=55, DIV=56, CONTAIN=57, NOTCONTAIN=58, START=59, NOTSTART=60, 
		END=61, NOTEND=62, TRUE=63, FALSE=64, COLON=65, NUMBERIC=66, DATETIME=67, 
		DATE=68, YEAR=69, MONTH=70, DAY=71, TIME_ZONE=72, IDENTIFIER=73, STRING=74, 
		SINGLE_LINE_COMMENT=75, MULTI_LINE_COMMENT=76, WS=77, NEWLINE=78;
	public static final int
		RULE_program = 0, RULE_importDeclaration = 1, RULE_paramType = 2, RULE_genericType = 3, 
		RULE_simpleType = 4, RULE_typeArguments = 5, RULE_arrayType = 6, RULE_listType = 7, 
		RULE_setType = 8, RULE_mapType = 9, RULE_qualifiedName = 10, RULE_statement = 11, 
		RULE_method = 12, RULE_action = 13, RULE_controlStatement = 14, RULE_ifStatement = 15, 
		RULE_elseIfConExpression = 16, RULE_elseIfAction = 17, RULE_elseAction = 18, 
		RULE_forStatement = 19, RULE_initExpression = 20, RULE_conExpression = 21, 
		RULE_stopExpression = 22, RULE_whileStatement = 23, RULE_returnStatement = 24, 
		RULE_breakStatement = 25, RULE_continueStatement = 26, RULE_expressionStatement = 27, 
		RULE_variableDecl = 28, RULE_expression = 29, RULE_sout = 30, RULE_logical = 31, 
		RULE_comparison = 32, RULE_arithmetic = 33, RULE_functionDefinition = 34, 
		RULE_parameterList = 35, RULE_param = 36, RULE_functionVar = 37, RULE_classsType = 38, 
		RULE_primary = 39, RULE_literalItem = 40, RULE_methodInvocation = 41, 
		RULE_this = 42, RULE_instanceName = 43, RULE_methodName = 44, RULE_argumentList = 45, 
		RULE_accessStaticVariable = 46, RULE_accessObjectName = 47, RULE_literal = 48, 
		RULE_listLiteral = 49, RULE_mapLiteral = 50, RULE_mapEntry = 51, RULE_importVar = 52, 
		RULE_identifier = 53, RULE_bool = 54, RULE_string = 55, RULE_date = 56, 
		RULE_variables = 57, RULE_number = 58, RULE_null = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDeclaration", "paramType", "genericType", "simpleType", 
			"typeArguments", "arrayType", "listType", "setType", "mapType", "qualifiedName", 
			"statement", "method", "action", "controlStatement", "ifStatement", "elseIfConExpression", 
			"elseIfAction", "elseAction", "forStatement", "initExpression", "conExpression", 
			"stopExpression", "whileStatement", "returnStatement", "breakStatement", 
			"continueStatement", "expressionStatement", "variableDecl", "expression", 
			"sout", "logical", "comparison", "arithmetic", "functionDefinition", 
			"parameterList", "param", "functionVar", "classsType", "primary", "literalItem", 
			"methodInvocation", "this", "instanceName", "methodName", "argumentList", 
			"accessStaticVariable", "accessObjectName", "literal", "listLiteral", 
			"mapLiteral", "mapEntry", "importVar", "identifier", "bool", "string", 
			"date", "variables", "number", "null"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'['", "']'", "'List'", "'Set'", "'Map'", "'.'", "'if'", 
			"'else if'", "'else'", "'console.log('", "'@'", "'.class'", "'short'", 
			"'null'", "'this'", "'continue'", "'break'", "'int'", "'float'", "'double'", 
			"'long'", "'boolean'", "'byte'", "'import'", "'new'", "'var'", "'as'", 
			"'return'", "'function'", "'while'", "'for'", "'='", "';'", "'WITH'", 
			"'IF'", "'THEN'", "'ELSEIF'", "'ELSE'", "'$'", "'('", "')'", "'{'", "'}'", 
			"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'", 
			"'-'", "'*'", "'/'", "'CONTAIN'", "'NOTCONTAIN'", "'START'", "'NOTSTART'", 
			"'END'", "'NOTEND'", "'true'", "'false'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TYPESHORT", "TYPENULL", "THIS", "CONTINUE", "BREAK", "TYPEINT", 
			"TYPEFLOAT", "TYPEDOUBLE", "TYPELONG", "TYPEBOOLEAN", "TYPEBYTE", "IMPORT", 
			"NEW", "VAR", "AS", "RETURN", "FUNCTION", "WHILE", "FOR", "ASSIGN", "SEMICOLON", 
			"WITH", "IF", "THEN", "ELSEIF", "ELSE", "DOLLAR", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "GT", "GE", "LT", "LE", "EQ", "NE", "AND", "OR", 
			"ADD", "MINUS", "MUL", "DIV", "CONTAIN", "NOTCONTAIN", "START", "NOTSTART", 
			"END", "NOTEND", "TRUE", "FALSE", "COLON", "NUMBERIC", "DATETIME", "DATE", 
			"YEAR", "MONTH", "DAY", "TIME_ZONE", "IDENTIFIER", "STRING", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "WS", "NEWLINE"
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(121);
				importDeclaration();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223219196584801932L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1565L) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
			setState(135);
			match(IMPORT);
			setState(136);
			paramType();
			setState(137);
			match(AS);
			setState(138);
			importVar();
			setState(139);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				genericType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				listType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				mapType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				setType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
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
			setState(149);
			qualifiedName();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(150);
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
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33046528L) != 0)) ) {
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
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JQuickLangParser.LT, 0); }
		public List<ClasssTypeContext> classsType() {
			return getRuleContexts(ClasssTypeContext.class);
		}
		public ClasssTypeContext classsType(int i) {
			return getRuleContext(ClasssTypeContext.class,i);
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
		enterRule(_localctx, 10, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LT);
			setState(156);
			classsType();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(157);
				match(T__0);
				setState(158);
				classsType();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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
		enterRule(_localctx, 12, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
				setState(166);
				simpleType();
				}
				break;
			case IDENTIFIER:
				{
				setState(167);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				match(T__1);
				setState(171);
				match(T__2);
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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
		public ClasssTypeContext classsType() {
			return getRuleContext(ClasssTypeContext.class,0);
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
		enterRule(_localctx, 14, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__3);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(177);
				match(LT);
				setState(178);
				classsType();
				setState(179);
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
		public ClasssTypeContext classsType() {
			return getRuleContext(ClasssTypeContext.class,0);
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
		enterRule(_localctx, 16, RULE_setType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__4);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(184);
				match(LT);
				setState(185);
				classsType();
				setState(186);
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
		public List<ClasssTypeContext> classsType() {
			return getRuleContexts(ClasssTypeContext.class);
		}
		public ClasssTypeContext classsType(int i) {
			return getRuleContext(ClasssTypeContext.class,i);
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
		enterRule(_localctx, 18, RULE_mapType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__5);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(191);
				match(LT);
				setState(192);
				classsType();
				setState(193);
				match(T__0);
				setState(194);
				classsType();
				setState(195);
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
		enterRule(_localctx, 20, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENTIFIER);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(200);
				match(T__6);
				setState(201);
				match(IDENTIFIER);
				}
				}
				setState(206);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				expression();
				setState(208);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				method();
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(211);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				controlStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
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
				setState(218);
				methodInvocation();
				}
				break;
			case FUNCTION:
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
			setState(222);
			match(LBRACE);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223219196584801932L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1565L) != 0)) {
				{
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(223);
					variableDecl();
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(224);
						match(SEMICOLON);
						}
					}

					}
					break;
				case 2:
					{
					setState(227);
					controlStatement();
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(228);
						match(SEMICOLON);
						}
					}

					}
					break;
				case 3:
					{
					setState(231);
					statement();
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
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				returnStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				continueStatement();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__5:
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
			case DOLLAR:
			case LPAREN:
			case LBRACE:
			case TRUE:
			case FALSE:
			case NUMBERIC:
			case DATETIME:
			case DATE:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
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
			setState(251);
			match(T__7);
			setState(252);
			match(LPAREN);
			setState(253);
			conExpression();
			setState(254);
			match(RPAREN);
			setState(255);
			action();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(256);
				match(T__8);
				setState(257);
				match(LPAREN);
				setState(258);
				elseIfConExpression();
				setState(259);
				match(RPAREN);
				setState(260);
				elseIfAction();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(267);
				match(T__9);
				setState(268);
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
			setState(271);
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
			setState(273);
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
			setState(275);
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
			setState(277);
			match(FOR);
			setState(278);
			match(LPAREN);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(279);
				variableDecl();
				}
				break;
			case 2:
				{
				setState(280);
				initExpression();
				}
				break;
			}
			setState(283);
			match(SEMICOLON);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223359942126616460L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1565L) != 0)) {
				{
				setState(284);
				conExpression();
				}
			}

			setState(287);
			match(SEMICOLON);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223359942126616460L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1565L) != 0)) {
				{
				setState(288);
				stopExpression();
				}
			}

			setState(291);
			match(RPAREN);
			setState(292);
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
			setState(294);
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
			setState(296);
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
			setState(298);
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
			setState(300);
			match(WHILE);
			setState(301);
			match(LPAREN);
			setState(302);
			expression();
			setState(303);
			match(RPAREN);
			setState(304);
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
			setState(306);
			match(RETURN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223359942126616460L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1565L) != 0)) {
				{
				setState(307);
				expression();
				}
			}

			setState(310);
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
			setState(312);
			match(BREAK);
			setState(313);
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
			setState(315);
			match(CONTINUE);
			setState(316);
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
			setState(318);
			expression();
			setState(319);
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(321);
				paramType();
				}
				break;
			}
			setState(324);
			match(IDENTIFIER);
			setState(325);
			match(ASSIGN);
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(326);
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
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				arithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				logical();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
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
			setState(335);
			match(T__10);
			setState(336);
			expression();
			setState(337);
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
			setState(339);
			comparison();
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
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
					setState(341);
					comparison();
					}
					} 
				}
				setState(346);
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
			setState(347);
			primary();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					((ComparisonContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) ) {
						((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
					primary();
					}
					} 
				}
				setState(354);
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
			setState(355);
			primary();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135107988821114880L) != 0)) ) {
					_errHandler.recoverInline(this);
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
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(363);
				typeArguments();
				}
			}

			setState(366);
			match(FUNCTION);
			setState(367);
			match(IDENTIFIER);
			setState(368);
			match(LPAREN);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33046640L) != 0) || _la==IDENTIFIER) {
				{
				setState(369);
				parameterList();
				}
			}

			setState(372);
			match(RPAREN);


			       
			setState(374);
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
			setState(377);
			param();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(378);
				match(T__0);
				setState(379);
				param();
				}
				}
				setState(384);
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
			setState(385);
			classsType();
			setState(386);
			match(COLON);
			setState(387);
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
			setState(389);
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
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				importVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
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
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				methodInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				match(LPAREN);
				setState(399);
				expression();
				setState(400);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
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
	public static class LiteralItemContext extends ParserRuleContext {
		public ClasssTypeContext classsType() {
			return getRuleContext(ClasssTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JQuickLangParser.COLON, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).enterLiteralItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQuickLangListener ) ((JQuickLangListener)listener).exitLiteralItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQuickLangVisitor ) return ((JQuickLangVisitor<? extends T>)visitor).visitLiteralItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralItemContext literalItem() throws RecognitionException {
		LiteralItemContext _localctx = new LiteralItemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literalItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			classsType();
			setState(406);
			match(COLON);
			setState(407);
			literal();
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
		enterRule(_localctx, 82, RULE_methodInvocation);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new StaticCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				qualifiedName();
				setState(410);
				match(COLON);
				setState(411);
				match(COLON);
				setState(412);
				methodName();
				setState(413);
				match(LPAREN);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33046640L) != 0) || _la==IDENTIFIER) {
					{
					setState(414);
					argumentList();
					}
				}

				setState(417);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ConstructorCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(NEW);
				setState(420);
				qualifiedName();
				setState(421);
				match(LPAREN);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33046640L) != 0) || _la==IDENTIFIER) {
					{
					setState(422);
					argumentList();
					}
				}

				setState(425);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new InstanceMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				instanceName();
				setState(428);
				match(T__6);
				setState(429);
				methodName();
				setState(430);
				match(LPAREN);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33046640L) != 0) || _la==IDENTIFIER) {
					{
					setState(431);
					argumentList();
					}
				}

				setState(434);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ThisMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				this_();
				setState(437);
				match(T__6);
				setState(438);
				methodName();
				setState(439);
				match(LPAREN);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33046640L) != 0) || _la==IDENTIFIER) {
					{
					setState(440);
					argumentList();
					}
				}

				setState(443);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new AccessStaticMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				accessStaticVariable();
				setState(446);
				match(T__6);
				setState(447);
				methodName();
				setState(448);
				match(LPAREN);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33046640L) != 0) || _la==IDENTIFIER) {
					{
					setState(449);
					argumentList();
					}
				}

				setState(452);
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
		enterRule(_localctx, 84, RULE_this);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		enterRule(_localctx, 86, RULE_instanceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		enterRule(_localctx, 88, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
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
		public List<LiteralItemContext> literalItem() {
			return getRuleContexts(LiteralItemContext.class);
		}
		public LiteralItemContext literalItem(int i) {
			return getRuleContext(LiteralItemContext.class,i);
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
		enterRule(_localctx, 90, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			literalItem();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(463);
				match(T__0);
				setState(464);
				literalItem();
				}
				}
				setState(469);
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
		enterRule(_localctx, 92, RULE_accessStaticVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			classsType();
			setState(471);
			match(T__11);
			setState(472);
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
		enterRule(_localctx, 94, RULE_accessObjectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public MapLiteralContext mapLiteral() {
			return getRuleContext(MapLiteralContext.class,0);
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
		enterRule(_localctx, 96, RULE_literal);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				date();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				bool();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				null_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
				variables();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(483);
				qualifiedName();
				setState(484);
				match(T__12);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(486);
				listLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(487);
				mapLiteral();
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
		enterRule(_localctx, 98, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__1);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223359942126616460L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1565L) != 0)) {
				{
				setState(491);
				expression();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(492);
					match(T__0);
					setState(493);
					expression();
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(501);
			match(T__2);
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
		enterRule(_localctx, 100, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(LBRACE);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223359942126616460L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1565L) != 0)) {
				{
				setState(504);
				mapEntry();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(505);
					match(T__0);
					setState(506);
					mapEntry();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(514);
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
		enterRule(_localctx, 102, RULE_mapEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			expression();
			setState(517);
			match(COLON);
			setState(518);
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
			setState(520);
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
			setState(522);
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
			setState(524);
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
			setState(526);
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
			setState(528);
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
			setState(530);
			match(DOLLAR);
			setState(531);
			match(LBRACE);
			setState(532);
			match(IDENTIFIER);
			setState(533);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBERIC() { return getToken(JQuickLangParser.NUMBERIC, 0); }
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
		enterRule(_localctx, 116, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(NUMBERIC);
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
		enterRule(_localctx, 118, RULE_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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
		"\u0004\u0001N\u021c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0005\u0000{\b\u0000\n\u0000\f\u0000~\t\u0000\u0001"+
		"\u0000\u0005\u0000\u0081\b\u0000\n\u0000\f\u0000\u0084\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0094\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0098\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00a0\b\u0005\n\u0005\f\u0005\u00a3\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006\u00ad\b\u0006\u000b\u0006\f\u0006\u00ae"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00b6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bd\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c6"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00cb\b\n\n\n\f\n\u00ce\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d5"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d9\b\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00dd\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00e2\b\r\u0001\r"+
		"\u0001\r\u0003\r\u00e6\b\r\u0001\r\u0001\r\u0003\r\u00ea\b\r\u0005\r\u00ec"+
		"\b\r\n\r\f\r\u00ef\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fa\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0107\b\u000f\n\u000f\f\u000f\u010a\t\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u010e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u011a\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011e\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0122\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0135\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c"+
		"\u0143\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0148\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u014e"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0157\b\u001f\n\u001f\f\u001f\u015a\t\u001f"+
		"\u0001 \u0001 \u0001 \u0005 \u015f\b \n \f \u0162\t \u0001!\u0001!\u0001"+
		"!\u0005!\u0167\b!\n!\f!\u016a\t!\u0001\"\u0003\"\u016d\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0173\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0005#\u017d\b#\n#\f#\u0180\t#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0003&\u018a\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0194\b\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01a0"+
		"\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01a8\b)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01b1\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01ba\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u01c3\b)\u0001)\u0001)\u0003)\u01c7\b)\u0001"+
		"*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u01d2"+
		"\b-\n-\f-\u01d5\t-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00030\u01e9\b0\u00011\u00011\u00011\u00011\u00051\u01ef\b1\n1\f1\u01f2"+
		"\t1\u00031\u01f4\b1\u00011\u00011\u00012\u00012\u00012\u00012\u00052\u01fc"+
		"\b2\n2\f2\u01ff\t2\u00032\u0201\b2\u00012\u00012\u00013\u00013\u00013"+
		"\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0000\u0000<\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtv\u0000\u0006\u0002\u0000\u000e\u000e\u0013\u0018\u0001\u0000"+
		"34\u0001\u0000-2\u0001\u000058\u0001\u0000?@\u0001\u0000CD\u022d\u0000"+
		"x\u0001\u0000\u0000\u0000\u0002\u0087\u0001\u0000\u0000\u0000\u0004\u0093"+
		"\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000\u0000\b\u0099\u0001"+
		"\u0000\u0000\u0000\n\u009b\u0001\u0000\u0000\u0000\f\u00a8\u0001\u0000"+
		"\u0000\u0000\u000e\u00b0\u0001\u0000\u0000\u0000\u0010\u00b7\u0001\u0000"+
		"\u0000\u0000\u0012\u00be\u0001\u0000\u0000\u0000\u0014\u00c7\u0001\u0000"+
		"\u0000\u0000\u0016\u00d8\u0001\u0000\u0000\u0000\u0018\u00dc\u0001\u0000"+
		"\u0000\u0000\u001a\u00de\u0001\u0000\u0000\u0000\u001c\u00f9\u0001\u0000"+
		"\u0000\u0000\u001e\u00fb\u0001\u0000\u0000\u0000 \u010f\u0001\u0000\u0000"+
		"\u0000\"\u0111\u0001\u0000\u0000\u0000$\u0113\u0001\u0000\u0000\u0000"+
		"&\u0115\u0001\u0000\u0000\u0000(\u0126\u0001\u0000\u0000\u0000*\u0128"+
		"\u0001\u0000\u0000\u0000,\u012a\u0001\u0000\u0000\u0000.\u012c\u0001\u0000"+
		"\u0000\u00000\u0132\u0001\u0000\u0000\u00002\u0138\u0001\u0000\u0000\u0000"+
		"4\u013b\u0001\u0000\u0000\u00006\u013e\u0001\u0000\u0000\u00008\u0142"+
		"\u0001\u0000\u0000\u0000:\u014d\u0001\u0000\u0000\u0000<\u014f\u0001\u0000"+
		"\u0000\u0000>\u0153\u0001\u0000\u0000\u0000@\u015b\u0001\u0000\u0000\u0000"+
		"B\u0163\u0001\u0000\u0000\u0000D\u016c\u0001\u0000\u0000\u0000F\u0179"+
		"\u0001\u0000\u0000\u0000H\u0181\u0001\u0000\u0000\u0000J\u0185\u0001\u0000"+
		"\u0000\u0000L\u0189\u0001\u0000\u0000\u0000N\u0193\u0001\u0000\u0000\u0000"+
		"P\u0195\u0001\u0000\u0000\u0000R\u01c6\u0001\u0000\u0000\u0000T\u01c8"+
		"\u0001\u0000\u0000\u0000V\u01ca\u0001\u0000\u0000\u0000X\u01cc\u0001\u0000"+
		"\u0000\u0000Z\u01ce\u0001\u0000\u0000\u0000\\\u01d6\u0001\u0000\u0000"+
		"\u0000^\u01da\u0001\u0000\u0000\u0000`\u01e8\u0001\u0000\u0000\u0000b"+
		"\u01ea\u0001\u0000\u0000\u0000d\u01f7\u0001\u0000\u0000\u0000f\u0204\u0001"+
		"\u0000\u0000\u0000h\u0208\u0001\u0000\u0000\u0000j\u020a\u0001\u0000\u0000"+
		"\u0000l\u020c\u0001\u0000\u0000\u0000n\u020e\u0001\u0000\u0000\u0000p"+
		"\u0210\u0001\u0000\u0000\u0000r\u0212\u0001\u0000\u0000\u0000t\u0217\u0001"+
		"\u0000\u0000\u0000v\u0219\u0001\u0000\u0000\u0000x|\u0006\u0000\uffff"+
		"\uffff\u0000y{\u0003\u0002\u0001\u0000zy\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0082\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0003\u0016\u000b\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0000\u0000\u0001\u0086\u0001"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0019\u0000\u0000\u0088\u0089"+
		"\u0003\u0004\u0002\u0000\u0089\u008a\u0005\u001c\u0000\u0000\u008a\u008b"+
		"\u0003h4\u0000\u008b\u008c\u0005\"\u0000\u0000\u008c\u0003\u0001\u0000"+
		"\u0000\u0000\u008d\u0094\u0003\b\u0004\u0000\u008e\u0094\u0003\u0006\u0003"+
		"\u0000\u008f\u0094\u0003\u000e\u0007\u0000\u0090\u0094\u0003\u0012\t\u0000"+
		"\u0091\u0094\u0003\u0010\b\u0000\u0092\u0094\u0003\f\u0006\u0000\u0093"+
		"\u008d\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093"+
		"\u008f\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0005\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0014\n\u0000\u0096\u0098"+
		"\u0003\n\u0005\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0007\u0001\u0000\u0000\u0000\u0099\u009a\u0007"+
		"\u0000\u0000\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u009c\u0005/"+
		"\u0000\u0000\u009c\u00a1\u0003L&\u0000\u009d\u009e\u0005\u0001\u0000\u0000"+
		"\u009e\u00a0\u0003L&\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005-\u0000\u0000\u00a5\u000b\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0003\b\u0004\u0000\u00a7\u00a9\u0003\u0014"+
		"\n\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0002\u0000"+
		"\u0000\u00ab\u00ad\u0005\u0003\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\r\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b5\u0005\u0004\u0000\u0000\u00b1\u00b2\u0005/\u0000\u0000\u00b2"+
		"\u00b3\u0003L&\u0000\u00b3\u00b4\u0005-\u0000\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00bc\u0005"+
		"\u0005\u0000\u0000\u00b8\u00b9\u0005/\u0000\u0000\u00b9\u00ba\u0003L&"+
		"\u0000\u00ba\u00bb\u0005-\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u0011\u0001\u0000\u0000\u0000\u00be\u00c5\u0005\u0006\u0000\u0000"+
		"\u00bf\u00c0\u0005/\u0000\u0000\u00c0\u00c1\u0003L&\u0000\u00c1\u00c2"+
		"\u0005\u0001\u0000\u0000\u00c2\u00c3\u0003L&\u0000\u00c3\u00c4\u0005-"+
		"\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u0013\u0001\u0000"+
		"\u0000\u0000\u00c7\u00cc\u0005I\u0000\u0000\u00c8\u00c9\u0005\u0007\u0000"+
		"\u0000\u00c9\u00cb\u0005I\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u0015\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003:\u001d\u0000\u00d0"+
		"\u00d1\u0005\"\u0000\u0000\u00d1\u00d9\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0003\u0018\f\u0000\u00d3\u00d5\u0005\"\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0003\u001c\u000e\u0000\u00d7\u00d9\u0003"+
		"<\u001e\u0000\u00d8\u00cf\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u0017\u0001\u0000\u0000\u0000\u00da\u00dd\u0003R)\u0000"+
		"\u00db\u00dd\u0003D\"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u0019\u0001\u0000\u0000\u0000\u00de"+
		"\u00ed\u0005+\u0000\u0000\u00df\u00e1\u00038\u001c\u0000\u00e0\u00e2\u0005"+
		"\"\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00ec\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003\u001c"+
		"\u000e\u0000\u00e4\u00e6\u0005\"\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ec\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e9\u0003\u0016\u000b\u0000\u00e8\u00ea\u0005\"\u0000\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00df\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005,\u0000\u0000\u00f1"+
		"\u001b\u0001\u0000\u0000\u0000\u00f2\u00fa\u0003\u001e\u000f\u0000\u00f3"+
		"\u00fa\u0003&\u0013\u0000\u00f4\u00fa\u0003.\u0017\u0000\u00f5\u00fa\u0003"+
		"0\u0018\u0000\u00f6\u00fa\u00032\u0019\u0000\u00f7\u00fa\u00034\u001a"+
		"\u0000\u00f8\u00fa\u00036\u001b\u0000\u00f9\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f5\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\b\u0000\u0000\u00fc"+
		"\u00fd\u0005)\u0000\u0000\u00fd\u00fe\u0003*\u0015\u0000\u00fe\u00ff\u0005"+
		"*\u0000\u0000\u00ff\u0108\u0003\u001a\r\u0000\u0100\u0101\u0005\t\u0000"+
		"\u0000\u0101\u0102\u0005)\u0000\u0000\u0102\u0103\u0003 \u0010\u0000\u0103"+
		"\u0104\u0005*\u0000\u0000\u0104\u0105\u0003\"\u0011\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010d\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\n\u0000\u0000\u010c\u010e\u0003"+
		"$\u0012\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u001f\u0001\u0000\u0000\u0000\u010f\u0110\u0003:\u001d"+
		"\u0000\u0110!\u0001\u0000\u0000\u0000\u0111\u0112\u0003\u001a\r\u0000"+
		"\u0112#\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u001a\r\u0000\u0114"+
		"%\u0001\u0000\u0000\u0000\u0115\u0116\u0005 \u0000\u0000\u0116\u0119\u0005"+
		")\u0000\u0000\u0117\u011a\u00038\u001c\u0000\u0118\u011a\u0003(\u0014"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0005\"\u0000\u0000\u011c\u011e\u0003*\u0015\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0005\"\u0000\u0000\u0120"+
		"\u0122\u0003,\u0016\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005*\u0000\u0000\u0124\u0125\u0003\u001a\r\u0000\u0125\'\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003:\u001d\u0000\u0127)\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0003:\u001d\u0000\u0129+\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0003:\u001d\u0000\u012b-\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u001f"+
		"\u0000\u0000\u012d\u012e\u0005)\u0000\u0000\u012e\u012f\u0003:\u001d\u0000"+
		"\u012f\u0130\u0005*\u0000\u0000\u0130\u0131\u0003\u001a\r\u0000\u0131"+
		"/\u0001\u0000\u0000\u0000\u0132\u0134\u0005\u001d\u0000\u0000\u0133\u0135"+
		"\u0003:\u001d\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0005"+
		"\"\u0000\u0000\u01371\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0012"+
		"\u0000\u0000\u0139\u013a\u0005\"\u0000\u0000\u013a3\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005\u0011\u0000\u0000\u013c\u013d\u0005\"\u0000\u0000"+
		"\u013d5\u0001\u0000\u0000\u0000\u013e\u013f\u0003:\u001d\u0000\u013f\u0140"+
		"\u0005\"\u0000\u0000\u01407\u0001\u0000\u0000\u0000\u0141\u0143\u0003"+
		"\u0004\u0002\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"I\u0000\u0000\u0145\u0147\u0005!\u0000\u0000\u0146\u0148\u0003:\u001d"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u01489\u0001\u0000\u0000\u0000\u0149\u014e\u0003B!\u0000\u014a"+
		"\u014e\u0003>\u001f\u0000\u014b\u014e\u0003R)\u0000\u014c\u014e\u0003"+
		"N\'\u0000\u014d\u0149\u0001\u0000\u0000\u0000\u014d\u014a\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e;\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u000b\u0000"+
		"\u0000\u0150\u0151\u0003:\u001d\u0000\u0151\u0152\u0005*\u0000\u0000\u0152"+
		"=\u0001\u0000\u0000\u0000\u0153\u0158\u0003@ \u0000\u0154\u0155\u0007"+
		"\u0001\u0000\u0000\u0155\u0157\u0003@ \u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159?\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u0160\u0003N\'\u0000\u015c"+
		"\u015d\u0007\u0002\u0000\u0000\u015d\u015f\u0003N\'\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161A\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0168\u0003"+
		"N\'\u0000\u0164\u0165\u0007\u0003\u0000\u0000\u0165\u0167\u0003N\'\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169C\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b"+
		"\u016d\u0003\n\u0005\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005\u001e\u0000\u0000\u016f\u0170\u0005I\u0000\u0000\u0170\u0172\u0005"+
		")\u0000\u0000\u0171\u0173\u0003F#\u0000\u0172\u0171\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005*\u0000\u0000\u0175\u0176\u0006\"\uffff\uffff"+
		"\u0000\u0176\u0177\u0003\u001a\r\u0000\u0177\u0178\u0006\"\uffff\uffff"+
		"\u0000\u0178E\u0001\u0000\u0000\u0000\u0179\u017e\u0003H$\u0000\u017a"+
		"\u017b\u0005\u0001\u0000\u0000\u017b\u017d\u0003H$\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017fG\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182\u0003L&\u0000"+
		"\u0182\u0183\u0005A\u0000\u0000\u0183\u0184\u0003J%\u0000\u0184I\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0005I\u0000\u0000\u0186K\u0001\u0000\u0000"+
		"\u0000\u0187\u018a\u0003h4\u0000\u0188\u018a\u0003\u0004\u0002\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a"+
		"M\u0001\u0000\u0000\u0000\u018b\u0194\u0003`0\u0000\u018c\u0194\u0005"+
		"I\u0000\u0000\u018d\u0194\u0003R)\u0000\u018e\u018f\u0005)\u0000\u0000"+
		"\u018f\u0190\u0003:\u001d\u0000\u0190\u0191\u0005*\u0000\u0000\u0191\u0194"+
		"\u0001\u0000\u0000\u0000\u0192\u0194\u00038\u001c\u0000\u0193\u018b\u0001"+
		"\u0000\u0000\u0000\u0193\u018c\u0001\u0000\u0000\u0000\u0193\u018d\u0001"+
		"\u0000\u0000\u0000\u0193\u018e\u0001\u0000\u0000\u0000\u0193\u0192\u0001"+
		"\u0000\u0000\u0000\u0194O\u0001\u0000\u0000\u0000\u0195\u0196\u0003L&"+
		"\u0000\u0196\u0197\u0005A\u0000\u0000\u0197\u0198\u0003`0\u0000\u0198"+
		"Q\u0001\u0000\u0000\u0000\u0199\u019a\u0003\u0014\n\u0000\u019a\u019b"+
		"\u0005A\u0000\u0000\u019b\u019c\u0005A\u0000\u0000\u019c\u019d\u0003X"+
		",\u0000\u019d\u019f\u0005)\u0000\u0000\u019e\u01a0\u0003Z-\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005*\u0000\u0000\u01a2\u01c7"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u001a\u0000\u0000\u01a4\u01a5"+
		"\u0003\u0014\n\u0000\u01a5\u01a7\u0005)\u0000\u0000\u01a6\u01a8\u0003"+
		"Z-\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005*\u0000\u0000"+
		"\u01aa\u01c7\u0001\u0000\u0000\u0000\u01ab\u01ac\u0003V+\u0000\u01ac\u01ad"+
		"\u0005\u0007\u0000\u0000\u01ad\u01ae\u0003X,\u0000\u01ae\u01b0\u0005)"+
		"\u0000\u0000\u01af\u01b1\u0003Z-\u0000\u01b0\u01af\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0005*\u0000\u0000\u01b3\u01c7\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0003T*\u0000\u01b5\u01b6\u0005\u0007\u0000\u0000\u01b6\u01b7\u0003"+
		"X,\u0000\u01b7\u01b9\u0005)\u0000\u0000\u01b8\u01ba\u0003Z-\u0000\u01b9"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005*\u0000\u0000\u01bc\u01c7"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0003\\.\u0000\u01be\u01bf\u0005"+
		"\u0007\u0000\u0000\u01bf\u01c0\u0003X,\u0000\u01c0\u01c2\u0005)\u0000"+
		"\u0000\u01c1\u01c3\u0003Z-\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0005*\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u0199"+
		"\u0001\u0000\u0000\u0000\u01c6\u01a3\u0001\u0000\u0000\u0000\u01c6\u01ab"+
		"\u0001\u0000\u0000\u0000\u01c6\u01b4\u0001\u0000\u0000\u0000\u01c6\u01bd"+
		"\u0001\u0000\u0000\u0000\u01c7S\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005"+
		"\u0010\u0000\u0000\u01c9U\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005I\u0000"+
		"\u0000\u01cbW\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005I\u0000\u0000\u01cd"+
		"Y\u0001\u0000\u0000\u0000\u01ce\u01d3\u0003P(\u0000\u01cf\u01d0\u0005"+
		"\u0001\u0000\u0000\u01d0\u01d2\u0003P(\u0000\u01d1\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4[\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003L&\u0000\u01d7\u01d8"+
		"\u0005\f\u0000\u0000\u01d8\u01d9\u0003^/\u0000\u01d9]\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0003j5\u0000\u01db_\u0001\u0000\u0000\u0000\u01dc"+
		"\u01e9\u0003n7\u0000\u01dd\u01e9\u0003t:\u0000\u01de\u01e9\u0003p8\u0000"+
		"\u01df\u01e9\u0003l6\u0000\u01e0\u01e9\u0003v;\u0000\u01e1\u01e9\u0003"+
		"j5\u0000\u01e2\u01e9\u0003r9\u0000\u01e3\u01e4\u0003\u0014\n\u0000\u01e4"+
		"\u01e5\u0005\r\u0000\u0000\u01e5\u01e9\u0001\u0000\u0000\u0000\u01e6\u01e9"+
		"\u0003b1\u0000\u01e7\u01e9\u0003d2\u0000\u01e8\u01dc\u0001\u0000\u0000"+
		"\u0000\u01e8\u01dd\u0001\u0000\u0000\u0000\u01e8\u01de\u0001\u0000\u0000"+
		"\u0000\u01e8\u01df\u0001\u0000\u0000\u0000\u01e8\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e1\u0001\u0000\u0000\u0000\u01e8\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9a\u0001\u0000\u0000\u0000"+
		"\u01ea\u01f3\u0005\u0002\u0000\u0000\u01eb\u01f0\u0003:\u001d\u0000\u01ec"+
		"\u01ed\u0005\u0001\u0000\u0000\u01ed\u01ef\u0003:\u001d\u0000\u01ee\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01eb"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u0003\u0000\u0000\u01f6c\u0001"+
		"\u0000\u0000\u0000\u01f7\u0200\u0005+\u0000\u0000\u01f8\u01fd\u0003f3"+
		"\u0000\u01f9\u01fa\u0005\u0001\u0000\u0000\u01fa\u01fc\u0003f3\u0000\u01fb"+
		"\u01f9\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe"+
		"\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200"+
		"\u01f8\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005,\u0000\u0000\u0203e\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\u0003:\u001d\u0000\u0205\u0206\u0005A\u0000"+
		"\u0000\u0206\u0207\u0003:\u001d\u0000\u0207g\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005I\u0000\u0000\u0209i\u0001\u0000\u0000\u0000\u020a\u020b\u0005"+
		"I\u0000\u0000\u020bk\u0001\u0000\u0000\u0000\u020c\u020d\u0007\u0004\u0000"+
		"\u0000\u020dm\u0001\u0000\u0000\u0000\u020e\u020f\u0005J\u0000\u0000\u020f"+
		"o\u0001\u0000\u0000\u0000\u0210\u0211\u0007\u0005\u0000\u0000\u0211q\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0005(\u0000\u0000\u0213\u0214\u0005+\u0000"+
		"\u0000\u0214\u0215\u0005I\u0000\u0000\u0215\u0216\u0005,\u0000\u0000\u0216"+
		"s\u0001\u0000\u0000\u0000\u0217\u0218\u0005B\u0000\u0000\u0218u\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0005\u000f\u0000\u0000\u021aw\u0001\u0000"+
		"\u0000\u00001|\u0082\u0093\u0097\u00a1\u00a8\u00ae\u00b5\u00bc\u00c5\u00cc"+
		"\u00d4\u00d8\u00dc\u00e1\u00e5\u00e9\u00eb\u00ed\u00f9\u0108\u010d\u0119"+
		"\u011d\u0121\u0134\u0142\u0147\u014d\u0158\u0160\u0168\u016c\u0172\u017e"+
		"\u0189\u0193\u019f\u01a7\u01b0\u01b9\u01c2\u01c6\u01d3\u01e8\u01f0\u01f3"+
		"\u01fd\u0200";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}