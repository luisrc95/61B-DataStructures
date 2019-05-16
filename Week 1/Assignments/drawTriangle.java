public class drawTriangle{
    public static void Draw (int x){
        if(x == 0)return;
        int y = 1;
        int z = 0;

        while(y <= x){
            while(z < y){
                System.out.print('*');
                z = z +1;
            }
            System.out.print('\n');
            z = 0;
            y = y + 1;
        }
    }
    public static void main(String[] args){
        Draw(10);
    }
}