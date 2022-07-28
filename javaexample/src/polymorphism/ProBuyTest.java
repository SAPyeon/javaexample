package polymorphism;

public class ProBuyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //Buyer 클래스 호출
	      Buyer b = new Buyer();
	      //Product p = new Computer(); 과 같은 의미
	      //이걸 매개변수 다형성이라고 부름
	      //하나의 타입으로 다양한 결과를 얻어낼 수 있음
	      b.buy(new Computer()); //Computer을/를 구입하셨습니다. //가격은100입니다.
	      b.buy(new Tv()); //Tv을/를 구입하셨습니다. //가격은100입니다.
	      //buy클래스 변수 money값 출력
	      System.out.println("현재 소유한 금액은"+b.money+"입니다.");
	      //item이라는 배열에 저장되어 있는 값을 출력
	      System.out.println(b.item[0].toString());//Computer
	      System.out.println(b.item[0].price);//200
	      System.out.println(b.item[1].toString());//Tv
	      System.out.println(b.item[1].price);//100


	}

}
