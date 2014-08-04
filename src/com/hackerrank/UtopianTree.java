package com.hackerrank;
import java.util.Scanner;

public class UtopianTree{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		if(isInRange(1,10,testCases)){
			while(testCases-- > 0){
				int cycle = scan.nextInt();
				if(isInRange(0,60,cycle)){
					int tLenght = 1;
					for(int i=1;i<=cycle;i++){
						if(i%2==0){
							tLenght+=1;
						}else{
							tLenght*=2;
						}
					}
					System.out.println(tLenght);
				}else{
					System.out.println("Cycle value should be from 0 to 60");
				}
			}
		}else{
			System.out.println("Test Cases should be from 1 to 10");
		}
		scan.close();
	}
	private static boolean isInRange(int min,int max,int val){
		return (val >= min && val <=max);
	}
}