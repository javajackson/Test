package simple_factory;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/22 17:58
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class OpetationDiv extends  Operation {
    @Override
    public double getResult() {
        if(numB==0){
            throw new RuntimeException("除数不能为零");
        }
        return numA/numB;
    }
}
