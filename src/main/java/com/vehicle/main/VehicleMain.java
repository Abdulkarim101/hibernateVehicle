package com.vehicle.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.vehicle.entity.VehicleEntity;
import com.vehicle.repository.VehicleRepository;

public class VehicleMain {

	
	public static void main(String[] args) {
		

		ApplicationContext act = new ClassPathXmlApplicationContext("hiberVehicle.xml");
		VehicleRepository vr = (VehicleRepository) act.getBean("vehicleRepository");
		
		VehicleEntity ve = new VehicleEntity();
		ve.setMake("Toyota");
		ve.setModle("Prius");
		ve.setColor("Gray");
		ve.setLicanse("IED49877859");
		ve.setVyear("2010");
		ve.setVclass("4 door");
		ve.setVinNo("VIN33449879709");
		
		vr.save(ve);
		
		

	}

}
