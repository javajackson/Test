package decorative.v2;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 13:29
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Main {
    public static void main(String[] args) {
        Person person=new Person("小菜");

        System.out.println("第一种装扮：");
        Finery dtx=new TShirt();
        Finery kk=new BigTrouser();
        Finery pqx=new Sneakers();
        dtx.show();
        kk.show();
        pqx.show();

        System.out.println("第二种装扮：");
        Finery xz=new Suit();
        Finery ld=new Tie();
        Finery px=new LeatherShoes();
        xz.show();
        ld.show();
        px.show();
    }
}
