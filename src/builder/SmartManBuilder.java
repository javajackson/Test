package builder;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/11  17:11
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SmartManBuilder implements IBuildHuman {

    Human human;

    public SmartManBuilder() {
        human = new Human();
    }

    @Override
    public void builderHead() {
        human.setHead("智商180的头脑");
    }

    @Override
    public void builderBody() {
        human.setBody("新的身体");
    }

    @Override
    public void builderHand() {
        human.setHand("新的手");
    }

    @Override
    public void builderFoot() {
        human.setFoot("新的脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
