//Name: Ruth Elliott;
//ID: 1700229;

public class Teachers {
	private String teachername;
	private String classroom;
	private int NumofStudents;
	
	public Teachers(){
		teachername = "";
		classroom = "";
		NumofStudents = 0;
	}
	
	public Teachers(String tn, String cr, int studs){
		teachername = tn;
		classroom = cr;
		NumofStudents = studs;
	}
	
	public String getteachername(){
		return teachername;
	}
	
	public String getclassroom(){
		return classroom ;
	}
	
	public int getNumofStudents(){
		return NumofStudents;
	}
	
	public void setteachername(String tr){
		teachername = tr;
	}
	
	public void setclassroom(String cr){
		classroom = cr;
	}
	
	public void setNumofStudents(int studs){
		NumofStudents = studs;
	}
	@Override
	public String toString() {
		return "Teachers [teachername=" + teachername + ", classroom="
				+ classroom + ", NumofStudents=" + NumofStudents + "]";
	}
	
	

}
