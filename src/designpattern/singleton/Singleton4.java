package designpattern.singleton;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/15  17:07
 * @Description: 静态内部类单例模式
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Singleton4 {
    private static Singleton4 singleton4;

    private Singleton4() {
    }

    private static class SingletonHolder {
        private static Singleton4 singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton4;
    }
}
