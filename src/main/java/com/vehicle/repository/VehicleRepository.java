package com.vehicle.repository;

import java.util.List;

import org.hibernate.Query;
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

	public VehicleEntity getById(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		VehicleEntity ve = (VehicleEntity) session.get(VehicleEntity.class, id);
		session.getTransaction().commit();
		session.close();
		return ve;
	}

	public List<VehicleEntity> getByMake(String make) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = (Query) session.createQuery("select ve from VehicleEntity ve where ve.make = :make");
		query.setParameter("make", make);

		List<VehicleEntity> vehicles = query.list();

		session.getTransaction().commit();
		session.close();

		return vehicles;
	}

	public void update(VehicleEntity vehicle) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.merge(vehicle);
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
