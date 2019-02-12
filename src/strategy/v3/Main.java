package strategy.v3;

import java.util.Scanner;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 09:15
 * @Description: 商场计费系统 增加打折功能
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Main {
    public static void main(String[] args){
        double total=0.0;
        String input;
        Scanner scanner=new Scanner(System.in);
        try {
            while(true){

                System.out.println("请输入单价:");
                input=scanner.nextLine();
                if("exit".equals(input.toLowerCase())){
                    break;
                }
                double price=Double.valueOf(input);
                System.out.println("请输入重量:");
                input=scanner.nextLine();
                if("exit".equals(input.toLowerCase())){
                    break;
                }
                double weight=Double.valueOf(input);
                total+=price*weight;
                System.out.println("此次价格为："+price*weight);
            }
            System.out.println("请输入优惠类型：1.正常收费 2.满300返100 3.打8折");
            int type=Integer.valueOf(scanner.nextLine());
            CashSuper cs=CashFactory.createCashAccept(type);
            total=cs.acceptCash(total);

            System.out.println("总价为："+total);
        }catch (Exception e){
            System.out.println("系统出现错误:"+e.getMessage());
        }
    }
}
