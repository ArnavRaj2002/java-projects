package com.nit.sbeans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;
@Component("office")

@Setter
// @Setter → lets Spring Boot inject values from prop files into fields via setters.
@ToString
//@ToString → makes debugging/logging easier by printing bean values.

@ConfigurationProperties(prefix ="office.info")
public class OfficeBuilding 
{
private String systemName;
private String version;
private boolean emergencyMode;
private int maxEmployees;
private List<String> supportedDevices;
private Map<String, Double> defaultTemperature;
private SecuritySettings ss;
}
