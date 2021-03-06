package Singleton_pattern;

public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking Taoiseach = null;
    private int number = 0;

    private DoubleCheckedLocking() {
    }

    public static synchronized DoubleCheckedLocking getTaoiseach() {
        if (Taoiseach == null){
            synchronized (DoubleCheckedLocking.class) {
                if (Taoiseach == null){
                    Taoiseach = new DoubleCheckedLocking();
                }
            }
        }
        return Taoiseach;

    }
    public void setnumber(int n){
        this.number = n;
    }
    public int getNumber(){
        return number;
    }
}