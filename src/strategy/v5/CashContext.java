package strategy.v5;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 10:25
 * @Description:指向CashSuper的类
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(int type){//1.正常收费 2.满300返100 3.打8折

        switch (type){
            case 1:
                cs=new CashNormal();
                break;
            case 2:
                cs=new CashReturn(300,100);
                break;
            case 3:
                cs=new CashRebate(0.8);
                break;
            case 4:
                cs=new CashRebate(0.9);
                break;
            case 5:
                cs=new CashReturn(100,10);
                break;
        }

    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
