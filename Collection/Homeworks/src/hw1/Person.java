package hw1;



import java.util.Random;

public class Person {
	
	@SuppressWarnings("unused")
	private String Name;
	private int Energy;
	private int box_Number;
	private int room_Number;
	private int Time = 0;
	private int cry_number = 0;

	Random rand = new Random();

	public Person(String name,int energy) {
		this.Name = name;
		this.Energy = energy;
	}

	public int crying(int mother, int daughter) {

		if (mother <= daughter) {
			cry_number++;
			System.out.println("Mother gave the infant to Father");
		}

		return cry_number;
	}

	public void set_Energy(int energy) {
		this.Energy -= energy;
	}
	
	public int get_Energy() {
		return Energy;
	}

	public void set_Time() {
		this.Time++;
	}
	
	public int get_Time() {
		return Time;
	}

	public int get_Box_Number() {
		return box_Number;
	}

	public int get_Room_Number() {
		return room_Number;
	}

	public int get_Crying() {
		return cry_number;
	}

	public void hiding() {
		this.room_Number= rand.nextInt(5)+1;
		this.box_Number= rand.nextInt(5)+1;
	}

	

}
