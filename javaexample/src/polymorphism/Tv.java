package polymorphism;
//티비(자식클래스)
public class Tv extends Product{
   Tv(){
   //부모클래스 Product에 있는 생성자를 불러옴, price 값에 100을 넣음
      super(100);   
   } 
   //toString() 메서드, Tv라는 문자를 반환시킴
   public String toString() {
      return "Tv";
   }
}
