package designpattern.builder;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/12  11:41
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        director.builder(builderA);

        Product productA = builderA.getResult();
        productA.show();

        director.builder(builderB);

        Product productB = builderB.getResult();
        productB.show();
    }
}
