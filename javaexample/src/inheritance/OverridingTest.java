package inheritance;

public class OverridingTest {
   public static void main(String[] args) {
// TODO Auto-generated method stub
      OverridingChild ad = new OverridingChild();
      ad.x = 10;//부모클래스 Overriding의 변수 x
      ad.y = 20;//부모클래스 Overriding의 변수 y
      ad.z = 30;//자식클래스 OverridingChile의 변수 z
      System.out.println(ad.add());//60 : 오버라이딩으로 x+y+z가 됨
   }
}