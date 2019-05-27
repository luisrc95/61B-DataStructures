public class Dog{
    //This is going to be a property of the Dog class
    //This will help our DogLauncher know which instante of makeNoise()
    //to user
    public int weightInPounds;
    //Start of a static variable, they're used to give instances
    //a constant variable
    public static String binomen = "Canis familiaris";

    public Dog(int w){
        weightInPounds = w;
    }
 
    public void makeNoise(){
        if(weightInPounds < 10){
            System.out.println("yip!");
        }else if(weightInPounds < 30){
            System.out.println("bark.");
        }else{
            System.out.println("woooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if(d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }
    //This is a non static way of writting the above code but in
    //a non static way, also notice the reuse of the "this" variable/pointer
    public Dog maxDog(Dog d2){
        if(this.weightInPounds > d2.weightInPounds){
            return this;
        }
        return d2;
    }
}

/**Notice how static methods can be used independently of an instance of
 * the class, where as nonstatic methods require an instance of a class to
 * be called.
 */
