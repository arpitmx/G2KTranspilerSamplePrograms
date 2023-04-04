// Generated from /Users/apple/IdeaProjects/G2KTranspilerSample/src/main/kotlin/GroovyGradle.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GroovyGradleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IMPLEMENTATION=4, TEST_IMPLEMENTATION=5, ANDROID_TEST_IMPLEMENTATION=6, 
		SPACES=7, STRING_LITERAL=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "IMPLEMENTATION", "TEST_IMPLEMENTATION", "ANDROID_TEST_IMPLEMENTATION", 
			"SPACES", "STRING_LITERAL"
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


	public GroovyGradleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GroovyGradle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\bw\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00033\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005f\b\u0005\u0001\u0006\u0004\u0006i\b\u0006\u000b"+
		"\u0006\f\u0006j\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005"+
		"\u0007q\b\u0007\n\u0007\f\u0007t\t\u0007\u0001\u0007\u0001\u0007\u0000"+
		"\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0001\u0000\u0002\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"\'\'{\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001"+
		"\u0011\u0001\u0000\u0000\u0000\u0003\u001e\u0001\u0000\u0000\u0000\u0005"+
		" \u0001\u0000\u0000\u0000\u0007\"\u0001\u0000\u0000\u0000\t4\u0001\u0000"+
		"\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rh\u0001\u0000\u0000\u0000"+
		"\u000fn\u0001\u0000\u0000\u0000\u0011\u0012\u0005d\u0000\u0000\u0012\u0013"+
		"\u0005e\u0000\u0000\u0013\u0014\u0005p\u0000\u0000\u0014\u0015\u0005e"+
		"\u0000\u0000\u0015\u0016\u0005n\u0000\u0000\u0016\u0017\u0005d\u0000\u0000"+
		"\u0017\u0018\u0005e\u0000\u0000\u0018\u0019\u0005n\u0000\u0000\u0019\u001a"+
		"\u0005c\u0000\u0000\u001a\u001b\u0005i\u0000\u0000\u001b\u001c\u0005e"+
		"\u0000\u0000\u001c\u001d\u0005s\u0000\u0000\u001d\u0002\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005{\u0000\u0000\u001f\u0004\u0001\u0000\u0000\u0000"+
		" !\u0005}\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"#\u0005i\u0000\u0000"+
		"#$\u0005m\u0000\u0000$%\u0005p\u0000\u0000%&\u0005l\u0000\u0000&\'\u0005"+
		"e\u0000\u0000\'(\u0005m\u0000\u0000()\u0005e\u0000\u0000)*\u0005n\u0000"+
		"\u0000*+\u0005t\u0000\u0000+,\u0005a\u0000\u0000,-\u0005t\u0000\u0000"+
		"-.\u0005i\u0000\u0000./\u0005o\u0000\u0000/0\u0005n\u0000\u000002\u0001"+
		"\u0000\u0000\u000013\u0003\r\u0006\u000021\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005t\u0000\u000056\u0005"+
		"e\u0000\u000067\u0005s\u0000\u000078\u0005t\u0000\u000089\u0005I\u0000"+
		"\u00009:\u0005m\u0000\u0000:;\u0005p\u0000\u0000;<\u0005l\u0000\u0000"+
		"<=\u0005e\u0000\u0000=>\u0005m\u0000\u0000>?\u0005e\u0000\u0000?@\u0005"+
		"n\u0000\u0000@A\u0005t\u0000\u0000AB\u0005a\u0000\u0000BC\u0005t\u0000"+
		"\u0000CD\u0005i\u0000\u0000DE\u0005o\u0000\u0000EF\u0005n\u0000\u0000"+
		"FH\u0001\u0000\u0000\u0000GI\u0003\r\u0006\u0000HG\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005a\u0000\u0000"+
		"KL\u0005n\u0000\u0000LM\u0005d\u0000\u0000MN\u0005r\u0000\u0000NO\u0005"+
		"o\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005d\u0000\u0000QR\u0005T\u0000"+
		"\u0000RS\u0005e\u0000\u0000ST\u0005s\u0000\u0000TU\u0005t\u0000\u0000"+
		"UV\u0005I\u0000\u0000VW\u0005m\u0000\u0000WX\u0005p\u0000\u0000XY\u0005"+
		"l\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005m\u0000\u0000[\\\u0005e\u0000"+
		"\u0000\\]\u0005n\u0000\u0000]^\u0005t\u0000\u0000^_\u0005a\u0000\u0000"+
		"_`\u0005t\u0000\u0000`a\u0005i\u0000\u0000ab\u0005o\u0000\u0000bc\u0005"+
		"n\u0000\u0000ce\u0001\u0000\u0000\u0000df\u0003\r\u0006\u0000ed\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\f\u0001\u0000\u0000\u0000"+
		"gi\u0007\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0006\u0006\u0000\u0000m\u000e\u0001\u0000\u0000\u0000"+
		"nr\u0005\'\u0000\u0000oq\b\u0001\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\'\u0000"+
		"\u0000v\u0010\u0001\u0000\u0000\u0000\u0006\u00002Hejr\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}