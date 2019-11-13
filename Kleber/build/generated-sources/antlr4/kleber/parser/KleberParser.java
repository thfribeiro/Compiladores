// Generated from C:\Users\Thiago\Documents\NetBeansProjects\Kleber\grammar\kleber\parser\Kleber.g4 by ANTLR 4.6

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
		RETURN=1, FUNCTIONS=2, INT=3, FLOAT=4, BOOLEAN=5, STRING=6, TRUE=7, FALSE=8, 
		READ=9, WRITE=10, IF=11, ELSE=12, MAIN=13, INCLUDE=14, GLOBAL=15, STR=16, 
		NUM=17, VAR=18, GR=19, LS=20, EQ=21, GRT=22, LST=23, NEQ=24, ATR=25, PEG=26, 
		MEG=27, OEX=28, CEX=29, OBL=30, CBL=31, NOT=32, ADD=33, SUB=34, MUL=35, 
		DIV=36, SEP=37, MOD=38, EOL=39, COMMENT=40, LINE_COMMENT=41, WS=42, FOR=43;
	public static final int
		RULE_progr = 0, RULE_bibcall = 1, RULE_global = 2, RULE_functions = 3, 
		RULE_function = 4, RULE_main = 5, RULE_line = 6, RULE_read = 7, RULE_write = 8, 
		RULE_variable = 9, RULE_type = 10, RULE_atr = 11, RULE_ifstm = 12, RULE_forstm = 13, 
		RULE_expr = 14, RULE_term = 15, RULE_fact = 16, RULE_boolExpr = 17, RULE_relop = 18, 
		RULE_increment = 19, RULE_block = 20, RULE_functionBlock = 21;
	public static final String[] ruleNames = {
		"progr", "bibcall", "global", "functions", "function", "main", "line", 
		"read", "write", "variable", "type", "atr", "ifstm", "forstm", "expr", 
		"term", "fact", "boolExpr", "relop", "increment", "block", "functionBlock"
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
		"MOD", "EOL", "COMMENT", "LINE_COMMENT", "WS", "FOR"
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
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				bibcall();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(49);
				global();
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS) {
				{
				setState(52);
				functions();
				}
			}

			setState(55);
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
			setState(57);
			match(INCLUDE);
			setState(58);
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
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(GLOBAL);
			setState(61);
			match(OBL);
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				variable();
				setState(63);
				match(EOL);
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			setState(69);
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
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(FUNCTIONS);
			setState(72);
			match(OBL);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				function();
				setState(74);
				match(EOL);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0) );
			setState(80);
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			type();
			setState(83);
			match(VAR);
			setState(84);
			match(OEX);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						variable();
						setState(86);
						match(SEP);
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(93);
				variable();
				}
			}

			setState(96);
			match(CEX);
			setState(97);
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
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(MAIN);
			setState(100);
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
		enterRule(_localctx, 12, RULE_line);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				read();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				write();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				atr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
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
		enterRule(_localctx, 14, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(READ);
			setState(109);
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
		enterRule(_localctx, 16, RULE_write);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(WRITE);
				setState(112);
				match(STR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(WRITE);
				setState(114);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			int _alt;
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				type();
				setState(118);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				type();
				setState(121);
				match(VAR);
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						match(SEP);
						setState(123);
						match(VAR);
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 22, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(VAR);
			setState(134);
			match(ATR);
			setState(135);
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
		enterRule(_localctx, 24, RULE_ifstm);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(IF);
				setState(138);
				match(OEX);
				setState(139);
				boolExpr();
				setState(140);
				match(CEX);
				setState(141);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IF);
				setState(144);
				match(OEX);
				setState(145);
				boolExpr();
				setState(146);
				match(CEX);
				setState(147);
				block();
				setState(148);
				match(ELSE);
				setState(149);
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
		enterRule(_localctx, 26, RULE_forstm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FOR);
			setState(154);
			match(CEX);
			setState(155);
			atr();
			setState(156);
			match(EOL);
			setState(157);
			boolExpr();
			setState(158);
			match(EOL);
			setState(159);
			increment();
			setState(160);
			match(CEX);
			setState(161);
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
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				term();
				setState(164);
				match(ADD);
				setState(165);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				term();
				setState(168);
				match(SUB);
				setState(169);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				fact();
				setState(175);
				match(MUL);
				setState(176);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				fact();
				setState(179);
				match(DIV);
				setState(180);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				fact();
				setState(183);
				match(MOD);
				setState(184);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
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
		enterRule(_localctx, 32, RULE_fact);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(NUM);
				}
				break;
			case OEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(OEX);
				setState(192);
				expr();
				setState(193);
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
		enterRule(_localctx, 34, RULE_boolExpr);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(NOT);
				setState(199);
				boolExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				fact();
				setState(201);
				relop();
				setState(202);
				fact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
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
		enterRule(_localctx, 36, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 38, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(OBL);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				line();
				setState(214);
				match(EOL);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << VAR))) != 0) );
			setState(220);
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public TerminalNode OBL() { return getToken(KleberParser.OBL, 0); }
		public TerminalNode RETURN() { return getToken(KleberParser.RETURN, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(KleberParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(KleberParser.EOL, i);
		}
		public TerminalNode CBL() { return getToken(KleberParser.CBL, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(OBL);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				line();
				setState(224);
				match(EOL);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << VAR))) != 0) );
			setState(230);
			match(RETURN);
			setState(231);
			fact();
			setState(232);
			match(EOL);
			setState(233);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\2\5\2\65\n\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\6\4D\n\4\r\4\16\4E\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5O\n\5\r\5\16"+
		"\5P\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\5\6a\n"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\177\n\13\f"+
		"\13\16\13\u0082\13\13\5\13\u0084\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009a"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00af\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00be\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00c6\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00d1\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\6\26\u00db"+
		"\n\26\r\26\16\26\u00dc\3\26\3\26\3\27\3\27\3\27\3\27\6\27\u00e5\n\27\r"+
		"\27\16\27\u00e6\3\27\3\27\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\5\b\3\2\25\32\3\2\34\35\u00f2\2"+
		"/\3\2\2\2\4;\3\2\2\2\6>\3\2\2\2\bI\3\2\2\2\nT\3\2\2\2\fe\3\2\2\2\16l\3"+
		"\2\2\2\20n\3\2\2\2\22u\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u0087"+
		"\3\2\2\2\32\u0099\3\2\2\2\34\u009b\3\2\2\2\36\u00ae\3\2\2\2 \u00bd\3\2"+
		"\2\2\"\u00c5\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00d4\3\2\2\2*\u00d6"+
		"\3\2\2\2,\u00e0\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\64\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\64\65\3\2\2"+
		"\2\65\67\3\2\2\2\668\5\b\5\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\f"+
		"\7\2:\3\3\2\2\2;<\7\20\2\2<=\7\22\2\2=\5\3\2\2\2>?\7\21\2\2?C\7 \2\2@"+
		"A\5\24\13\2AB\7)\2\2BD\3\2\2\2C@\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2"+
		"FG\3\2\2\2GH\7!\2\2H\7\3\2\2\2IJ\7\4\2\2JN\7 \2\2KL\5\n\6\2LM\7)\2\2M"+
		"O\3\2\2\2NK\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7!\2\2S"+
		"\t\3\2\2\2TU\5\26\f\2UV\7\24\2\2V`\7\36\2\2WX\5\24\13\2XY\7\'\2\2Y[\3"+
		"\2\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2"+
		"_a\5\24\13\2`\\\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\37\2\2cd\5,\27\2d\13\3"+
		"\2\2\2ef\7\17\2\2fg\5*\26\2g\r\3\2\2\2hm\5\20\t\2im\5\22\n\2jm\5\30\r"+
		"\2km\5\32\16\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\17\3\2\2\2no\7"+
		"\13\2\2op\7\24\2\2p\21\3\2\2\2qr\7\f\2\2rv\7\22\2\2st\7\f\2\2tv\5\36\20"+
		"\2uq\3\2\2\2us\3\2\2\2v\23\3\2\2\2wx\5\26\f\2xy\7\24\2\2y\u0084\3\2\2"+
		"\2z{\5\26\f\2{\u0080\7\24\2\2|}\7\'\2\2}\177\7\24\2\2~|\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083w\3\2\2\2\u0083z\3\2\2\2\u0084\25\3\2\2\2\u0085\u0086"+
		"\t\2\2\2\u0086\27\3\2\2\2\u0087\u0088\7\24\2\2\u0088\u0089\7\33\2\2\u0089"+
		"\u008a\5\36\20\2\u008a\31\3\2\2\2\u008b\u008c\7\r\2\2\u008c\u008d\7\36"+
		"\2\2\u008d\u008e\5$\23\2\u008e\u008f\7\37\2\2\u008f\u0090\5*\26\2\u0090"+
		"\u009a\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\7\36\2\2\u0093\u0094\5"+
		"$\23\2\u0094\u0095\7\37\2\2\u0095\u0096\5*\26\2\u0096\u0097\7\16\2\2\u0097"+
		"\u0098\5*\26\2\u0098\u009a\3\2\2\2\u0099\u008b\3\2\2\2\u0099\u0091\3\2"+
		"\2\2\u009a\33\3\2\2\2\u009b\u009c\7-\2\2\u009c\u009d\7\37\2\2\u009d\u009e"+
		"\5\30\r\2\u009e\u009f\7)\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7)\2\2\u00a1"+
		"\u00a2\5(\25\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\5*\26\2\u00a4\35\3\2\2"+
		"\2\u00a5\u00a6\5 \21\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\5\36\20\2\u00a8"+
		"\u00af\3\2\2\2\u00a9\u00aa\5 \21\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\5\36"+
		"\20\2\u00ac\u00af\3\2\2\2\u00ad\u00af\5 \21\2\u00ae\u00a5\3\2\2\2\u00ae"+
		"\u00a9\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\37\3\2\2\2\u00b0\u00b1\5\"\22"+
		"\2\u00b1\u00b2\7%\2\2\u00b2\u00b3\5 \21\2\u00b3\u00be\3\2\2\2\u00b4\u00b5"+
		"\5\"\22\2\u00b5\u00b6\7&\2\2\u00b6\u00b7\5 \21\2\u00b7\u00be\3\2\2\2\u00b8"+
		"\u00b9\5\"\22\2\u00b9\u00ba\7(\2\2\u00ba\u00bb\5 \21\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00be\5\"\22\2\u00bd\u00b0\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd"+
		"\u00b8\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be!\3\2\2\2\u00bf\u00c6\7\24\2\2"+
		"\u00c0\u00c6\7\23\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00c3\5\36\20\2\u00c3"+
		"\u00c4\7\37\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3"+
		"\2\2\2\u00c5\u00c1\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00d1\5\"\22\2\u00c8\u00c9"+
		"\7\"\2\2\u00c9\u00d1\5$\23\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\5&\24\2"+
		"\u00cc\u00cd\5\"\22\2\u00cd\u00d1\3\2\2\2\u00ce\u00d1\7\t\2\2\u00cf\u00d1"+
		"\7\n\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d3\t\3\2\2"+
		"\u00d3\'\3\2\2\2\u00d4\u00d5\t\4\2\2\u00d5)\3\2\2\2\u00d6\u00da\7 \2\2"+
		"\u00d7\u00d8\5\16\b\2\u00d8\u00d9\7)\2\2\u00d9\u00db\3\2\2\2\u00da\u00d7"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7!\2\2\u00df+\3\2\2\2\u00e0\u00e4\7 \2\2\u00e1"+
		"\u00e2\5\16\b\2\u00e2\u00e3\7)\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e1\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5\"\22\2\u00ea\u00eb\7"+
		")\2\2\u00eb\u00ec\7!\2\2\u00ec-\3\2\2\2\24\61\64\67EP\\`lu\u0080\u0083"+
		"\u0099\u00ae\u00bd\u00c5\u00d0\u00dc\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}