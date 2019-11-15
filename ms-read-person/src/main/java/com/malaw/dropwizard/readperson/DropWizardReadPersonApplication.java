package com.malaw.dropwizard.readperson;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.apache.http.client.HttpClient;

public class DropWizardReadPersonApplication extends Application<ReadPersonApplicationConfiguration> {

    public static void main(String[] args) throws Exception {
        new DropWizardReadPersonApplication().run(args);
    }

    @Override
    public void run(
        ReadPersonApplicationConfiguration readPersonApplicationConfiguration,
        Environment environment) {
        environment.jersey().register(new PersonResource(new PersonService()));
        environment.jersey().register(new ReadPersonHealthCheck());
        final HttpClient httpClient = new HttpClient() 
    }
}
