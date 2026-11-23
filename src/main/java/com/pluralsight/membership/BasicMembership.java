package com.pluralsight.membership;


import java.math.BigDecimal;

/*
Basic peak on is 30/per month -5
Basic without peak is 27.5/per month
offPeakOnly
 */
public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, boolean offPeakOnly) {
        super(memberName, months);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    @Override
    public BigDecimal calculateMonthlyPrice() {
        if (isOffPeakOnly() == true){
            return getBaseRate().subtract(new BigDecimal(5));
        }
        else {
            return getBaseRate().subtract(new BigDecimal(2.5));
        }
    }

    @Override
    public String toString() {
        return "Basic | " + getMemberName() + " | " + getMonths() + " months | off-peak only: " + offPeakOnly +
                "\nMonthly price: $" + calculateMonthlyPrice() + ", sign-up fee: $" + calculateSignUpFee() + ", contract total: $" + calculateContractTotal();
    }
}
