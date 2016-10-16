/**
 * Created by ScorpionOrange on 2016/10/08.
 *
 * 手动推算：n=1 ~ n=6，得出斐波那契数列；
 * 如使用f(n)=f(n-1)+f(n-2)的尾递归方法，则将超时；
 * 故使用首递归方法，将变量a、b依次相加、交换数值，再相加 ……
 *
 * 解释一下：为什么爬梯子的题目会是斐波那契数列
 * 1、每次只能选择一步跨一级，或一步跨两级；
 * 2、所以爬第n级楼梯的话，就相当于爬n-1级楼梯，再多跨一步一级的；以及爬n-2级楼梯，再多跨一步两级的；
 * 3、所以爬第n级楼梯的组合数量就应该相等于爬n-1级楼梯的组合数量加上n-2级楼梯的组合数量；
 * 4、可见是斐波那契数列。
 *
 * @param n: An integer
 * @return: An integer
 */
public class Solution {
    public int climbStairs(int n) {
        // write your code here
        int a = 0;
        int b = 1;
        while(n>0)  {
            b=a+b;
            a=b-a;
            n--;
        }
        return b;
    }
}
