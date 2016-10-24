package fcu.iecs.oop.tiida;

public class NissanTiida {
	int time=1;
	public void tiida(){
		for(int i=0;i<time;i++){
			for(int j=0;j<time;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		time++;
	}
}