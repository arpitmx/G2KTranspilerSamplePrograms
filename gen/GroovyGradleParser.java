// Generated from /Users/apple/IdeaProjects/G2KTranspilerSample/src/main/kotlin/GroovyGradle.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GroovyGradleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IMPLEMENTATION=4, TEST_IMPLEMENTATION=5, ANDROID_TEST_IMPLEMENTATION=6, 
		SPACES=7, STRING_LITERAL=8;
	public static final int
		RULE_dependencies_section = 0, RULE_dependency = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"dependencies_section", "dependency"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dependencies'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IMPLEMENTATION", "TEST_IMPLEMENTATION", "ANDROID_TEST_IMPLEMENTATION", 
			"SPACES", "STRING_LITERAL"
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
	public String getGrammarFileName() { return "GroovyGradle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GroovyGradleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dependencies_sectionContext extends ParserRuleContext {
		public List<DependencyContext> dependency() {
			return getRuleContexts(DependencyContext.class);
		}
		public DependencyContext dependency(int i) {
			return getRuleContext(DependencyContext.class,i);
		}
		public Dependencies_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencies_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyGradleListener ) ((GroovyGradleListener)listener).enterDependencies_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyGradleListener ) ((GroovyGradleListener)listener).exitDependencies_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyGradleVisitor ) return ((GroovyGradleVisitor<? extends T>)visitor).visitDependencies_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependencies_sectionContext dependencies_section() throws RecognitionException {
		Dependencies_sectionContext _localctx = new Dependencies_sectionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dependencies_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(T__0);
			setState(5);
			match(T__1);
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				dependency();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) );
			setState(11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DependencyContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTATION() { return getToken(GroovyGradleParser.IMPLEMENTATION, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GroovyGradleParser.STRING_LITERAL, 0); }
		public TerminalNode TEST_IMPLEMENTATION() { return getToken(GroovyGradleParser.TEST_IMPLEMENTATION, 0); }
		public TerminalNode ANDROID_TEST_IMPLEMENTATION() { return getToken(GroovyGradleParser.ANDROID_TEST_IMPLEMENTATION, 0); }
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyGradleListener ) ((GroovyGradleListener)listener).enterDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyGradleListener ) ((GroovyGradleListener)listener).exitDependency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyGradleVisitor ) return ((GroovyGradleVisitor<? extends T>)visitor).visitDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dependency);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLEMENTATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(IMPLEMENTATION);
				setState(14);
				match(STRING_LITERAL);
				}
				break;
			case TEST_IMPLEMENTATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(TEST_IMPLEMENTATION);
				setState(16);
				match(STRING_LITERAL);
				}
				break;
			case ANDROID_TEST_IMPLEMENTATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(ANDROID_TEST_IMPLEMENTATION);
				setState(18);
				match(STRING_LITERAL);
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

	public static final String _serializedATN =
		"\u0004\u0001\b\u0016\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0000\u0000"+
		"\u0002\u0000\u0002\u0000\u0000\u0016\u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0005\u0005\u0001\u0000\u0000"+
		"\u0005\u0007\u0005\u0002\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007"+
		"\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001"+
		"\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0005\u0003\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0005\u0004\u0000\u0000\u000e\u0014\u0005\b\u0000\u0000\u000f"+
		"\u0010\u0005\u0005\u0000\u0000\u0010\u0014\u0005\b\u0000\u0000\u0011\u0012"+
		"\u0005\u0006\u0000\u0000\u0012\u0014\u0005\b\u0000\u0000\u0013\r\u0001"+
		"\u0000\u0000\u0000\u0013\u000f\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0002\t\u0013";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}