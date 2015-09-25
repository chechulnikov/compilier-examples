package compilier.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import compilier.examples.interfaces.ITranslator;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        Injector injector;
        try {
            injector = Guice.createInjector(new ExamplesModule());
            ITranslator translator = injector.getInstance(ITranslator.class);
            translator.translate();
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }
}
