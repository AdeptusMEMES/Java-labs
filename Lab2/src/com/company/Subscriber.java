package com.company;

import java.util.ArrayList;

public class Subscriber implements  Observer{

    private String name;
    private MailType favorite;
    private ArrayList<Mail> received;
    private String address;

    public Subscriber(String name, MailType favorite, String address)
    {
        this.name=name;
        this.favorite=favorite;
        this.address=address;
        received = new ArrayList<Mail>();
    }

    public void update(Object obj)
    {
        PostalOffice office = (PostalOffice)obj;
        Mail mail;
        for(int i=0; i<office.getState().size();i++){
            mail = (Mail)(office.getState().get(i));
            if(!received.contains(mail))
                if(mail.getType() == favorite && mail.getDestination().equals(address))
                {
                    System.out.print(name + " received " + " \"" + mail.getTitle() +"\" "+ " on address " + mail.getDestination()+".\n");
                    received.add(mail);
                }
        }
    }
}
