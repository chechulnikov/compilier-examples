package compilier.examples.translators.infix_to_postfix;

import com.google.inject.Inject;
import compilier.examples.interfaces.IParser;
import compilier.examples.interfaces.ITranslator;

import java.io.IOException;

public class InfixToPostfixTranslator implements ITranslator {
    private IParser parser;

    @Inject
    public InfixToPostfixTranslator(IParser parser) throws IOException {
        this.parser = parser;
    }

    @Override
    public void translate() throws IOException {
        parser.parse();
        System.out.write('\n');
    }
}