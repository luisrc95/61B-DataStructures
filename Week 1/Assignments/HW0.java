public class HW0{
    public static void main(String[] args){
        int x = 1;
        int y = 0;

        while(x <= 5){
            while(y < x){
                System.out.print('*');
                y = y+1;
            }
            System.out.print('\n');
            y = 0;
            x = x + 1;
        }
    }

}


/** 
Ins this example I did not use any for loops, but It will be useful
to research them in the near future
*/