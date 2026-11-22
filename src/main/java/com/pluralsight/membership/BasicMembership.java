package com.pluralsight.membership;


import java.math.BigDecimal;

/*
Basic peak on is 30/per month -5
Basic without peak is 27.5/per month
offPeakOnly
 */
public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
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
        if (offPeakOnly == true){
            return new BigDecimal(25.00);
        }
        else {
            return new BigDecimal(27.50);
        }
    }

    @Override
    public String toString() {
        return "Basic | " + getMemberName() + " | " + getMonths() + " months | off-peak only: " + offPeakOnly +
                "\nMonthly price: $" + calculateMonthlyPrice() + ", sign-up fee: $" + calculateSignUpFee() + ", contract total: $" + calculateContractTotal();
    }
}
