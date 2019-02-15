package designpattern.singleton;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/15  17:00
 * @Description: 懒汉式单例模式--同步方法
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    private static synchronized Singleton2 getInstance() {
        if (null == singleton2) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
