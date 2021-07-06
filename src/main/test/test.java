import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Zzy
 * @description:生成4位不重复的随机数
 * @date 2021/7/5 14:25
 */
public class test {


    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        while (str.length()<4){
            Integer i = new Random().nextInt(4);
            if (!str.toString().contains(i.toString())){
                str.append(i.toString());
            }
        }
        System.out.println(str.toString());

    }

}