package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for문을 이용하여 1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보자.﻿
		int sum = 0;
		for(int i=1;i<101;i++) {
			if(i%3==0) { //3의 배수는 3을 0으로 나눴을 때 나머지가 0임
				sum+=i; //sum = sum+i
			}//if문 끝
			}//for문 끝
		System.out.println(sum); //1683
	
		//2. while문과 Math.random()메소드를 이용
	  
		int fst = 0; // fst선언, 만약 while문 안에다 선언 할 시 while문 밖에서 fst는 변수로서 출력이 불가능하다.
		int sec = 0; // sec선언, 만약 while문 안에다 선언 할 시 while문 밖에서 sec는 변수로서 출력이 불가능하다.
		while(true) {
			//범위안에 랜덤 숫자(정수) 만들기 = (int)(Math.random()*(최대값-최소값+1)+최소값)
			//Math.random()은 0에서 1미만의 수를 랜덤으로 발생시킴
			//int로 강제형변환인(실수를 정수로,double->int) 경우 변환시킬 계산식 전체를 괄호로 묶어줌
			fst = (int)(Math.random()*6)+1; //1~6까지 랜덤 정수구하여 fst에 저장
			sec = (int)(Math.random()*6)+1; //1~6까지 랜덤 정수구하여 sec에 저장
			if(fst+sec==5) { //fst+sec가 5이면
				System.out.printf("(%d,%d)\n",fst,sec); //(fst,sec) 로 표시하여 출력하라, %d는 숫자를 의미 \n은 줄바꿈문자
				break; //반복문을 멈춰라
			}
			System.out.printf("(%d,%d)\n",fst,sec); // 아니면 계속 (fst,sec)로 출력
		}
		
		//3. 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		/*int money = 37210; //금액을 저장하는 변수 선언 및 초기화
		int man = 10000; //만원
		int ocheon = 5000; //오천원
		int cheon = 1000; //천원
		int obaek = 500; //오백원
		int baek = 100; //100원
		int sip = 10; //십원

		int i = money/man; //금액을 만원으로 표시할 수 있는 장수를 계산
		int j = money%man/ocheon; //금액을 만원으로 표시하고 남은 수를 오천원으로 나누어 장수를 계산
		int k = money%man%ocheon/cheon; //금액을 만원,오천원으로 표시하고 남은 수를 천원으로 나누어 장수를 계산
		int l = money%man%ocheon%cheon/obaek; //금액을 만원,오천원,천원으로 표시하고 남은 수를 오백원으로 나누어 장수를 계산
		int m = money%man%ocheon%cheon%obaek/baek; //금액을 만원,오천원,천원,오백원으로 표시하고 남은 수를 백원으로 나누어 장수를 계산
		int n = money%man%ocheon%cheon%obaek%baek/sip; //금액을 만원,오천원,천원,오백원,백원으로 표시하고 남은 수를 십원으로 나누어 장수를 계산

		System.out.println(i);//3
		System.out.println(j);//1
		System.out.println(k);//2
		System.out.println(l);//0
		System.out.println(m);//2
		System.out.println(n);//1
*/	
		//거스름돈 반복문,배열 이용
		/*int money = 3720;
		int[] chg = {10000,5000,1000,500,100,10}; //화폐단위가 있는 배열을 저장
		for(int i=0;i<chg.length;i++) { //배열의 잔돈을 반복적으로 계산
			if(i>=3) { //만약 3이상(500원 부터 동전들) 이면
				System.out.println(chg[i]+"권"+money/chg[i]+"개" ); // "...권 ...개"로 표시
			}else { //아닐경우
				System.out.println(chg[i]+"권"+money/chg[i]+"장" ); // "....권...장"으로 표시
			}//조건문문 끝
			money%=chg[i];// 반복할 때마다 화폐단위로 나눈 금액의 잔돈계산
			}
*/		
		
		//4.약수구하기
		
		//list사용
