// Generated from experiment.g4 by ANTLR 4.8
 
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class experimentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, VAR=8, IF=9, ELSE=10, 
		WHILE=11, DO=12, LOG=13, READ=14, OR=15, AND=16, EQ=17, NEQ=18, GT=19, 
		LT=20, GTEQ=21, LTEQ=22, BOOL=23, ENDLINE=24, NEWLINE=25, VARNAME=26, 
		CHAR=27, INT=28, FLOAT=29, STRING=30, WHITESPACE=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_let = 2, RULE_startIFExpr = 3, 
		RULE_ifExpr = 4, RULE_startWhileExpr = 5, RULE_startDoWhileExpr = 6, RULE_startLogExpr = 7, 
		RULE_startReadExpr = 8, RULE_startExpr = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "let", "startIFExpr", "ifExpr", "startWhileExpr", 
			"startDoWhileExpr", "startLogExpr", "startReadExpr", "startExpr", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'var'", "'if'", 
			"'else'", "'while'", "'do'", "'log'", "'read'", "'||'", "'&&'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "VAR", "IF", "ELSE", 
			"WHILE", "DO", "LOG", "READ", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", 
			"LTEQ", "BOOL", "ENDLINE", "NEWLINE", "VARNAME", "CHAR", "INT", "FLOAT", 
			"STRING", "WHITESPACE"
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
	public String getGrammarFileName() { return "experiment.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private ArrayList<String> variableNames = new ArrayList<String>();

	    private boolean variableDefined(String name){
	        return variableNames.contains(name);
	    }

	    private void defineVariable(String name){
	        variableNames.add(name);
	    }

	public experimentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(experimentParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(experimentParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(experimentParser.ENDLINE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(22);
					match(NEWLINE);
					}
				}

				setState(25);
				statement();
				setState(26);
				match(ENDLINE);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << LOG) | (1L << READ) | (1L << NEWLINE))) != 0) );
			setState(32);
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

	public static class StatementContext extends ParserRuleContext {
		public LetContext let;
		public StartIFExprContext startIFExpr() {
			return getRuleContext(StartIFExprContext.class,0);
		}
		public StartWhileExprContext startWhileExpr() {
			return getRuleContext(StartWhileExprContext.class,0);
		}
		public StartDoWhileExprContext startDoWhileExpr() {
			return getRuleContext(StartDoWhileExprContext.class,0);
		}
		public StartLogExprContext startLogExpr() {
			return getRuleContext(StartLogExprContext.class,0);
		}
		public StartReadExprContext startReadExpr() {
			return getRuleContext(StartReadExprContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(34);
				startIFExpr();
				}
				break;
			case WHILE:
				{
				setState(35);
				startWhileExpr();
				}
				break;
			case DO:
				{
				setState(36);
				startDoWhileExpr();
				}
				break;
			case LOG:
				{
				setState(37);
				startLogExpr();
				}
				break;
			case READ:
				{
				setState(38);
				startReadExpr();
				}
				break;
			case VAR:
				{
				setState(39);
				((StatementContext)_localctx).let = let();
				System.out.println(((StatementContext)_localctx).let.type);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LetContext extends ParserRuleContext {
		public String type;
		public Token VARNAME;
		public TerminalNode VAR() { return getToken(experimentParser.VAR, 0); }
		public TerminalNode VARNAME() { return getToken(experimentParser.VARNAME, 0); }
		public TerminalNode BOOL() { return getToken(experimentParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(experimentParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(experimentParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(experimentParser.FLOAT, 0); }
		public StartExprContext startExpr() {
			return getRuleContext(StartExprContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(VAR);
			setState(45);
			((LetContext)_localctx).VARNAME = match(VARNAME);
			if(variableDefined((((LetContext)_localctx).VARNAME!=null?((LetContext)_localctx).VARNAME.getText():null))) throw new IllegalArgumentException("Variavel " + (((LetContext)_localctx).VARNAME!=null?((LetContext)_localctx).VARNAME.getText():null)+ " ja foi declarada!");
			setState(47);
			match(T__0);
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(48);
				match(BOOL);
				((LetContext)_localctx).type =  "bool"; 
				}
				break;
			case 2:
				{
				setState(50);
				match(INT);
				((LetContext)_localctx).type =  "int"; 
				}
				break;
			case 3:
				{
				setState(52);
				match(CHAR);
				((LetContext)_localctx).type =  "char"; 
				}
				break;
			case 4:
				{
				setState(54);
				match(FLOAT);
				((LetContext)_localctx).type =  "float"; 
				}
				break;
			case 5:
				{
				setState(56);
				startExpr();
				}
				break;
			}
			defineVariable((((LetContext)_localctx).VARNAME!=null?((LetContext)_localctx).VARNAME.getText():null));
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

	public static class StartIFExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(experimentParser.IF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<IfExprContext> ifExpr() {
			return getRuleContexts(IfExprContext.class);
		}
		public IfExprContext ifExpr(int i) {
			return getRuleContext(IfExprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(experimentParser.ELSE, 0); }
		public StartIFExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startIFExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterStartIFExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitStartIFExpr(this);
		}
	}

	public final StartIFExprContext startIFExpr() throws RecognitionException {
		StartIFExprContext _localctx = new StartIFExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_startIFExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IF);
			setState(62);
			match(T__1);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				ifExpr();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ) | (1L << BOOL) | (1L << INT) | (1L << FLOAT))) != 0) );
			setState(68);
			match(T__2);
			setState(69);
			match(NEWLINE);
			setState(70);
			statement();
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(71);
				match(NEWLINE);
				setState(72);
				match(ELSE);
				setState(73);
				match(NEWLINE);
				setState(74);
				statement();
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(experimentParser.BOOL, 0); }
		public List<StartExprContext> startExpr() {
			return getRuleContexts(StartExprContext.class);
		}
		public StartExprContext startExpr(int i) {
			return getRuleContext(StartExprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(experimentParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(experimentParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(experimentParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(experimentParser.NEQ, i);
		}
		public List<TerminalNode> GTEQ() { return getTokens(experimentParser.GTEQ); }
		public TerminalNode GTEQ(int i) {
			return getToken(experimentParser.GTEQ, i);
		}
		public List<TerminalNode> LTEQ() { return getTokens(experimentParser.LTEQ); }
		public TerminalNode LTEQ(int i) {
			return getToken(experimentParser.LTEQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(experimentParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(experimentParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(experimentParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(experimentParser.GT, i);
		}
		public List<TerminalNode> INT() { return getTokens(experimentParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(experimentParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(experimentParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(experimentParser.FLOAT, i);
		}
		public List<TerminalNode> AND() { return getTokens(experimentParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(experimentParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(experimentParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(experimentParser.OR, i);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifExpr);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(BOOL);
				}
				break;
			case T__1:
			case EQ:
			case NEQ:
			case GT:
			case LT:
			case GTEQ:
			case LTEQ:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				startExpr();
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR || _la==AND) {
					{
					{
					setState(81);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(82);
					startExpr();
					setState(83);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(84);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class StartWhileExprContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(experimentParser.WHILE, 0); }
		public TerminalNode NEWLINE() { return getToken(experimentParser.NEWLINE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<IfExprContext> ifExpr() {
			return getRuleContexts(IfExprContext.class);
		}
		public IfExprContext ifExpr(int i) {
			return getRuleContext(IfExprContext.class,i);
		}
		public StartWhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startWhileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterStartWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitStartWhileExpr(this);
		}
	}

	public final StartWhileExprContext startWhileExpr() throws RecognitionException {
		StartWhileExprContext _localctx = new StartWhileExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_startWhileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(WHILE);
			setState(94);
			match(T__1);
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				ifExpr();
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ) | (1L << BOOL) | (1L << INT) | (1L << FLOAT))) != 0) );
			setState(100);
			match(T__2);
			setState(101);
			match(NEWLINE);
			setState(102);
			statement();
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

	public static class StartDoWhileExprContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(experimentParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(experimentParser.WHILE, 0); }
		public List<IfExprContext> ifExpr() {
			return getRuleContexts(IfExprContext.class);
		}
		public IfExprContext ifExpr(int i) {
			return getRuleContext(IfExprContext.class,i);
		}
		public StartDoWhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDoWhileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterStartDoWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitStartDoWhileExpr(this);
		}
	}

	public final StartDoWhileExprContext startDoWhileExpr() throws RecognitionException {
		StartDoWhileExprContext _localctx = new StartDoWhileExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startDoWhileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(DO);
			setState(105);
			statement();
			setState(106);
			match(WHILE);
			setState(107);
			match(T__1);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				ifExpr();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ) | (1L << BOOL) | (1L << INT) | (1L << FLOAT))) != 0) );
			setState(113);
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

	public static class StartLogExprContext extends ParserRuleContext {
		public Token STRING;
		public TerminalNode LOG() { return getToken(experimentParser.LOG, 0); }
		public TerminalNode STRING() { return getToken(experimentParser.STRING, 0); }
		public TerminalNode VARNAME() { return getToken(experimentParser.VARNAME, 0); }
		public StartLogExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startLogExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterStartLogExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitStartLogExpr(this);
		}
	}

	public final StartLogExprContext startLogExpr() throws RecognitionException {
		StartLogExprContext _localctx = new StartLogExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_startLogExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LOG);
			setState(116);
			match(T__1);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(117);
				((StartLogExprContext)_localctx).STRING = match(STRING);
				 System.out.println((((StartLogExprContext)_localctx).STRING!=null?((StartLogExprContext)_localctx).STRING.getText():null)); 
				}
				break;
			case VARNAME:
				{
				setState(119);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
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

	public static class StartReadExprContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(experimentParser.READ, 0); }
		public TerminalNode VARNAME() { return getToken(experimentParser.VARNAME, 0); }
		public StartReadExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startReadExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterStartReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitStartReadExpr(this);
		}
	}

	public final StartReadExprContext startReadExpr() throws RecognitionException {
		StartReadExprContext _localctx = new StartReadExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_startReadExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(READ);
			setState(125);
			match(T__1);
			setState(126);
			match(VARNAME);
			setState(127);
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

	public static class StartExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StartExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterStartExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitStartExpr(this);
		}
	}

	public final StartExprContext startExpr() throws RecognitionException {
		StartExprContext _localctx = new StartExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_startExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(129);
				expr(0);
				}
				}
				setState(134);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(experimentParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(experimentParser.FLOAT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(136);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(137);
				match(FLOAT);
				}
				break;
			case T__1:
				{
				setState(138);
				match(T__1);
				setState(139);
				expr(0);
				setState(140);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u009e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\5\2\32\n\2\3\2\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\5\3\5\3\5\6\5C\n\5\r\5\16\5"+
		"D\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6Y\n\6\f\6\16\6\\\13\6\5\6^\n\6\3\7\3\7\3\7\6\7c\n\7\r\7\16\7d"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\bp\n\b\r\b\16\bq\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t{\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\7\13\u0085\n"+
		"\13\f\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0091\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\f\2\3\26\r"+
		"\2\4\6\b\n\f\16\20\22\24\26\2\7\3\2\23\30\3\2\36\37\3\2\21\22\3\2\6\7"+
		"\3\2\b\t\2\u00a9\2\36\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b?\3\2\2\2\n]\3\2"+
		"\2\2\f_\3\2\2\2\16j\3\2\2\2\20u\3\2\2\2\22~\3\2\2\2\24\u0086\3\2\2\2\26"+
		"\u0090\3\2\2\2\30\32\7\33\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2"+
		"\2\33\34\5\4\3\2\34\35\7\32\2\2\35\37\3\2\2\2\36\31\3\2\2\2\37 \3\2\2"+
		"\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$-\5\b\5\2%-"+
		"\5\f\7\2&-\5\16\b\2\'-\5\20\t\2(-\5\22\n\2)*\5\6\4\2*+\b\3\1\2+-\3\2\2"+
		"\2,$\3\2\2\2,%\3\2\2\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2-\5\3\2"+
		"\2\2./\7\n\2\2/\60\7\34\2\2\60\61\b\4\1\2\61;\7\3\2\2\62\63\7\31\2\2\63"+
		"<\b\4\1\2\64\65\7\36\2\2\65<\b\4\1\2\66\67\7\35\2\2\67<\b\4\1\289\7\37"+
		"\2\29<\b\4\1\2:<\5\24\13\2;\62\3\2\2\2;\64\3\2\2\2;\66\3\2\2\2;8\3\2\2"+
		"\2;:\3\2\2\2<=\3\2\2\2=>\b\4\1\2>\7\3\2\2\2?@\7\13\2\2@B\7\4\2\2AC\5\n"+
		"\6\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\5\2\2GH\7\33"+
		"\2\2HM\5\4\3\2IJ\7\33\2\2JK\7\f\2\2KL\7\33\2\2LN\5\4\3\2MI\3\2\2\2MN\3"+
		"\2\2\2N\t\3\2\2\2O^\7\31\2\2PQ\5\24\13\2QR\t\2\2\2RZ\t\3\2\2ST\t\4\2\2"+
		"TU\5\24\13\2UV\t\2\2\2VW\t\3\2\2WY\3\2\2\2XS\3\2\2\2Y\\\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]O\3\2\2\2]P\3\2\2\2^\13\3\2\2\2_`"+
		"\7\r\2\2`b\7\4\2\2ac\5\n\6\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e"+
		"f\3\2\2\2fg\7\5\2\2gh\7\33\2\2hi\5\4\3\2i\r\3\2\2\2jk\7\16\2\2kl\5\4\3"+
		"\2lm\7\r\2\2mo\7\4\2\2np\5\n\6\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2rs\3\2\2\2st\7\5\2\2t\17\3\2\2\2uv\7\17\2\2vz\7\4\2\2wx\7 \2\2x{\b\t"+
		"\1\2y{\7\34\2\2zw\3\2\2\2zy\3\2\2\2{|\3\2\2\2|}\7\5\2\2}\21\3\2\2\2~\177"+
		"\7\20\2\2\177\u0080\7\4\2\2\u0080\u0081\7\34\2\2\u0081\u0082\7\5\2\2\u0082"+
		"\23\3\2\2\2\u0083\u0085\5\26\f\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\b\f\1\2\u008a\u0091\7\36\2\2\u008b\u0091\7\37\2\2"+
		"\u008c\u008d\7\4\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7\5\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091"+
		"\u009a\3\2\2\2\u0092\u0093\f\7\2\2\u0093\u0094\t\5\2\2\u0094\u0099\5\26"+
		"\f\b\u0095\u0096\f\6\2\2\u0096\u0097\t\6\2\2\u0097\u0099\5\26\f\7\u0098"+
		"\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\27\3\2\2\2\u009c\u009a\3\2\2\2\21\31 ,"+
		";DMZ]dqz\u0086\u0090\u0098\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}