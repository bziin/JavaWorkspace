package chap_05;


//신발 사이즈 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

public class Quiz_05 {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);

        }
        for (int size :
                sizeArray) {
            System.out.println("사이즈 "+ size +"(재고있음)");
        }

    }
}
