package org.aes.helper;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClient;

public class InternetConnectivityChecker {
	
	private InternetConnectivityChecker() {
	
	}
	
	public static boolean isDriveApiAccessible() {
		try {
			// Attempt to connect to Google Drive API
			RestClient.create("https://www.googleapis.com/drive/v3").method(HttpMethod.GET).retrieve();
			return true;
		} catch (Exception e) {
			// Connection attempt failed, Bad Internet Connection
			return false;
		}
	}
	
}
