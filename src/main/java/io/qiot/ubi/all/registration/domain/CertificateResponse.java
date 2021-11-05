/**
 * 
 */
package io.qiot.ubi.all.registration.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Object containing the certificates returned by the registration service
 * 
 * @author andreabattaglia
 *
 */
@JsonPropertyOrder(value = { "keystore", "truststore" })
@RegisterForReflection
public class CertificateResponse {
    @JsonProperty("keystore")
    public String keystore;
    @JsonProperty("truststore")
    public String truststore;

    // For isCA only
    @JsonProperty("tlsCert")
    public String tlsCert;
    @JsonProperty("tlsKey")
    public String tlsKey;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CertificateResponse [truststore=");
        builder.append(truststore);
        builder.append(", keystore=");
        builder.append(keystore);
        builder.append(", tlsCert=");
        builder.append(tlsCert);
        builder.append(", tlsKey=");
        builder.append(tlsKey);
        builder.append("]");
        return builder.toString();
    }

}
