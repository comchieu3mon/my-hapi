package com.example.myhapi.provider;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.IResourceProvider;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;

public class PatientProvider implements IResourceProvider {

    @Autowired
    private FhirContext fhirContext;


    @Override
    public Class<? extends IBaseResource> getResourceType() {
        return Patient.class;
    }
}
