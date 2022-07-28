package array;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] score = new int[3];
		//정적배열(객체배열)
		Student[] stu = new Student[3]; //Student객체 배열에 새로운 주소 stu를 생성
				
		stu[0] = new Student(); //stu의 0번째 값에 student클래스의 새로운 주소를 생성
		stu[0].name = "정자바";
		stu[0].sum = 100;
				
		stu[1] = new Student(); 
		stu[1].name = "홍길동";
		stu[1].sum = 95;
				
		stu[2] = new Student(); 
		stu[2].name = "최씨샵";
		stu[2].sum = 90;
*/		
		//일반적 ArrayList 사용		
		//ArrayList사용 : 길이가 늘었다가 줄었다가 할 수 있다.(동적배열)
/*		ArrayList<Object> list = new ArrayList();
				
		//배열값들을 그냥 순차적으로 입력함
		for(int i = 0; i<stu.length;i++) {
			//list.add(stu[i]);
			list.add(stu[i].name);
			list.add(stu[i].sum);
		}
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i)); //차례대로 나열 1:배열0번의 이름, 2: 배열0번의 점수
		}
*/		//이 경우 순차적으로 나열만 되고 한 묶음으로 나타낼 수 없다.
		//list = ["정자바",100,"홍길동",95,"최씨샵",90]; 총 여섯개의 길이를 갖는 배열완성 
		//객체를 각각 주소를 부여해서 주소에 객체에 있는 변수들을 한 묶음으로 리스트안에 순서대로 입력
		//리스트 als 생성
		ArrayList<Student> als = new ArrayList<>();
				
		//객체 Student에 새로운 주소 부여
		//Student stu = new Student("정자바",100); //매개변수로 name,sum을 갖는 생성자를 만든 경우 사용할 수 있음
		Student stu = new Student();
		stu.name = "정자바";
		stu.sum = 100;
		als.add(stu); //각각 입력한 값들을 합쳐서 첫번째 리스트 값에 넣음
				
		//객체 Student에 새로운 주소 부여
		//stu = new Student("홍길동",95);//매개변수로 name,sum을 갖는 생성자를 만든 경우 사용할 수 있음
		stu = new Student();
		stu.name = "홍길동";
		stu.sum = 95;
		als.add(stu);//각각 입력한 값들을 합쳐서 두번째 리스트 값에 넣음 
				
		//객체 Student에 새로운 주소 부여
		//stu = new Student("최씨샵",90);//매개변수로 name,sum을 갖는 생성자를 만든 경우 사용할 수 있음
		stu = new Student();
		stu.name = "최씨샵";
		stu.sum = 90;
		als.add(stu);//각각 입력한 값들을 합쳐서 세번째 리스트 값에 넣음
				
		for(int i = 0; i<als.size();i++) {
			System.out.println(als.get(i).name); //각 리스트목록에서 순서대로 name항목을 불러옴
			System.out.println(als.get(i).sum); //각 리스트목록에서 순서대로 sum항목을 불러옴
		}

		//이 경우 집합처럼 name과 sum을 한 묶음으로 객체로 들어간다.
		//als = [Student(0x100),Student(0x200),Student(0x300)]; 
		//각각 새로운 주소로 들어가 있으며 새로운 주소에 변수들(name,sum)에  값이 저장되어 있음
		
		
		//HashMap 사용
		HashMap<Integer,Student> map2 = new HashMap<>();
		//Student 객체 새로운 주소를 만듬(0x100)
		Student stu2 = new Student();
		stu2.name = "정자바";
		stu2.sum = 100;		
		map2.put(1, stu2);//map 키(1)에 저장
		//Student 객체 새로운 주소를 만듬(0x200)
		stu2 = new Student();
		stu2.name = "홍길동";
		stu2.sum = 95;
		map2.put(2, stu2);//map 키(2)에 저장
		//Student 객체 새로운 주소를 만듬(0x300)
		stu2 = new Student();
		stu2.name = "최씨샵";
		stu2.sum = 90;
		map2.put(3, stu2);//map 키(3)에 저장
				
		System.out.println(map2.get(1).name);
		System.out.println(map2.get(1).sum);
				
		System.out.println(map2.get(2).name);
		System.out.println(map2.get(2).sum);
				
		System.out.println(map2.get(3).name);
		System.out.println(map2.get(3).sum);
				
		//stu2 = [1:Student(0x100),2:Student(0x200),3:Student(0x300)]; 
		//각 번호는 키값임
		//각각 새로운 주소로 들어가 있으며 새로운 주소에 변수들(name,sum)에  값이 저장되어 있음
				
		//ArrayList가 HashMap보다 데이터 처리속도가 빠르지만 
		//값을 순서 없이 찾거나 수정할 때는 HashMap이 더 용이하다.
		
		
	}

}
