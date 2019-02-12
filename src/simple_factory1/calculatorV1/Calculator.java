package simple_factory1.calculatorV1;

import java.util.Scanner;

/**
 * @Author: chenglvpeng
 * @Date: 2018/11/29  14:29
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        Integer number1 = scanner.nextInt();
        System.out.println("请输入运算符：");
    }
}
