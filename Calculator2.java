
class Calculator2
{
    double result=0;
    int x,y;
    void inputdata(int a,int b)
    {
        x=a;
        y=b;
    }
    void add(){
        result=x+y;
        System.out.println(result);
    }
    void sub(){
        result=x-y;
        System.out.println(result);
    }
    public static void main(){
        Calculator2 c=new Calculator2();
        c.inputdata(3,6);
        c.add();
        c.sub();
    }
}