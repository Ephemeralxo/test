package leetcode.P7;

class Solution {

    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            int t = x % 10;
            x = x / 10;
            //关于数据反转导致溢出32位下最大的负数会溢出
            //反转后的结果也会溢出
            if(ans > Integer.MAX_VALUE / 10  || ans < Integer.MIN_VALUE / 10){return 0 ;}
            //如果测试用例是符合题意的那么最高位只会出现 0 ， 1， 2 三位数字 所以与2 147 483 647和
            // -2 147 483 648比较一定不会出现整数溢型
            ans = ans * 10 + t;

        }
        return ans;
    }
}


//        String xString = Integer.toString(x);
//        String string = xString;
//        int flag = 1;
//        if (x < 0) {
//            flag = -1;
//            string = xString.substring(1);
//        }
//        try {
//            return Integer.valueOf((new StringBuilder(string)).reverse().toString()) * flag;
//        }catch (Exception e){
//            return 0;
//        }
