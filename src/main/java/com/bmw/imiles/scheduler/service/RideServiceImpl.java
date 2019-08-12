package com.bmw.imiles.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RideServiceImpl implements RideService{
	
	private static Integer API_COUNTER = 1;
	
	@Autowired
    RestTemplate restTemplate;
 
	@Value("${scheduler.ride.service.url}") String url;

	@Override
	public void callToRideDataCompliance() {
		System.out.println( "call ....." + API_COUNTER );
        String result = restTemplate.getForObject(url + String.valueOf(API_COUNTER ++), String.class);
        System.out.println("Response " +   result);
		
	}

}
