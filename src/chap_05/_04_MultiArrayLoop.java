package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i = 0; i < 3; i++) { //세로 기준
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " ");

            }
            System.out.println();

        }

    }
}
