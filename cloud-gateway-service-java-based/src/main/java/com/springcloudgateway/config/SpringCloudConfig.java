package com.springcloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
	
	/*
	 * This class is used to configure  pre-filter in request body and post filter in response body for subject and student service
	 */

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/student/**")
				//Pre and Post Filters provided by Spring Cloud Gateway
						.filters(f -> f.addRequestHeader("student-request", "student-request-header")
								.addResponseHeader("student-response", "student-response-header"))
						.uri("http://localhost:8081/")
						.id("studentModule"))

				.route(r -> r.path("/subject/**")
				//Pre and Post Filters provided by Spring Cloud Gateway
						.filters(f -> f.addRequestHeader("subject-request", "subject-request-header")
								.addResponseHeader("subject-response", "subject-response-header"))
						.uri("http://localhost:8082/")
						.id("subjectModule"))
				.build();
	}

}
