package Day04_Strings;

public class Largestword{
    public static void main(String[] args){
        String s="I love to code in java programming";
        String a[]=s.split(" ");
        int n=a.length;
        String x="";
        int max=a[0].length();
        for(int i=0;i<n;i++){
            if(a[i].length()>max){
                max=a[i].length();
                x=a[i];
            }
        }
        System.out.println(x);
    }
}