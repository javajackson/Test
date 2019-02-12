package strategy.v3;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 09:35
 * @Description:收费工厂类
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CashFactory {

    public static CashSuper createCashAccept(int type){// 1. 正常收费 2. 满300返100 3. 打8折
        CashSuper cs=null;
        switch (type){
            case 1:
                cs=new CashNormal();
                break;
            case 2:
                cs=new CashReturn(300,100);
                break;
            case 3:
                cs=new CashRebate(0.8);
        }
        return cs;
    }
}
