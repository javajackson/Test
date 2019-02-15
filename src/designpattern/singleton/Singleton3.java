package designpattern.singleton;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/15  17:03
 * @Description: 饿汉式单例模式--双重检查锁
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Singleton3 {

    private volatile static Singleton3 singleton3 = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (null == singleton3) {
            synchronized (Singleton3.class) {
                if (null == singleton3) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
