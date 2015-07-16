package org.springframework.cloud.netflix.eureka;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

@ConfigurationProperties("eureka.client.oauth2")
public class EurekaOAuth2ResourceDetails extends ClientCredentialsResourceDetails {

}
