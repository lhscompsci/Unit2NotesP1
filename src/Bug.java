public class Bug {

    //instance variables
    private int size;
    private boolean fly;

    //constructors
    public Bug(){       //default
        size = 1;
        fly = false;
    }

    public Bug(int s, boolean f){
        size = s;
        fly = f;
    }

    //mutator methods -- changers
    public void setSize(int s){
        size = s;
    }
    public void setFly(boolean f){
        fly = f;
    }

    //accessor methods
    public int getSize(){
        return size;
    }
    public boolean canFly(){
        return fly;
    }


    public void speak(){
        System.out.println("chirp chirp!");
    }

    public void sayName(){
        System.out.println("creepy crawly");
    }

    public int multiplier(int alpha, int beta){
        return alpha * beta;
    }
}
