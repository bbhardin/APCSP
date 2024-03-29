package com.ben.main;

public class Main {

//	volatile static int nCars = 1;
//	volatile static int sCars = 2;
//	volatile static int eCars = 1;
//	volatile static int wCars = 1;
	
//	volatile static long nArrivalTime = 1000000;
//	volatile static long sArrivalTime = 1000000;
//	volatile static long eArrivalTime = 1000000;
//	volatile static long wArrivalTime = 1000000;
//	volatile static long startTime = 0;
	
	public static void main(String[] args) {
		
		volatile int nCars = 1;
		int sCars = 2;
		int eCars = 3;
		int wCars = 4;
		
		long startTime = System.nanoTime();
		long sArrivalTime = System.nanoTime() - startTime;
		long nArrivalTime = System.nanoTime() - startTime;
		long eArrivalTime = System.nanoTime() - startTime;
		long wArrivalTime = System.nanoTime() - startTime;
		System.out.println(nArrivalTime + " " + sArrivalTime + " " + eArrivalTime + " " + wArrivalTime);
		while(nCars != 0 || sCars != 0 || eCars != 0 || wCars != 0){
			if(nArrivalTime < sArrivalTime && nArrivalTime < eArrivalTime && nArrivalTime < sArrivalTime) {
				System.out.println(nCars + " car(s) from the north go.");
				nCars = 0;
				nArrivalTime = 100;
			}
			else if(sArrivalTime < eArrivalTime && sArrivalTime < wArrivalTime) {
				System.out.println(sCars + " car(s) from the south go.");
				sCars = 0;
				nArrivalTime = 100;
			}
			else if(eArrivalTime < wArrivalTime) {
				System.out.println(eCars + " car(s) from the east go.");
				eCars = 0;
				eArrivalTime = 100;
			}
			else if(wArrivalTime != 100) {
				System.out.println(wCars + " car(s) from the west go.");
				wCars = 0;
				wArrivalTime = 100;
			}
			else {
				System.out.println("There are no more cars at the traffic light.");
			}
			
			System.out.println(nCars + " " + sCars + " " + eCars + " " + wCars);
		}
		
	}
	
	public static void run() {
		
			
		
	}
	
}
