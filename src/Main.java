import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Bug dude = new Bug(30,false);  //instantiate
        Bug dudette = new Bug();
        Bug dudekid = new Bug();

        dude.speak();
        dude.sayName();
        dudette.sayName();
        dudette.speak();
        dudette.speak();

        dudette.setSize(20);
        dudekid.setFly(true);

        out.println(dude.canFly());
        out.println(dudette.getSize());

        int ans = dudekid.multiplier(4,21);
        out.println("the answer is "+ ans);


        //anytime you need to use a method from the Math class
        //just start  Math.    and let the list pop up
     //   Math.

        //Random Numbers  (RNG)
        //pseudorandom numbers (PNG)

        //Math.random()  <== 0.0 up to but not including 1.0

        //    (int)(Math.random() * [range]  + lower)
        //                  upper - lower + 1

        //Roll a d20
        int value = (int)(Math.random()*20 + 1);
        out.println("You rolled: "+ value);

        //Strings -- collections of characters enclosed by quotation marks "lakdshflakdsjf"
        //              0123456789  -- position
        String myStr = "Howdy yall";
        // Strings are immutable

        out.println(myStr.length());    //total quantity
        out.println(myStr.indexOf("y"));    //where is it in the string -- first occurrence
        out.println(myStr.indexOf("How"));  //where it begins
        out.println(myStr.lastIndexOf("y"));    //looks from the right
        out.println(myStr.charAt(7));       //what char is at the given location
        out.println(myStr.substring(7));    //returns a portion of the original string beginning at the given loc
                                                        // all the way to the end
        out.println(myStr.substring(3,8));      //returns a portion starting at 3 and goes up to but not including 8
        myStr.toUpperCase();        //returns the original ALL UPPERCASED
        out.println(myStr);
        myStr = myStr.toUpperCase();
        out.println(myStr);
        //compareTo  vs  equals
        String s1 = "one";
        String s2 = "two";
        out.println(s1.equals("one"));      //boolean -- checks to see if same string
        out.println(s1.compareTo(s2));      //
        out.println(s2.compareTo(s1));      //




    }
}