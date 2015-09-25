package compilier.examples;

import com.google.inject.AbstractModule;
import compilier.examples.interfaces.IParser;
import compilier.examples.interfaces.ITranslator;
import compilier.examples.translators.infix_to_postfix.InfixToPostfixParser;
import compilier.examples.translators.infix_to_postfix.InfixToPostfixTranslator;

public class ExamplesModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IParser.class).to(InfixToPostfixParser.class);
        bind(ITranslator.class).to(InfixToPostfixTranslator.class);
    }
}
