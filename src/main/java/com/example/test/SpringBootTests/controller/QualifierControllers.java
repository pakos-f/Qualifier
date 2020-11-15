package com.example.test.SpringBootTests.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.SpringBootTests.services.VehicleService;

@RestController
public class QualifierControllers {

	@Autowired
	@Qualifier("carBean")
	VehicleService vehicleCarService;

	@Autowired
	@Qualifier("bikeBean")
	VehicleService vehicleBikeService;

	@GetMapping("/getCarInfo")
	String car (){
		return vehicleCarService.info();
	}
	
	@GetMapping("/getBikeInfo")
	String bike (){
		return vehicleBikeService.info();
	}
}
