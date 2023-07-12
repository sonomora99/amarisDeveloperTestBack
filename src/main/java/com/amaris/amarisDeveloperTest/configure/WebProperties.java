package com.amaris.amarisDeveloperTest.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebProperties {
	
	@Value("${amaris.api.url}")
	private String amarisApiUrl;

	public String getAmarisApiUrl() {
		return amarisApiUrl;
	}

	public void setAmarisApiUrl(String amarisApiUrl) {
		this.amarisApiUrl = amarisApiUrl;
	}
	
	

}
