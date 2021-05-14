package demo03;

/**
 * @author 王艺博
 * @date 2021/5/11 17:27
 */
public class demo01 {
    public static void main(String[] args) {
        Integer [] a = {11,23,45,67,32};
        System.out.println(Tools.getMiddle(a));

        String [] str = {"大根","二根","小根"};
        System.out.println(Tools.getMiddle(str));

        Boolean [] b = {true,false,true,false};
        System.out.println(Tools.getMiddle(b));
    }

}
