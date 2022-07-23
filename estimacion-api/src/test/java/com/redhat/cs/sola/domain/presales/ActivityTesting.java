package com.redhat.cs.sola.domain.presales;

import io.quarkus.test.junit.QuarkusTest;
import io.vertx.core.cli.annotations.Description;

import org.junit.jupiter.api.Test;

import com.redhat.cs.sola.domain.presales.infraestructure.ActivityAPIRestImpl;

import static io.restassured.RestAssured.given;
// import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;


@QuarkusTest
public class ActivityTesting {

    //TODO: https://towardsdatascience.com/distributed-transactions-cdc-event-sourcing-outbox-cqrs-patterns-ee0cf70339b1 para el diseño del mensaje
    //TODO: what is better, to test rest or java services?, i'll go rest
    // @Inject 
    // private ActivityAPIRestImpl service;
    
    @Test
    public void shouldCreateAnActivity() {
        given()
          .when().get("/rest/activity")
          .then()
             .statusCode(200)
            .body("[0].id", notNullValue())
            .body("[0].description", notNullValue())
            .body("[0].title", notNullValue())
            .body("[0].autor", notNullValue())
            .body("[0].fechaCreacion", notNullValue()); 
            //  expect: e


    }

}