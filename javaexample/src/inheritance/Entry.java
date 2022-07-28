package inheritance;
//부모클래스 Entry
public class Entry {
   //속성
   String word; //약어를 받는 변수 Word , 인스턴스변수임
   //기본생성자, 뒤의 매개변수를 받는 생성자때문에 입력해야 나중에 호출 가능
   Entry() {
   }
   //매개변수 w를 갖는 생성자
   Entry(String w){
      word = w; //생성자 밖, 클래스 안 인스턴스 변수word에 매개변수 w값을 넣음
   }
   //약어를 출력하는 메소드 , 매개변수가 없고 리턴값이 없는 인스턴스 메소드임
   public void printView() {
      System.out.println("*****약어 사전*****");
      System.out.println("약어 :"+ word);
   }
}
