public class Employee2{
    int days;
    double rate;
    void Sal_Data(int d, double r){
        days=d;
        rate=r;
    }
    double compute_sal(){
        double total_wages=days*rate;
        double special_allowance=total_wages*15/100;
        double total_salary=total_wages+special_allowance;
        return total_salary;   
    }
    static void main(int a,int b){
        Employee obj=new Employee();
        obj.Sal_Data(a,b);
        double c=obj.compute_sal();
        System.out.print("total salary = "+c);
    }
}