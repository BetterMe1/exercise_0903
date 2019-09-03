package exercise.exercise_0903;

/**
 * @Description:vipkid笔试
 * @Author:Anan
 * @Date:2019/9/3
 */
/*
二进制中1的个数
 */
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Long.toBinaryString(num);
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
*/
/*
zero的组数
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(",");
        Long[] nums = new Long[strs.length];
        for(int i=0; i<strs.length; i++){
            nums[i] = Long.parseLong(strs[i].trim());
        }
        boolean[] flag = new boolean[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(flag[i]){
                continue;
            }
            for(int j=i+1; j<nums.length; j++){
                if(!flag[j]&& nums[i]+nums[j]==0){
                    count++;
                    flag[i] = true;
                    flag[j] = true;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}