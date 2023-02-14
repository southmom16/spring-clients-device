package com.springboot.clientsDevice.service.impl;


import com.springboot.clientsDevice.entity.Device;
import com.springboot.clientsDevice.repository.DeviceRepository;
import com.springboot.clientsDevice.service.DeviceService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService {

	private DeviceRepository deviceRepository;

	public DeviceServiceImpl(DeviceRepository deviceRepository) {
		super();
		this.deviceRepository = deviceRepository;
	}

	@Override
	public Device saveDevice(Device device) {
		return  deviceRepository.save(device);
	}

	@Override
	public Device getDevicebyId(long id) {
		// TODO Auto-generated method stub
		deviceRepository.updateDeviceUsingQueryAnnotation("active", id);
		Optional<Device> optional = deviceRepository.findById(id);
		Device device = optional.get();
		return device;
	}

}
