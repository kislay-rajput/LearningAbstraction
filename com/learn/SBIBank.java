package com.learn;

public class SBIBank implements RBIBank,ConsumerRules{
    //Opitional, Used for validation
    @Override
    public void rateOfInterest() {
        System.out.println("SBI rate of Interest");
    }
    public void bankDetails(){
        System.out.println("Its SBI bank");
    }

    @Override
    public void bankNames() {
        System.out.println("SBI Bank");
    }

    @Override
    public void followRules() {
        System.out.println("SBI follows consumer rules");
    }
}
