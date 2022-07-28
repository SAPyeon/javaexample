package inheritance;
//생성자는 기본적으로 상속을 받을 수 없음
//따라서 super()를 사용
//부모클래스 Point2D에 자식클래스 Point3D가 상속받음
public class Point3D extends Point2D {
   int z;//z선언(Point3D의 변수임)
   Point3D(){
      this(10,20,30); //매개변수 3개가 있는 생성자 Point3D를 불러와서 값을 입력
   }
   Point3D(int x, int y, int z){ // 기본적으로 생성자는 상속 불가능
   //super(); : ()안에 없을 시 기본생성자를 상속받음
      super(x,y); //부모클래스의 생성자(매개변수를 작성해야함)
      this.z = z; //super뒤에 새로 선언가능, 생성자부터 상속 받아야 함
   }
   //오버라이딩
   String getLocation() {
      return "x : " + x + " y : " + y + " z : " + z;
   }
}