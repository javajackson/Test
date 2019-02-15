package designpattern.builder;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/12  13:38
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public abstract class  Builder {
    public abstract void builderPartA();
    public abstract void builderPartB();

    public abstract Product getResult();
}
