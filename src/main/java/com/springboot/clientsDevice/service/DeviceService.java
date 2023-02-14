package com.springboot.clientsDevice.service;

import com.springboot.clientsDevice.entity.Device;

public interface DeviceService{
	Device saveDevice(Device employee);
	Device getDevicebyId(long id);
}
