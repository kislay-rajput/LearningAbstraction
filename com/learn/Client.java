package com.learn;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        RBIBank sbiBank = new SBIBank();
        sbiBank.rateOfInterest();

        SBIBank sb1 = new SBIBank();
        sb1.followRules();

//        List<RBIBank> banks = new ArrayList<>();
//        banks.add(new SBIBank());
//        banks.add(new PNBBank());
    }
}
