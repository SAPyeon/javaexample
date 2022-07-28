package polymorphism;
//제품을 사는 사람 객체
public class Buyer {
   //소유금
   int money = 1000;
   //item이라는 Product타입의 배열을 선언
   Product[] item = new Product[5];
   int i = 0; // item의 인덱스 값을 i변수에 저장
   //제품을 사는 기능
   void buy(Product p) { 
   //내가 가진 금액 = 내가 가진 금액-제품가격
   //소유금액 = 소유금액(money) - 제품가격(price)
   money -= p.price;
   //각 Product에 상속받은 클래스들의 메서드를 불러옴
   System.out.println(p.toString()+"을/를 구입하셨습니다.");
   System.out.println("가격은"+p.price+"입니다.");
   //배열에 Product타입의 변수 p에다 새로운 주소가 생성될 때마다 각각 저장
   item[i++] = p;
   }
}
