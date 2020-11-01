
import java.util.*;

        class RomanToInt {
            public int romanToInt(String s) {
                int sum = 0;
                int pernum = getValue(s.charAt(0));
                for (int i = 1;i < s.length();i++){
                    int num =  getValue(s.charAt(i));
                    if (pernum < num){
                        sum = sum - pernum;

                    }else {
                         sum = pernum + sum;
                    }
                    //运算完成后让pernum移动
                    pernum = num;
                }
                sum = sum + pernum;
                return sum;
            }

            private static int getValue(char ch) {
                switch(ch) {
                    case 'I': return 1;
                    case 'V': return 5;
                    case 'X': return 10;
                    case 'L': return 50;
                    case 'C': return 100;
                    case 'D': return 500;
                    case 'M': return 1000;
                    default: return 0;
                }
            }
        }


