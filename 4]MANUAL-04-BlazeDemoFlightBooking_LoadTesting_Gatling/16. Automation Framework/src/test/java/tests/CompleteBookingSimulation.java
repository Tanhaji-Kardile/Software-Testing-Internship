package com.gatling.tests;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import java.time.Duration;

public class CompleteBookingSimulation extends Simulation {

    HttpProtocolBuilder httpProtocol =
            http.baseUrl("https://blazedemo.com")
                .acceptHeader("text/html");

    ScenarioBuilder scn = scenario("Complete Booking Scenario")

            // Open Home Page
            .exec(
                http("Open Home Page")
                    .get("/")
                    .check(status().is(200))
            )

            .pause(2)

            // Search Flights
            .exec(
                http("Find Flights")
                    .post("/reserve.php")
                    .formParam("fromPort", "Paris")
                    .formParam("toPort", "Buenos Aires")
                    .check(status().is(200))
            )

            .pause(2)

            // Choose Flight
            .exec(
                http("Choose Flight")
                    .post("/purchase.php")
                    .formParam("flight", "43")
                    .formParam("price", "472.56")
                    .formParam("airline", "Virgin America")
                    .formParam("fromPort", "Paris")
                    .formParam("toPort", "Buenos Aires")
                    .check(status().is(200))
            )

            .pause(2)

            // Complete Booking
            .exec(
                http("Complete Booking")
                    .post("/confirmation.php")
                    .formParam("inputName", "Sachin")
                    .formParam("address", "at post pune")
                    .formParam("city", "pune")
                    .formParam("state", "Maharashtra")
                    .formParam("zipCode", "412308")
                    .formParam("cardType", "visa")
                    .formParam("creditCardNumber", "123456")
                    .formParam("creditCardMonth", "11")
                    .formParam("creditCardYear", "2026")
                    .formParam("nameOnCard", "Sachin deshmukh")
                    .check(status().is(200))
            )

            .pause(2);

    {
        setUp(
            scn.injectOpen(
                rampUsers(20)
                    .during(Duration.ofSeconds(30))
            )
        ).protocols(httpProtocol);
    }
}