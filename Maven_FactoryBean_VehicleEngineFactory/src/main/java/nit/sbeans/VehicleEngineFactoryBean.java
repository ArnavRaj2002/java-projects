package nit.sbeans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("vtype")
public class VehicleEngineFactoryBean implements FactoryBean<Engine>{

	@Value("${vechile.type}")
	private String type;

	@Override
	public Engine getObject() throws Exception {
		if (type.equalsIgnoreCase("electric"))
			return new ElectricEngine();
		else if (type.equalsIgnoreCase("diesel"))
			return new DieselEngine();
		return new HybridEngine();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Engine.class;
	}

}
