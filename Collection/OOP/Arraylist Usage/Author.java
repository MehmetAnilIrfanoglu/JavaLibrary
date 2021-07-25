package lab1;


public class Author {
	private String name;
	private int age;
	
	public Author() {
		
	}
	
    public Author(String nm,int ag) {
    	name=nm;
    	age=ag;
		
	}
    
    public void setName(String nm) {
    	name=nm;
    }
    
    public void setAge(int ag) {
    	age=ag;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }
	

}
