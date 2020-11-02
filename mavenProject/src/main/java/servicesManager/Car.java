package servicesManager;
import java.util.*;


public class Car {
	
	private String licensePlate;
	private String model;
	private short releaseYear;
	private double value;
	
	public Car(String licensePlate, String model, short releaseYear, double value) {
		this.setLicensePlate(licensePlate);
		this.setModel(model);
		this.setReleaseYear(releaseYear);
		this.setValue(value);
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public short getReleaseYear() {
		return releaseYear;
	}
	
	@SuppressWarnings("deprecation")
	public void setReleaseYear(short releaseYear) {
		Date data = new Date();
		if (releaseYear < 1886 || releaseYear > data.getYear() + 1) {
			System.out.println("ERRO: Data de lançamento do carro inválida");
		}
		else {
			this.releaseYear = releaseYear;	
		}
	}
	
}
