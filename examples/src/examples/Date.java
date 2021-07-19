package examples;

public class Date {
	private final int day;
	private final int month;
	private final int year;
	Date(){
		this.day =0;
		this.month =0;
		this.year =0;
	}
    Date(int d,int m,int y){
    	this.day = d;
    	this.month =m;
    	this.year=y;
    	 
    }
    public String toString() {
    	return day+"/"+month+"/"+year;
    }
  
    public static void main(String[] args) {
    	Date d = new Date(24,06,2000);
    	System.out.println(d.toString());
    }
}
