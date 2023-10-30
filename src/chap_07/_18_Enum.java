package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형 Enum
        //달력 : JAN,FEB ...
        //옷사이즈 s,m,l
        // 해상도 : HD, FHD, QHD

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        System.out.print("동영상 녹화품질: ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);
        System.out.println("-----------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name()+ ":"+myRes.ordinal());
        }
        System.out.println("---------------");
        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name()+ ":"+myRes.getWidth());
        }


        }
    }




enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}