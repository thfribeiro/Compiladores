// Generated from /home/cc08462311900/NetBeansProjects/Kleber/grammar/kleber/parser/Kleber.g4 by ANTLR 4.6

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
		INT=1, FLOAT=2, BOOLEAN=3, STRING=4, TRUE=5, FALSE=6, READ=7, WRITE=8, 
		IF=9, ELSE=10, MAIN=11, INCLUDE=12, GLOBAL=13, STR=14, NUM=15, VAR=16, 
		GR=17, LS=18, EQ=19, GRT=20, LST=21, NEQ=22, ATR=23, PEG=24, MEG=25, OEX=26, 
		CEX=27, OBL=28, CBL=29, NOT=30, ADD=31, SUB=32, MUL=33, DIV=34, MOD=35, 
		EOL=36, COMMENT=37, LINE_COMMENT=38, WS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "BOOLEAN", "STRING", "TRUE", "FALSE", "READ", "WRITE", 
		"IF", "ELSE", "MAIN", "INCLUDE", "GLOBAL", "STR", "NUM", "VAR", "GR", 
		"LS", "EQ", "GRT", "LST", "NEQ", "ATR", "PEG", "MEG", "OEX", "CEX", "OBL", 
		"CBL", "NOT", "ADD", "SUB", "MUL", "DIV", "MOD", "EOL", "COMMENT", "LINE_COMMENT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'boolean'", "'string'", "'true'", "'false'", 
		"'read'", "'write'", "'if'", "'else'", "'main'", "'#include'", "'global'", 
		null, null, null, "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", 
		"'+='", "'-='", "'('", "')'", "'{'", "'}'", null, "'+'", "'-'", "'*'", 
		"'/'", "'%'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "BOOLEAN", "STRING", "TRUE", "FALSE", "READ", "WRITE", 
		"IF", "ELSE", "MAIN", "INCLUDE", "GLOBAL", "STR", "NUM", "VAR", "GR", 
		"LS", "EQ", "GRT", "LST", "NEQ", "ATR", "PEG", "MEG", "OEX", "CEX", "OBL", 
		"CBL", "NOT", "ADD", "SUB", "MUL", "DIV", "MOD", "EOL", "COMMENT", "LINE_COMMENT", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\7\17\u00a0\n\17\f\17\16\17\u00a3\13\17\3"+
		"\17\3\17\3\20\5\20\u00a8\n\20\3\20\6\20\u00ab\n\20\r\20\16\20\u00ac\3"+
		"\20\3\20\6\20\u00b1\n\20\r\20\16\20\u00b2\5\20\u00b5\n\20\3\21\3\21\7"+
		"\21\u00b9\n\21\f\21\16\21\u00bc\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\5\37\u00e2\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"&\3&\7&\u00f4\n&\f&\16&\u00f7\13&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0102"+
		"\n\'\f\'\16\'\u0105\13\'\3\'\3\'\3(\6(\u010a\n(\r(\16(\u010b\3(\3(\3\u00f5"+
		"\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)\3\2\t\6\2\f\f\17\17$$^^\4\2--//\3\2\62;\4\2"+
		"C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0118\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\t"+
		"c\3\2\2\2\13j\3\2\2\2\ro\3\2\2\2\17u\3\2\2\2\21z\3\2\2\2\23\u0080\3\2"+
		"\2\2\25\u0083\3\2\2\2\27\u0088\3\2\2\2\31\u008d\3\2\2\2\33\u0096\3\2\2"+
		"\2\35\u009d\3\2\2\2\37\u00a7\3\2\2\2!\u00b6\3\2\2\2#\u00bd\3\2\2\2%\u00bf"+
		"\3\2\2\2\'\u00c1\3\2\2\2)\u00c4\3\2\2\2+\u00c7\3\2\2\2-\u00ca\3\2\2\2"+
		"/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63\u00d2\3\2\2\2\65\u00d5\3\2\2\2\67"+
		"\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00e1\3\2\2\2?\u00e3\3\2"+
		"\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G\u00eb\3\2\2\2I\u00ed"+
		"\3\2\2\2K\u00ef\3\2\2\2M\u00fd\3\2\2\2O\u0109\3\2\2\2QR\7k\2\2RS\7p\2"+
		"\2ST\7v\2\2T\4\3\2\2\2UV\7h\2\2VW\7n\2\2WX\7q\2\2XY\7c\2\2YZ\7v\2\2Z\6"+
		"\3\2\2\2[\\\7d\2\2\\]\7q\2\2]^\7q\2\2^_\7n\2\2_`\7g\2\2`a\7c\2\2ab\7p"+
		"\2\2b\b\3\2\2\2cd\7u\2\2de\7v\2\2ef\7t\2\2fg\7k\2\2gh\7p\2\2hi\7i\2\2"+
		"i\n\3\2\2\2jk\7v\2\2kl\7t\2\2lm\7w\2\2mn\7g\2\2n\f\3\2\2\2op\7h\2\2pq"+
		"\7c\2\2qr\7n\2\2rs\7u\2\2st\7g\2\2t\16\3\2\2\2uv\7t\2\2vw\7g\2\2wx\7c"+
		"\2\2xy\7f\2\2y\20\3\2\2\2z{\7y\2\2{|\7t\2\2|}\7k\2\2}~\7v\2\2~\177\7g"+
		"\2\2\177\22\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082\24\3\2"+
		"\2\2\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7g\2\2\u0087\26\3\2\2\2\u0088\u0089\7o\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7p\2\2\u008c\30\3\2\2\2\u008d\u008e\7%\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7e\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7w\2\2\u0093\u0094\7f\2\2\u0094\u0095\7g\2\2\u0095\32\3\2\2\2\u0096"+
		"\u0097\7i\2\2\u0097\u0098\7n\2\2\u0098\u0099\7q\2\2\u0099\u009a\7d\2\2"+
		"\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\34\3\2\2\2\u009d\u00a1\7"+
		"$\2\2\u009e\u00a0\n\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7$\2\2\u00a5\36\3\2\2\2\u00a6\u00a8\t\3\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab\t\4\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00b0\7\60\2\2\u00af\u00b1\t\4\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		" \3\2\2\2\u00b6\u00ba\t\5\2\2\u00b7\u00b9\t\6\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\"\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7@\2\2\u00be$\3\2\2\2\u00bf\u00c0"+
		"\7>\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\u00c3\7?\2\2\u00c3(\3"+
		"\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\7?\2\2\u00c6*\3\2\2\2\u00c7\u00c8"+
		"\7>\2\2\u00c8\u00c9\7?\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\60\3\2\2\2\u00cf\u00d0"+
		"\7-\2\2\u00d0\u00d1\7?\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6\66\3\2\2\2\u00d7\u00d8"+
		"\7+\2\2\u00d88\3\2\2\2\u00d9\u00da\7}\2\2\u00da:\3\2\2\2\u00db\u00dc\7"+
		"\177\2\2\u00dc<\3\2\2\2\u00dd\u00e2\7#\2\2\u00de\u00df\7P\2\2\u00df\u00e0"+
		"\7Q\2\2\u00e0\u00e2\7V\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2"+
		">\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6B"+
		"\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea"+
		"F\3\2\2\2\u00eb\u00ec\7\'\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee"+
		"J\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f5\3\2\2\2"+
		"\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b&"+
		"\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0103"+
		"\3\2\2\2\u0100\u0102\n\7\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0107\b\'\2\2\u0107N\3\2\2\2\u0108\u010a\t\b\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\b(\2\2\u010eP\3\2\2\2\r\2\u00a1\u00a7\u00ac"+
		"\u00b2\u00b4\u00ba\u00e1\u00f5\u0103\u010b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}