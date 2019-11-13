// Generated from C:\Users\Thiago\Documents\NetBeansProjects\Kleber\grammar\kleber\parser\Kleber.g4 by ANTLR 4.6

package kleber.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KleberLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RETURN=1, FUNCTIONS=2, INT=3, FLOAT=4, BOOLEAN=5, STRING=6, TRUE=7, FALSE=8, 
		READ=9, WRITE=10, IF=11, ELSE=12, MAIN=13, INCLUDE=14, GLOBAL=15, STR=16, 
		NUM=17, VAR=18, GR=19, LS=20, EQ=21, GRT=22, LST=23, NEQ=24, ATR=25, PEG=26, 
		MEG=27, OEX=28, CEX=29, OBL=30, CBL=31, NOT=32, ADD=33, SUB=34, MUL=35, 
		DIV=36, SEP=37, MOD=38, EOL=39, COMMENT=40, LINE_COMMENT=41, WS=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"RETURN", "FUNCTIONS", "INT", "FLOAT", "BOOLEAN", "STRING", "TRUE", "FALSE", 
		"READ", "WRITE", "IF", "ELSE", "MAIN", "INCLUDE", "GLOBAL", "STR", "NUM", 
		"VAR", "GR", "LS", "EQ", "GRT", "LST", "NEQ", "ATR", "PEG", "MEG", "OEX", 
		"CEX", "OBL", "CBL", "NOT", "ADD", "SUB", "MUL", "DIV", "SEP", "MOD", 
		"EOL", "COMMENT", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "'functions'", "'int'", "'float'", "'boolean'", "'string'", 
		"'true'", "'false'", "'read'", "'write'", "'if'", "'else'", "'main'", 
		"'#include'", "'global'", null, null, null, "'>'", "'<'", "'=='", "'>='", 
		"'<='", "'!='", "'='", "'+='", "'-='", "'('", "')'", "'{'", "'}'", null, 
		"'+'", "'-'", "'*'", "'/'", "','", "'%'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RETURN", "FUNCTIONS", "INT", "FLOAT", "BOOLEAN", "STRING", "TRUE", 
		"FALSE", "READ", "WRITE", "IF", "ELSE", "MAIN", "INCLUDE", "GLOBAL", "STR", 
		"NUM", "VAR", "GR", "LS", "EQ", "GRT", "LST", "NEQ", "ATR", "PEG", "MEG", 
		"OEX", "CEX", "OBL", "CBL", "NOT", "ADD", "SUB", "MUL", "DIV", "SEP", 
		"MOD", "EOL", "COMMENT", "LINE_COMMENT", "WS"
	};
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


	public KleberLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kleber.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0128\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u00b7"+
		"\n\21\f\21\16\21\u00ba\13\21\3\21\3\21\3\22\5\22\u00bf\n\22\3\22\6\22"+
		"\u00c2\n\22\r\22\16\22\u00c3\3\22\3\22\6\22\u00c8\n\22\r\22\16\22\u00c9"+
		"\5\22\u00cc\n\22\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3\13\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3!\5!\u00f9\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3)\3)\7)\u010d\n)\f)\16)\u0110\13)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\7*\u011b\n*\f*\16*\u011e\13*\3*\3*\3+\6+\u0123\n+\r+\16+\u0124"+
		"\3+\3+\3\u010e\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\t\6\2\f\f\17\17$$^^"+
		"\4\2--//\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7h\3\2\2\2\tl\3\2\2\2\13r\3"+
		"\2\2\2\rz\3\2\2\2\17\u0081\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25"+
		"\u0091\3\2\2\2\27\u0097\3\2\2\2\31\u009a\3\2\2\2\33\u009f\3\2\2\2\35\u00a4"+
		"\3\2\2\2\37\u00ad\3\2\2\2!\u00b4\3\2\2\2#\u00be\3\2\2\2%\u00cd\3\2\2\2"+
		"\'\u00d4\3\2\2\2)\u00d6\3\2\2\2+\u00d8\3\2\2\2-\u00db\3\2\2\2/\u00de\3"+
		"\2\2\2\61\u00e1\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2\2\2\67\u00e9\3\2"+
		"\2\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f2\3\2\2\2A\u00f8"+
		"\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00fe\3\2\2\2I\u0100\3\2\2\2K"+
		"\u0102\3\2\2\2M\u0104\3\2\2\2O\u0106\3\2\2\2Q\u0108\3\2\2\2S\u0116\3\2"+
		"\2\2U\u0122\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7v\2\2Z[\7w\2\2[\\\7t\2\2\\]\7"+
		"p\2\2]\4\3\2\2\2^_\7h\2\2_`\7w\2\2`a\7p\2\2ab\7e\2\2bc\7v\2\2cd\7k\2\2"+
		"de\7q\2\2ef\7p\2\2fg\7u\2\2g\6\3\2\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k\b\3"+
		"\2\2\2lm\7h\2\2mn\7n\2\2no\7q\2\2op\7c\2\2pq\7v\2\2q\n\3\2\2\2rs\7d\2"+
		"\2st\7q\2\2tu\7q\2\2uv\7n\2\2vw\7g\2\2wx\7c\2\2xy\7p\2\2y\f\3\2\2\2z{"+
		"\7u\2\2{|\7v\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080"+
		"\16\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084\7w\2\2\u0084"+
		"\u0085\7g\2\2\u0085\20\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\22\3\2\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7f\2\2"+
		"\u0090\24\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7t\2\2\u0093\u0094\7"+
		"k\2\2\u0094\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\26\3\2\2\2\u0097\u0098"+
		"\7k\2\2\u0098\u0099\7h\2\2\u0099\30\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\32\3\2\2\2\u009f\u00a0"+
		"\7o\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\34\3\2\2\2\u00a4\u00a5\7%\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7f\2\2"+
		"\u00ab\u00ac\7g\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\7i\2\2\u00ae\u00af\7"+
		"n\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3 \3\2\2\2\u00b4\u00b8\7$\2\2\u00b5\u00b7\n\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc\"\3\2\2\2"+
		"\u00bd\u00bf\t\3\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00c2\t\4\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c7\7\60"+
		"\2\2\u00c6\u00c8\t\4\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c5\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc$\3\2\2\2\u00cd\u00d1\t\5\2\2\u00ce\u00d0"+
		"\t\6\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2&\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5"+
		"(\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da"+
		"\7?\2\2\u00da,\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7?\2\2\u00dd.\3"+
		"\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7?\2\2\u00e0\60\3\2\2\2\u00e1\u00e2"+
		"\7#\2\2\u00e2\u00e3\7?\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5\64"+
		"\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7\u00e8\7?\2\2\u00e8\66\3\2\2\2\u00e9"+
		"\u00ea\7/\2\2\u00ea\u00eb\7?\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7*\2\2\u00ed"+
		":\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7}\2\2\u00f1>"+
		"\3\2\2\2\u00f2\u00f3\7\177\2\2\u00f3@\3\2\2\2\u00f4\u00f9\7#\2\2\u00f5"+
		"\u00f6\7P\2\2\u00f6\u00f7\7Q\2\2\u00f7\u00f9\7V\2\2\u00f8\u00f4\3\2\2"+
		"\2\u00f8\u00f5\3\2\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7-\2\2\u00fbD\3\2\2"+
		"\2\u00fc\u00fd\7/\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7,\2\2\u00ffH\3\2\2\2"+
		"\u0100\u0101\7\61\2\2\u0101J\3\2\2\2\u0102\u0103\7.\2\2\u0103L\3\2\2\2"+
		"\u0104\u0105\7\'\2\2\u0105N\3\2\2\2\u0106\u0107\7=\2\2\u0107P\3\2\2\2"+
		"\u0108\u0109\7\61\2\2\u0109\u010a\7,\2\2\u010a\u010e\3\2\2\2\u010b\u010d"+
		"\13\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112"+
		"\7,\2\2\u0112\u0113\7\61\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b)\2\2\u0115"+
		"R\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7\61\2\2\u0118\u011c\3\2\2"+
		"\2\u0119\u011b\n\7\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\b*\2\2\u0120T\3\2\2\2\u0121\u0123\t\b\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\b+\2\2\u0127V\3\2\2\2\r\2\u00b8\u00be\u00c3\u00c9\u00cb"+
		"\u00d1\u00f8\u010e\u011c\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}