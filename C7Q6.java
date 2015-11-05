package c7q6;

import java.util.Scanner;

public class C7Q6 {
	//declare constants
	public static final double INITIALPOP=123.8;
	public static final int STARTYEAR=2014;
	public static final double GROWTHRATE = 0.005;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentPop = INITIALPOP;
		double targetPop = new C7Q6().getTargetPop();

		int i=0;
		for (i=0; currentPop<targetPop; i++){ 
			currentPop*=(1+GROWTHRATE);
		}
		System.out.println(STARTYEAR+i);
	}
	
	double getTargetPop(){

		double targetPop=0;
		boolean validUserInput=false;
		Scanner reader = new Scanner(System.in);
		String userInput="";
		while (validUserInput==false){
			System.out.println("Enter target population");
			userInput=reader.nextLine();
			try {
				targetPop = Double.parseDouble(userInput);
				if (targetPop<INITIALPOP){
					System.out.println("Target population must be over the initial population of " + INITIALPOP + ".");
				} else {
					validUserInput=true;
				}
			} catch (NumberFormatException e){
				System.out.println("Invalid input. Enter a number with a decimal point, no special characters.");
			}
		}
		return targetPop;
	}

}
