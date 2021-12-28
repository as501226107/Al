package class1;

public class Test001 {
    /*
    * 判断奇偶数
    * */
    public static void main(String[] args) {
//       new Test001().func1(2);
//        int a=6,b=78;
//        new Test001().func3(a,b);
//        System.out.println(a+".."+b);
        System.out.println(51);
    }
    public void func1(int x){
        //判断是否为奇数
        //若为奇数：其最后一位为1，偶数为0
        System.out.println(x&1);


    }
    public void func2(int x){
        //获取二进制位是0还是1
        //先往左移动n位，再移回来 则可以判断
        System.out.println(x&1);
    }
    public void func3(Integer a,Integer b){
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+".."+b);
    }
    /*题目1：
    * 1—1000这1000个数放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现一次。
    * 每个数组元素只能访问一次，设计一个算法，将它找出来；不用辅助存储空间，能否设计一个算法实现？
    * */
    void func4(){
        //1 2 3 4 .k.k. 1000 & 1 2 3 4 .k.k. 1000
        //去重复 ：a^a=0 b^a=b
        //若k和k重复
    }
}
