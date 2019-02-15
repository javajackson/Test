package designpattern.singleton;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/15  16:37
 * @Description: 饿汉式单例模式
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Singleton1 {

    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton;
    }
}
