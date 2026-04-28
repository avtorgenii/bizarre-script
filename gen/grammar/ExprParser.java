// Generated from C:/Users/ashes/dev/bizarre-script/src/grammar/ExprParser.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_TYPE=1, FLOAT_TYPE=2, BOOL_TYPE=3, STRING_TYPE=4, LIST_TYPE=5, PROG_START=6, 
		PROG_END=7, IF_kw=8, ELSE_kw=9, PRINT_kw=10, READ_kw=11, FUNC_DEF=12, 
		RETURN_kw=13, FOR_kw=14, AND=15, OR=16, NOT=17, EQUAL=18, NOTEQUAL=19, 
		GT=20, LT=21, GE=22, LE=23, MUL=24, DIV=25, ADD=26, SUB=27, INCR=28, DECR=29, 
		ASSIGN=30, COMMA=31, SEMI=32, LPAREN=33, RPAREN=34, LCURLY=35, RCURLY=36, 
		LBRACK=37, RBRACK=38, FLOAT=39, INT=40, STRING=41, BOOL=42, ID=43, WS=44, 
		Other=45, COMMENT=46, LINE_COMMENT=47;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_stat = 2, RULE_block = 3, RULE_def = 4, 
		RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "stat", "block", "def", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'bool'", "'string'", "'list'", "'DOMAIN_EXPANSION'", 
			"'OMAE_WA_MOU_SHINDEIRU'", "'NANI?'", "'YARE_YARE_DAZE'", "'DATTEBAYO'", 
			"'ZAWARUDO'", "'KO_RE_WA_REQUIEM'", "'ARRIVEDERCI'", "'ORAORAORA'", "'SO?'", 
			"'ISEKAI'", "'DAGA_KOTOWARU'", "'EQUIVALENT_EXCHANGE'", "'KONO_DIO_DA'", 
			"'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'", "'PLUS_ULTRA'", 
			"'MUDA'", "'DESU'", "','", "';'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", "STRING_TYPE", "LIST_TYPE", 
			"PROG_START", "PROG_END", "IF_kw", "ELSE_kw", "PRINT_kw", "READ_kw", 
			"FUNC_DEF", "RETURN_kw", "FOR_kw", "AND", "OR", "NOT", "EQUAL", "NOTEQUAL", 
			"GT", "LT", "GE", "LE", "MUL", "DIV", "ADD", "SUB", "INCR", "DECR", "ASSIGN", 
			"COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LBRACK", "RBRACK", 
			"FLOAT", "INT", "STRING", "BOOL", "ID", "WS", "Other", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "ExprParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROG_START() { return getToken(ExprParser.PROG_START, 0); }
		public TerminalNode PROG_END() { return getToken(ExprParser.PROG_END, 0); }
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(12);
			match(PROG_START);
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869216062L) != 0)) {
				{
				setState(15);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case FLOAT_TYPE:
				case BOOL_TYPE:
				case STRING_TYPE:
				case LIST_TYPE:
				case IF_kw:
				case PRINT_kw:
				case READ_kw:
				case RETURN_kw:
				case FOR_kw:
				case LBRACK:
				case FLOAT:
				case INT:
				case STRING:
				case BOOL:
				case ID:
					{
					setState(13);
					stat();
					}
					break;
				case FUNC_DEF:
					{
					setState(14);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(PROG_END);
			setState(21);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(ExprParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ExprParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(ExprParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ExprParser.STRING_TYPE, 0); }
		public TerminalNode LIST_TYPE() { return getToken(ExprParser.LIST_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends StatContext {
		public TerminalNode RETURN_kw() { return getToken(ExprParser.RETURN_kw, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatContext extends StatContext {
		public StatContext init;
		public ExprContext cond;
		public ExprContext step;
		public BlockContext body;
		public StatContext stepStat;
		public ExprContext stepExpr;
		public TerminalNode FOR_kw() { return getToken(ExprParser.FOR_kw, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitForStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public StatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatContext extends StatContext {
		public TerminalNode PRINT_kw() { return getToken(ExprParser.PRINT_kw, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public PrintStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterPrintStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitPrintStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends StatContext {
		public ExprContext cond;
		public BlockContext then;
		public BlockContext elseBlock;
		public TerminalNode IF_kw() { return getToken(ExprParser.IF_kw, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE_kw() { return getToken(ExprParser.ELSE_kw, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public DeclareContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				type();
				setState(26);
				match(ID);
				setState(27);
				match(ASSIGN);
				setState(28);
				expr(0);
				setState(29);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				expr(0);
				setState(32);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(PRINT_kw);
				setState(35);
				expr(0);
				setState(36);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(IF_kw);
				setState(39);
				match(LPAREN);
				setState(40);
				((IfStatContext)_localctx).cond = expr(0);
				setState(41);
				match(RPAREN);
				setState(42);
				((IfStatContext)_localctx).then = block();
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(43);
					match(ELSE_kw);
					setState(44);
					((IfStatContext)_localctx).elseBlock = block();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(RETURN_kw);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869186048L) != 0)) {
					{
					setState(48);
					expr(0);
					}
				}

				setState(51);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(FOR_kw);
				setState(53);
				match(LPAREN);
				setState(54);
				((ForStatContext)_localctx).init = stat();
				setState(55);
				((ForStatContext)_localctx).cond = expr(0);
				setState(56);
				match(SEMI);
				setState(57);
				((ForStatContext)_localctx).step = expr(0);
				setState(58);
				match(RPAREN);
				setState(59);
				((ForStatContext)_localctx).body = block();
				}
				break;
			case 7:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				match(FOR_kw);
				setState(62);
				match(LPAREN);
				setState(63);
				((ForStatContext)_localctx).init = stat();
				setState(64);
				((ForStatContext)_localctx).cond = expr(0);
				setState(65);
				match(SEMI);
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(66);
					((ForStatContext)_localctx).stepStat = stat();
					}
					break;
				case 2:
					{
					setState(67);
					((ForStatContext)_localctx).stepExpr = expr(0);
					}
					break;
				}
				setState(70);
				match(RPAREN);
				setState(71);
				((ForStatContext)_localctx).body = block();
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockRealContext extends BlockContext {
		public TerminalNode LCURLY() { return getToken(ExprParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ExprParser.RCURLY, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockRealContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterBlockReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitBlockReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitBlockReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockSingleContext extends BlockContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockSingleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterBlockSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitBlockSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitBlockSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOL_TYPE:
			case STRING_TYPE:
			case LIST_TYPE:
			case IF_kw:
			case PRINT_kw:
			case READ_kw:
			case RETURN_kw:
			case FOR_kw:
			case LBRACK:
			case FLOAT:
			case INT:
			case STRING:
			case BOOL:
			case ID:
				_localctx = new BlockSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				stat();
				}
				break;
			case LCURLY:
				_localctx = new BlockRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(LCURLY);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869211966L) != 0)) {
					{
					{
					setState(77);
					stat();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(RCURLY);
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
	public static class DefContext extends ParserRuleContext {
		public Token name;
		public Token ID;
		public List<Token> par = new ArrayList<Token>();
		public StatContext stat;
		public List<StatContext> body = new ArrayList<StatContext>();
		public TerminalNode FUNC_DEF() { return getToken(ExprParser.FUNC_DEF, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ExprParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ExprParser.RCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FUNC_DEF);
			setState(87);
			((DefContext)_localctx).name = match(ID);
			setState(88);
			match(LPAREN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(89);
				((DefContext)_localctx).ID = match(ID);
				((DefContext)_localctx).par.add(((DefContext)_localctx).ID);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					((DefContext)_localctx).ID = match(ID);
					((DefContext)_localctx).par.add(((DefContext)_localctx).ID);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			match(RPAREN);
			setState(100);
			match(LCURLY);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869211966L) != 0)) {
				{
				{
				setState(101);
				((DefContext)_localctx).stat = stat();
				((DefContext)_localctx).body.add(((DefContext)_localctx).stat);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(RCURLY);
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
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLitContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public FloatLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterFloatLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitFloatLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitFloatLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public FunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode INCR() { return getToken(ExprParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(ExprParser.DECR, 0); }
		public IncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(ExprParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ExprParser.RBRACK, 0); }
		public ListAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterListAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitListAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitListAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadCallContext extends ExprContext {
		public TerminalNode READ_kw() { return getToken(ExprParser.READ_kw, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterReadCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitReadCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitReadCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLitContext extends ExprContext {
		public TerminalNode LBRACK() { return getToken(ExprParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ExprParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public ListLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterListLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitListLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitListLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpContext extends ExprContext {
		public ExprContext l;
		public Token op;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public TerminalNode EQUAL() { return getToken(ExprParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ExprParser.NOTEQUAL, 0); }
		public TerminalNode GT() { return getToken(ExprParser.GT, 0); }
		public TerminalNode LT() { return getToken(ExprParser.LT, 0); }
		public TerminalNode GE() { return getToken(ExprParser.GE, 0); }
		public TerminalNode LE() { return getToken(ExprParser.LE, 0); }
		public BinOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLitContext extends ExprContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public IntLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitIntLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(ExprParser.BOOL, 0); }
		public BoolLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterBoolLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitBoolLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLitContext extends ExprContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public StringLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprParserListener ) ((ExprParserListener)listener).exitStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprParserVisitor ) return ((ExprParserVisitor<? extends T>)visitor).visitStringLit(this);
			else return visitor.visitChildren(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				match(ID);
				setState(111);
				match(LPAREN);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869186048L) != 0)) {
					{
					setState(112);
					expr(0);
					}
				}

				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(115);
					match(COMMA);
					setState(116);
					expr(0);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ReadCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(READ_kw);
				setState(124);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new IncrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(ID);
				setState(126);
				((IncrementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCR || _la==DECR) ) {
					((IncrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				_localctx = new IntLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BoolLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(BOOL);
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ListLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LBRACK);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869186048L) != 0)) {
					{
					setState(133);
					expr(0);
					}
				}

				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(136);
					match(COMMA);
					setState(137);
					expr(0);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(RBRACK);
				}
				break;
			case 10:
				{
				_localctx = new ListAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(ID);
				setState(145);
				match(LBRACK);
				setState(146);
				expr(0);
				setState(147);
				match(RBRACK);
				}
				break;
			case 11:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(ID);
				setState(150);
				match(ASSIGN);
				setState(151);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						((BinOpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(155);
						((BinOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((BinOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						((BinOpContext)_localctx).r = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						((BinOpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(158);
						((BinOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((BinOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						((BinOpContext)_localctx).r = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						((BinOpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(161);
						((BinOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
							((BinOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						((BinOpContext)_localctx).r = expr(11);
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001\u0003"+
		"\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004]\b\u0004\n\u0004\f\u0004`\t\u0004"+
		"\u0003\u0004b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"g\b\u0004\n\u0004\f\u0004j\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005r\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0087\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008b\b\u0005\n\u0005"+
		"\f\u0005\u008e\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0099\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a4\b\u0005"+
		"\n\u0005\f\u0005\u00a7\t\u0005\u0001\u0005\u0000\u0001\n\u0006\u0000\u0002"+
		"\u0004\u0006\b\n\u0000\u0005\u0001\u0000\u0001\u0005\u0001\u0000\u001c"+
		"\u001d\u0001\u0000\u0018\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u0012"+
		"\u0017\u00c3\u0000\f\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000"+
		"\u0000\u0004I\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\b"+
		"V\u0001\u0000\u0000\u0000\n\u0098\u0001\u0000\u0000\u0000\f\u0011\u0005"+
		"\u0006\u0000\u0000\r\u0010\u0003\u0004\u0002\u0000\u000e\u0010\u0003\b"+
		"\u0004\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0007\u0000"+
		"\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005+\u0000\u0000"+
		"\u001b\u001c\u0005\u001e\u0000\u0000\u001c\u001d\u0003\n\u0005\u0000\u001d"+
		"\u001e\u0005 \u0000\u0000\u001eJ\u0001\u0000\u0000\u0000\u001f \u0003"+
		"\n\u0005\u0000 !\u0005 \u0000\u0000!J\u0001\u0000\u0000\u0000\"#\u0005"+
		"\n\u0000\u0000#$\u0003\n\u0005\u0000$%\u0005 \u0000\u0000%J\u0001\u0000"+
		"\u0000\u0000&\'\u0005\b\u0000\u0000\'(\u0005!\u0000\u0000()\u0003\n\u0005"+
		"\u0000)*\u0005\"\u0000\u0000*-\u0003\u0006\u0003\u0000+,\u0005\t\u0000"+
		"\u0000,.\u0003\u0006\u0003\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.J\u0001\u0000\u0000\u0000/1\u0005\r\u0000\u000002\u0003\n"+
		"\u0005\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003J\u0005 \u0000\u000045\u0005\u000e\u0000\u000056\u0005"+
		"!\u0000\u000067\u0003\u0004\u0002\u000078\u0003\n\u0005\u000089\u0005"+
		" \u0000\u00009:\u0003\n\u0005\u0000:;\u0005\"\u0000\u0000;<\u0003\u0006"+
		"\u0003\u0000<J\u0001\u0000\u0000\u0000=>\u0005\u000e\u0000\u0000>?\u0005"+
		"!\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0003\n\u0005\u0000AD\u0005"+
		" \u0000\u0000BE\u0003\u0004\u0002\u0000CE\u0003\n\u0005\u0000DB\u0001"+
		"\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FG\u0005\"\u0000\u0000GH\u0003\u0006\u0003\u0000HJ\u0001\u0000\u0000\u0000"+
		"I\u0019\u0001\u0000\u0000\u0000I\u001f\u0001\u0000\u0000\u0000I\"\u0001"+
		"\u0000\u0000\u0000I&\u0001\u0000\u0000\u0000I/\u0001\u0000\u0000\u0000"+
		"I4\u0001\u0000\u0000\u0000I=\u0001\u0000\u0000\u0000J\u0005\u0001\u0000"+
		"\u0000\u0000KU\u0003\u0004\u0002\u0000LP\u0005#\u0000\u0000MO\u0003\u0004"+
		"\u0002\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000SU\u0005$\u0000\u0000TK\u0001\u0000\u0000\u0000"+
		"TL\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005\f\u0000"+
		"\u0000WX\u0005+\u0000\u0000Xa\u0005!\u0000\u0000Y^\u0005+\u0000\u0000"+
		"Z[\u0005\u001f\u0000\u0000[]\u0005+\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000aY\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005"+
		"\"\u0000\u0000dh\u0005#\u0000\u0000eg\u0003\u0004\u0002\u0000fe\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000kl\u0005$\u0000\u0000l\t\u0001\u0000\u0000\u0000mn\u0006\u0005\uffff"+
		"\uffff\u0000no\u0005+\u0000\u0000oq\u0005!\u0000\u0000pr\u0003\n\u0005"+
		"\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rw\u0001\u0000"+
		"\u0000\u0000st\u0005\u001f\u0000\u0000tv\u0003\n\u0005\u0000us\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z\u0099\u0005\"\u0000\u0000{|\u0005\u000b\u0000\u0000|\u0099\u0003\n\u0005"+
		"\r}~\u0005+\u0000\u0000~\u0099\u0007\u0001\u0000\u0000\u007f\u0099\u0005"+
		"(\u0000\u0000\u0080\u0099\u0005\'\u0000\u0000\u0081\u0099\u0005)\u0000"+
		"\u0000\u0082\u0099\u0005*\u0000\u0000\u0083\u0099\u0005+\u0000\u0000\u0084"+
		"\u0086\u0005%\u0000\u0000\u0085\u0087\u0003\n\u0005\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008c"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u001f\u0000\u0000\u0089\u008b"+
		"\u0003\n\u0005\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0099\u0005&\u0000\u0000\u0090\u0091\u0005+\u0000"+
		"\u0000\u0091\u0092\u0005%\u0000\u0000\u0092\u0093\u0003\n\u0005\u0000"+
		"\u0093\u0094\u0005&\u0000\u0000\u0094\u0099\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005+\u0000\u0000\u0096\u0097\u0005\u001e\u0000\u0000\u0097\u0099"+
		"\u0003\n\u0005\u0001\u0098m\u0001\u0000\u0000\u0000\u0098{\u0001\u0000"+
		"\u0000\u0000\u0098}\u0001\u0000\u0000\u0000\u0098\u007f\u0001\u0000\u0000"+
		"\u0000\u0098\u0080\u0001\u0000\u0000\u0000\u0098\u0081\u0001\u0000\u0000"+
		"\u0000\u0098\u0082\u0001\u0000\u0000\u0000\u0098\u0083\u0001\u0000\u0000"+
		"\u0000\u0098\u0084\u0001\u0000\u0000\u0000\u0098\u0090\u0001\u0000\u0000"+
		"\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0099\u00a5\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\n\f\u0000\u0000\u009b\u009c\u0007\u0002\u0000\u0000"+
		"\u009c\u00a4\u0003\n\u0005\r\u009d\u009e\n\u000b\u0000\u0000\u009e\u009f"+
		"\u0007\u0003\u0000\u0000\u009f\u00a4\u0003\n\u0005\f\u00a0\u00a1\n\n\u0000"+
		"\u0000\u00a1\u00a2\u0007\u0004\u0000\u0000\u00a2\u00a4\u0003\n\u0005\u000b"+
		"\u00a3\u009a\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u000b\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u0012\u000f\u0011-1DIPT^ahqw\u0086\u008c\u0098\u00a3\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}