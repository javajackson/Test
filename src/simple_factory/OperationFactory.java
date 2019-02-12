package simple_factory;

/**
 * @Author:chenglvpeng
 * @Date:2018/6/22 18:36
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class OperationFactory {

    public static Operation createOperation(String operator){
        Operation oper=null;
        switch (operator){
            case "*":
                oper=new OperationMul();
                break;
            case "/":
                oper=new OpetationDiv();
                break;
            case "+":
                oper=new OperationAdd();
                break;
            case "-":
                oper=new OperationSub();
        }
        return  oper;
    }
}
