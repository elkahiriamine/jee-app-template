package business;

public class IMPayment implements MPayment{

    @Override
    public double calculatePaymentMonthly(double amount, int numberMonth, double rate) {
        double t  = rate/100;
        double var1 = amount*(t/12);//first variable refer to first calculate
        double var2 =1-Math.pow(1+t/12,-numberMonth);
        int a = 0
        return var1/var2;
    }
}
