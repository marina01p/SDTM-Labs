package interpreter;

import java.util.regex.Pattern;

public class Interpreter {

    public static Expression buildInterpreterTree() {

        Expression keyWords = new TerminalExpression(Pattern.compile("(mint|lollipop|sourjelly|jellybeans|haribo|jellybelly)"));
        return keyWords;
    }
}
