package Interface;

public class Cat implements Animal {
   //인터페이스 메소드 불러옴, 이때 인터페이스와 같은 리턴타입이어야 함
   public void cry() {
      //고양이가 운다
      System.out.println("야옹야옹!~");
   }
}
