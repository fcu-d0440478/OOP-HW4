package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		NissanTiida T=new NissanTiida();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int loop=scanner.nextInt();
		for(int i=0;i<loop;i++){
			T.tiida();
		}
		scanner.close();
	}
}
