package nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VechileService {
	
	@Autowired
	@Qualifier("vtype")
	private Engine engine;
	
	public void type() {
		engine.start();
		engine.stop();
	}

}
