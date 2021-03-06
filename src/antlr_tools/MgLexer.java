package antlr_tools;// Generated from Mg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, LogicConstant=33, PosIntegerConstant=34, StringConstant=35, 
		LineComment=36, BlockComment=37, WhiteSpace=38, NewLine=39, Bool=40, Int=41, 
		String=42, Void=43, Null=44, True=45, False=46, If=47, Else=48, For=49, 
		While=50, Break=51, Continue=52, Return=53, New=54, Class=55, This=56, 
		Identifier=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "LogicConstant", 
		"PosIntegerConstant", "Letter", "Underscore", "DigitNoZero", "Digit", 
		"StringConstant", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"LineComment", "BlockComment", "WhiteSpace", "NewLine", "Bool", "Int", 
		"String", "Void", "Null", "True", "False", "If", "Else", "For", "While", 
		"Break", "Continue", "Return", "New", "Class", "This", "Identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "'='", "'{'", "'}'", "'++'", "'--'", 
		"'+'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
		"'.'", "'['", "']'", null, null, null, null, null, null, null, "'bool'", 
		"'int'", "'string'", "'void'", "'null'", "'true'", "'false'", "'if'", 
		"'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", "'new'", 
		"'class'", "'this'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "LogicConstant", 
		"PosIntegerConstant", "StringConstant", "LineComment", "BlockComment", 
		"WhiteSpace", "NewLine", "Bool", "Int", "String", "Void", "Null", "True", 
		"False", "If", "Else", "For", "While", "Break", "Continue", "Return", 
		"New", "Class", "This", "Identifier"
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


	public MgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\5\"\u00d0\n\"\3#\3#\3#\7#\u00d5\n#\f#\16#\u00d8\13"+
		"#\5#\u00da\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\5(\u00e6\n(\3(\3(\3)\6)"+
		"\u00eb\n)\r)\16)\u00ec\3*\3*\5*\u00f1\n*\3+\3+\3+\3,\3,\3,\3,\7,\u00fa"+
		"\n,\f,\16,\u00fd\13,\3,\3,\3-\3-\3-\3-\3-\7-\u0106\n-\f-\16-\u0109\13"+
		"-\3-\3-\3-\3-\3-\3.\6.\u0111\n.\r.\16.\u0112\3.\3.\3/\5/\u0118\n/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"8\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3A\3A\3A\3A\7A\u017e\nA\fA\16A\u0181\13A\3\u0107\2B\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G\2I\2K\2M\2O%Q\2S\2U\2W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63"+
		"s\64u\65w\66y\67{8}9\177:\u0081;\3\2\t\4\2C\\c|\3\2\63;\3\2\62;\4\2$$"+
		"^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\4\2\13\13\"\"\2\u0188\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2O\3\2\2\2\2W\3\2\2\2"+
		"\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e"+
		"\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2"+
		"\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2"+
		"\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7\u0087"+
		"\3\2\2\2\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r\u008d\3\2\2\2\17\u008f\3\2"+
		"\2\2\21\u0091\3\2\2\2\23\u0094\3\2\2\2\25\u0097\3\2\2\2\27\u0099\3\2\2"+
		"\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u009f\3\2\2\2\37\u00a1\3\2\2\2"+
		"!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00ab\3\2\2\2)\u00ad\3"+
		"\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b5\3\2\2\2\61\u00b8\3\2\2\2\63"+
		"\u00bb\3\2\2\2\65\u00bd\3\2\2\2\67\u00bf\3\2\2\29\u00c1\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00cb\3\2\2\2C\u00cf\3\2\2\2E"+
		"\u00d9\3\2\2\2G\u00db\3\2\2\2I\u00dd\3\2\2\2K\u00df\3\2\2\2M\u00e1\3\2"+
		"\2\2O\u00e3\3\2\2\2Q\u00ea\3\2\2\2S\u00f0\3\2\2\2U\u00f2\3\2\2\2W\u00f5"+
		"\3\2\2\2Y\u0100\3\2\2\2[\u0110\3\2\2\2]\u0117\3\2\2\2_\u011d\3\2\2\2a"+
		"\u0122\3\2\2\2c\u0126\3\2\2\2e\u012d\3\2\2\2g\u0132\3\2\2\2i\u0137\3\2"+
		"\2\2k\u013c\3\2\2\2m\u0142\3\2\2\2o\u0145\3\2\2\2q\u014a\3\2\2\2s\u014e"+
		"\3\2\2\2u\u0154\3\2\2\2w\u015a\3\2\2\2y\u0163\3\2\2\2{\u016a\3\2\2\2}"+
		"\u016e\3\2\2\2\177\u0174\3\2\2\2\u0081\u0179\3\2\2\2\u0083\u0084\7=\2"+
		"\2\u0084\4\3\2\2\2\u0085\u0086\7*\2\2\u0086\6\3\2\2\2\u0087\u0088\7+\2"+
		"\2\u0088\b\3\2\2\2\u0089\u008a\7.\2\2\u008a\n\3\2\2\2\u008b\u008c\7?\2"+
		"\2\u008c\f\3\2\2\2\u008d\u008e\7}\2\2\u008e\16\3\2\2\2\u008f\u0090\7\177"+
		"\2\2\u0090\20\3\2\2\2\u0091\u0092\7-\2\2\u0092\u0093\7-\2\2\u0093\22\3"+
		"\2\2\2\u0094\u0095\7/\2\2\u0095\u0096\7/\2\2\u0096\24\3\2\2\2\u0097\u0098"+
		"\7-\2\2\u0098\26\3\2\2\2\u0099\u009a\7/\2\2\u009a\30\3\2\2\2\u009b\u009c"+
		"\7#\2\2\u009c\32\3\2\2\2\u009d\u009e\7\u0080\2\2\u009e\34\3\2\2\2\u009f"+
		"\u00a0\7,\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\7\'\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7>\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa\7@\2\2\u00aa&\3\2\2\2\u00ab\u00ac"+
		"\7@\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae\u00af\7?\2\2\u00af*\3"+
		"\2\2\2\u00b0\u00b1\7>\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6\u00b7\7?\2\2\u00b7\60"+
		"\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\7?\2\2\u00ba\62\3\2\2\2\u00bb"+
		"\u00bc\7(\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7`\2\2\u00be\66\3\2\2\2\u00bf"+
		"\u00c0\7~\2\2\u00c08\3\2\2\2\u00c1\u00c2\7(\2\2\u00c2\u00c3\7(\2\2\u00c3"+
		":\3\2\2\2\u00c4\u00c5\7~\2\2\u00c5\u00c6\7~\2\2\u00c6<\3\2\2\2\u00c7\u00c8"+
		"\7\60\2\2\u00c8>\3\2\2\2\u00c9\u00ca\7]\2\2\u00ca@\3\2\2\2\u00cb\u00cc"+
		"\7_\2\2\u00ccB\3\2\2\2\u00cd\u00d0\5i\65\2\u00ce\u00d0\5k\66\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0D\3\2\2\2\u00d1\u00da\5M\'\2\u00d2\u00d6"+
		"\5K&\2\u00d3\u00d5\5M\'\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d2\3\2\2\2\u00daF\3\2\2\2\u00db\u00dc"+
		"\t\2\2\2\u00dcH\3\2\2\2\u00dd\u00de\7a\2\2\u00deJ\3\2\2\2\u00df\u00e0"+
		"\t\3\2\2\u00e0L\3\2\2\2\u00e1\u00e2\t\4\2\2\u00e2N\3\2\2\2\u00e3\u00e5"+
		"\7$\2\2\u00e4\u00e6\5Q)\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8P\3\2\2\2\u00e9\u00eb\5S*\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00edR\3\2\2\2\u00ee\u00f1\n\5\2\2\u00ef\u00f1\5U+\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1T\3\2\2\2\u00f2\u00f3\7^\2\2\u00f3\u00f4"+
		"\t\6\2\2\u00f4V\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7\61\2\2\u00f7"+
		"\u00fb\3\2\2\2\u00f8\u00fa\n\7\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\b,\2\2\u00ffX\3\2\2\2\u0100\u0101\7\61\2\2"+
		"\u0101\u0102\7,\2\2\u0102\u0107\3\2\2\2\u0103\u0106\5Y-\2\u0104\u0106"+
		"\13\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010b\7,\2\2\u010b\u010c\7\61\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\b-\2\2\u010eZ\3\2\2\2\u010f\u0111\t\b\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\b.\2\2\u0115\\\3\2\2\2\u0116\u0118\7\17\2\2\u0117\u0116"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\f\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\b/\2\2\u011c^\3\2\2\2\u011d\u011e\7d\2\2\u011e"+
		"\u011f\7q\2\2\u011f\u0120\7q\2\2\u0120\u0121\7n\2\2\u0121`\3\2\2\2\u0122"+
		"\u0123\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7v\2\2\u0125b\3\2\2\2\u0126"+
		"\u0127\7u\2\2\u0127\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a\7k\2\2"+
		"\u012a\u012b\7p\2\2\u012b\u012c\7i\2\2\u012cd\3\2\2\2\u012d\u012e\7x\2"+
		"\2\u012e\u012f\7q\2\2\u012f\u0130\7k\2\2\u0130\u0131\7f\2\2\u0131f\3\2"+
		"\2\2\u0132\u0133\7p\2\2\u0133\u0134\7w\2\2\u0134\u0135\7n\2\2\u0135\u0136"+
		"\7n\2\2\u0136h\3\2\2\2\u0137\u0138\7v\2\2\u0138\u0139\7t\2\2\u0139\u013a"+
		"\7w\2\2\u013a\u013b\7g\2\2\u013bj\3\2\2\2\u013c\u013d\7h\2\2\u013d\u013e"+
		"\7c\2\2\u013e\u013f\7n\2\2\u013f\u0140\7u\2\2\u0140\u0141\7g\2\2\u0141"+
		"l\3\2\2\2\u0142\u0143\7k\2\2\u0143\u0144\7h\2\2\u0144n\3\2\2\2\u0145\u0146"+
		"\7g\2\2\u0146\u0147\7n\2\2\u0147\u0148\7u\2\2\u0148\u0149\7g\2\2\u0149"+
		"p\3\2\2\2\u014a\u014b\7h\2\2\u014b\u014c\7q\2\2\u014c\u014d\7t\2\2\u014d"+
		"r\3\2\2\2\u014e\u014f\7y\2\2\u014f\u0150\7j\2\2\u0150\u0151\7k\2\2\u0151"+
		"\u0152\7n\2\2\u0152\u0153\7g\2\2\u0153t\3\2\2\2\u0154\u0155\7d\2\2\u0155"+
		"\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7c\2\2\u0158\u0159\7m\2\2"+
		"\u0159v\3\2\2\2\u015a\u015b\7e\2\2\u015b\u015c\7q\2\2\u015c\u015d\7p\2"+
		"\2\u015d\u015e\7v\2\2\u015e\u015f\7k\2\2\u015f\u0160\7p\2\2\u0160\u0161"+
		"\7w\2\2\u0161\u0162\7g\2\2\u0162x\3\2\2\2\u0163\u0164\7t\2\2\u0164\u0165"+
		"\7g\2\2\u0165\u0166\7v\2\2\u0166\u0167\7w\2\2\u0167\u0168\7t\2\2\u0168"+
		"\u0169\7p\2\2\u0169z\3\2\2\2\u016a\u016b\7p\2\2\u016b\u016c\7g\2\2\u016c"+
		"\u016d\7y\2\2\u016d|\3\2\2\2\u016e\u016f\7e\2\2\u016f\u0170\7n\2\2\u0170"+
		"\u0171\7c\2\2\u0171\u0172\7u\2\2\u0172\u0173\7u\2\2\u0173~\3\2\2\2\u0174"+
		"\u0175\7v\2\2\u0175\u0176\7j\2\2\u0176\u0177\7k\2\2\u0177\u0178\7u\2\2"+
		"\u0178\u0080\3\2\2\2\u0179\u017f\5G$\2\u017a\u017e\5G$\2\u017b\u017e\5"+
		"I%\2\u017c\u017e\5M\'\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0082\3\2\2\2\u0181\u017f\3\2\2\2\20\2\u00cf\u00d6\u00d9\u00e5"+
		"\u00ec\u00f0\u00fb\u0105\u0107\u0112\u0117\u017d\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}