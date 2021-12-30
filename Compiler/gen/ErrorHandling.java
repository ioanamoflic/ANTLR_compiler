import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfig;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Interval;

import java.util.BitSet;

public class ErrorHandling implements ANTLRErrorListener {

    public static ErrorHandling INSTANCE = new ErrorHandling();
    private static final boolean REPORT_SYNTAX_ERRORS = true;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }

        System.err.println(sourceName+"line"+line+":"+charPositionInLine+" "+msg);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

        if (REPORT_SYNTAX_ERRORS && !exact) {
            return;
        }

        String format = "reportAmbiguity d=%s: ambigAlts=%s, input='%s'";
        String decision = getDecisionDescription(parser, dfa);
        BitSet conflictingAlts = getConflictingAlts(ambigAlts, configs);
        String text = parser.getTokenStream().getText(Interval.of(startIndex, stopIndex));
        String message = String.format(format, decision, conflictingAlts, text);
        parser.notifyErrorListeners(message);
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int startIndex, int stopIndex, BitSet bitSet, ATNConfigSet atnConfigSet) {

//        String format = "reportAttemptingFullContext d=%s, input='%s'";
//        String decision = getDecisionDescription(parser, dfa);
//        String text = parser.getTokenStream().getText(Interval.of(startIndex, stopIndex));
//        String message = String.format(format, decision, text);
//        parser.notifyErrorListeners(message);
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int startIndex, int stopIndex, int prediciton, ATNConfigSet atnConfigSet) {

        String format = "reportContextSensitivity d=%s, input='%s'";
        String decision = getDecisionDescription(parser, dfa);
        String text = parser.getTokenStream().getText(Interval.of(startIndex, stopIndex));
        String message = String.format(format, decision, text);
        parser.notifyErrorListeners(message);
    }

    protected String getDecisionDescription(Parser recognizer, DFA dfa) {
        int decision = dfa.decision;
        int ruleIndex = dfa.atnStartState.ruleIndex;

        String[] ruleNames = recognizer.getRuleNames();
        if (ruleIndex < 0 || ruleIndex >= ruleNames.length) {
            return String.valueOf(decision);
        }

        String ruleName = ruleNames[ruleIndex];
        if (ruleName == null || ruleName.isEmpty()) {
            return String.valueOf(decision);
        }

        return String.format("%d (%s)", decision, ruleName);
    }

    protected BitSet getConflictingAlts(BitSet reportedAlts, ATNConfigSet configs) {
        if (reportedAlts != null) {
            return reportedAlts;
        }

        BitSet result = new BitSet();
        for (ATNConfig config : configs) {
            result.set(config.alt);
        }

        return result;
    }
}
