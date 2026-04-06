package com.nit.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
@Configuration
@Data
@ConfigurationProperties(prefix = "app.ds")
public class DataSourceConfig 
{
private String driver;
private String url;
private String username;
private String password;
}
