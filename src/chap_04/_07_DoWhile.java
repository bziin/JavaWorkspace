package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile

        int distance = 25; // 전체거리 25미터
        int move = 0; // 현재이동거리 0미터
        int height = 2; // 키 2미터
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리는 : " +move);
            move += 3;

        }
        System.out.println("도착했스비다.");

        System.out.println("----반복문 2------");
        //DoWhile 반복문
        do {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재이동거리 :"+move);
            move += 3;


        } while (move + height< distance );
        System.out.println("도챃했습니다.");
    }
}
