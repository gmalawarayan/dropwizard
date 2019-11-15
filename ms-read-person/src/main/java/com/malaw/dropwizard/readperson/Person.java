package com.malaw.dropwizard.readperson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    private String name;

    private String jobTitle;

    public Person() { }

    public Person(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public String getJobTitle() {
        return jobTitle;
    }
}
