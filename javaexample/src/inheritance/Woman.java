package inheritance;
//자식클래스
public class Woman extends People {
   //오버라이딩
   void printInfo() {
      super.printInfo(); //부모클래스에서 메소드를 호출
      System.out.println("나는 여자입니다.");
   }
   void makeup() {
      System.out.println("메이크업");
   }
}
