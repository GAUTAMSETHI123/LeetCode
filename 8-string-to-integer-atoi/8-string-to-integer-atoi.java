class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        if(str.length()==0||str.length()==1&&(str.charAt(0)=='+'||str.charAt(0)=='-'))return 0;
        long num = 0L;
        boolean neg = (str.charAt(0)=='-');
        if(neg||str.charAt(0)=='+') str = str.substring(1);
        int i = 0;
        while(i<str.length()&&str.charAt(i)=='0')++i;
        int j = i+12;
        while(i< str.length()&&i<j){
            num*=10L;
            if(!"1234567890".contains(str.charAt(i)+"")){
                num/=10L;
                break;
            }
            num += (long)(str.charAt(i++)-'0');
        }
        if(num> Integer.MAX_VALUE)return ( (neg)?-1*Integer.MAX_VALUE -1:Integer.MAX_VALUE );
        return (int) num * ((neg)?-1:1);
    }
}