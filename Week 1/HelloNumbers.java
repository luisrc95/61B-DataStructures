public class HelloNumbers{
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while (x < 10){
            System.out.println(y);
            x =  x+1;
            y = x + y;
            System.out.print('\n');
        }
    }
}

/*
    Dealing with variables is the same as in C
    Also notice that for java we can specify the need to only have one item per line
    with printl instread of just print
*/