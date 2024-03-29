// Generated from /home/thiago/Área de Trabalho/Compiladores/Kleber/grammar/kleber/parser/Kleber.g4 by ANTLR 4.6

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
		T__0=1, RETURN=2, PRINTF=3, SCANF=4, FUNCTIONS=5, INT=6, FLOAT=7, STRING=8, 
		CHAR=9, TRUE=10, FALSE=11, READ=12, WRITE=13, IF=14, ELSE=15, FOR=16, 
		MAIN=17, INCLUDE=18, GLOBAL=19, STR=20, NUM=21, VAR=22, CHARACTERE=23, 
		GR=24, LS=25, EQ=26, GRT=27, LST=28, NEQ=29, ATR=30, ASP=31, PEG=32, MEG=33, 
		OEX=34, CEX=35, OBL=36, CBL=37, NOT=38, ADD=39, SUB=40, MUL=41, DIV=42, 
		SEP=43, MOD=44, EOL=45, WS=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "RETURN", "PRINTF", "SCANF", "FUNCTIONS", "INT", "FLOAT", "STRING", 
		"CHAR", "TRUE", "FALSE", "READ", "WRITE", "IF", "ELSE", "FOR", "MAIN", 
		"INCLUDE", "GLOBAL", "STR", "NUM", "VAR", "CHARACTERE", "GR", "LS", "EQ", 
		"GRT", "LST", "NEQ", "ATR", "ASP", "PEG", "MEG", "OEX", "CEX", "OBL", 
		"CBL", "NOT", "ADD", "SUB", "MUL", "DIV", "SEP", "MOD", "EOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", "'return'", "'printf'", "'scanf'", "'functions'", "'int'", 
		"'float'", "'string'", "'char'", "'true'", "'false'", "'read'", "'write'", 
		"'if'", "'else'", "'for'", "'main'", "'#include'", "'global'", null, null, 
		null, null, "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", "'\"'", 
		"'+='", "'-='", "'('", "')'", "'{'", "'}'", null, "'+'", "'-'", "'*'", 
		"'/'", "','", "'%'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "RETURN", "PRINTF", "SCANF", "FUNCTIONS", "INT", "FLOAT", 
		"STRING", "CHAR", "TRUE", "FALSE", "READ", "WRITE", "IF", "ELSE", "FOR", 
		"MAIN", "INCLUDE", "GLOBAL", "STR", "NUM", "VAR", "CHARACTERE", "GR", 
		"LS", "EQ", "GRT", "LST", "NEQ", "ATR", "ASP", "PEG", "MEG", "OEX", "CEX", 
		"OBL", "CBL", "NOT", "ADD", "SUB", "MUL", "DIV", "SEP", "MOD", "EOL", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\7\25\u00cf\n\25\f\25\16\25\u00d2\13\25\3"+
		"\25\3\25\3\26\5\26\u00d7\n\26\3\26\6\26\u00da\n\26\r\26\16\26\u00db\3"+
		"\26\3\26\6\26\u00e0\n\26\r\26\16\26\u00e1\5\26\u00e4\n\26\3\27\3\27\7"+
		"\27\u00e8\n\27\f\27\16\27\u00eb\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3\'\5\'\u0117\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\6/\u0128"+
		"\n/\r/\16/\u0129\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3"+
		"\2\b\6\2\f\f\17\17$$^^\4\2--\u00ae\u00ae\3\2\62;\4\2C\\c|\6\2\62;C\\a"+
		"ac|\5\2\13\f\17\17\"\"\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7h\3\2\2\2\to\3\2\2\2\13u\3\2\2\2\r"+
		"\177\3\2\2\2\17\u0083\3\2\2\2\21\u0089\3\2\2\2\23\u0090\3\2\2\2\25\u0095"+
		"\3\2\2\2\27\u009a\3\2\2\2\31\u00a0\3\2\2\2\33\u00a5\3\2\2\2\35\u00ab\3"+
		"\2\2\2\37\u00ae\3\2\2\2!\u00b3\3\2\2\2#\u00b7\3\2\2\2%\u00bc\3\2\2\2\'"+
		"\u00c5\3\2\2\2)\u00cc\3\2\2\2+\u00d6\3\2\2\2-\u00e5\3\2\2\2/\u00ec\3\2"+
		"\2\2\61\u00f0\3\2\2\2\63\u00f2\3\2\2\2\65\u00f4\3\2\2\2\67\u00f7\3\2\2"+
		"\29\u00fa\3\2\2\2;\u00fd\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0104"+
		"\3\2\2\2C\u0107\3\2\2\2E\u010a\3\2\2\2G\u010c\3\2\2\2I\u010e\3\2\2\2K"+
		"\u0110\3\2\2\2M\u0116\3\2\2\2O\u0118\3\2\2\2Q\u011a\3\2\2\2S\u011c\3\2"+
		"\2\2U\u011e\3\2\2\2W\u0120\3\2\2\2Y\u0122\3\2\2\2[\u0124\3\2\2\2]\u0127"+
		"\3\2\2\2_`\7\62\2\2`\4\3\2\2\2ab\7t\2\2bc\7g\2\2cd\7v\2\2de\7w\2\2ef\7"+
		"t\2\2fg\7p\2\2g\6\3\2\2\2hi\7r\2\2ij\7t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2"+
		"mn\7h\2\2n\b\3\2\2\2op\7u\2\2pq\7e\2\2qr\7c\2\2rs\7p\2\2st\7h\2\2t\n\3"+
		"\2\2\2uv\7h\2\2vw\7w\2\2wx\7p\2\2xy\7e\2\2yz\7v\2\2z{\7k\2\2{|\7q\2\2"+
		"|}\7p\2\2}~\7u\2\2~\f\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081"+
		"\u0082\7v\2\2\u0082\16\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\20\3\2\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2"+
		"\u008d\u008e\7p\2\2\u008e\u008f\7i\2\2\u008f\22\3\2\2\2\u0090\u0091\7"+
		"e\2\2\u0091\u0092\7j\2\2\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094\24"+
		"\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7w\2\2\u0098"+
		"\u0099\7g\2\2\u0099\26\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f\30\3\2\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7f\2\2"+
		"\u00a4\32\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7"+
		"k\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\34\3\2\2\2\u00ab\u00ac"+
		"\7k\2\2\u00ac\u00ad\7h\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2 \3\2\2\2\u00b3\u00b4"+
		"\7h\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6\"\3\2\2\2\u00b7\u00b8"+
		"\7o\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"$\3\2\2\2\u00bc\u00bd\7%\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7e\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7f\2\2"+
		"\u00c3\u00c4\7g\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7n\2"+
		"\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb"+
		"\7n\2\2\u00cb(\3\2\2\2\u00cc\u00d0\7$\2\2\u00cd\u00cf\n\2\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7$\2\2\u00d4*\3\2\2\2\u00d5"+
		"\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00da\t\4\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00df\7\60"+
		"\2\2\u00de\u00e0\t\4\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00dd\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4,\3\2\2\2\u00e5\u00e9\t\5\2\2\u00e6\u00e8"+
		"\t\6\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea.\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7)\2\2\u00ed"+
		"\u00ee\t\5\2\2\u00ee\u00ef\7)\2\2\u00ef\60\3\2\2\2\u00f0\u00f1\7@\2\2"+
		"\u00f1\62\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\64\3\2\2\2\u00f4\u00f5\7?\2"+
		"\2\u00f5\u00f6\7?\2\2\u00f6\66\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f98\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7?\2\2\u00fc:\3"+
		"\2\2\2\u00fd\u00fe\7#\2\2\u00fe\u00ff\7?\2\2\u00ff<\3\2\2\2\u0100\u0101"+
		"\7?\2\2\u0101>\3\2\2\2\u0102\u0103\7$\2\2\u0103@\3\2\2\2\u0104\u0105\7"+
		"-\2\2\u0105\u0106\7?\2\2\u0106B\3\2\2\2\u0107\u0108\7/\2\2\u0108\u0109"+
		"\7?\2\2\u0109D\3\2\2\2\u010a\u010b\7*\2\2\u010bF\3\2\2\2\u010c\u010d\7"+
		"+\2\2\u010dH\3\2\2\2\u010e\u010f\7}\2\2\u010fJ\3\2\2\2\u0110\u0111\7\177"+
		"\2\2\u0111L\3\2\2\2\u0112\u0117\7#\2\2\u0113\u0114\7P\2\2\u0114\u0115"+
		"\7Q\2\2\u0115\u0117\7V\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0117"+
		"N\3\2\2\2\u0118\u0119\7-\2\2\u0119P\3\2\2\2\u011a\u011b\7/\2\2\u011bR"+
		"\3\2\2\2\u011c\u011d\7,\2\2\u011dT\3\2\2\2\u011e\u011f\7\61\2\2\u011f"+
		"V\3\2\2\2\u0120\u0121\7.\2\2\u0121X\3\2\2\2\u0122\u0123\7\'\2\2\u0123"+
		"Z\3\2\2\2\u0124\u0125\7=\2\2\u0125\\\3\2\2\2\u0126\u0128\t\7\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b/\2\2\u012c^\3\2\2\2\13\2\u00d0"+
		"\u00d6\u00db\u00e1\u00e3\u00e9\u0116\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}