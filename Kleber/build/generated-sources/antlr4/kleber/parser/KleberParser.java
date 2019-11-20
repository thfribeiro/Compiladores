// Generated from C:\Users\Thiago\Documents\NetBeansProjects\Compiladores\Kleber\grammar\kleber\parser\Kleber.g4 by ANTLR 4.6

package kleber.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KleberParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RETURN=2, PRINTF=3, SCANF=4, FUNCTIONS=5, INT=6, FLOAT=7, BOOLEAN=8, 
		STRING=9, TRUE=10, FALSE=11, READ=12, WRITE=13, IF=14, ELSE=15, FOR=16, 
		MAIN=17, INCLUDE=18, GLOBAL=19, STR=20, NUM=21, VAR=22, GR=23, LS=24, 
		EQ=25, GRT=26, LST=27, NEQ=28, ATR=29, PEG=30, MEG=31, OEX=32, CEX=33, 
		OBL=34, CBL=35, NOT=36, ADD=37, SUB=38, MUL=39, DIV=40, SEP=41, MOD=42, 
		EOL=43, WS=44;
	public static final int
		RULE_progr = 0, RULE_bibcall = 1, RULE_global = 2, RULE_functions = 3, 
		RULE_function = 4, RULE_main = 5, RULE_line = 6, RULE_printf = 7, RULE_scanf = 8, 
		RULE_variable = 9, RULE_type = 10, RULE_atr = 11, RULE_ifstm = 12, RULE_forstm = 13, 
		RULE_expr = 14, RULE_term = 15, RULE_fact = 16, RULE_boolExpr = 17, RULE_relop = 18, 
		RULE_increment = 19, RULE_block = 20, RULE_ret = 21, RULE_functionBlock = 22;
	public static final String[] ruleNames = {
		"progr", "bibcall", "global", "functions", "function", "main", "line", 
		"printf", "scanf", "variable", "type", "atr", "ifstm", "forstm", "expr", 
		"term", "fact", "boolExpr", "relop", "increment", "block", "ret", "functionBlock"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'return'", "'printf'", "'scanf'", "'functions'", "'int'", 
		"'float'", "'boolean'", "'string'", "'true'", "'false'", "'read'", "'write'", 
		"'if'", "'else'", "'for'", "'main'", "'#include'", "'global'", null, null, 
		null, "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", "'+='", "'-='", 
		"'('", "')'", "'{'", "'}'", null, "'+'", "'-'", "'*'", "'/'", "','", "'%'", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "RETURN", "PRINTF", "SCANF", "FUNCTIONS", "INT", "FLOAT", 
		"BOOLEAN", "STRING", "TRUE", "FALSE", "READ", "WRITE", "IF", "ELSE", "FOR", 
		"MAIN", "INCLUDE", "GLOBAL", "STR", "NUM", "VAR", "GR", "LS", "EQ", "GRT", 
		"LST", "NEQ", "ATR", "PEG", "MEG", "OEX", "CEX", "OBL", "CBL", "NOT", 
		"ADD", "SUB", "MUL", "DIV", "SEP", "MOD", "EOL", "WS"
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

	@Override
	public String getGrammarFileName() { return "Kleber.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KleberParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<BibcallContext> bibcall() {
			return getRuleContexts(BibcallContext.class);
		}
		public BibcallContext bibcall(int i) {
			return getRuleContext(BibcallContext.class,i);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterProgr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitProgr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitProgr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				bibcall();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(51);
				global();
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS) {
				{
				setState(54);
				functions();
				}
			}

			setState(57);
			main();
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

	public static class BibcallContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(KleberParser.INCLUDE, 0); }
		public TerminalNode STR() { return getToken(KleberParser.STR, 0); }
		public BibcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterBibcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitBibcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitBibcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BibcallContext bibcall() throws RecognitionException {
		BibcallContext _localctx = new BibcallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bibcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(INCLUDE);
			setState(60);
			match(STR);
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(KleberParser.GLOBAL, 0); }
		public TerminalNode OBL() { return getToken(KleberParser.OBL, 0); }
		public TerminalNode CBL() { return getToken(KleberParser.CBL, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(KleberParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(KleberParser.EOL, i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(GLOBAL);
			setState(63);
			match(OBL);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				variable();
				setState(65);
				match(EOL);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			setState(71);
			match(CBL);
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

	public static class FunctionsContext extends ParserRuleContext {
		public TerminalNode FUNCTIONS() { return getToken(KleberParser.FUNCTIONS, 0); }
		public TerminalNode OBL() { return getToken(KleberParser.OBL, 0); }
		public TerminalNode CBL() { return getToken(KleberParser.CBL, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(KleberParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(KleberParser.EOL, i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FUNCTIONS);
			setState(74);
			match(OBL);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				function();
				setState(76);
				match(EOL);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			setState(82);
			match(CBL);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(KleberParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(KleberParser.SEP, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			match(VAR);
			setState(86);
			match(OEX);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(87);
						variable();
						setState(88);
						match(SEP);
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(95);
				variable();
				}
			}

			setState(98);
			match(CEX);
			setState(99);
			functionBlock();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(KleberParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(MAIN);
			setState(102);
			block();
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

	public static class LineContext extends ParserRuleContext {
		public PrintfContext printf() {
			return getRuleContext(PrintfContext.class,0);
		}
		public ScanfContext scanf() {
			return getRuleContext(ScanfContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public IfstmContext ifstm() {
			return getRuleContext(IfstmContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				printf();
				}
				break;
			case SCANF:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				scanf();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				atr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				ifstm();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				ret();
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

	public static class PrintfContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(KleberParser.PRINTF, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public TerminalNode STR() { return getToken(KleberParser.STR, 0); }
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public List<TerminalNode> SEP() { return getTokens(KleberParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(KleberParser.SEP, i);
		}
		public List<TerminalNode> VAR() { return getTokens(KleberParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(KleberParser.VAR, i);
		}
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitPrintf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitPrintf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(PRINTF);
			setState(112);
			match(OEX);
			setState(113);
			match(STR);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(114);
				match(SEP);
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(115);
						match(VAR);
						setState(116);
						match(SEP);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(122);
				match(VAR);
				}
			}

			setState(125);
			match(CEX);
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

	public static class ScanfContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(KleberParser.SCANF, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public TerminalNode STR() { return getToken(KleberParser.STR, 0); }
		public List<TerminalNode> SEP() { return getTokens(KleberParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(KleberParser.SEP, i);
		}
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public List<TerminalNode> VAR() { return getTokens(KleberParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(KleberParser.VAR, i);
		}
		public ScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterScanf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitScanf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitScanf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanfContext scanf() throws RecognitionException {
		ScanfContext _localctx = new ScanfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scanf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(SCANF);
			setState(128);
			match(OEX);
			setState(129);
			match(STR);
			setState(130);
			match(SEP);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(131);
						match(T__0);
						setState(132);
						match(VAR);
						setState(133);
						match(SEP);
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(139);
				match(T__0);
				setState(140);
				match(VAR);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(145);
			match(CEX);
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

	public static class VariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(KleberParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(KleberParser.VAR, i);
		}
		public List<TerminalNode> SEP() { return getTokens(KleberParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(KleberParser.SEP, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			int _alt;
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				type();
				setState(148);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				type();
				setState(151);
				match(VAR);
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(152);
						match(SEP);
						setState(153);
						match(VAR);
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KleberParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KleberParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(KleberParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(KleberParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static class AtrContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public TerminalNode ATR() { return getToken(KleberParser.ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitAtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(VAR);
			setState(164);
			match(ATR);
			setState(165);
			expr();
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

	public static class IfstmContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KleberParser.IF, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KleberParser.ELSE, 0); }
		public IfstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterIfstm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitIfstm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitIfstm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstm);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(IF);
				setState(168);
				match(OEX);
				setState(169);
				boolExpr();
				setState(170);
				match(CEX);
				setState(171);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(IF);
				setState(174);
				match(OEX);
				setState(175);
				boolExpr();
				setState(176);
				match(CEX);
				setState(177);
				block();
				setState(178);
				match(ELSE);
				setState(179);
				block();
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

	public static class ForstmContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KleberParser.FOR, 0); }
		public List<TerminalNode> CEX() { return getTokens(KleberParser.CEX); }
		public TerminalNode CEX(int i) {
			return getToken(KleberParser.CEX, i);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(KleberParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(KleberParser.EOL, i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterForstm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitForstm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitForstm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmContext forstm() throws RecognitionException {
		ForstmContext _localctx = new ForstmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forstm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FOR);
			setState(184);
			match(CEX);
			setState(185);
			atr();
			setState(186);
			match(EOL);
			setState(187);
			boolExpr();
			setState(188);
			match(EOL);
			setState(189);
			increment();
			setState(190);
			match(CEX);
			setState(191);
			block();
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KleberParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(KleberParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				term();
				setState(194);
				match(ADD);
				setState(195);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				term();
				setState(198);
				match(SUB);
				setState(199);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MUL() { return getToken(KleberParser.MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(KleberParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KleberParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				fact();
				setState(205);
				match(MUL);
				setState(206);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				fact();
				setState(209);
				match(DIV);
				setState(210);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				fact();
				setState(213);
				match(MOD);
				setState(214);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				fact();
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(KleberParser.NUM, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fact);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(NUM);
				}
				break;
			case OEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(OEX);
				setState(222);
				expr();
				setState(223);
				match(CEX);
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

	public static class BoolExprContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public TerminalNode NOT() { return getToken(KleberParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(KleberParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KleberParser.FALSE, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolExpr);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(NOT);
				setState(229);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				fact();
				setState(231);
				relop();
				setState(232);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(FALSE);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode GR() { return getToken(KleberParser.GR, 0); }
		public TerminalNode LS() { return getToken(KleberParser.LS, 0); }
		public TerminalNode EQ() { return getToken(KleberParser.EQ, 0); }
		public TerminalNode GRT() { return getToken(KleberParser.GRT, 0); }
		public TerminalNode LST() { return getToken(KleberParser.LST, 0); }
		public TerminalNode NEQ() { return getToken(KleberParser.NEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GR) | (1L << LS) | (1L << EQ) | (1L << GRT) | (1L << LST) | (1L << NEQ))) != 0)) ) {
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode PEG() { return getToken(KleberParser.PEG, 0); }
		public TerminalNode MEG() { return getToken(KleberParser.MEG, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==PEG || _la==MEG) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBL() { return getToken(KleberParser.OBL, 0); }
		public TerminalNode CBL() { return getToken(KleberParser.CBL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(KleberParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(KleberParser.EOL, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(OBL);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				line();
				setState(244);
				match(EOL);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINTF) | (1L << SCANF) | (1L << IF) | (1L << VAR))) != 0) );
			setState(250);
			match(CBL);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KleberParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(KleberParser.EOL, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(RETURN);
			setState(253);
			expr();
			setState(254);
			match(EOL);
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public TerminalNode OBL() { return getToken(KleberParser.OBL, 0); }
		public TerminalNode CBL() { return getToken(KleberParser.CBL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(KleberParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(KleberParser.EOL, i);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(OBL);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					line();
					setState(258);
					match(EOL);
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(265);
				ret();
				}
			}

			setState(268);
			match(CBL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\2\5\2\67\n\2\3\2\5\2:\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\6\4F\n\4\r\4\16\4G\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5Q\n\5"+
		"\r\5\16\5R\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6"+
		"\5\6c\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\5\t~\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\n\3\n\6\n\u0090"+
		"\n\n\r\n\16\n\u0091\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009d"+
		"\n\13\f\13\16\13\u00a0\13\13\5\13\u00a2\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00b8\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cd\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dc\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00e4\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00ef\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\6\26\u00f9\n\26\r\26\16\26\u00fa\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\7\30\u0107\n\30\f\30\16\30\u010a\13\30\3\30\5\30\u010d\n"+
		"\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\2\5\3\2\b\13\3\2\31\36\3\2 !\u0119\2\61\3\2\2\2\4=\3\2\2\2\6@\3\2"+
		"\2\2\bK\3\2\2\2\nV\3\2\2\2\fg\3\2\2\2\16o\3\2\2\2\20q\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00a5\3\2\2\2\32\u00b7\3"+
		"\2\2\2\34\u00b9\3\2\2\2\36\u00cc\3\2\2\2 \u00db\3\2\2\2\"\u00e3\3\2\2"+
		"\2$\u00ee\3\2\2\2&\u00f0\3\2\2\2(\u00f2\3\2\2\2*\u00f4\3\2\2\2,\u00fe"+
		"\3\2\2\2.\u0102\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67"+
		"\3\2\2\2\679\3\2\2\28:\5\b\5\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\f\7\2"+
		"<\3\3\2\2\2=>\7\24\2\2>?\7\26\2\2?\5\3\2\2\2@A\7\25\2\2AE\7$\2\2BC\5\24"+
		"\13\2CD\7-\2\2DF\3\2\2\2EB\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2"+
		"\2\2IJ\7%\2\2J\7\3\2\2\2KL\7\7\2\2LP\7$\2\2MN\5\n\6\2NO\7-\2\2OQ\3\2\2"+
		"\2PM\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7%\2\2U\t\3\2\2"+
		"\2VW\5\26\f\2WX\7\30\2\2Xb\7\"\2\2YZ\5\24\13\2Z[\7+\2\2[]\3\2\2\2\\Y\3"+
		"\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ac\5\24\13\2"+
		"b^\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7#\2\2ef\5.\30\2f\13\3\2\2\2gh\7\23\2"+
		"\2hi\5*\26\2i\r\3\2\2\2jp\5\20\t\2kp\5\22\n\2lp\5\30\r\2mp\5\32\16\2n"+
		"p\5,\27\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\17\3\2\2"+
		"\2qr\7\5\2\2rs\7\"\2\2s}\7\26\2\2ty\7+\2\2uv\7\30\2\2vx\7+\2\2wu\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|~\7\30\2\2}t\3\2"+
		"\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7#\2\2\u0080\21\3\2\2\2\u0081\u0082"+
		"\7\6\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7\26\2\2\u0084\u008f\7+\2\2\u0085"+
		"\u0086\7\3\2\2\u0086\u0087\7\30\2\2\u0087\u0089\7+\2\2\u0088\u0085\3\2"+
		"\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\3\2\2\u008e\u0090\7\30"+
		"\2\2\u008f\u008a\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7#\2\2\u0094\23\3\2\2\2"+
		"\u0095\u0096\5\26\f\2\u0096\u0097\7\30\2\2\u0097\u00a2\3\2\2\2\u0098\u0099"+
		"\5\26\f\2\u0099\u009e\7\30\2\2\u009a\u009b\7+\2\2\u009b\u009d\7\30\2\2"+
		"\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1"+
		"\u0098\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\t\2\2\2\u00a4\27\3\2\2\2\u00a5"+
		"\u00a6\7\30\2\2\u00a6\u00a7\7\37\2\2\u00a7\u00a8\5\36\20\2\u00a8\31\3"+
		"\2\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\5$\23\2\u00ac"+
		"\u00ad\7#\2\2\u00ad\u00ae\5*\26\2\u00ae\u00b8\3\2\2\2\u00af\u00b0\7\20"+
		"\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\5$\23\2\u00b2\u00b3\7#\2\2\u00b3"+
		"\u00b4\5*\26\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\5*\26\2\u00b6\u00b8\3"+
		"\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00af\3\2\2\2\u00b8\33\3\2\2\2\u00b9"+
		"\u00ba\7\22\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\7"+
		"-\2\2\u00bd\u00be\5$\23\2\u00be\u00bf\7-\2\2\u00bf\u00c0\5(\25\2\u00c0"+
		"\u00c1\7#\2\2\u00c1\u00c2\5*\26\2\u00c2\35\3\2\2\2\u00c3\u00c4\5 \21\2"+
		"\u00c4\u00c5\7\'\2\2\u00c5\u00c6\5\36\20\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8"+
		"\5 \21\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00cd\5 \21\2\u00cc\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\7)\2\2\u00d0"+
		"\u00d1\5 \21\2\u00d1\u00dc\3\2\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4\7"+
		"*\2\2\u00d4\u00d5\5 \21\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7\5\"\22\2\u00d7"+
		"\u00d8\7,\2\2\u00d8\u00d9\5 \21\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\5\""+
		"\22\2\u00db\u00ce\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d6\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc!\3\2\2\2\u00dd\u00e4\7\30\2\2\u00de\u00e4\7\27\2"+
		"\2\u00df\u00e0\7\"\2\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2\7#\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2"+
		"\2\2\u00e4#\3\2\2\2\u00e5\u00ef\5\"\22\2\u00e6\u00e7\7&\2\2\u00e7\u00ef"+
		"\5$\23\2\u00e8\u00e9\5\"\22\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\5\"\22\2"+
		"\u00eb\u00ef\3\2\2\2\u00ec\u00ef\7\f\2\2\u00ed\u00ef\7\r\2\2\u00ee\u00e5"+
		"\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef%\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f1\'\3\2\2\2\u00f2"+
		"\u00f3\t\4\2\2\u00f3)\3\2\2\2\u00f4\u00f8\7$\2\2\u00f5\u00f6\5\16\b\2"+
		"\u00f6\u00f7\7-\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7%\2\2\u00fd+\3\2\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0100\5\36\20\2"+
		"\u0100\u0101\7-\2\2\u0101-\3\2\2\2\u0102\u0108\7$\2\2\u0103\u0104\5\16"+
		"\b\2\u0104\u0105\7-\2\2\u0105\u0107\3\2\2\2\u0106\u0103\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010d\5,\27\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7%\2\2\u010f/\3\2\2\2\30"+
		"\63\669GR^boy}\u008a\u0091\u009e\u00a1\u00b7\u00cc\u00db\u00e3\u00ee\u00fa"+
		"\u0108\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}