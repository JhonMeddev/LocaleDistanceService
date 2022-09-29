package br.com.rodosafra;

import br.com.rodosafra.client.LocaleDistanceController;
import io.dropwizard.Application;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.ws.rs.client.Client;
import java.util.EnumSet;


@EnableFeignClients
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

        // Enable CORS headers
        final FilterRegistration.Dynamic cors =
                environment.servlets().addFilter("CORS", CrossOriginFilter.class);

        // Configure CORS parameters
        cors.setInitParameter("allowedOrigins", "*");
        cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
        cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

        // Add URL mapping
        cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

        // DO NOT pass a preflight request to down-stream auth filters
        // unauthenticated preflight requests should be permitted by spec
        cors.setInitParameter(CrossOriginFilter.CHAIN_PREFLIGHT_PARAM, Boolean.FALSE.toString());
        // TODO: implement application

        final Client client = new JerseyClientBuilder(environment).build("DemoRESTClient");
        environment.jersey().register(new LocaleDistanceController(client));

    }

}
