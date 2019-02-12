package redeem;

/**
 * @Author:chenglvpeng
 * @Date:2018/8/1 15:48
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNum {
    private static char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z', '0', '1' };//最后又重复两个0和1，因为需要凑足数组长度为64

    private static Random random = new Random();

    //生成指定长度的随机字符串
    public static synchronized String createRandomString(int length) {
        if (length > 0) {
            int index = 0;
            char[] temp = new char[length];
            int num = random.nextInt();
            for (int i = 0; i < length % 5; i++) {
                temp[index++] = ch[num & 63];//取后面六位，记得对应的二进制是以补码形式存在的。
                num >>= 6;//63的二进制为:111111
                // 为什么要右移6位？因为数组里面一共有64个有效字符。为什么要除5取余？因为一个int型要用4个字节表示，也就是32位。
            }
            for (int i = 0; i < length / 5; i++) {
                num = random.nextInt();
                for (int j = 0; j < 5; j++) {
                    temp[index++] = ch[num & 63];
                    num >>= 6;
                }
            }
            return new String(temp, 0, length);
        }
        else if (length == 0) {
            return "";
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    //根据指定个数，测试随机字符串函数的重复率
    public static double rateOfRepeat(int number) {
        int repeat = 0;
        String[] str = new String[number];
        for (int i = 0; i < number; i++) {//生成指定个数的字符串
            str[i] = RandomNum.createRandomString(6);
        }
        for (int i = 0; i < number; i++) {//查找是否有相同的字符串
            for (int j = i + 1; j < number - 1; j++) {
                if (str[i].equals(str[j]))
                    repeat++;
            }
        }
        return ((double) repeat) / number;
    }

    //生成指定数量，指定长度的随机字符串

    public static List<String> createRandomStringOfCount(int count,int length){
        List<String> list=new ArrayList<>();
        for (int i = 0; i < count; i++) {//生成指定个数的字符串
            list.add(RandomNum.createRandomString(length));
        }

        return list;
    }


    public static void main(String[] args) {
        /*System.out.println(RandomNum.createRandomString(6));
        double rate = RandomNum.rateOfRepeat(10000);//测试10000次的重复率
        System.out.println("重复率:" + rate);*/
        List<String> list=createRandomStringOfCount(100,10);
        System.out.println();
    }
}
