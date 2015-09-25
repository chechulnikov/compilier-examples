package compilier.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.IOException;

public class Start {
    private static final Injector injector;

    static {
        injector = Guice.createInjector(new ExamplesModule());
    }

    public static void main(String[] args) throws IOException {
//        InfixToPostfixTranslator translator = new InfixToPostfixTranslator();
//        translator.Translate();
        IA a = injector.getInstance(IA.class);
        a.doSomething();
    }
}
