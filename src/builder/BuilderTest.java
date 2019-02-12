package builder;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/11  17:41
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        SmartManBuilder smartManBuilder = new SmartManBuilder();
        Human human = director.createHumanByDirector(smartManBuilder);
        System.out.println(human.getHead());
        System.out.println(human.getBody());
        System.out.println(human.getHand());
        System.out.println(human.getFoot());
    }
}
