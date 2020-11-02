package servicesManager;
import java.util.Date;

public class Revision {
	
	public String serviceName;
	public Date date;
	public boolean isCancelled;
	
	public Revision(String serviceName, Date date) {
		this.serviceName = serviceName;
		this.date = date;
		this.isCancelled = false;
	}
	
	public void cancel() {
		this.isCancelled = true;
	}
	//SimpleDateFormat textDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	//this.birthDate = textDateFormat.parse(birthDate);
}