/*		int x = 36; //약수를 구하고자 하는 숫자를 저장
		Scanner sc = new Scanner(System.in); //콘솔에 입력할 수 있게 만드는 scanner사용
		System.out.print("약수를 구하고 싶은 수>"); //콘솔에 "약수를 구하고 싶은 수>"를 출력하여 옆에 입력하도록 함
		x = sc.nextInt(); //입력값을 x에 저장
		ArrayList list = new ArrayList(); //새로운 리스트 변수list생성
		for(int i = 1; i<=x; i++) { //1부터 입력값까지 반복
		   if((x%i)==0){ // 약수는 나머지가 0인 수, 만약 약수라면
		      list.add(i); // list에 그 값을 저장하라
		   }//if문 끝
		}//for문 끝
		System.out.println(list.toString()); // list의 값을 모두 출력
		System.out.println("약수의 개수는"+list.size()+"개 입니다."); // "약수의 개수는 (list의 값의 갯수) 개 입니다." 를 출력
*/		
		//list사용 x
/*		int x = 36; //약수를 구하고자 하는 숫자를 저장
		int cnt = 0; //약수의 갯수를 구하고자 하는 숫자를 저장
		Scanner sc = new Scanner(System.in); //콘솔에 입력할 수 있게 만드는 scanner사용
		System.out.print("약수를 구하고 싶은 수>"); //콘솔에 "약수를 구하고 싶은 수>"를 출력하여 옆에 입력하도록 함
		x = sc.nextInt(); //입력값을 x에 저장
		System.out.print("{");
		for(int i = 1; i<=x; i++) { //1부터 입력값까지 반복
		   if((x%i)==0){ // 약수는 나머지가 0인 수, 만약 약수라면
		      if(x==i) {
		         System.out.print(i+"");
		      }else {
		         System.out.print(i+",");
		      }//if문 안 if문 끝
		      cnt++;
		   }//if문 끝
		}//for문 끝
		System.out.println("}");
		System.out.println("약수의 개수는 "+cnt+"개 입니다.");
*/
		
		//5. 홀수와 짝수의 개수를 구하는 프로그램을 만들어라.
/*		int[] arr = {3,4,5,6,7}; //a라는 배열 생성
		ArrayList odd = new ArrayList(); // odd라는 홀수만 입력하려는 리스트 생성
		ArrayList even = new ArrayList(); //even라는 짝수만 입력하려는 리스트 생성
		for(int i = 0; i<arr.length;i++) { //반복문사용
		   if(arr[i]%(2)==0) { //만약 배열값이 짝수라면
		      even.add(i); //even리스트에 값을 추가
		   }else{ //아니라면(홀수라면)
		      odd.add(i); //odd리스트에 값을 추가
		   }//if문 끝
		}//for문 끝
		System.out.println(Arrays.toString(arr)); //배열값을 나열하여 출력
		System.out.println(" = 홀수"+odd.size()+"개, 짝수"+even.size()+"개");
		// = "홀수 (odd에 입력된 값의 갯수) 개, 짝수(even에 입력된 값의 갯수)개" 를 출력
*/		
		//6.컴퓨터가 생각한 숫자 맞추기
		int com = (int)(Math.random()*100)+1;//1부터 100까지 랜덤숫자(정수)를 com에 저장
		Scanner sc = new Scanner(System.in); //스캐너생성
		int i = 0; //시도횟수를 기록하는 변수 저장
		while(true) { //입력을 계속 할 수 있는 반복문 생성
		   System.out.print("1과 100 사이의 값을 입력하세요"); // 출력
		   int user = sc.nextInt(); //콘솔에 입력한 값을 user에 저장
		   if(com==user) { // 만약 com과 user(입력값)이 같다면
		      System.out.println("맞췄습니다."); //맞췄습니다 출력
		      System.out.println("시도횟수는"+(i+1)+"번 입니다."); //반복횟수와 함께 출력
		      break; //반복문을 멈춰라
		   }else if(com<user) { // 만약 com 값보다 user값이 크다면
		      System.out.println("더 작은 수를 입력하세요."); //더 작은수를 입력하세요 출력
		   }else { //만약 com값보다 user값이 작다면
		      System.out.println("더 큰 수를 입력하세요."); // 더 큰 수를 입력하세요 출력
		   }//조건문 끝
		   i++; //반복할 때마다 횟수가 증가함
		}//while문 끝

	
	
	}}
