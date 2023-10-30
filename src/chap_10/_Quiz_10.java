package chap_10;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

    // 스트림 이용해서 미술관 방문 손님에게 적절한 입장료 안내
    // 조건
    // 손님 이름 및 나이 정보를 위한 customer 클래스 생성
    // 입장료는 1 인당 5000
    // 20 세 이상 손님들에게만 입장료 부과 그외는 무료
    // 모든 클래스는 하나의 파일에 정의한다..

    // 챈들러 50 , 레이철 42, 모니카 21, 벤자민  18, 제임스 5
    //map 이용하면 원하는 형태로 데이터 가공, 삼항연산자 ( int max = a>b ?a:b;)
public class _Quiz_10 {
    public static void main(String[] args) {
//    int [] age = {50, 42, 21, 18, 5};
//    IntStream ageStream = Arrays.stream(age);
//
//    String[] name = {"챈들러","레이첼","모니카","벤자민","제임스"};
//    Stream<String> stream = Arrays.stream(name);

    // 입장료는 1 인당 5000원, 20세 이상 손님들에게만 부과 그외 무료

        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러",50));
        list.add(new Customer("레이첼",42));
        list.add(new Customer("모니카",21));
        list.add(new Customer("벤자민",18));
        list.add(new Customer("제임스",5));

        System.out.println("미술관 입장료");
        System.out.println("----------------------");
        list.stream().map(x->x.age >= 20 ? x.name +"5000원": x.name +"무료")
                .forEach(System.out::println);





    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
