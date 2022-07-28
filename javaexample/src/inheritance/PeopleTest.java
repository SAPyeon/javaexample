package inheritance;

//메인메소드
public class PeopleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 참조형 변수 호출
		/*
		 * Woman w = new Woman(); 
		 * Man m = new Man(); 
		 * w.printInfo(); 
		 * m.printInfo();
		 * People p = new People();
		 */
		// 다형성을 사용한 호출 : 부모클래스를 호출하여 자식클래스를 불러옴
		// 부모클래스에 비해 자식클래스가 크기가 더 작다고 보기 때문에 자동으로 호출가능
		// People참조타입으로 Man클래스와 Woman클래스를 참조할 수 있기 때문에 아래는 다형성
		// People 참조타입 p로 Man클래스 참조
		People p = new Man();
		p.printInfo();
		// enlist()메소드 호출 안됨 = people메소드가 아니고 Man클래스 자체 메소드이기 때문
		// 따라서 각 참조형 타입으로 형변환을 해줘서 Man메소드를 호출해야함
		((Man) p).enlist();
		// People 참조타입 p로 Woman클래스 참조
		p = new Woman();
		p.printInfo();
		// enlist()메소드 호출 안됨 = people메소드가 아니고 Woman클래스 자체 메소드이기 때문
		// 따라서 각 참조형 타입으로 형변환을 해줘서 Man메소드를 호출해야함
		((Woman) p).makeup();
	}
}
