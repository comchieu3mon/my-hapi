package com.example.myhapi;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.RestfulServer;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/*")
public class FhirRestfulServer extends RestfulServer {

    private ApplicationContext applicationContext;

    public FhirRestfulServer(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    protected void initialize() throws ServletException {
        super.initialize();
        setFhirContext(FhirContext.forR4());
    }
}
