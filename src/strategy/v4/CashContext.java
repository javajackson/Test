package strategy.v4;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 10:25
 * @Description:指向CashSuper的类
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cashSuper){
        cs=cashSuper;
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
