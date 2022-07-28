package loop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int in = 0;
		int out = 0;
		while(a!=4) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			a = sc.nextInt();
			if(a == 1) {
				System.out.print("예금액>");
				b = sc.nextInt();
				in +=b;
			}else if(a==2) {
				System.out.print("출금액>");
				c = sc.nextInt();
				out += c;
			}else if(a==3) {
				System.out.println("잔고 :"+(in-out));
			}
		}System.out.println("프로그램 종료");
		sc.close();

	}

}
