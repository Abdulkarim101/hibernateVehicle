package com.vehicle.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hibernate.vehicle.entity.VehicleEntity;

@Repository
public class VehicleRepository {

	private SessionFactory sessionFactory;

	public void save(VehicleEntity vehicle) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
