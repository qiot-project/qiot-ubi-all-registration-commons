package io.qiot.ubi.all.registration.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mmascia
 * 
 **/
public class CAIssuerRequest implements IssuerRequest {
    
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
