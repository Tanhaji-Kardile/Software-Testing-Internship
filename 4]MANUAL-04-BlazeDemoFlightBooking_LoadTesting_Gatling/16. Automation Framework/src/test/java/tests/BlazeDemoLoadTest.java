package com.gatling.tests;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import java.time.Duration;

public class BlazeDemoLoadTest extends Simulation {

    HttpProtocolBuilder httpProtocol =
            http.baseUrl("https://blazedemo.com")
                .acceptHeader("text/html");

    ScenarioBuilder scn = scenario("BlazeDemo Load Test")
            .exec(
                    http("Open Home Page")
                            .get("/")
                            .check(status().is(200))
            )
            .pause(1);

    {
        setUp(
                scn.injectOpen(
                        rampUsers(20).during(Duration.ofSeconds(30))
                )
        ).protocols(httpProtocol);
    }
}