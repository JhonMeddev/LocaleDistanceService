package br.com.rodosafra;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LocaleDistanceServiceApplication extends Application<LocaleDistanceServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new LocaleDistanceServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "LocaleDistanceService";
    }

    @Override
    public void initialize(final Bootstrap<LocaleDistanceServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final LocaleDistanceServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
