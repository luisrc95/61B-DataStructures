/** The dog lauched class will test drive the dog class*/

public class DogLauncher{
    public static void main(String[] args){
        Dog d = new Dog(15);//Notice the new instance of Dog
        Dog d2 = new Dog(100);

        Dog bigger = d2.maxDog(d);
        
        bigger.makeNoise();
        //d.makeNoise();
    }
}

/**This is the basis for OPP in Java, notice how class Dog.java did
 * not need to have a main class, it was sufficient to have a main method
 * in Dog Laucher to make use of the code in Dog.java
 */
/**The declaration and usage of classes/Constructors
 * if very similar to what
 * I've encountered in C/C++ nothing new.  What we should pay
 * attention to is the use of "static"
 */
/**JavaC is "very smart" in that it will notice when a depencency
 * has changed and will recompile the dependency when the main method
 * is called
 * */


 /**For Project 0
  * Array of classes:
  * Dog[] dogs = new Dog[2]
  * dogs[0] = new Dog(8)
  * dogs[1] = new Dog(20)
  */