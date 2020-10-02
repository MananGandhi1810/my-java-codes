public class Employee{
    int empCode;
    double basicPay;
    void sal_info(int ec, double b){
        empCode=ec;
        basicPay=b;
    }
    void compute_sal(){
        double DA=(95.00/100.00)*basicPay;
        double HRA=(15.00/100.00)*basicPay;
        double Total_sal=basicPay+DA+HRA;
        double Annual_sal=Total_sal*12;
        System.out.println("DA: "+DA+"\nHRA: "+HRA+"\nTotal salary: "+Total_sal+"\nAnnual salary: "+Annual_sal);
    }
    void main(){
        sal_info(22,1000);
        compute_sal();
    }
}