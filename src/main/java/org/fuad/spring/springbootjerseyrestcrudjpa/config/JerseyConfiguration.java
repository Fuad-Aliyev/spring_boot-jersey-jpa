package org.fuad.spring.springbootjerseyrestcrudjpa.config;

import javax.ws.rs.ApplicationPath;

import org.fuad.spring.springbootjerseyrestcrudjpa.controller.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/boot-jersey")
public class JerseyConfiguration extends ResourceConfig{
	public JerseyConfiguration() {
	  register(UserResource.class);
	 }
}
