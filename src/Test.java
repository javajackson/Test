import designpattern.singleton.Singleton1;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/3  14:12
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Test {
    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);

    }


}
