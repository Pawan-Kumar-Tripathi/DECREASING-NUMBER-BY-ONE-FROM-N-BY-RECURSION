/**
 * program_1_recusion
 */
public class program_1_recusion {

    public static void name(int n ) {
    if(n==0)
    return;
    System.out.println(n);
    name(n-1);
    
        
    }
    public static void main(String args[]) {
        int n = 5;
        name(n);
        
    }
}