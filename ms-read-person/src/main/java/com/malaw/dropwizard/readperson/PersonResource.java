package com.malaw.dropwizard.readperson;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.joda.time.DateTime;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@RolesAllowed("ADMIN")
public class PersonResource {

    private final PersonService personService;

    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @GET
    public String getTodaysDate() {
        return "{\"today's Date is \":" + new DateTime().toString("dd/MM/yyyy") + "}";
    }
}
