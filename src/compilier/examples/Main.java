package compilier.examples;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InfixToPostfixTranslator translator = new InfixToPostfixTranslator();
        translator.Translate();
    }
}
