package com.nit.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("prototype")
public class CacheService {
	Map<String,String> map=new HashMap<String, String>();

	public void put(String key, String value)
	{
		map.put(key, value);
	}
	public void get(String key)
	{
		String valstring = map.get(key);
		System.out.println("Added to cache: "+key);
		System.out.println("Added to cache: "+valstring);
	}
}
