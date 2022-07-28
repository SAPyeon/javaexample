package inheritance;
//메인메소드
import java.util.Scanner;
public class HealthTest {
   public static void main(String[] args) {
   // TODO Auto-generated method stub
   //메인메소드
      Scanner sc = new Scanner(System.in); //스캐너, 반드시 import 해줌
      char gender; //스캐너를 입력받기 위한 gender변수
      double tall; //스캐너를 입력받기 위한 tall변수
      double weight;//스캐너를 입력받기 위한 weight변수
   //출력문
      System.out.println("***** 비만도 *****");
      System.out.print("성별(M/F) : ");
      gender = sc.next().charAt(0); //gender변수에 첫번째 입력값을 넣음, SubHealth의 gender값
      //char값은 스캐너 입력값에 없음, 따라서 스트링타입의 next()에서 charAt(0)으로 첫번째 값을 가져옴
      System.out.print("신장(Cm) : " );
      tall = sc.nextDouble();//tall변수에 첫번째 입력값을 넣음, SubHealth의 tall값
      System.out.print("체중(Kg) : " );
      weight = sc.nextDouble();//weight변수에 첫번째 입력값을 넣음, SubHealth의 weight값
      //SubHealth클래스의 주소 h 호출
      SubHealth h = new SubHealth(Character.toUpperCase(gender),tall,weight); 
      //스캐너입력값:((대문자로변경)성별 , 신장, 체중값)
      //SubHealth h = new SubHealth('M', 175.3, 95.45);
      h.output1(); //SubHealth의 output1 출력
}}
