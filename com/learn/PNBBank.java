package com.learn;

public class PNBBank implements RBIBank,ConsumerRules{
    @Override
    public void rateOfInterest() {
        System.out.println("PNB rate of interest");
    }

    @Override
    public void followRules() {
        System.out.println("PNB rules");
    }

    @Override
    public void bankNames() {
        System.out.println("PNB Bank");
    }
}
