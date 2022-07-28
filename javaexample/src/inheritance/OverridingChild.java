package inheritance;
//Overriding을 상속받음

public class OverridingChild extends Overriding {
	int z;

	// 오버라이딩
	// 조건 1 : 메소드의 이름이 같아야 함
	// 조건 2 : 매개변수가 같아야 함
	// 조건 3 : 리턴타입이 같아야 함
	// 상속받은 메소드 add()을 새롭게 바꿈
	int add() {
		return x + y + z;
	}

}
