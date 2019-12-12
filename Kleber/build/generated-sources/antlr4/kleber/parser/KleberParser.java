// Generated from /home/thiago/Área de Trabalho/Compiladores/Kleber/grammar/kleber/parser/Kleber.g4 by ANTLR 4.6

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
		T__0=1, RETURN=2, PRINTF=3, SCANF=4, FUNCTIONS=5, INT=6, FLOAT=7, STRING=8, 
		CHAR=9, TRUE=10, FALSE=11, READ=12, WRITE=13, IF=14, ELSE=15, FOR=16, 
		MAIN=17, INCLUDE=18, GLOBAL=19, STR=20, NUM=21, VAR=22, CHARACTERE=23, 
		GR=24, LS=25, EQ=26, GRT=27, LST=28, NEQ=29, ATR=30, ASP=31, PEG=32, MEG=33, 
		OEX=34, CEX=35, OBL=36, CBL=37, NOT=38, ADD=39, SUB=40, MUL=41, DIV=42, 
		SEP=43, MOD=44, EOL=45, WS=46;
	public static final int
		RULE_progr = 0, RULE_bibcall = 1, RULE_global = 2, RULE_functions = 3, 
		RULE_function = 4, RULE_main = 5, RULE_line = 6, RULE_printf = 7, RULE_printparam = 8, 
		RULE_scanf = 9, RULE_variable = 10, RULE_type = 11, RULE_atr = 12, RULE_ifstm = 13, 
		RULE_forstm = 14, RULE_expr = 15, RULE_term = 16, RULE_fact = 17, RULE_boolExpr = 18, 
		RULE_relop = 19, RULE_increment = 20, RULE_block = 21, RULE_ret = 22, 
		RULE_functionBlock = 23;
	public static final String[] ruleNames = {
		"progr", "bibcall", "global", "functions", "function", "main", "line", 
		"printf", "printparam", "scanf", "variable", "type", "atr", "ifstm", "forstm", 
		"expr", "term", "fact", "boolExpr", "relop", "increment", "block", "ret", 
		"functionBlock"
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				bibcall();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(53);
				global();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS) {
				{
				setState(56);
				functions();
				}
			}

			setState(59);
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
			setState(61);
			match(INCLUDE);
			setState(62);
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
			setState(64);
			match(GLOBAL);
			setState(65);
			match(OBL);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				variable();
				setState(67);
				match(EOL);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR))) != 0) );
			setState(73);
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
			setState(75);
			match(FUNCTIONS);
			setState(76);
			match(OBL);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				function();
				setState(78);
				match(EOL);
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR))) != 0) );
			setState(84);
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
			setState(86);
			type();
			setState(87);
			match(VAR);
			setState(88);
			match(OEX);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						variable();
						setState(90);
						match(SEP);
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(97);
				variable();
				}
			}

			setState(100);
			match(CEX);
			setState(101);
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
			setState(103);
			match(MAIN);
			setState(104);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public IfstmContext ifstm() {
			return getRuleContext(IfstmContext.class,0);
		}
		public ForstmContext forstm() {
			return getRuleContext(ForstmContext.class,0);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				printf();
				}
				break;
			case SCANF:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				scanf();
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				variable();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				atr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				ifstm();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				forstm();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
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
		public PrintparamContext printparam() {
			return getRuleContext(PrintparamContext.class,0);
		}
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PRINTF);
			setState(116);
			match(OEX);
			setState(117);
			printparam();
			setState(118);
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

	public static class PrintparamContext extends ParserRuleContext {
		public PrintparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printparam; }
	 
		public PrintparamContext() { }
		public void copyFrom(PrintparamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintVARContext extends PrintparamContext {
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public PrintVARContext(PrintparamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterPrintVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitPrintVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitPrintVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrinExprContext extends PrintparamContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrinExprContext(PrintparamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterPrinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitPrinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitPrinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintSTRContext extends PrintparamContext {
		public TerminalNode STR() { return getToken(KleberParser.STR, 0); }
		public PrintSTRContext(PrintparamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterPrintSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitPrintSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitPrintSTR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintparamContext printparam() throws RecognitionException {
		PrintparamContext _localctx = new PrintparamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printparam);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintSTRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(STR);
				}
				break;
			case 2:
				_localctx = new PrintVARContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(VAR);
				}
				break;
			case 3:
				_localctx = new PrinExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
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

	public static class ScanfContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(KleberParser.SCANF, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
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
		enterRule(_localctx, 18, RULE_scanf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(SCANF);
			setState(126);
			match(OEX);
			setState(127);
			match(VAR);
			setState(128);
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
		enterRule(_localctx, 20, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			type();
			setState(131);
			match(VAR);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					match(SEP);
					setState(133);
					match(VAR);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KleberParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KleberParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(KleberParser.CHAR, 0); }
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
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR))) != 0)) ) {
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
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	 
		public AtrContext() { }
		public void copyFrom(AtrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtrCharContext extends AtrContext {
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public TerminalNode ATR() { return getToken(KleberParser.ATR, 0); }
		public TerminalNode CHARACTERE() { return getToken(KleberParser.CHARACTERE, 0); }
		public AtrCharContext(AtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterAtrChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitAtrChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitAtrChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtrExprContext extends AtrContext {
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public TerminalNode ATR() { return getToken(KleberParser.ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrExprContext(AtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterAtrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitAtrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitAtrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtrStringContext extends AtrContext {
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public TerminalNode ATR() { return getToken(KleberParser.ATR, 0); }
		public TerminalNode STR() { return getToken(KleberParser.STR, 0); }
		public AtrStringContext(AtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterAtrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitAtrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitAtrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atr);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AtrExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(VAR);
				setState(142);
				match(ATR);
				setState(143);
				expr();
				}
				break;
			case 2:
				_localctx = new AtrStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(VAR);
				setState(145);
				match(ATR);
				setState(146);
				match(STR);
				}
				break;
			case 3:
				_localctx = new AtrCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(VAR);
				setState(148);
				match(ATR);
				setState(149);
				match(CHARACTERE);
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

	public static class IfstmContext extends ParserRuleContext {
		public IfstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstm; }
	 
		public IfstmContext() { }
		public void copyFrom(IfstmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfelsetContext extends IfstmContext {
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
		public IfelsetContext(IfstmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterIfelset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitIfelset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitIfelset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IftContext extends IfstmContext {
		public TerminalNode IF() { return getToken(KleberParser.IF, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IftContext(IfstmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterIft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitIft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitIft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmContext ifstm() throws RecognitionException {
		IfstmContext _localctx = new IfstmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstm);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(IF);
				setState(153);
				match(OEX);
				setState(154);
				boolExpr();
				setState(155);
				match(CEX);
				setState(156);
				block();
				}
				break;
			case 2:
				_localctx = new IfelsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(IF);
				setState(159);
				match(OEX);
				setState(160);
				boolExpr();
				setState(161);
				match(CEX);
				setState(162);
				block();
				setState(163);
				match(ELSE);
				setState(164);
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
		public ForstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstm; }
	 
		public ForstmContext() { }
		public void copyFrom(ForstmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends ForstmContext {
		public TerminalNode FOR() { return getToken(KleberParser.FOR, 0); }
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
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
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public TerminalNode NUM() { return getToken(KleberParser.NUM, 0); }
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(ForstmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmContext forstm() throws RecognitionException {
		ForstmContext _localctx = new ForstmContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forstm);
		try {
			_localctx = new ForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(FOR);
			setState(169);
			match(OEX);
			setState(170);
			atr();
			setState(171);
			match(EOL);
			setState(172);
			boolExpr();
			setState(173);
			match(EOL);
			setState(174);
			match(VAR);
			setState(175);
			increment();
			setState(176);
			match(NUM);
			setState(177);
			match(CEX);
			setState(178);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSubContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SUB() { return getToken(KleberParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KleberParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				term();
				setState(181);
				match(ADD);
				setState(182);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprSubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				term();
				setState(185);
				match(SUB);
				setState(186);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprDivContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode DIV() { return getToken(KleberParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprModContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MOD() { return getToken(KleberParser.MOD, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprModContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFactContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public ExprFactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprFact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MUL() { return getToken(KleberParser.MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprMultContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ExprMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				fact();
				setState(192);
				match(MUL);
				setState(193);
				term();
				}
				break;
			case 2:
				_localctx = new ExprDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				fact();
				setState(196);
				match(DIV);
				setState(197);
				term();
				}
				break;
			case 3:
				_localctx = new ExprModContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				fact();
				setState(200);
				match(MOD);
				setState(201);
				term();
				}
				break;
			case 4:
				_localctx = new ExprFactContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
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
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactNUMContext extends FactContext {
		public TerminalNode NUM() { return getToken(KleberParser.NUM, 0); }
		public FactNUMContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFactNUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFactNUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFactNUM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactVARContext extends FactContext {
		public TerminalNode VAR() { return getToken(KleberParser.VAR, 0); }
		public FactVARContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFactVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFactVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFactVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactExprContext extends FactContext {
		public TerminalNode OEX() { return getToken(KleberParser.OEX, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CEX() { return getToken(KleberParser.CEX, 0); }
		public FactExprContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterFactExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitFactExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitFactExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fact);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new FactVARContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(VAR);
				}
				break;
			case NUM:
				_localctx = new FactNUMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(NUM);
				}
				break;
			case OEX:
				_localctx = new FactExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(OEX);
				setState(209);
				expr();
				setState(210);
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
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBoolContext extends BoolExprContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExprBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFalseContext extends BoolExprContext {
		public TerminalNode FALSE() { return getToken(KleberParser.FALSE, 0); }
		public ExprFalseContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTrueContext extends BoolExprContext {
		public TerminalNode TRUE() { return getToken(KleberParser.TRUE, 0); }
		public ExprTrueContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterExprTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitExprTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolExpr);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case VAR:
			case OEX:
				_localctx = new ExprBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				fact();
				setState(215);
				relop();
				setState(216);
				fact();
				}
				break;
			case TRUE:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(FALSE);
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
		enterRule(_localctx, 38, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 40, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(OBL);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				line();
				setState(228);
				match(EOL);
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINTF) | (1L << SCANF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << IF) | (1L << FOR) | (1L << VAR))) != 0) );
			setState(234);
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
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
	 
		public RetContext() { }
		public void copyFrom(RetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Return0Context extends RetContext {
		public TerminalNode RETURN() { return getToken(KleberParser.RETURN, 0); }
		public Return0Context(RetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).enterReturn0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KleberListener ) ((KleberListener)listener).exitReturn0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KleberVisitor ) return ((KleberVisitor<? extends T>)visitor).visitReturn0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ret);
		try {
			_localctx = new Return0Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(RETURN);
			setState(237);
			match(T__0);
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
		enterRule(_localctx, 46, RULE_functionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(OBL);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					line();
					setState(241);
					match(EOL);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(248);
				ret();
				}
			}

			setState(251);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0100\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\2\5\29\n\2\3\2\5\2<\n\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\6\4H\n\4\r\4\16\4I\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\6\5S\n\5\r\5\16\5T\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16"+
		"\6b\13\6\3\6\5\6e\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bt\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a9"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cf\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00d7\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00df\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\6\27\u00e9\n"+
		"\27\r\27\16\27\u00ea\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31"+
		"\u00f6\n\31\f\31\16\31\u00f9\13\31\3\31\5\31\u00fc\n\31\3\31\3\31\3\31"+
		"\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\3\2\b\13"+
		"\3\2\32\37\3\2\"#\u0106\2\63\3\2\2\2\4?\3\2\2\2\6B\3\2\2\2\bM\3\2\2\2"+
		"\nX\3\2\2\2\fi\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22}\3\2\2\2\24\177\3\2"+
		"\2\2\26\u0084\3\2\2\2\30\u008d\3\2\2\2\32\u0098\3\2\2\2\34\u00a8\3\2\2"+
		"\2\36\u00aa\3\2\2\2 \u00bf\3\2\2\2\"\u00ce\3\2\2\2$\u00d6\3\2\2\2&\u00de"+
		"\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,\u00e4\3\2\2\2.\u00ee\3\2\2\2\60"+
		"\u00f1\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\668\3\2\2\2\679\5\6\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2"+
		":<\5\b\5\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\f\7\2>\3\3\2\2\2?@\7\24\2"+
		"\2@A\7\26\2\2A\5\3\2\2\2BC\7\25\2\2CG\7&\2\2DE\5\26\f\2EF\7/\2\2FH\3\2"+
		"\2\2GD\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\'\2\2L\7\3"+
		"\2\2\2MN\7\7\2\2NR\7&\2\2OP\5\n\6\2PQ\7/\2\2QS\3\2\2\2RO\3\2\2\2ST\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\'\2\2W\t\3\2\2\2XY\5\30\r\2YZ\7"+
		"\30\2\2Zd\7$\2\2[\\\5\26\f\2\\]\7-\2\2]_\3\2\2\2^[\3\2\2\2_b\3\2\2\2`"+
		"^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2ce\5\26\f\2d`\3\2\2\2de\3\2\2\2"+
		"ef\3\2\2\2fg\7%\2\2gh\5\60\31\2h\13\3\2\2\2ij\7\23\2\2jk\5,\27\2k\r\3"+
		"\2\2\2lt\5\20\t\2mt\5\24\13\2nt\5\26\f\2ot\5\32\16\2pt\5\34\17\2qt\5\36"+
		"\20\2rt\5.\30\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3"+
		"\2\2\2sr\3\2\2\2t\17\3\2\2\2uv\7\5\2\2vw\7$\2\2wx\5\22\n\2xy\7%\2\2y\21"+
		"\3\2\2\2z~\7\26\2\2{~\7\30\2\2|~\5 \21\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2"+
		"~\23\3\2\2\2\177\u0080\7\6\2\2\u0080\u0081\7$\2\2\u0081\u0082\7\30\2\2"+
		"\u0082\u0083\7%\2\2\u0083\25\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u008a"+
		"\7\30\2\2\u0086\u0087\7-\2\2\u0087\u0089\7\30\2\2\u0088\u0086\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\27"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\t\2\2\2\u008e\31\3\2\2\2\u008f"+
		"\u0090\7\30\2\2\u0090\u0091\7 \2\2\u0091\u0099\5 \21\2\u0092\u0093\7\30"+
		"\2\2\u0093\u0094\7 \2\2\u0094\u0099\7\26\2\2\u0095\u0096\7\30\2\2\u0096"+
		"\u0097\7 \2\2\u0097\u0099\7\31\2\2\u0098\u008f\3\2\2\2\u0098\u0092\3\2"+
		"\2\2\u0098\u0095\3\2\2\2\u0099\33\3\2\2\2\u009a\u009b\7\20\2\2\u009b\u009c"+
		"\7$\2\2\u009c\u009d\5&\24\2\u009d\u009e\7%\2\2\u009e\u009f\5,\27\2\u009f"+
		"\u00a9\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\7$\2\2\u00a2\u00a3\5&"+
		"\24\2\u00a3\u00a4\7%\2\2\u00a4\u00a5\5,\27\2\u00a5\u00a6\7\21\2\2\u00a6"+
		"\u00a7\5,\27\2\u00a7\u00a9\3\2\2\2\u00a8\u009a\3\2\2\2\u00a8\u00a0\3\2"+
		"\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad"+
		"\5\32\16\2\u00ad\u00ae\7/\2\2\u00ae\u00af\5&\24\2\u00af\u00b0\7/\2\2\u00b0"+
		"\u00b1\7\30\2\2\u00b1\u00b2\5*\26\2\u00b2\u00b3\7\27\2\2\u00b3\u00b4\7"+
		"%\2\2\u00b4\u00b5\5,\27\2\u00b5\37\3\2\2\2\u00b6\u00b7\5\"\22\2\u00b7"+
		"\u00b8\7)\2\2\u00b8\u00b9\5 \21\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb\5\""+
		"\22\2\u00bb\u00bc\7*\2\2\u00bc\u00bd\5 \21\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00c0\5\"\22\2\u00bf\u00b6\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00be\3"+
		"\2\2\2\u00c0!\3\2\2\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\7+\2\2\u00c3\u00c4"+
		"\5\"\22\2\u00c4\u00cf\3\2\2\2\u00c5\u00c6\5$\23\2\u00c6\u00c7\7,\2\2\u00c7"+
		"\u00c8\5\"\22\2\u00c8\u00cf\3\2\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\7"+
		".\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5$\23\2\u00ce"+
		"\u00c1\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00cf#\3\2\2\2\u00d0\u00d7\7\30\2\2\u00d1\u00d7\7\27\2\2\u00d2\u00d3"+
		"\7$\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\7%\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7%\3\2\2\2"+
		"\u00d8\u00d9\5$\23\2\u00d9\u00da\5(\25\2\u00da\u00db\5$\23\2\u00db\u00df"+
		"\3\2\2\2\u00dc\u00df\7\f\2\2\u00dd\u00df\7\r\2\2\u00de\u00d8\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e1\t\3\2\2"+
		"\u00e1)\3\2\2\2\u00e2\u00e3\t\4\2\2\u00e3+\3\2\2\2\u00e4\u00e8\7&\2\2"+
		"\u00e5\u00e6\5\16\b\2\u00e6\u00e7\7/\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\7\'\2\2\u00ed-\3\2\2\2\u00ee\u00ef\7\4\2\2"+
		"\u00ef\u00f0\7\3\2\2\u00f0/\3\2\2\2\u00f1\u00f7\7&\2\2\u00f2\u00f3\5\16"+
		"\b\2\u00f3\u00f4\7/\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5.\30\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\'\2\2\u00fe\61\3\2\2"+
		"\2\25\658;IT`ds}\u008a\u0098\u00a8\u00bf\u00ce\u00d6\u00de\u00ea\u00f7"+
		"\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}