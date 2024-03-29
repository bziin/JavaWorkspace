package chap_07;

public class _Quiz_07 {
    // 햄버거를 자동으로 만드는 프로그램 작성
    // 조건 : 햄버거( 양상추 패티 피클), 치즈버거( 양상추 패티 피클 치즈),
    // 새우버거( 양상추 패티 피클 새우) 3 가지
    // 각 버거는 각각의 클래스로 생성
    // 버거이름을 담기위한 name 변수 정의
    // 재료 정보를 표시하는 cook() 메소드 정의
    // 공통 부분은 상속 및 메소드 오버라이딩으로 처리
    // 모든 클래스는 하나의 파일에 정의

    public static void main(String[] args) {
        Hamburger [] hamBurgers = new Hamburger[3];
        hamBurgers[0] = new Hamburger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("--------------");
        for (Hamburger hamburger : hamBurgers) {
            hamburger.cook();
            System.out.println("--------------");
        }
        System.out.println("메뉴준비가 완료되었습니다.");


    }
}


    class Hamburger {
        public String name;

        public Hamburger() {
            this("햄버거");
        }

        public Hamburger(String name) {
            this.name = name;
        }

        public void cook() {
            System.out.println(this.name + "를 만듭니다.");
            System.out.println("빵 사이에 드어가는 재료는?");
            System.out.println(">양상추");
            System.out.println("+패티");
            System.out.println("+피클");


        }


    }

    class CheeseBurger extends Hamburger {

        public CheeseBurger() {
            super("치즈버거");

        }

        public void cook() {
            super.cook();
            System.out.println("+치즈");


        }

    }

    class ShrimpBurger extends Hamburger {

        public ShrimpBurger() {
            super("새우버거");
        }

        public void cook() {
            super.cook();
            System.out.println("+새우");

        }
    }

