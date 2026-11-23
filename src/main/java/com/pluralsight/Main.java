package com.pluralsight;

import com.pluralsight.membership.BasicMembership;
import com.pluralsight.membership.FamilyMembership;
import com.pluralsight.membership.Membership;
import com.pluralsight.membership.PremiumMembership;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Membership> membership = new ArrayList<>();

        System.out.println("========GYM Memberships========");

        membership.add(new BasicMembership("Alice Johnson", 6,true));
        membership.add(new BasicMembership("Bob Smith", 2, false));
        membership.add(new PremiumMembership("Carol White", 12, 2));
        membership.add(new PremiumMembership("Frank Miller", 3, 0));
        membership.add(new FamilyMembership("Grace Lee", 12, 3));
        membership.add(new FamilyMembership("Emma Wilson", 6, 1));

        for (Membership membership1 : membership) {
            System.out.println(membership1);
        }

        System.out.println();
    }
}
