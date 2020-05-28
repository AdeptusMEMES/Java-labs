package com.company;

public class Mail {
    MailType type;
    String title;
    String destination;

    public Mail(String title, MailType type, String destination)
    {
        this.type = type;
        this.title=title;
        this.destination=destination;
    }

    public String getTitle() {
        return title;
    }

    public String getDestination() {
        return destination;
    }

    public MailType getType() {
        return type;
    }
}
