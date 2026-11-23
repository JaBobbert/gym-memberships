package com.pluralsight.membership;

import java.math.BigDecimal;

/*
Premium is 30/per month + 18.5
if greater than 12 months then no sign up fee
guestPasses
 */
public class PremiumMembership extends Membership {
    private int guestPasses;

    public PremiumMembership(String memberName, int months, int guestPasses) {
        super(memberName, months);
        this.guestPasses = guestPasses;
    }

    public int getGuestPasses() {
        return guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    @Override
    public BigDecimal calculateMonthlyPrice() {
           return getBaseRate().add(new BigDecimal(18.5));

    }

    @Override
    public BigDecimal calculateContractTotal(){
        if (getMonths() >= 12){
            BigDecimal newSignUp = calculateSignUpFee().ZERO;
            return calculateMonthlyPrice().multiply(new BigDecimal(getMonths())).add(newSignUp);

        }
        else {
            return calculateMonthlyPrice().multiply(new BigDecimal(getMonths())).add(calculateSignUpFee());
        }
    }

    @Override
    public String toString() {
        if (getMonths() >= 12) {
            return "Premium | " + getMemberName() + " | " + getMonths() + " | guest passes: " + guestPasses +
                    "\nMonthly price: $" + calculateMonthlyPrice() + ", sign-up fee: $" + calculateSignUpFee().ZERO + ", contract total: $" + calculateContractTotal();
        } else {
            return "Premium | " + getMemberName() + " | " + getMonths() + " | guest passes: " + guestPasses +
                    "\nMonthly price: $" + calculateMonthlyPrice() + ", sign-up fee: $" + calculateSignUpFee() + ", contract total: $" + calculateContractTotal();
        }
    }
}
