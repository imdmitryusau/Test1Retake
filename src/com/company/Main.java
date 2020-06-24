package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Volunteer v = new Volunteer("Alex", "Tselevich", "alextslv");
    Volunteer v1 = new Volunteer("Jake", "Paul", "jpaul");
    Volunteer v2 = new Volunteer("Logan", "Paul", "lpaul");
    Volunteer v3 = new Volunteer("Anthony", "Trujilo", "anthonu111");
    Volunteer v4 = new Volunteer("Henry", "Green", "hgreen");
    Volunteer v5 = new Volunteer("Jack", "Taylor", "jtake");

    v1.Activate();
    v2.Activate();
    v3.Activate();
    v4.Activate();
    v5.Activate();

    ArrayList<Volunteer> list_s = new ArrayList<>();
    list_s.add(v3);
    v.addSubordinate(list_s);
    v1.addSubordinate(list_s);

    v.displayInfo();
    v1.displayInfo();

    ArrayList<Volunteer> list_a= new ArrayList<>();
    list_a.add(v);
    list_a.add(v1);
    list_a.add(v2);
    list_a.add(v3);
    list_a.add(v4);
    list_a.add(v5);

    System.out.println("Active ones");
        for (Volunteer sub: list_a)
        {
            sub.displayingActiveOnes();
        }
    }
}
