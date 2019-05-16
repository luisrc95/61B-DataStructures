import java.util.Arrays;

public class Exercise4{
    public static void windowPos(int[] a, int n){
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0)continue;
            for(int j = 0; j < n; j++){
                if(j+1+i == a.length)break;
                a[i] += a[j+ 1 + i];
            }
        }
    }
    public static void main(String[] args){
        int[] a = {1,2,-3,4,5,4};
        int n = 3;
        windowPos(a,n);

        //4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}