package reconsitution;

/**
 * @Author: chenglvpeng
 * @Date: 2019/1/16  14:25
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Rental {
    private Movie movie;
    private int dayRentaled;

    public Rental(Movie movie, int dayRentaled){
        this.movie = movie;
        this.dayRentaled = dayRentaled;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDayRentaled() {
        return dayRentaled;
    }

    public void setDayRentaled(int dayRentaled) {
        this.dayRentaled = dayRentaled;
    }


}
