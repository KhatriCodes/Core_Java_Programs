interface Display {

    String show(String message);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {


        Display s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.show("Palash"));
    }
}
//output
//Hello, Palash