package compilier.examples;

import java.io.IOException;

import static java.lang.System.*;

public class Parser{
    static int lookahead;

    public Parser() throws IOException {
        lookahead = in.read();
    }

    public void expr() throws IOException {
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
        char lookaheadChar = (char) Parser.lookahead;
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
