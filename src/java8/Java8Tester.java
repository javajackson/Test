package java8;

/**
 * @Author: chenglvpeng
 * @Date:2018/11/27 11:07
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Java8Tester {

    final static String salutation = "Hello ";


    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

       /* MathOperation addition = (int a,int b)->a+b;

        MathOperation subtraction = (a,b)->a-b;

        MathOperation multiplication = (int a,int b)->{ return a * b;};

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = "+tester.operate(10,5,addition));
        System.out.println("10 - 5 = "+tester.operate(10,5,subtraction));
        System.out.println("10 * 5 = "+tester.operate(10,5,multiplication));
        System.out.println("10 / 5 = "+tester.operate(10,5,division));*/

        GreetingService greetingService = message -> System.out.println(salutation+message);

        greetingService.sayMessage("World!");
        final int num = 1;
        Converter<Integer, String> converter = i -> System.out.println(String.valueOf(i+num));
        converter.convert(5);



    }

    /*private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }*/

    interface GreetingService{
        void sayMessage(String message);
    }

    interface Converter<T1, T2> {
        void convert(int i);
    }
}
