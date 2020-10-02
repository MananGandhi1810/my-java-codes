import java.util.*;
public class interest{
    double principle_value, rate_of_interest, time_in_years;
    public void result(double p,double r, double t){
        principle_value=p;
        rate_of_interest=r;
        time_in_years=t;
    }
    public void simpleInterest(double p,double r, double t){
        result(p,r,t);
        double results=principle_value*rate_of_interest*time_in_years;
        double inter=results/100;
        System.out.println("interest: "+inter);
        System.out.println("amount: "+(inter+principle_value));
    }
    public void main(double p,double r, double t){
        simpleInterest(p,r,t);
    }
}