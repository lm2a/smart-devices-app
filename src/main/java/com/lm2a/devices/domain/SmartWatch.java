package com.lm2a.devices.domain;


import com.lm2a.devices.domain.pieces.Battery;
import com.lm2a.devices.domain.pieces.CPU;
import com.lm2a.devices.domain.pieces.HealthMonitor;
import com.lm2a.devices.domain.pieces.RAM;

public class SmartWatch extends SmartDevice{

	private HealthMonitor monitor;
	
	public SmartWatch() {}
	
	public SmartWatch(Long id, String name, RAM ram, Battery battery, CPU cpu, Boolean wifi, HealthMonitor monitor) {
		super(id, name, ram, battery, cpu, wifi);
		this.monitor = monitor;
	}

	public HealthMonitor getMonitor() {
		return monitor;
	}

	public void setMonitor(HealthMonitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "SmartWatch [monitor=" + monitor + ", getId()=" + getId() + ", getName()=" + getName() + ", getRam()="
				+ getRam() + ", getBattery()=" + getBattery() + ", getCpu()=" + getCpu() + ", getWifi()=" + getWifi()
				+ "]";
	}

	
	
}
