package model;

import java.io.Serializable;

public class CreditModel implements Serializable {
     private double amount;
     private int duration ;
     private double rate;
     private double paymentMonthly;

    public CreditModel(double amount, int duration, double rate, double paymentMonthly)  {
        this.amount = amount;
        this.duration = duration;
        this.rate = rate;
        this.paymentMonthly = paymentMonthly;
    }

    public CreditModel() {
    }

    public double getAmount() {
        return amount;
    }

    public int getDuration() {
        return duration;
    }



    public double getRate() {
        return rate;
    }

    public double getPaymentMonthly() {
        return paymentMonthly;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setPaymentMonthly(double paymentMonthly) {
        this.paymentMonthly = paymentMonthly;
    }
}




// Session is used to stored data relative to client on the sever side.
//Cookies is temprory file that are stored in the browser's the machine which make it possible to store relavite date into client side side