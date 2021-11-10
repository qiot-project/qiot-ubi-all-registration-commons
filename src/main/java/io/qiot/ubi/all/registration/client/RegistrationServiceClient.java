package io.qiot.ubi.all.registration.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.qiot.ubi.all.registration.domain.CAIssuerRequest;
import io.qiot.ubi.all.registration.domain.CertificateRequest;
import io.qiot.ubi.all.registration.domain.CertificateResponse;

/**
 * @author andreabattaglia
 *
 */
@Path("/v1")
@RegisterRestClient(configKey = "registration-service-api")
public interface RegistrationServiceClient {

    /**
     * @param request
     * @return
     */
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CertificateResponse provisionCertificate(CertificateRequest request);

    @Path("/issuer")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response provisionIssuer(CAIssuerRequest issuerRequest);

}