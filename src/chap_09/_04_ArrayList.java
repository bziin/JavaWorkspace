package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        //컬렉션 프레임워크 ( 많은 데이터들을 쉽고 편리하게 관리해주기위해서 자바 클래스의 모음집)
        //List , Set, Map
        ArrayList<String> list = new ArrayList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회( 인덱스 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("----------------------");

        // 삭제 ( 박명수 이사)
        System.out.println("신청 학생 수( 이사 전):"+list.size()); //5
        list.remove("박명수");
        System.out.println("신청 학생 수( 이사 후):"+list.size()); //5

        System.out.println("------------------------");

        System.out.println(list.get(3));


        System.out.println("-------------------");

        System.out.println("남은 학생 수 (제외 전):"+list.size()); //4
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 (제외 후):"+list.size()); //3

        System.out.println("---------------------");

        //순회

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------");
        //변경 수강권양도
        System.out.println("수강권 양도 전: "+ list.get(0));
        list.set(0,"이수근");
        System.out.println("수강권 양도 후: "+ list.get(0));
        System.out.println("------------------------");

        // 확인

        System.out.println(list.indexOf("김종국"));
        // 선착순 5 명 내에 포함되었는가?
        if(list.contains("김종국")) {
            System.out.println("수강신청 성공");

        }else {
            System.out.println("수강신청 실패");
        }

        //전체삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("학생 수:" +list.size());
            System.out.println("리스트가 바뀌었습니다.");
        }

        System.out.println("-------------");
        // 다음학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        };





    }
}
