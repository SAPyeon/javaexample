package objectarray;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//일반 배열생성
				int[] array = {10,20,30,40,50,60,70,80};
				//배열값 입력
				array[0] = 10;
				array[1] = 20;
				array[2] = 30;
				array[3] = 40;
				array[4] = 50;
				array[5] = 60;
				array[6] = 70;
				array[7] = 80;
				
				//ObjectArray 클래스에 객체타입을 배열로 불러옴
				//타입대신에 사용할 클래스명을 입력하여 사용
				ObjectArray[] objarray = new ObjectArray[7];
				
				//배열값 입력, 입력할 배열 인덱스와 함께 클래스 안에 있는 변수만을 입력하여 배열값에 저장,
		        // 이 때 배열값은 변수와 같은 타입이어야 함
				//배열의 값이 여러개이기 때문에 또다른 주소를 부여하여 그 주소에 입력값이 넣어지게 함
				//타입 대신에 클래스 이름이 들어갔기 때문에 값을 불러올 수 없어서 새로운 주소를 부여해서 
		        //인스턴스 변수를 가져오기 위해 objarray[i]=ObjectArray();을 각각 입력
		        objarray[0] = new ObjectArray();
				objarray[0].name = "정자바";
				objarray[0].score = 100;
				
		        objarray[1] = new ObjectArray();
				objarray[1].name = "최씨";
				objarray[1].score = 88;
				
		        objarray[2] = new ObjectArray();
				objarray[2].name = "이씨샵";
				objarray[2].score = 90;
				
		        objarray[3] = new ObjectArray();
				objarray[3].name = "이자바";
				objarray[3].score = 83;
				
		        objarray[4] = new ObjectArray();
				objarray[4].name = "장씨";
				objarray[4].score = 71;
				
		        objarray[5] = new ObjectArray();
				objarray[5].name = "오씨샵";
				objarray[5].score = 25;
				
		        objarray[6] = new ObjectArray();
				objarray[6].name = "김자바";
				objarray[6].score = 87;
				//배열을 출력하는 문
				for(int i = 0; i<objarray.length; i++) {
					if(objarray[i]==null) { // 빈 배열은 출력하지 않게 함
						break;
					}
					System.out.println(objarray[i].name);
					System.out.println(objarray[i].score);
				}		

	}

}
