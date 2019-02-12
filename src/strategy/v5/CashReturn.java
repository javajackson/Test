package strategy.v5;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 09:30
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CashReturn extends CashSuper {

    private double moneyCondition=0.0;
    private double moneyReturn=0.0;

    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition=moneyCondition;
        this.moneyReturn=moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if(money>=moneyCondition){
            money=money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return money;
    }
}
