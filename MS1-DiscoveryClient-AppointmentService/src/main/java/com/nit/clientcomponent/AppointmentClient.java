package com.nit.clientcomponent;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AppointmentClient 
{
	@Autowired
	private DiscoveryClient client;
	public String getDoctorInfo(Integer id)
	{                                                            
		List<ServiceInstance> instances = client.getInstances("MS1-DiscoveryClient-DoctorService");
        if (instances == null || instances.isEmpty()) {
            throw new RuntimeException("Doctor Service not available");
        }
		ServiceInstance serviceInstance = instances.get(0);
		URI uri = serviceInstance.getUri();
	    String url=uri+"/doctor/display/{id1}"; //in docyor cont is is taken,and in this method param id
	    //String url=uri+"/doctor/display/"+id;
	    RestTemplate restTemplate=new RestTemplate();
	    String resp= restTemplate.getForObject(url,String.class,id); //id here pass [String.class depnd on RT]
	    //String resp= restTemplate.getForObject(url,String.class); //i want DoctorDTO RT
	                                                                                      
 		return resp;
		
	}
	
 
}
