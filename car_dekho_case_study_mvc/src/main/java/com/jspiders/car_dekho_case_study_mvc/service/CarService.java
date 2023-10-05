package com.jspiders.car_dekho_case_study_mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.car_dekho_case_study_mvc.pojo.CarPOJO;
import com.jspiders.car_dekho_case_study_mvc.repository.CarRepository;
@Service
public class CarService 
{

	@Autowired CarRepository repository;

	public CarPOJO addCar(String name, String brand, String fueltype, double price) 
	{
		
		CarPOJO pojo = repository.addCar(name, brand, fueltype, price);
		return pojo;
	}

	public CarPOJO searchCar(int id) 
	{
		CarPOJO pojo = repository.searchCar(id);
		return pojo;
	}

	public CarPOJO removeCar(int id) 
	{
		CarPOJO pojo = repository.removeCar(id);
		return pojo;
	}

	public CarPOJO updateCar(int id, String name, String brand, String fueltype, double price)
	{
		CarPOJO pojo = repository.updateCar(id, name, brand, fueltype, price);
		return pojo;
	}
	public List<CarPOJO> findAllCars() 
	{
		List<CarPOJO> cars = repository.findAllCars();
		return cars;
	}

}
