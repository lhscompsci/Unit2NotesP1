import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Bug dude = new Bug();  //instantiate
        Bug dudette = new Bug();
        Bug dudekid = new Bug();

        dude.speak();
        dude.sayName();
        dudette.sayName();
        dudette.speak();
        dudette.speak();

        int ans = dudekid.multiplier(4,21);
        out.println("the answer is "+ ans);

    }
}