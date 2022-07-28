package accessmodifier;
public class Account {
   // 속성
   // Account 클래스에서만 접근할 수 있는 인스턴스 변수
   private int balance = 1000; // 잔고 변수 선언
   // 상수 선언 : 선언과 초기화를 반드시 같이 해야함
   final int MIN_BALANCE = 0; // 최소값 변수
   final int MAX_BALANCE = 1000000; // 최대값 변수
   //기본생성자, 기본balance값을 1000으로 줌
   Account(){
      this(1000);
   }
   Account(int balance) {
      setBalance(balance); //setBalance메서드를 호출
   }
   public int getBalance() {
      return balance;
   }
   public void setBalance(int balance) {
      if (balance >= 0 && balance < 1000000) {
        this.balance = balance;
      }
   }
}
