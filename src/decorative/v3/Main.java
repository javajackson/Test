package decorative.v3;


/**
 * @Author:chenglvpeng
 * @Date:2018/6/25 13:57
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Main {
    public static void main(String[] args) {
        Person person=new Person("小菜");

        System.out.println("第一种装扮：");
        Sneakers pqx=new Sneakers();
        BigTrouser kk=new BigTrouser();
        TShirt dtx=new TShirt();
        pqx.decorate(person);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮：");
        LeatherShoes px=new LeatherShoes();
        Suit xz=new Suit();
        Tie ld=new Tie();
        px.decorate(person);
        xz.decorate(px);
        ld.decorate(xz);
        ld.show();
    }
}
