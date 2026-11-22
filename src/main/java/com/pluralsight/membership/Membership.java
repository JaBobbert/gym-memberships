package com.pluralsight.membership;

import java.math.BigDecimal;

/*
memberName
months
baseRate
 */

public abstract class Membership {
    private String memberName;
    private int months;
    private BigDecimal baseRate;

    public Membership(String memberName, int months, BigDecimal baseRate) {
        this.memberName = memberName;
        this.months = months;
        this.baseRate = baseRate;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    public abstract BigDecimal calculateMonthlyPrice();

    public BigDecimal calculateSignUpFee(){
        return BigDecimal.valueOf(49.00);
    }

    public BigDecimal calculateContractTotal(){
        return (calculateMonthlyPrice().multiply(new BigDecimal(months))).add(calculateSignUpFee());
    }

    @Override
    public String toString() {
        return memberName + ", " + months + ", " + baseRate;
    }
}
