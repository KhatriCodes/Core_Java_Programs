interface sayable
        {
            void say();
        }
public class LambdaExpressionExample2 {

    public static void main(String[] args) {

        sayable s1 = ()-> {
            System.out.println("palash"); // here we have to write body of method
        };
        s1.say(); // here we have to call method

    }
}
