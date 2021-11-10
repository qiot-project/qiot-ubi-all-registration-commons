package io.qiot.ubi.all.registration.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author mmascia
 * @author andreabattaglia
 * 
 **/
@JsonPropertyOrder(value = { "tlsCert", "tlsKey"})
@RegisterForReflection
public class CAIssuerRequest {
    
    public static final String TLS_CERT = "tls.crt";
    public static final String TLS_KEY = "tls.key";

    @JsonProperty("tlsCert")
    public String tlsCert;
    @JsonProperty("tlsKey")
    public String tlsKey;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CAIssuerRequest [tlsCert=");
        builder.append(tlsCert);
        builder.append(", tlsKey=");
        builder.append(tlsKey);
        builder.append("]");
        return builder.toString();
    }
}
