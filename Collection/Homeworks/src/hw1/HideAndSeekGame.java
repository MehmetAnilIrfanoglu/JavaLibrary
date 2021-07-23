package hw1;



public class HideAndSeekGame {
	public static void main(String[] args) {
		
		Person mother = new Person("Mother",0);
		Person father = new Person("Father",100);
		Person daughter = new Person("Daughter",100);
		System.out.println("Game Started at 18:00");

		while (daughter.get_Crying() < 3  && father.get_Energy() > 0 ) {
			
		mother.hiding();
		daughter.hiding();

			if (daughter.get_Room_Number() < mother.get_Room_Number()) {
				for (int i = 1; i <= (daughter.get_Room_Number() - 1) * 5 + daughter.get_Box_Number(); i++) {
					father.set_Energy(1);
					father.set_Time();

					if (father.get_Energy() < 0) {
						break;
					}
				}
			} else if (daughter.get_Room_Number() == mother.get_Room_Number()) {
				for (int j = 1; j < daughter.get_Room_Number(); j++) {
					for (int i = 1; i <= 5; i++) {
						father.set_Energy(1);

						father.set_Time();

						if (father.get_Energy() < 0) {
							break;
						}
					}
				}
				for (int i = 1; i <= daughter.get_Box_Number(); i++) {
					father.set_Energy(2);
					father.set_Time();
					if (father.get_Energy() < 0) {
						break;
					}
				}
			} else {
				for (int i = 1; i < mother.get_Room_Number(); i++) {
					for (int l = 1; l <= 5; l++) {
						father.set_Energy(1);

						father.set_Time();

						if (father.get_Energy() < 0) {
							break;
						}
					}
				}
				for (int i = mother.get_Room_Number(); i < daughter.get_Room_Number(); i++) {
					for (int l = 1; l <= 5; l++) {
						father.set_Energy(2);
						father.set_Time();
						;
						if (father.get_Energy() < 0) {
							break;
						}
					}
				}
				for (int i = 1; i <= daughter.get_Box_Number(); i++) {
					father.set_Energy(2);
					father.set_Time();

					if (father.get_Energy() < 0) {
						break;
					}
				}
			}

			if (father.get_Energy() >= 0) {
				System.out.println("Mother at room " + mother.get_Room_Number());
				System.out.println("Daughter at room " + daughter.get_Room_Number());
				System.out.println("Daughter is hiding in the box " + daughter.get_Box_Number());
				daughter.crying(mother.get_Room_Number(), daughter.get_Room_Number());
			} else {
				break;
			}
		}

		if (daughter.get_Crying() == 3) {
			System.out.println("Daughter starts crying please stop the game");
			System.out.println("Father's left energy is " + father.get_Energy());
		} else {
			System.out.println("Father is out of energy");
		}
		System.out.printf("Father and Daughter played %d minute(s) hide and seek", father.get_Time());
	}
}
