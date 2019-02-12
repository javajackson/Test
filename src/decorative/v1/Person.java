package decorative.v1;

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

    public void wearTShirt(){
        System.out.print("大T恤 ");
    }

    public void wearBigTrouser(){
        System.out.print("垮裤 ");
    }

    public void wearSneakers(){
        System.out.print("破球鞋 ");
    }

    public void wearSuit(){
        System.out.print("西装 ");
    }

    public void wearTie(){
        System.out.print("领带 ");
    }

    public void wearLeatherShoes(){
        System.out.print("皮鞋 ");
    }

    public void show(){
        System.out.println("装扮的"+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
