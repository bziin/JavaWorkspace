package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score);
        System.out.println((double)score);

        //float , double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8 ; //93+98
        System.out.println(score); //
    }
}
