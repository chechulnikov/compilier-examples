package compilier.examples;

import java.io.IOException;

public class InfixToPostfixTranslator {
    private Parser parser;

    public InfixToPostfixTranslator() throws IOException {
        parser = new Parser();
    }

    public void Translate() throws IOException {
        parser.expr();
        System.out.write('\n');
    }
}