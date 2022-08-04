package practice;

import java.util.ArrayList;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
		//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
		
		int[] mul = new int[1000];
		
		for(int i = 0; i<1000; i++) {
			mul[i] = i+1;
			//System.out.println(mul[i]);	
		}
		ArrayList<Integer> arr = new ArrayList<>();
		for(int j = 0 ; j<999; j++) {
			if(mul[j]%3==0 || mul[j]%5==0) {
				arr.add(mul[j]);
			}
		}
		int sum = 0;
		for(int i =0; i<arr.size(); i++) {
			sum+=arr.get(i);
			 //System.out.print(arr.get(i) + " "); 
		}
		System.out.println(sum);
		
		
		
		
	}

}
