package reconsitution;

/**
 * @Author: chenglvpeng
 * @Date: 2019/1/16  14:22
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Movie {
    public static final int CHILDRENS =2;
    public static final int REGULAR = 0;
    public static final int NEW_RELAESE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode){
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
