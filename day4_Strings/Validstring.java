package day4_Strings;

public class Validstring{
    public static  void main(String[] args){
        String s="aA1 7";
        int n=s.length();
        int digit=0;
        int upper=0;
        if(n>4){
            for(int i=0;i<n;i++) {
                char a = s.charAt(i);
                if (a == ' ' || a == '/') {
                    System.out.println(0);
                } else {
                    if (Character.isUpperCase(a)) {
                        upper++;
                    }
                    if (Character.isDigit(a)) {
                        digit++;
                    }
                }
            }
            if(digit>0&&upper>0) {
                System.out.println(1);
            }
        }
    }
}