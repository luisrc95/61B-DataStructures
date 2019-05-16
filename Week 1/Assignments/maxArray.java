public class maxArray{
    public static int largest(int[] a){
        int x = a[0];
        for(int i = 0; i < a.length; i++){
            if(x < a[i])
                x = a[i];
        }
        return x;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.print(largest(numbers));
    }
}


/**
 * This implements two of the exercises in 61B,  the two are Exercise 2/Exercise3 
 * which looks for the biggest element in the array as well as the using of for loops
 * 
 * I've noticed that the for loop is exactly the same as C, also notice how arrays 
 * have some built in functions (i.e. a.length)
 */

 /**
  * One thing that I noticed was that we don't need to specify the how many elements
  * need to be in the array before assigning values, reminds me of Python
  */

/**
 * Java also has bounds checking meaning, there is not need for vectors as in C++
 */

 /**
  * Java also has functionality for strings which is contains.
  * This will look for a grouping of chars withing a given string
  * i.e a = "Crazy horse" a.contains("horse") = true
  */