// Generated from /home/cc08462311900/NetBeansProjects/Kleber/grammar/kleber/parser/Kleber.g4 by ANTLR 4.6

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
		INT=1, FLOAT=2, BOOLEAN=3, STRING=4, TRUE=5, FALSE=6, READ=7, WRITE=8, 
		IF=9, ELSE=10, MAIN=11, INCLUDE=12, GLOBAL=13, STR=14, NUM=15, VAR=16, 
		GR=17, LS=18, EQ=19, GRT=20, LST=21, NEQ=22, ATR=23, PEG=24, MEG=25, OEX=26, 
		CEX=27, OBL=28, CBL=29, NOT=30, ADD=31, SUB=32, MUL=33, DIV=34, MOD=35, 
		EOL=36, COMMENT=37, LINE_COMMENT=38, WS=39, FOR=40;
	public static final int
		RULE_progr = 0, RULE_bibcall = 1, RULE_global = 2, RULE_main = 3, RULE_line = 4, 
		RULE_read = 5, RULE_write = 6, RULE_variavel = 7, RULE_tipo = 8, RULE_atr = 9, 
		RULE_ifstm = 10, RULE_forstm = 11, RULE_expr = 12, RULE_term = 13, RULE_fact = 14, 
		RULE_boolExpr = 15, RULE_relop = 16, RULE_increment = 17, RULE_block = 18;
	public static final String[] ruleNames = {
		"progr", "bibcall", "global", "main", "line", "read", "write", "variavel", 
		"tipo", "atr", "ifstm", "forstm", "expr", "term", "fact", "boolExpr", 
		"relop", "increment", "block"
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
		"WS", "FOR"
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
		public ProgrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progr; }
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				bibcall();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(43);
				global();
				}
			}

			setState(46);
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
	}

	public final BibcallContext bibcall() throws RecognitionException {
		BibcallContext _localctx = new BibcallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bibcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INCLUDE);
			setState(49);
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
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(KleberParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(KleberParser.EOL, i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(GLOBAL);
			setState(52);
			match(OBL);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				variavel();
				setState(54);
				match(EOL);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			setState(60);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(KleberParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(MAIN);
			setState(63);
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
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public IfstmContext ifstm() {
			return getRuleContext(IfstmContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_line);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				read();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				write();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				atr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				ifstm();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(KleberParser.READ, 0); }
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(READ);
			setState(72);
			match(VAR);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(KleberParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(KleberParser.STR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(WRITE);
				setState(75);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(WRITE);
				setState(77);
				expr();
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

	public static class VariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			tipo();
			setState(81);
			match(VAR);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KleberParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KleberParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(KleberParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(KleberParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VAR);
			setState(86);
			match(ATR);
			setState(87);
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
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifstm);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(IF);
				setState(90);
				match(OEX);
				setState(91);
				boolExpr();
				setState(92);
				match(CEX);
				setState(93);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(IF);
				setState(96);
				match(OEX);
				setState(97);
				boolExpr();
				setState(98);
				match(CEX);
				setState(99);
				block();
				setState(100);
				match(ELSE);
				setState(101);
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
	}

	public final ForstmContext forstm() throws RecognitionException {
		ForstmContext _localctx = new ForstmContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forstm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(FOR);
			setState(106);
			match(CEX);
			setState(107);
			atr();
			setState(108);
			match(EOL);
			setState(109);
			boolExpr();
			setState(110);
			match(EOL);
			setState(111);
			increment();
			setState(112);
			match(CEX);
			setState(113);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				term();
				setState(116);
				match(ADD);
				setState(117);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				term();
				setState(120);
				match(SUB);
				setState(121);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				fact();
				setState(127);
				match(MUL);
				setState(128);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				fact();
				setState(131);
				match(DIV);
				setState(132);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				fact();
				setState(135);
				match(MOD);
				setState(136);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
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
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fact);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(NUM);
				}
				break;
			case OEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(OEX);
				setState(144);
				expr();
				setState(145);
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
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolExpr);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(NOT);
				setState(151);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				fact();
				setState(153);
				relop();
				setState(154);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
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
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(OBL);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				line();
				setState(166);
				match(EOL);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << VAR))) != 0) );
			setState(172);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\5\2/\n\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4;\n\4\r\4\16\4<\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0096\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\6\24\u00ab\n\24\r\24\16\24\u00ac\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\5\3\2\3\6\3\2\23\30\3\2\32\33\u00b1\2"+
		")\3\2\2\2\4\62\3\2\2\2\6\65\3\2\2\2\b@\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16"+
		"P\3\2\2\2\20R\3\2\2\2\22U\3\2\2\2\24W\3\2\2\2\26i\3\2\2\2\30k\3\2\2\2"+
		"\32~\3\2\2\2\34\u008d\3\2\2\2\36\u0095\3\2\2\2 \u00a0\3\2\2\2\"\u00a2"+
		"\3\2\2\2$\u00a4\3\2\2\2&\u00a6\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+"+
		")\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\5\6\4\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2"+
		"\2\60\61\5\b\5\2\61\3\3\2\2\2\62\63\7\16\2\2\63\64\7\20\2\2\64\5\3\2\2"+
		"\2\65\66\7\17\2\2\66:\7\36\2\2\678\5\20\t\289\7&\2\29;\3\2\2\2:\67\3\2"+
		"\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\37\2\2?\7\3\2\2\2@A\7"+
		"\r\2\2AB\5&\24\2B\t\3\2\2\2CH\5\f\7\2DH\5\16\b\2EH\5\24\13\2FH\5\26\f"+
		"\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IJ\7\t\2\2JK\7\22"+
		"\2\2K\r\3\2\2\2LM\7\n\2\2MQ\7\20\2\2NO\7\n\2\2OQ\5\32\16\2PL\3\2\2\2P"+
		"N\3\2\2\2Q\17\3\2\2\2RS\5\22\n\2ST\7\22\2\2T\21\3\2\2\2UV\t\2\2\2V\23"+
		"\3\2\2\2WX\7\22\2\2XY\7\31\2\2YZ\5\32\16\2Z\25\3\2\2\2[\\\7\13\2\2\\]"+
		"\7\34\2\2]^\5 \21\2^_\7\35\2\2_`\5&\24\2`j\3\2\2\2ab\7\13\2\2bc\7\34\2"+
		"\2cd\5 \21\2de\7\35\2\2ef\5&\24\2fg\7\f\2\2gh\5&\24\2hj\3\2\2\2i[\3\2"+
		"\2\2ia\3\2\2\2j\27\3\2\2\2kl\7*\2\2lm\7\35\2\2mn\5\24\13\2no\7&\2\2op"+
		"\5 \21\2pq\7&\2\2qr\5$\23\2rs\7\35\2\2st\5&\24\2t\31\3\2\2\2uv\5\34\17"+
		"\2vw\7!\2\2wx\5\32\16\2x\177\3\2\2\2yz\5\34\17\2z{\7\"\2\2{|\5\32\16\2"+
		"|\177\3\2\2\2}\177\5\34\17\2~u\3\2\2\2~y\3\2\2\2~}\3\2\2\2\177\33\3\2"+
		"\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7#\2\2\u0082\u0083\5\34\17\2\u0083"+
		"\u008e\3\2\2\2\u0084\u0085\5\36\20\2\u0085\u0086\7$\2\2\u0086\u0087\5"+
		"\34\17\2\u0087\u008e\3\2\2\2\u0088\u0089\5\36\20\2\u0089\u008a\7%\2\2"+
		"\u008a\u008b\5\34\17\2\u008b\u008e\3\2\2\2\u008c\u008e\5\36\20\2\u008d"+
		"\u0080\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u008c\3\2"+
		"\2\2\u008e\35\3\2\2\2\u008f\u0096\7\22\2\2\u0090\u0096\7\21\2\2\u0091"+
		"\u0092\7\34\2\2\u0092\u0093\5\32\16\2\u0093\u0094\7\35\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0096"+
		"\37\3\2\2\2\u0097\u00a1\5\36\20\2\u0098\u0099\7 \2\2\u0099\u00a1\5 \21"+
		"\2\u009a\u009b\5\36\20\2\u009b\u009c\5\"\22\2\u009c\u009d\5\36\20\2\u009d"+
		"\u00a1\3\2\2\2\u009e\u00a1\7\7\2\2\u009f\u00a1\7\b\2\2\u00a0\u0097\3\2"+
		"\2\2\u00a0\u0098\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3#\3\2\2\2\u00a4"+
		"\u00a5\t\4\2\2\u00a5%\3\2\2\2\u00a6\u00aa\7\36\2\2\u00a7\u00a8\5\n\6\2"+
		"\u00a8\u00a9\7&\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7\37\2\2\u00af\'\3\2\2\2\r+.<GPi~\u008d\u0095\u00a0\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}