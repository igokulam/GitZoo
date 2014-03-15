package com.igokulam.zoo;

public class SandBox extends Base {
	static String myName = "Sandbox";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  
	     SandBox sa = new SandBox(); 
			sa.play();
			
		int[]  myIntArray = new int[3];
	     myIntArray[0] = 10;
	     myIntArray[1] = 20;
	     myIntArray[2] = 30;		
	}
	
	public void play(){
		  log("test");
		  int num = 10;
		  log("square of " + num + " is " +square(num));
	}
	private int square(int aNum){
		int temp = 0;
		temp = aNum*aNum;
		return temp;
	}
}
