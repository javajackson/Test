package decorative.v3;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 13:45
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Finery extends Person {

    protected Person person;
    public void decorate(Person person){
        this.person=person;
    }

    @Override
    public void show() {
        if (person!=null){
            person.show();
        }
    }
}
