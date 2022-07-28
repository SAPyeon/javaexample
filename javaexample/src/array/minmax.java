package array;


public class minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] array = { 79, 88, 91, 33, 100, 55, 95, 60, 72, 57 };


		// 총점

		int sum = 0;

		for (int i = 0; i < array.length; i++) {


			sum += array[i];

		}
		System.out.println("총점:" + sum);

		// 평균

		float avg = 0;

		avg = sum / array.length; // sum은 int이지만 avg는 float, 계산시 float으로 자동형변환

		System.out.println("평균:" + avg);
		
		// 최대값,최소값

		int max = array[0];

		int min = array[0];

		for (int j = 1; j < array.length; j++) {

			if (max < array[j]) {

				max = array[j];

			} else if (min > array[j]) {

				min = array[j];

			}

		}

		System.out.println("최대값:" + max);

		System.out.println("최소값:" + min);

	}

}
