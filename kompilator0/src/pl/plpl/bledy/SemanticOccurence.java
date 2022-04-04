package pl.plpl.bledy;

import org.antlr.v4.runtime.RecognitionException;

public class SemanticOccurence
{

    public enum Level {

        INFO(0),
        WARN(1),
        ERROR(2),
        FATAL(3);

        private final Integer severity;

        Level(int severity) {
            this.severity = severity;
        }

        public boolean isWorseThan(Level other) {
            return this.severity > other.severity;
        }
        public boolean worseOrEqual(Level other) {
            return this.severity >= other.severity;
        }
        public String nazwapolska(){
            return switch (severity) {
                case 0 -> "INFORMACJA";
                case 1 -> "OSTRZEŻENIE";
                case 2 -> "BŁĄD";
                case 3 -> "FATALNY BŁĄD";
                default -> "?";
            };
        }
    }

    private final Level severity;
    private final Object offendingSymbol;
    private final int line;
    private final int charPositionInLine;
    private final String message;


    public SemanticOccurence(Level severity, Object offendingSymbol, int line, int charPositionInLine, String msg)
    {
        this.severity = severity;
        this.offendingSymbol = offendingSymbol;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.message = msg;

    }

    @Override
    public String toString() {
        return  severity.nazwapolska() +
                //" na symbolu" + offendingSymbol +
                " na pozycji:" + line +
                "," + charPositionInLine +
                " '" + message ;
    }

    public Level getSeverity() {
        return severity;
    }

    public Object getOffendingSymbol()
    {
        return offendingSymbol;
    }

    public int getLine()
    {
        return line;
    }

    public int getCharPositionInLine()
    {
        return charPositionInLine;
    }

    public String getMessage()
    {
        return message;
    }

}