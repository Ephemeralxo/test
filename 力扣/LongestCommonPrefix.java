public class LongestCommonPrefix {

        public String longestCommonPrefix(String[] strs) {
            String a = "";
            try {
                a=strs[0];
                for (String str : strs) {
                    while (!str.startsWith(a)) {
                        a = a.substring(0,a.length() - 1);
                    }
                }
                return a;
            } catch (Exception e) {
                return a;
            }

        }
    public String longestCommonPrefix2(String[] strs) {
            if (strs == null || strs.length ==0){
                return "";
            }
            //纵向遍历
        //对第一个数组中的字符串第一个字符进行比较
        //依次进行比较相同则继续不同则返回
        int i = 0;
        StringBuilder res = new StringBuilder();
        while(i<strs[0].length()){
            String pre = strs[0];
            for(int j = 1;j<strs.length;j++){
                if(strs[j].length()<i+1||pre.charAt(i)!=strs[j].charAt(i)){
                    return res.toString();
                }
                pre = strs[j];
            }
            res.append(pre.charAt(i));
            i++;
        }
        return res.toString();


    }

}
