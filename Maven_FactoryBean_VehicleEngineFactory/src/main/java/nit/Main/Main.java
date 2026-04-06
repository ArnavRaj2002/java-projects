package nit.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import nit.cfgs.AppConfig;
import nit.sbeans.VechileService;

public class Main {

	public static void main(String[] args) {
 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
 VechileService service = ctx.getBean(VechileService.class);
 service.type();
	}

}
