package hw4;


public class Mines extends Location {

	int mine_number;
	double distance;
	int interest;
	public int getInterest() {
		return this.interest;
	}
	
	
	
	String mine_name;
	      Mines(int x,int y,int m){
	    	  super(x,y);
	    	  this.mine_number = m;
	    	  this.distance =Math.sqrt(x*x+y*y);
	      switch (mine_number) {
	      case 1:
	    	  this.mine_name = "silver";
	    	  this.interest = 1;
	    	  break;
	      case 2:
	    	  this.mine_name= "gold";
	    	  this.interest = 2;
	    	  break;
	      case 3:
	    	  this.mine_name= "diamond";
	    	  this.interest = 3;
	    	  break;
	      }
	     

}
}

