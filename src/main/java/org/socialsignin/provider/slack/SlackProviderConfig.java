package org.socialsignin.provider.slack;

import org.socialsignin.provider.AbstractProviderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.web.ConnectInterceptor;
import org.springframework.social.slack.api.Slack;

@Configuration
public class SlackProviderConfig extends AbstractProviderConfig<Slack> {
	
	
	@Autowired
	private ConnectInterceptor<Slack> slackConnectInterceptor;
	
	@Override
	protected ConnectInterceptor<Slack> getConnectInterceptor() {
		return slackConnectInterceptor;
	}
	

}
