package com.example.test.SpringBootTests.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bikeBean")
public class VehicleServiceBikeImpl implements VehicleService {

	@Override
	public String info() {
		return "Bike is ok";
	}
}
