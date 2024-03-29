package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

import java.awt.*;

public class _14_Polymorphism {
    public static void main(String[] args) {
        //다형성

        //class person : 사람
        // class Student extends Person : 학생 ( 학생은 사라밍다. Student is a Person)
        // class Teacher extends Person : 선생님 ( 선생님은 사람이다. Teacher is a Person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-----------------------");


        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras) {
            cam.showMainFeature();

        }
        System.out.println("-------------");

        if(camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }
        if(speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();

        }

        Object[] objs = new Object[3];
        objs[0]= new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();

    }

}
