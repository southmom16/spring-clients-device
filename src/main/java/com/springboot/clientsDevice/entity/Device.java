package com.springboot.clientsDevice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name="devices")
public class Device {

	public Device() {
	}
	public Device(long id, String msisdn, String imei, String deviceId, String mac, String latitude, String longitude, String status, Date dateCreated, Date lastUpdatedAt) {
		this.id = id;
		this.msisdn = msisdn;
		this.imei = imei;
		this.deviceId = deviceId;
		this.mac = mac;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
		this.dateCreated = dateCreated;
		this.lastUpdatedAt = lastUpdatedAt;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	//mobile station integrated services digital network
	@Column(name = "msisdn")
	private String msisdn;

	//international mobile station equipment identity
	@Column(name = "imei")
	private String imei;

	@Column(name = "deviceId")
	private String deviceId;

	// media access control address
	@Column(name = "mac")
	private String mac;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	@Column(name = "status")
	private String status;

	@Column(name = "datecreated")
	private Date dateCreated;

	@LastModifiedDate
	@Column(name = "lastupdatedat")
	private Date lastUpdatedAt;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
}

