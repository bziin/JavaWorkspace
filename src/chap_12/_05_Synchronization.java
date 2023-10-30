package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();


        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("--직원1 청소 시작 ( Runnable) --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");

                }
                System.out.println("-- 직원1 청소 끝( Runnable) ---");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("--직원2 청소 시작 ( Runnable) --");
            for (int i = 2; i <= 5; i++) {
                room.clean("직원2");


            }
            System.out.println("-- 직원2 청소 끝( Runnable) ---");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
