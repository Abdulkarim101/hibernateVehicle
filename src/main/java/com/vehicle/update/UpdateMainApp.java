package com.vehicle.update;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.vehicle.entity.VehicleEntity;
import com.vehicle.repository.VehicleRepository;

public class UpdateMainApp {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("hiberVehicle.xml");
		VehicleRepository vr = (VehicleRepository) act.getBean("vehicleRepository");

		System.out.println("Select by id = 4");
		VehicleEntity v1 = vr.getById(4l);

		v1.setMake("BMW");
		v1.setModel("3J");

		vr.update(v1);
	}

}
