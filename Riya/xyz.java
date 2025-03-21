package Riya;

public class xyz extends abc{

    private int x;
    private int y;
    private int z;

    public xyz(int a, int b, int c, int x, int y, int z) {
        super(a,b,c);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double calculate(){
        return x*y*z;
    }

}
