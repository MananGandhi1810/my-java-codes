public class ch5_9{
    int larger(int a,int b,int c)
    {
        int l=(a<b)?((b<c)?c:b):((a<c)?c:a);
        return l;
    }
    void show(int a, int b, int c){
        int d=larger(a,b,c);
        System.out.print(d);
    }
}