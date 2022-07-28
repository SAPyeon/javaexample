package inheritance;
//부모클래스Parent를 자식클래스 Child가 상속받음

public class Child extends Parent{
	// int x = 10; 이 있다고 생각
	int x = 20;
	void method() {
		System.out.println("x=" + x); // 자식클래스 안에 변수x 값(미입력시 상속값) //x=20
		System.out.println("this.x=" + this.x); // 자식클래스 안에 변수x 값(미입력시 상속값)//this.x=20
		System.out.println("super.x=" + super.x); // Parent 안에 변수x 값//super.x=10
	}
}
