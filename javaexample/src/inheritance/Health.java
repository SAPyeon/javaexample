package inheritance;
//부모클래스
public class Health {
   //속성
   char gender; //성별값을 갖는 gender변수 선언, 인스턴스변수
   double tall; //신장값을 갖는 tall변수 선언, 인스턴스 변수
   double weight; //체중값을 갖는 weight변수 선언, 인스턴스 변수
   //기본생성자(매개변수가 없음)
   Health(){
   }
   //매개변수를 세개를 가지고 있는 생성자 , 성별,신장,체중을 입력받음
   Health(char gender, double tall, double weight){
      this.gender = gender; //입력받은 gender는 인스턴스변수gender(메소드 밖 클래스에 선언된 변수)
      this.tall = tall; //입력받은 tall은 인스턴스변수tall(메소드 밖 클래스에 선언된 변수)
      this.weight = weight;//입력받은 weight는 인스턴스변수weight(메소드 밖 클래스에 선언된 변수)
   }
   //결과 출력하는 메소드, 매개변수가 없고 리턴도 없는 인스턴스 메소드
   void output1() {
   System.out.println("성별 - "+gender);
   System.out.println("신장 - " + tall +"Cm");
   System.out.println("체중 - " + weight +"Kg");
   }
}
