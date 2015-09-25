package compilier.examples;

import compilier.examples.translators.infix_to_postfix.InfixToPostfixTranslator;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        InfixToPostfixTranslator translator = new InfixToPostfixTranslator();
        translator.Translate();
    }
}
