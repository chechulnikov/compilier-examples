package compilier.examples.translators.infix_to_postfix;

import compilier.examples.interfaces.IParser;

import java.io.IOException;
import static java.lang.System.*;

public class InfixToPostfixParser implements IParser {
    private int lookahead;

    public InfixToPostfixParser() throws IOException {
        lookahead = in.read();
    }

    @Override
    public void parse() throws IOException {
        term();
        while (true) {
            if (lookahead == '+') {
                match('+');
                term();
                out.write('+');
            } else if (lookahead == '-') {
                match('-');
                term();
                out.write('-');
            } else return;
        }
    }

    private void term() throws IOException {
        char lookaheadChar = (char) lookahead;
        if (Character.isDigit(lookaheadChar)) {
            out.write(lookaheadChar);
            match(lookahead);
        } else {
            throw new Error("Syntax error");
        }
    }

    private void match(int terminal) throws IOException {
        if (lookahead == terminal) lookahead = in.read();
        else throw new Error("Syntax error");
    }
}
