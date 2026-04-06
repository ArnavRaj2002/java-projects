package nit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="nit")
@PropertySource(value = "nit/sbeans/vechile.properties")
public class AppConfig {

}
