package day5.com;

public class Transpose {
    public static void main(String[] args) {
    Transpose();
    }

    public static void Transpose(){
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }

        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
