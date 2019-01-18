// Generated from com/joantolos/antlr4/multi/project/dsl/SearchServiceQLLexer.g by ANTLR 4.7.2

  package com.joantolos.antlr4.multi.project.dsl;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SearchServiceQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "DOUBLE_DIGIT", "MONTH", "HYPHEN", "YEAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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


	public SearchServiceQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SearchServiceQLLexer.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\2C\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5;\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\3\2\5\2\7\2\t\2\13\2\r\2\3"+
		"\2\3\4\2C\\c|\2G\3\17\3\2\2\2\5\21\3\2\2\2\7\23\3\2\2\2\t:\3\2\2\2\13"+
		"<\3\2\2\2\r>\3\2\2\2\17\20\t\2\2\2\20\4\3\2\2\2\21\22\4\62;\2\22\6\3\2"+
		"\2\2\23\24\5\5\3\2\24\25\5\5\3\2\25\b\3\2\2\2\26\27\7L\2\2\27\30\7C\2"+
		"\2\30;\7P\2\2\31\32\7H\2\2\32\33\7G\2\2\33;\7D\2\2\34\35\7O\2\2\35\36"+
		"\7C\2\2\36;\7T\2\2\37 \7C\2\2 !\7R\2\2!;\7T\2\2\"#\7O\2\2#$\7C\2\2$;\7"+
		"[\2\2%&\7L\2\2&\'\7W\2\2\';\7P\2\2()\7L\2\2)*\7W\2\2*;\7N\2\2+,\7C\2\2"+
		",-\7W\2\2-;\7I\2\2./\7U\2\2/\60\7G\2\2\60;\7R\2\2\61\62\7Q\2\2\62\63\7"+
		"E\2\2\63;\7V\2\2\64\65\7P\2\2\65\66\7Q\2\2\66;\7X\2\2\678\7F\2\289\7G"+
		"\2\29;\7E\2\2:\26\3\2\2\2:\31\3\2\2\2:\34\3\2\2\2:\37\3\2\2\2:\"\3\2\2"+
		"\2:%\3\2\2\2:(\3\2\2\2:+\3\2\2\2:.\3\2\2\2:\61\3\2\2\2:\64\3\2\2\2:\67"+
		"\3\2\2\2;\n\3\2\2\2<=\7/\2\2=\f\3\2\2\2>?\5\5\3\2?@\5\5\3\2@A\5\5\3\2"+
		"AB\5\5\3\2B\16\3\2\2\2\4\2:\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}