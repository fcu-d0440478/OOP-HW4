package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String password;
		Scanner scanner = new Scanner(System.in);
		PasswordEncorder pw=new PasswordEncorder();
		
		while(true){
			System.out.println("Please enter a password:");
			password=scanner.nextLine();
			if(password.equalsIgnoreCase("EXIT")){
				System.out.println("end...");
				break;
			}
			System.out.println(pw.encode(password));
		}
		scanner.close();
	}
}