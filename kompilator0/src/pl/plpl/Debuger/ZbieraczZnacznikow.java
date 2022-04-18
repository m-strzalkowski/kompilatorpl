package pl.plpl.Debuger;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import pl.plpl.parser.plplBaseListener;
import pl.plpl.parser.plplParser;

import java.util.List;

public class ZbieraczZnacznikow extends plplBaseListener {
    plplParser parser;
    BufferedTokenStream tokens;
    TokenStreamRewriter rewriter;

    int i=0;
    public ZbieraczZnacznikow(plplParser parser, BufferedTokenStream tokens) {
        this.parser = parser;
        this.tokens = tokens;}
    @Override public void exitProgram(plplParser.ProgramContext ctx) {
        Token semi = ctx.getStop();
        int i = semi.getTokenIndex();
        List<Token> kanał333 =
                tokens.getHiddenTokensToLeft(i, 333);
        System.out.println(kanał333);

    }

}
/*
public static class CommentShifter extends CymbolBaseListener {
    BufferedTokenStream tokens;
    TokenStreamRewriter rewriter;
    //* Create TokenStreamRewriter attached to token stream
     /*  sitting between the Cymbol lexer and parser.
     //
    public CommentShifter(BufferedTokenStream tokens) {
        this.tokens = tokens;
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        Token semi = ctx.getStop();
        int i = semi.getTokenIndex();
        List<Token> cmtChannel =
                tokens.getHiddenTokensToRight(i, CymbolLexer.COMMENTS);
        if ( cmtChannel!=null ) {
            Token cmt = cmtChannel.get(0);
            if ( cmt!=null ) {
                String txt = cmt.getText().substring(2);
                String newCmt = "/* " + txt.trim() + " * /\n";
                rewriter.insertBefore(ctx.start, newCmt);
                rewriter.replace(cmt, "\n");
            }
        }
    }
}
*/