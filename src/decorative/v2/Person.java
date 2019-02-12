package decorative.v2;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 11:29
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Person {

    private String name;

    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的"+name);
    }
}
