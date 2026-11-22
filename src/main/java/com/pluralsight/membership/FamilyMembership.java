package com.pluralsight.membership;

import java.math.BigDecimal;

/*
10% off the monthly price when it is 3 or more
extraMembers
 */
public class FamilyMembership extends Membership {
    private int extraMembers;

    public FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }

    @Override
    public BigDecimal calculateMonthlyPrice() {
        BigDecimal familyPrice = (new BigDecimal(12.5).multiply(new BigDecimal(extraMembers)).add(new BigDecimal(30)));
        if(extraMembers >= 3){
            return familyPrice.subtract(familyPrice.multiply(new BigDecimal(0.10)));
        }
        else{
            return familyPrice;
        }
    }

    @Override
    public String toString() {
        return "Family | " + getMemberName() + " | " + getMonths() + " | extra members: " + extraMembers +
                "\nMonthly price: $" + calculateMonthlyPrice() + ", sign-up fee: $" + calculateSignUpFee() + ", contract total: $" + calculateContractTotal();

    }
}
