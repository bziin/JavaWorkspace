package chap_04;

//제어문
public class _01_If {
    public static void main(String[] args) {
        // 조건문 if

       // if 문 내에서 하나의 문장을 실행할 때는 {} 생략 가능
       // 2개 이상의 문장을 실행할 때는 {} 생략 불가
        int hour = 15; //오후 3 시

        if(hour < 14 )
            System.out.println("아이스아메리카노 +1");

        if (hour < 14 ) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이전, 모닝커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; //모닝커피
        //if(hour < 14 && morningCoffee ==false) {
        if(hour < 14 && !morningCoffee) {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        //오후 2 시 이후이거나 모닝커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        //if(hour >= 14 || morningCoffee== true) {
        if(hour >= 14 || morningCoffee) {
            System.out.println("아이스아메리카노( 디카페인)+1");
        }
        System.out.println("커피 주문 완료");

    }
}
