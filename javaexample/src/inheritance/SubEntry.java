package inheritance;
//부모클래스 Entry를 자식클래스 SubEntry에 상속
public class SubEntry extends Entry {
   //속성
   String definition; //원어를 갖는 변수 definition
   int year; //시기를 갖는 변수 year
   //매개변수 w를 갖는 생성자 SubEntry
   SubEntry(String w){
   //super() : 기본 생성자함수를 부모클래스에서 입력해 주었기 때문에 보이지 않아도 자동으로 super()가 만들어져 있음
      super(w);
   //word = w; // 부모클래스에 있는 word변수를 가져오기 위해 super사용, 
   //이후 매개변수 w값을 부모클래스 변수 word에 입력
   }
   //세개의 매개변수를 갖는 생성자
   SubEntry(String w, String d, int y){
      super(w); //부모생성자에 있는 변수 w를 가져오기 위해 super()사용
      definition = d; //매개변수 d값은 클래스안에 있는 인스턴스 변수 definition에 입력
      year = y; //매개변수 y값은 클래스안에 있는 인스턴스 변수 year에 입력
   }
   //약어, 원어, 시기를 출력하는 메소드 / 부모클래스에 있는 메소드 오버라이딩
   //매개변수가 없고 리턴값이 없는 메소드
   public void printView() {
      System.out.println("*****약어 사전*****");
      System.out.println("약어 :"+word);
      System.out.println("원어 :"+definition);
      System.out.println("시기 :"+year+"년");
   }
}
