package com.malaw.dropwizard.readperson;

import com.codahale.metrics.health.HealthCheck;

public class ReadPersonHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception{
        return Result.healthy();
    }

}
