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

    }
}