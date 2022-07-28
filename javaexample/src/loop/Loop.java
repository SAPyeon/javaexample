package loop;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0; // 선택
		int stu = 0; // 학생수
		int score = 0; // 학생들 점수
		int sum = 0; // 총합, 평균구할때 사용
		int max = 0; // 최대값
		int[] sarr = {}; // 빈 배열 선언, 나중에 배열에 점수값 입력
		while (true) { // 5번을 선택할 시 반복문 종료
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			num = sc.nextInt();
			if (num == 1) { // 1번 선택
				System.out.print("학생수>");
				stu = sc.nextInt();
				sarr = new int[stu]; // 배열 값에 길이를 학생수로 정함
			} else if (num == 2) { // 2번 선택
				for (int i = 0; i < stu; i++) { // 학생수만큼 반복
					System.out.print("학생>");
					score = sc.nextInt(); // 점수값을 입력
					sum += score; // 점수값을 sum에 누적
					sarr[i] = score; // 점수값을 배열에 저장
					// System.out.println(d[i]);
					if (max < sarr[i]) { // 만약 배열 안 i값이 max보다 크면
						max = sarr[i]; // max는 i값을 저장, ==> 결국 max는 최대값이 됨
						// System.out.println(max);
					}
				} // System.out.println(sum);
			} else if (num == 3) { // 3번 선택
				for (int j = 0; j < stu; j++) { // 학생수만큼 반복
					System.out.println("학생>" + sarr[j]); // "학생> 배열값" 출력
				}
			} else if (num == 4) { // 4번 선택
				float avg = (float) (sum / stu); // avg는 합계에 학생수를 나눈 값(평균)
				System.out.println("최고 점수 :" + max); // "최고점수: max" 출력(배열 내 최대값)
				System.out.println("평균 점수 :" + avg); // "평균점수:avg값" 출력(배열 내 값들의 합에서 학생 수 만큼 나눈값)
			} else if (num == 5) { // 5번선택
				System.out.println("프로그램 종료"); // "프로그램종료"출력
				break; // 반복문 종료
			} else { // 나머지 번호 선택
				System.out.println("1~4번 중에 선택하세요"); // 1~4번 중 선택하라는 문구 출력
			}
		} // 반복문 종료

	}

}
