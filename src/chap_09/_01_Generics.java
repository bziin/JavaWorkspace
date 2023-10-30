package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        //제네릭스
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubledArray(dArray);
        printStringsArray(sArray);
        System.out.println("------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }
    // T : Type
    private static <T> void printAnyArray(T[] array) {
        for (T t :array) {
            System.out.print(t +" "); // 1 2 3 4 5
        }
        System.out.println();

    }

    private static void printStringsArray(String[] sArray) {
        for (String s  :sArray) {
            System.out.print(s +" "); // 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printDoubledArray(Double[] dArray) {
        for (double d :dArray) {
            System.out.print(d +" "); // 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i :iArray) {
            System.out.print(i+" "); // 1 2 3 4 5
        }
        System.out.println();
    }
    }

