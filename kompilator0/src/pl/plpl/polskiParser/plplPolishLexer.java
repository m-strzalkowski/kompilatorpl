package pl.plpl.polskiParser;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.misc.Interval;
import pl.plpl.parser.plplLexer;

public class plplPolishLexer extends plplLexer {
    public plplPolishLexer(CharStream input) {
        super(input);
    }

    public void notifyListeners(LexerNoViableAltException e) {
        String text = this._input.getText(Interval.of(this._tokenStartCharIndex, this._input.index()));
        String msg = "bład rozpoznawania tokenów w: '" + this.getErrorDisplay(text) + "'";
        ANTLRErrorListener listener = this.getErrorListenerDispatch();
        listener.syntaxError(this, (Object)null, this._tokenStartLine, this._tokenStartCharPositionInLine, msg, e);
    }
}
