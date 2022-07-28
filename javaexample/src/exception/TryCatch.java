package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int) (Math.random() * 100) + 1; //컴퓨터가 입력한 숫자
		//System.out.println(com); //컴퓨터가 입력한 값 알고 싶을 때 사용
		Scanner sc = new Scanner(System.in); //입력을 위해 스캐너 사용
		int i = 0; //입력 시도 횟수 구하는 변수
		int num=0;
		//반복문사용
		while (true) {
		   try { //예외가 없을 경우 나타날 값
		      System.out.print("1과 100 사이의 값을 입력하세요 :"); //출력
		      num = sc.nextInt(); //입력할 값을 나타내는 변수, 입력값을 int타입으로 설정했으므로
		                          //숫자가 아니면 오류가 날 수 있는 부분임
		   } catch (InputMismatchException e) { //입력값이 숫자가 아닌경우 예외처리
		      // TODO: handle exception
		         System.out.println("숫자만 입력할 수 있습니다. 다시 입력해주세요"); //입력
		         sc = new Scanner(System.in); //스캐너값 비워주기, 아니면 계속 반복됨
		         continue; //해당 반복부문 건너뛰기
		   }//catch문 끝
		   i++; //입력할 때마다 횟수가 증가
		   if (num < com) { //만약 입력한 숫자가 컴퓨터가 생각한 숫자보다 작으면
		      System.out.println("더 큰 수를 입력하세요"); //출력
		   } else if (num > com) { //만약 입력한 숫자가 컴퓨터가 생각한 숫자보다 크면
		      System.out.println("더 작은 수를 입력하세요"); //출력
		   } else if (num == com) {//만약 입력한 숫자가 컴퓨터가 생각한 숫자와 같으면
		      System.out.println("정답!!"); //출력
		      System.out.println(i + "번만에 맞추셨습니다."); //시도횟수 출력
		      break; //반복문을 멈춰라
		   }//조건문 끝
		}//반복문 끝﻿
	}

}
