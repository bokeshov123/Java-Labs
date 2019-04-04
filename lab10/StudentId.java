import java.util.Date;

public class StudentId{

	private Date startDate;
	private Date endDate;
	private String number;

	public StudentId(String n){
		number = n;
	}
	
	public void setNumber(String newNumber){
		number = newNumber;
	}
	
	public String getNumber(){
		return number;
	}
	
	public void setStartDate(Date newstartD){
		startDate = newstartD;
	}
	
	public Date getStartDate(){
		return startDate;
	}

	public void setEndDate(Date newendD){
		endDate = newendD;
	}
	
	public Date getEndDate(){
		return endDate;
	}

}