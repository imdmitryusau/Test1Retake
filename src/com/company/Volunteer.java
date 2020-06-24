package com.company;

import java.util.ArrayList;

public class Volunteer {
    private static int VOLUNTEERS_COUNTER = 0;
    private int ACTIVE_VOLUNTEERS_COUNTER;
    private String id;
    private String fName;
    private String lName;
    private String login;
    private Volunteer subordinate;
    private ArrayList<Volunteer> sub = new ArrayList<>();
    private boolean status=false;

    public Volunteer(String fName, String lName, String login) {
        this.fName = fName;
        this.lName = lName;
        this.login = login;
        VOLUNTEERS_COUNTER++;
        this.id = "No" + VOLUNTEERS_COUNTER;
        sub.add(this);
    }

    public void Activate()
    {
        this.status = true;
    }

    public void Deactivate()
    {
        this.status = false;
    }


    public void addSubordinate(ArrayList<Volunteer> s)
    {
        this.sub.addAll(s);
    }

    public void removeSubordinate(ArrayList<Volunteer> s) //removing the array list of patients
    {
        this.sub.remove(s);
    }

    public void displayInfo()
    {
        StringBuilder builder = new StringBuilder();
        for(Volunteer v : sub)
        {
            builder.append(v+"\n");
        }
        System.out.println(builder.toString());
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "Last Name='" + lName + '\'' +
                ", First Name='" + fName + '\'' +
                ", Login='" + login + '\'' +
                '}';
    }

    public void displayingActiveOnes()
    {
        for (Volunteer v : sub)
        {
            if (v.status==true)
            {
                v.displayInfo();
            }
        }
    }


}
