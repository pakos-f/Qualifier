package com.example.test.SpringBootTests.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("carBean")
public class VehicleServiceCarImpl implements VehicleService {

	@Override
	public String info() {
		return "Car is ok";
	}
}
