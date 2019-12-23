package com.select.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.vehicle.entity.VehicleEntity;
import com.vehicle.repository.VehicleRepository;

public class SelectMainApp {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("hiberVehicle.xml");
		VehicleRepository vr = (VehicleRepository) act.getBean("vehicleRepository");

		System.out.println("Select by id = 2");
		VehicleEntity v1 = vr.getById(2l);

		if (v1 != null) {
			System.out.println(v1.toString());
		}
		System.out.println("Select by make = Toyota");

		
		List<VehicleEntity> vehicle = vr.getByMake("Toyota");

		for (VehicleEntity v : vehicle) {
			System.out.println(v.toString());
		}

	}

}
