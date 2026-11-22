package com.pluralsight;

import com.pluralsight.membership.BasicMembership;
import com.pluralsight.membership.Membership;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Membership> membership = new ArrayList<>();

        System.out.println("========GYM Memberships========");

        membership.add(new BasicMembership("Alice Johnson", 6, new BigDecimal(25.00), true));
        membership.add(new BasicMembership("Bob Smith", 2, new BigDecimal(27.50), true));
        System.out.println(membership);

        System.out.println();
        System.out.println("Totals");

    }
}
