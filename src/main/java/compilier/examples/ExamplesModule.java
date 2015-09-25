package compilier.examples;

import com.google.inject.AbstractModule;

public class ExamplesModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IA.class).to(A.class);
    }
}
