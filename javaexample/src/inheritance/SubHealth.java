package inheritance;
//부모클래스 Health에서 자식클래스SubHealth로 상속
public class SubHealth extends Health {
   // 속성
   double s_weight; // 자식클래스 표준체중값을 갖는 s_weight변수 선언, 인스턴스변수
   double fat; // 자식클래스 비만도 값을 갖는 fat변수 선언, 인스턴스 변수
   String result;// 자식클래스 비만결과값을 갖는 result변수 선언, 인스턴스 변수
   // 기본생성자
   SubHealth() {
      // super(); //Health 기본생성자가 입력되어 있기 때문에 super()를 직접 입력하지 않아도 기본적으로 들어가있음
      s_weight = 0.0;// 아무것도 입력 안할 시 기본 표준체중값
      fat = 0.0; // 아무것도 입력 안할 시 기본 비만도 값
      result = null;// 아무것도 입력 안할 시 기본 결과 값
   }
   // 3개의 매개변수를 가지는 생성자
   SubHealth(char gender, double tall, double weight) {
      super(gender, tall, weight); // Health생성자에 있는 매개변수를 불러옴 super.gender = gender;와 같은 의미
   }
   // 표준체중, 비만도 계산하는 메소드
   void calculate() {
      //성별에 따른 표준체중계산
      if (gender == 'M') { // 성별이 "M"이면 (char값은 String과 다르게 equals를 안하고 == 사용, char값은 ''(""은 사용 불가))
      s_weight = (tall - 100) * 0.9; // 표준체중 계산
      } else if (gender == 'F') { // 성별이 "W"이면 (char값은 String과 다르게 equals를 안하고 == 사용, char값은 ''(""은 사용 불가))
    	  s_weight = (tall - 100) * 0.85; // 표준체중 계산
      }
      // 비만도계산
      fat = (weight / s_weight) * 100;
      // 비만도에 따른 결과값을 나타내는 조건문
      if (fat <= 90) {
    	  result = "저체중";
      } else if (fat <= 110) {
    	  result = "정상(표준체중)";
      } else if (fat <= 120) {
    	  result = "과체중";
      } else if (fat <= 130) {
    	  result = "경도비만";
      } else if (fat <= 150) {
    	  result = "중도비만";
      } else if (fat > 150) {
    	  result = "고도비만";
      }
   }

// 출력, 부모클래스에 대한 오버라이딩
   void output1() {
      calculate(); // output1호출시 calculate메서드 자동 호출
      System.out.println("성별 - " + gender);
      System.out.println("신장 - " + tall + "Cm");
      System.out.println("체중 - " + weight + "Kg");
      System.out.println("당신은 비만도 " + Math.round(fat * 100) / 100d + "이고, " + result + " 입니다.");
   }
}
