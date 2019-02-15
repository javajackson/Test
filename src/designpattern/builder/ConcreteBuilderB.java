package designpattern.builder;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/12  13:43
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ConcreteBuilderB extends Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.add("part x");
    }

    @Override
    public void builderPartB() {
        product.add("part y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
