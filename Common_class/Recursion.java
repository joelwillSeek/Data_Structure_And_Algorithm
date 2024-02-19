package Common_class;
public class Recursion {
     Convenience con=new Convenience();
    public void steps(String v,int i){
        if(i<1) return;
        con.print(v);
        steps(v, i-1);
    }

    public int factorial(int v){
        if(v<=1){
            return v;
        }
        return v*factorial(v-1);
    }

    public int power(int b,int p){
        if(p<=1){
            return b;
        }

        return b*power(b, p-1);
    }
}
