package strategy.v1;

import java.util.Scanner;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 08:55
 * @Description:商场计费系统
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Main {

    public static void main(String[] args){
        double total=0.0;
        String input;
        try {
            while(true){
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入单价");
                input=scanner.nextLine();
                if("exit".equals(input.toLowerCase())){
                    break;
                }
                double price=Double.valueOf(input);
                System.out.println("请输入重量");
                input=scanner.nextLine();
                if("exit".equals(input.toLowerCase())){
                    break;
                }
                double weight=Double.valueOf(input);
                total+=price*weight;
                System.out.println("此次价格为："+price*weight);
            }
            System.out.println("总价为："+total);
        }catch (Exception e){
            System.out.println("系统出现错误:"+e.getMessage());
        }
    }
}
