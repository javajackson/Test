package designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chenglvpeng
 * @Date: 2019/2/12  13:35
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Product {

    List<String> list = new ArrayList<>();

    public void add(String content) {
        list.add(content);
    }

    public void show() {
        System.out.println("Display Product: ");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
