package br.com.rodosafra;

import br.com.rodosafra.api.LocaleDistanceController;
import br.com.rodosafra.client.LocaleDistanceService;
import io.dropwizard.Application;
import io.dropwizard.client.HttpClientBuilder;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.http.client.HttpClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.ws.rs.client.Client;


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
        // TODO: implement application

        final Client client = new JerseyClientBuilder(environment).build("DemoRESTClient");
        environment.jersey().register(new LocaleDistanceController(client));

    }

}
