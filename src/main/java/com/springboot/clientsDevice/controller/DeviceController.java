package com.springboot.clientsDevice.controller;

import com.springboot.clientsDevice.entity.Device;
import com.springboot.clientsDevice.service.DeviceService;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {
	private DeviceService deviceService;


	public DeviceController(DeviceService deviceService) {
		super();
		this.deviceService = deviceService;
	}
	// Build create device REST API
	@PostMapping("/register")
	public ResponseEntity<Device> saveDevice(@RequestBody Device device){
		Device deviceInfo = deviceService.saveDevice(device);

		deviceInfo.setStatus("standby");
		deviceInfo.setDateCreated(new Date(System.currentTimeMillis()));

		return new ResponseEntity<Device>(deviceService.saveDevice(deviceInfo), HttpStatus.CREATED);
	}

	// Build get all employees REST API
	@GetMapping("/registered/{id}")
	public ResponseEntity<Device> updateStatusDevice(@PathVariable("id") long id){

		Device deviceInfo = deviceService.getDevicebyId(id);
		deviceInfo.setLastUpdatedAt(new Date(System.currentTimeMillis()));

		return new ResponseEntity<Device>(deviceService.saveDevice(deviceInfo), HttpStatus.OK);
	}

//	@GetMapping("/registered/{id}")
//	public ResponseEntity<Device> get(@PathVariable("id") long id){
//		Device deviceInfo = deviceService.getDevicebyId(id);
//		return ResponseEntity.status(HttpStatus.OK).body(deviceInfo);
//	}


}

