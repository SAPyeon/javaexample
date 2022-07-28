package polymorphism;
//컴퓨터(자식클래스)
public class Computer extends Product {
   Computer(){
   //부모클래스 Product에 있는 생성자를 불러옴, price 값에 200을 넣음
      super(200);
   }
   //toString() 메서드, Computer라는 문자를 반환시킴
   //public String toString() : 문자열을 반환시킬 수 있는 기본메서드
   //선언을 안 해도 기본적으로 가지고 있음, 따라서 오버라이딩
   public String toString() {
      return "Computer";
   }
}
