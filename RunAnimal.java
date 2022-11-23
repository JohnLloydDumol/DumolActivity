import java.util.Scanner;

public class RunAnimal{
	public static void main(String[] args){
		String choice;
		Dog d = new Dog();
		Bird b = new Bird();
		Cat c = new Cat ();
		
		Scanner num = new Scanner(System.in);
		System.out.println("Press B for Bird, C for Cat, or D for Dog: ");
		choice = num.nextLine();
		
		if (choice.equalsIgnoreCase("B")){
			b.eat();
			b.sleep();
			b.makeSound();
		}
		else if (choice.equalsIgnoreCase("C")){
			c.eat();
			c.sleep();
			c.makeSound();
		}	
		else if (choice.equalsIgnoreCase("D")){
			d.eat();
			d.sleep();
			d.makeSound();
		}
		else 
			System.out.println("Invalid Input!");			
	}

}