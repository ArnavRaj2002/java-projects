package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

 
import com.nit.sbeans.Shipment;

public class DependencyInjection {

	public static void main(String[] args) {
		 FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject3a\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
//		 System.out.println("====================Order Details ===========================");
//		 Order order = ctx.getBean("ord",Order.class);
		 Shipment shipment = ctx.getBean("ship",Shipment.class);
		 //System.out.println(order);
		 System.out.println("=================Shipment Details======================");

		 System.out.println(shipment);
          ctx.close();
	}

}
