import java.util.stream.Stream;

public class Stream_Of_Demo {

    public static void main(String[] args) {
        //for Integer
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
       // for  String
        Stream<String> stream1 = Stream.of("Palash","khatri","java","dev");
        stream.forEach(p-> System.out.println(p));
        stream1.forEach(p-> System.out.println(p));
    }
}

/*
output
        1
        2
        3
        4
        5
        Palash
        khatri
        java
        dev
        */
