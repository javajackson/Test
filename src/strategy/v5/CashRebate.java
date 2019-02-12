package strategy.v5;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 09:26
 * @Description:打折收费子类
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CashRebate extends CashSuper {

    private double moneyRebate=1.0;

    public CashRebate(double myRebate){
        this.moneyRebate=myRebate;
    }
    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
