package builder;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/11  17:10
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface IBuildHuman {
    void builderHead();
    void builderBody();
    void builderHand();
    void builderFoot();

    Human createHuman();
}
