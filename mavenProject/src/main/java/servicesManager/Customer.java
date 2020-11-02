package servicesManager;
import java.util.*;

public class Customer {
	
	public String name;
	private String phone;
	private String address;
	private String document;
	private List<Car> carList = new ArrayList<Car>();
	
	public Customer(String name, String phone, String address, String document) {
		this.name = name;
		this.setPhone(phone);
		this.address = address;
		this.document = document;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocument() {
		return document;
	}
	
	public void addCar(Car newCar) {
		this.carList.add(newCar);
	}
	
}
