package com.xworkz.markerInterface;

public class Mobile implements Cloneable {
	private String Brand;
	private String version;
	private int storage;
	private int noOfCamera;
	private String size;
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getNoOfCamera() {
		return noOfCamera;
	}
	public void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	

}
