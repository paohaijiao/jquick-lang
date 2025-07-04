// Generated from D:/idea/jthornruleGrammer/QuickLang/JQuickLang.g4 by ANTLR 4.13.2
package com.github.paohaijiao.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JQuickLangLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, RETURN = 4, ASSIGN = 5, SEMICOLON = 6, WITH = 7, IF = 8,
            THEN = 9, ELSEIF = 10, ELSE = 11, DOLLAR = 12, LPAREN = 13, RPAREN = 14, LBRACE = 15,
            RBRACE = 16, GT = 17, GE = 18, LT = 19, LE = 20, EQ = 21, NE = 22, AND = 23, OR = 24, ADD = 25,
            MINUS = 26, MUL = 27, DIV = 28, CONTAIN = 29, NOTCONTAIN = 30, START = 31, NOTSTART = 32,
            END = 33, NOTEND = 34, TRUE = 35, FALSE = 36, NUMBER = 37, DATETIME = 38, DATE = 39,
            YEAR = 40, MONTH = 41, DAY = 42, TIME_ZONE = 43, IDENTIFIER = 44, STRING = 45, WS = 46,
            NEWLINE = 47;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "RETURN", "ASSIGN", "SEMICOLON", "WITH", "IF",
                "THEN", "ELSEIF", "ELSE", "DOLLAR", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
                "GT", "GE", "LT", "LE", "EQ", "NE", "AND", "OR", "ADD", "MINUS", "MUL",
                "DIV", "CONTAIN", "NOTCONTAIN", "START", "NOTSTART", "END", "NOTEND",
                "TRUE", "FALSE", "NUMBER", "DATETIME", "DATE", "YEAR", "MONTH", "DAY",
                "TIME_ZONE", "INT", "FLOAT", "IDENTIFIER", "STRING", "ESC", "UNICODE",
                "HEX", "WS", "NEWLINE"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'='", "','", "'null'", "'return'", "'ASSIGN'", "';'", "'WITH'",
                "'IF'", "'THEN'", "'ELSEIF'", "'ELSE'", "'$'", "'('", "')'", "'{'", "'}'",
                "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'+'",
                "'-'", "'*'", "'/'", "'CONTAIN'", "'NOTCONTAIN'", "'START'", "'NOTSTART'",
                "'END'", "'NOTEND'", "'true'", "'false'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, "RETURN", "ASSIGN", "SEMICOLON", "WITH", "IF",
                "THEN", "ELSEIF", "ELSE", "DOLLAR", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
                "GT", "GE", "LT", "LE", "EQ", "NE", "AND", "OR", "ADD", "MINUS", "MUL",
                "DIV", "CONTAIN", "NOTCONTAIN", "START", "NOTSTART", "END", "NOTEND",
                "TRUE", "FALSE", "NUMBER", "DATETIME", "DATE", "YEAR", "MONTH", "DAY",
                "TIME_ZONE", "IDENTIFIER", "STRING", "WS", "NEWLINE"
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


    public JQuickLangLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "JQuickLang.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\u0004\u0000/\u016a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
                    "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002" +
                    "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002" +
                    "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002" +
                    "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002" +
                    "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002" +
                    "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007" +
                    "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007" +
                    "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007" +
                    "+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007" +
                    "0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001" +
                    "\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001" +
                    "\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t" +
                    "\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001" +
                    "\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e" +
                    "\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013" +
                    "\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015" +
                    "\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017" +
                    "\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a" +
                    "\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c" +
                    "\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d" +
                    "\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d" +
                    "\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e" +
                    "\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f" +
                    "\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f" +
                    "\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001" +
                    "!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#" +
                    "\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0003$\u00fe\b$\u0001%\u0001" +
                    "%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001" +
                    "\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001" +
                    "*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0004" +
                    "+\u011f\b+\u000b+\f+\u0120\u0001,\u0004,\u0124\b,\u000b,\f,\u0125\u0001" +
                    ",\u0001,\u0005,\u012a\b,\n,\f,\u012d\t,\u0001,\u0001,\u0004,\u0131\b," +
                    "\u000b,\f,\u0132\u0003,\u0135\b,\u0001-\u0001-\u0005-\u0139\b-\n-\f-\u013c" +
                    "\t-\u0001.\u0001.\u0001.\u0005.\u0141\b.\n.\f.\u0144\t.\u0001.\u0001." +
                    "\u0001.\u0001.\u0005.\u014a\b.\n.\f.\u014d\t.\u0001.\u0003.\u0150\b.\u0001" +
                    "/\u0001/\u0001/\u0003/\u0155\b/\u00010\u00010\u00010\u00010\u00010\u0001" +
                    "0\u00011\u00011\u00012\u00042\u0160\b2\u000b2\f2\u0161\u00012\u00012\u0001" +
                    "3\u00033\u0167\b3\u00013\u00013\u0000\u00004\u0001\u0001\u0003\u0002\u0005" +
                    "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n" +
                    "\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011" +
                    "#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b" +
                    "7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W\u0000Y\u0000[" +
                    ",]-_\u0000a\u0000c\u0000e.g/\u0001\u0000\b\u0001\u000009\u0003\u0000A" +
                    "Z__az\u0004\u000009AZ__az\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\b\u0000" +
                    "\"\"//\\\\bbffnnrrtt\u0003\u000009AFaf\u0003\u0000\t\n\r\r  \u0173\u0000" +
                    "\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000" +
                    "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000" +
                    "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r" +
                    "\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011" +
                    "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015" +
                    "\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019" +
                    "\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d" +
                    "\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001" +
                    "\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000" +
                    "\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000" +
                    "\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/" +
                    "\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000" +
                    "\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000" +
                    "\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=" +
                    "\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000" +
                    "\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000" +
                    "\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K" +
                    "\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000" +
                    "\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000" +
                    "\u0000U\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]" +
                    "\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000" +
                    "\u0000\u0000\u0001i\u0001\u0000\u0000\u0000\u0003k\u0001\u0000\u0000\u0000" +
                    "\u0005m\u0001\u0000\u0000\u0000\u0007r\u0001\u0000\u0000\u0000\ty\u0001" +
                    "\u0000\u0000\u0000\u000b\u0080\u0001\u0000\u0000\u0000\r\u0082\u0001\u0000" +
                    "\u0000\u0000\u000f\u0087\u0001\u0000\u0000\u0000\u0011\u008a\u0001\u0000" +
                    "\u0000\u0000\u0013\u008f\u0001\u0000\u0000\u0000\u0015\u0096\u0001\u0000" +
                    "\u0000\u0000\u0017\u009b\u0001\u0000\u0000\u0000\u0019\u009d\u0001\u0000" +
                    "\u0000\u0000\u001b\u009f\u0001\u0000\u0000\u0000\u001d\u00a1\u0001\u0000" +
                    "\u0000\u0000\u001f\u00a3\u0001\u0000\u0000\u0000!\u00a5\u0001\u0000\u0000" +
                    "\u0000#\u00a7\u0001\u0000\u0000\u0000%\u00aa\u0001\u0000\u0000\u0000\'" +
                    "\u00ac\u0001\u0000\u0000\u0000)\u00af\u0001\u0000\u0000\u0000+\u00b2\u0001" +
                    "\u0000\u0000\u0000-\u00b5\u0001\u0000\u0000\u0000/\u00b8\u0001\u0000\u0000" +
                    "\u00001\u00bb\u0001\u0000\u0000\u00003\u00bd\u0001\u0000\u0000\u00005" +
                    "\u00bf\u0001\u0000\u0000\u00007\u00c1\u0001\u0000\u0000\u00009\u00c3\u0001" +
                    "\u0000\u0000\u0000;\u00cb\u0001\u0000\u0000\u0000=\u00d6\u0001\u0000\u0000" +
                    "\u0000?\u00dc\u0001\u0000\u0000\u0000A\u00e5\u0001\u0000\u0000\u0000C" +
                    "\u00e9\u0001\u0000\u0000\u0000E\u00f0\u0001\u0000\u0000\u0000G\u00f5\u0001" +
                    "\u0000\u0000\u0000I\u00fd\u0001\u0000\u0000\u0000K\u00ff\u0001\u0000\u0000" +
                    "\u0000M\u0103\u0001\u0000\u0000\u0000O\u0109\u0001\u0000\u0000\u0000Q" +
                    "\u010e\u0001\u0000\u0000\u0000S\u0111\u0001\u0000\u0000\u0000U\u0114\u0001" +
                    "\u0000\u0000\u0000W\u011e\u0001\u0000\u0000\u0000Y\u0134\u0001\u0000\u0000" +
                    "\u0000[\u0136\u0001\u0000\u0000\u0000]\u014f\u0001\u0000\u0000\u0000_" +
                    "\u0151\u0001\u0000\u0000\u0000a\u0156\u0001\u0000\u0000\u0000c\u015c\u0001" +
                    "\u0000\u0000\u0000e\u015f\u0001\u0000\u0000\u0000g\u0166\u0001\u0000\u0000" +
                    "\u0000ij\u0005=\u0000\u0000j\u0002\u0001\u0000\u0000\u0000kl\u0005,\u0000" +
                    "\u0000l\u0004\u0001\u0000\u0000\u0000mn\u0005n\u0000\u0000no\u0005u\u0000" +
                    "\u0000op\u0005l\u0000\u0000pq\u0005l\u0000\u0000q\u0006\u0001\u0000\u0000" +
                    "\u0000rs\u0005r\u0000\u0000st\u0005e\u0000\u0000tu\u0005t\u0000\u0000" +
                    "uv\u0005u\u0000\u0000vw\u0005r\u0000\u0000wx\u0005n\u0000\u0000x\b\u0001" +
                    "\u0000\u0000\u0000yz\u0005A\u0000\u0000z{\u0005S\u0000\u0000{|\u0005S" +
                    "\u0000\u0000|}\u0005I\u0000\u0000}~\u0005G\u0000\u0000~\u007f\u0005N\u0000" +
                    "\u0000\u007f\n\u0001\u0000\u0000\u0000\u0080\u0081\u0005;\u0000\u0000" +
                    "\u0081\f\u0001\u0000\u0000\u0000\u0082\u0083\u0005W\u0000\u0000\u0083" +
                    "\u0084\u0005I\u0000\u0000\u0084\u0085\u0005T\u0000\u0000\u0085\u0086\u0005" +
                    "H\u0000\u0000\u0086\u000e\u0001\u0000\u0000\u0000\u0087\u0088\u0005I\u0000" +
                    "\u0000\u0088\u0089\u0005F\u0000\u0000\u0089\u0010\u0001\u0000\u0000\u0000" +
                    "\u008a\u008b\u0005T\u0000\u0000\u008b\u008c\u0005H\u0000\u0000\u008c\u008d" +
                    "\u0005E\u0000\u0000\u008d\u008e\u0005N\u0000\u0000\u008e\u0012\u0001\u0000" +
                    "\u0000\u0000\u008f\u0090\u0005E\u0000\u0000\u0090\u0091\u0005L\u0000\u0000" +
                    "\u0091\u0092\u0005S\u0000\u0000\u0092\u0093\u0005E\u0000\u0000\u0093\u0094" +
                    "\u0005I\u0000\u0000\u0094\u0095\u0005F\u0000\u0000\u0095\u0014\u0001\u0000" +
                    "\u0000\u0000\u0096\u0097\u0005E\u0000\u0000\u0097\u0098\u0005L\u0000\u0000" +
                    "\u0098\u0099\u0005S\u0000\u0000\u0099\u009a\u0005E\u0000\u0000\u009a\u0016" +
                    "\u0001\u0000\u0000\u0000\u009b\u009c\u0005$\u0000\u0000\u009c\u0018\u0001" +
                    "\u0000\u0000\u0000\u009d\u009e\u0005(\u0000\u0000\u009e\u001a\u0001\u0000" +
                    "\u0000\u0000\u009f\u00a0\u0005)\u0000\u0000\u00a0\u001c\u0001\u0000\u0000" +
                    "\u0000\u00a1\u00a2\u0005{\u0000\u0000\u00a2\u001e\u0001\u0000\u0000\u0000" +
                    "\u00a3\u00a4\u0005}\u0000\u0000\u00a4 \u0001\u0000\u0000\u0000\u00a5\u00a6" +
                    "\u0005>\u0000\u0000\u00a6\"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005" +
                    ">\u0000\u0000\u00a8\u00a9\u0005=\u0000\u0000\u00a9$\u0001\u0000\u0000" +
                    "\u0000\u00aa\u00ab\u0005<\u0000\u0000\u00ab&\u0001\u0000\u0000\u0000\u00ac" +
                    "\u00ad\u0005<\u0000\u0000\u00ad\u00ae\u0005=\u0000\u0000\u00ae(\u0001" +
                    "\u0000\u0000\u0000\u00af\u00b0\u0005=\u0000\u0000\u00b0\u00b1\u0005=\u0000" +
                    "\u0000\u00b1*\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005!\u0000\u0000\u00b3" +
                    "\u00b4\u0005=\u0000\u0000\u00b4,\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005" +
                    "&\u0000\u0000\u00b6\u00b7\u0005&\u0000\u0000\u00b7.\u0001\u0000\u0000" +
                    "\u0000\u00b8\u00b9\u0005|\u0000\u0000\u00b9\u00ba\u0005|\u0000\u0000\u00ba" +
                    "0\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005+\u0000\u0000\u00bc2\u0001" +
                    "\u0000\u0000\u0000\u00bd\u00be\u0005-\u0000\u0000\u00be4\u0001\u0000\u0000" +
                    "\u0000\u00bf\u00c0\u0005*\u0000\u0000\u00c06\u0001\u0000\u0000\u0000\u00c1" +
                    "\u00c2\u0005/\u0000\u0000\u00c28\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005" +
                    "C\u0000\u0000\u00c4\u00c5\u0005O\u0000\u0000\u00c5\u00c6\u0005N\u0000" +
                    "\u0000\u00c6\u00c7\u0005T\u0000\u0000\u00c7\u00c8\u0005A\u0000\u0000\u00c8" +
                    "\u00c9\u0005I\u0000\u0000\u00c9\u00ca\u0005N\u0000\u0000\u00ca:\u0001" +
                    "\u0000\u0000\u0000\u00cb\u00cc\u0005N\u0000\u0000\u00cc\u00cd\u0005O\u0000" +
                    "\u0000\u00cd\u00ce\u0005T\u0000\u0000\u00ce\u00cf\u0005C\u0000\u0000\u00cf" +
                    "\u00d0\u0005O\u0000\u0000\u00d0\u00d1\u0005N\u0000\u0000\u00d1\u00d2\u0005" +
                    "T\u0000\u0000\u00d2\u00d3\u0005A\u0000\u0000\u00d3\u00d4\u0005I\u0000" +
                    "\u0000\u00d4\u00d5\u0005N\u0000\u0000\u00d5<\u0001\u0000\u0000\u0000\u00d6" +
                    "\u00d7\u0005S\u0000\u0000\u00d7\u00d8\u0005T\u0000\u0000\u00d8\u00d9\u0005" +
                    "A\u0000\u0000\u00d9\u00da\u0005R\u0000\u0000\u00da\u00db\u0005T\u0000" +
                    "\u0000\u00db>\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005N\u0000\u0000\u00dd" +
                    "\u00de\u0005O\u0000\u0000\u00de\u00df\u0005T\u0000\u0000\u00df\u00e0\u0005" +
                    "S\u0000\u0000\u00e0\u00e1\u0005T\u0000\u0000\u00e1\u00e2\u0005A\u0000" +
                    "\u0000\u00e2\u00e3\u0005R\u0000\u0000\u00e3\u00e4\u0005T\u0000\u0000\u00e4" +
                    "@\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005E\u0000\u0000\u00e6\u00e7\u0005" +
                    "N\u0000\u0000\u00e7\u00e8\u0005D\u0000\u0000\u00e8B\u0001\u0000\u0000" +
                    "\u0000\u00e9\u00ea\u0005N\u0000\u0000\u00ea\u00eb\u0005O\u0000\u0000\u00eb" +
                    "\u00ec\u0005T\u0000\u0000\u00ec\u00ed\u0005E\u0000\u0000\u00ed\u00ee\u0005" +
                    "N\u0000\u0000\u00ee\u00ef\u0005D\u0000\u0000\u00efD\u0001\u0000\u0000" +
                    "\u0000\u00f0\u00f1\u0005t\u0000\u0000\u00f1\u00f2\u0005r\u0000\u0000\u00f2" +
                    "\u00f3\u0005u\u0000\u0000\u00f3\u00f4\u0005e\u0000\u0000\u00f4F\u0001" +
                    "\u0000\u0000\u0000\u00f5\u00f6\u0005f\u0000\u0000\u00f6\u00f7\u0005a\u0000" +
                    "\u0000\u00f7\u00f8\u0005l\u0000\u0000\u00f8\u00f9\u0005s\u0000\u0000\u00f9" +
                    "\u00fa\u0005e\u0000\u0000\u00faH\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003" +
                    "W+\u0000\u00fc\u00fe\u0003Y,\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000" +
                    "\u00fd\u00fc\u0001\u0000\u0000\u0000\u00feJ\u0001\u0000\u0000\u0000\u00ff" +
                    "\u0100\u0003M&\u0000\u0100\u0101\u0005 \u0000\u0000\u0101\u0102\u0003" +
                    "U*\u0000\u0102L\u0001\u0000\u0000\u0000\u0103\u0104\u0003O\'\u0000\u0104" +
                    "\u0105\u0005-\u0000\u0000\u0105\u0106\u0003Q(\u0000\u0106\u0107\u0005" +
                    "-\u0000\u0000\u0107\u0108\u0003S)\u0000\u0108N\u0001\u0000\u0000\u0000" +
                    "\u0109\u010a\u0007\u0000\u0000\u0000\u010a\u010b\u0007\u0000\u0000\u0000" +
                    "\u010b\u010c\u0007\u0000\u0000\u0000\u010c\u010d\u0007\u0000\u0000\u0000" +
                    "\u010dP\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0000\u0000\u0000\u010f" +
                    "\u0110\u0007\u0000\u0000\u0000\u0110R\u0001\u0000\u0000\u0000\u0111\u0112" +
                    "\u0007\u0000\u0000\u0000\u0112\u0113\u0007\u0000\u0000\u0000\u0113T\u0001" +
                    "\u0000\u0000\u0000\u0114\u0115\u0007\u0000\u0000\u0000\u0115\u0116\u0007" +
                    "\u0000\u0000\u0000\u0116\u0117\u0005:\u0000\u0000\u0117\u0118\u0007\u0000" +
                    "\u0000\u0000\u0118\u0119\u0007\u0000\u0000\u0000\u0119\u011a\u0005:\u0000" +
                    "\u0000\u011a\u011b\u0007\u0000\u0000\u0000\u011b\u011c\u0007\u0000\u0000" +
                    "\u0000\u011cV\u0001\u0000\u0000\u0000\u011d\u011f\u0007\u0000\u0000\u0000" +
                    "\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000" +
                    "\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000" +
                    "\u0121X\u0001\u0000\u0000\u0000\u0122\u0124\u0007\u0000\u0000\u0000\u0123" +
                    "\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125" +
                    "\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126" +
                    "\u0127\u0001\u0000\u0000\u0000\u0127\u012b\u0005.\u0000\u0000\u0128\u012a" +
                    "\u0007\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d" +
                    "\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c" +
                    "\u0001\u0000\u0000\u0000\u012c\u0135\u0001\u0000\u0000\u0000\u012d\u012b" +
                    "\u0001\u0000\u0000\u0000\u012e\u0130\u0005.\u0000\u0000\u012f\u0131\u0007" +
                    "\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001" +
                    "\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001" +
                    "\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0123\u0001" +
                    "\u0000\u0000\u0000\u0134\u012e\u0001\u0000\u0000\u0000\u0135Z\u0001\u0000" +
                    "\u0000\u0000\u0136\u013a\u0007\u0001\u0000\u0000\u0137\u0139\u0007\u0002" +
                    "\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000" +
                    "\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000" +
                    "\u0000\u0000\u013b\\\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000" +
                    "\u0000\u013d\u0142\u0005\"\u0000\u0000\u013e\u0141\u0003_/\u0000\u013f" +
                    "\u0141\b\u0003\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f" +
                    "\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140" +
                    "\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145" +
                    "\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0150" +
                    "\u0005\"\u0000\u0000\u0146\u014b\u0005\'\u0000\u0000\u0147\u014a\u0003" +
                    "_/\u0000\u0148\u014a\b\u0004\u0000\u0000\u0149\u0147\u0001\u0000\u0000" +
                    "\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000" +
                    "\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000" +
                    "\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000" +
                    "\u0000\u014e\u0150\u0005\'\u0000\u0000\u014f\u013d\u0001\u0000\u0000\u0000" +
                    "\u014f\u0146\u0001\u0000\u0000\u0000\u0150^\u0001\u0000\u0000\u0000\u0151" +
                    "\u0154\u0005\\\u0000\u0000\u0152\u0155\u0007\u0005\u0000\u0000\u0153\u0155" +
                    "\u0003a0\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000" +
                    "\u0000\u0000\u0155`\u0001\u0000\u0000\u0000\u0156\u0157\u0005u\u0000\u0000" +
                    "\u0157\u0158\u0003c1\u0000\u0158\u0159\u0003c1\u0000\u0159\u015a\u0003" +
                    "c1\u0000\u015a\u015b\u0003c1\u0000\u015bb\u0001\u0000\u0000\u0000\u015c" +
                    "\u015d\u0007\u0006\u0000\u0000\u015dd\u0001\u0000\u0000\u0000\u015e\u0160" +
                    "\u0007\u0007\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0161" +
                    "\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162" +
                    "\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164" +
                    "\u00062\u0000\u0000\u0164f\u0001\u0000\u0000\u0000\u0165\u0167\u0005\r" +
                    "\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000" +
                    "\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\n\u0000" +
                    "\u0000\u0169h\u0001\u0000\u0000\u0000\u0010\u0000\u00fd\u0120\u0125\u012b" +
                    "\u0132\u0134\u013a\u0140\u0142\u0149\u014b\u014f\u0154\u0161\u0166\u0001" +
                    "\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}