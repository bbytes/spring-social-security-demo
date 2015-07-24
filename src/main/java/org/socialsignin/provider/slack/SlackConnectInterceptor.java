package org.socialsignin.provider.slack;

import org.socialsignin.springsocial.security.signin.SpringSocialSecurityConnectInterceptor;
import org.springframework.social.slack.api.Slack;
import org.springframework.stereotype.Component;

@Component
public class SlackConnectInterceptor extends
		SpringSocialSecurityConnectInterceptor<Slack> {

}
