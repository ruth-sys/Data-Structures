package mylinkedlist;

public class Appointment {
	private String Name;
	private String HotelRoom;
	private String Service;
	
	public Appointment() {
		Name = "";
		HotelRoom ="";
		Service = "";
	}
	
	public Appointment(String n, String hr, String s) {
		Name = n;
		HotelRoom = hr;
		Service = s;
	} 

	public Appointment(Appointment appoint) {
		Name = appoint.Name;
		HotelRoom = appoint.HotelRoom;
		Service = appoint.Service;
	}
	
	public void setName(String n) {
		Name = n;
	}
	
	public void setHotelRoom(String hr) {
		HotelRoom = hr;
	}
	
	public void setService(String s) {
		Service = s;
	}
	
	public String getName() {
		return Name;
		
	}
	
	public String getHotelRoom() {
		return HotelRoom;
	}

	public String getService() {
		return Service;
	}

	@Override
	public String toString() {
		return "Appointment [Name=" + Name + ", HotelRoom=" + HotelRoom + ", Service=" + Service + "]";
	}
	
	
}
