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
		ve.setMake("Merceds Benz");
		ve.setModel("E300");
		ve.setColor("White");
		ve.setLicanse("IED4098798759");
		ve.setVyear("2020");
		ve.setVclass("4 door");
		ve.setVinNo("VIN3943209");
		
		vr.save(ve);
		
		

	}

}
