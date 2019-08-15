package com.huawei.servicecomb.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2019-08-14T08:31:52.753Z")


@RestSchema(schemaId = "projecttemplate2")
@Path("/rest")

@Produces({ "application/json" })
public class Projecttemplate2Impl  {

    @Autowired
    private Projecttemplate2Delegate projecttemplate2Delegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return projecttemplate2Delegate.helloworld("projecttemplate2:"+name);
    }
}

