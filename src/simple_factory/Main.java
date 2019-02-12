package simple_factory;

import java.util.Scanner;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/22 18:40
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入数字A");
            Double numA=Double.valueOf(scanner.nextLine());
            System.out.println("请输入运算符");
            String operator=scanner.nextLine();
            System.out.println("请输入数字B");
            Double numB=Double.valueOf(scanner.nextLine());
            Double result;
            Operation oper=OperationFactory.createOperation(operator);
            oper.setNunA(numA);
            oper.setNumB(numB);
            result=oper.getResult();
            System.out.println("result:"+result);
        }catch (Exception e){
            System.out.println("程序出现错误："+e.getMessage());
        }
    }
}
