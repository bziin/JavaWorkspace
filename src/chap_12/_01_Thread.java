package chap_12;

import chap_12.clean.CleanThread;

import static chap_12.clean.CleanThread.cleanByBoss;

public class _01_Thread {
    public static void main(String[] args) {
        //하나의 프로세스 (Process)
        //쓰레드 (Thread) 서로 다른 사람이 동시에 청소해서 빨리 하려고 만들었다

        // 1 3 5 7 9
        // 2 4 6 8 10

        CleanThread cleanThread = new CleanThread();
       // cleanThread.run();
        cleanThread.start();

        cleanByBoss();

    }
    public static void cleaBySelf() {
        System.out.println("혼자서 청소시작");
        for (int i = 0; i <= 10; i++) {
            System.out.println("(혼자) "+ i +"번방 청소중");
        }
        System.out.println("-- 혼자 청소 끝 ---");
    }
}
