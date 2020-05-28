package com.company;

public class Main {

    public static void main(String[] args) {
        PostalOffice postOffice = new PostalOffice();

        Subscriber jim = new Subscriber("David", MailType.SPORTMAGAZINE, "somewhere");
        Subscriber alice = new Subscriber("Alice", MailType.FASHIONMAGAZINE, "anywhere");
        Subscriber david = new Subscriber("David", MailType.NEWSPAPER, "here");

        Mail first = new Mail("Sport for mens", MailType.SPORTMAGAZINE, "somewhere");
        Mail second = new Mail("Fashion", MailType.FASHIONMAGAZINE, "anywhere");
        Mail third = new Mail("NEWS", MailType.NEWSPAPER, "here");
        Mail fourth = new Mail("Sport for mens", MailType.NEWSPAPER, "anywhere");

        postOffice.addObserver(david);
        postOffice.addObserver(jim);
        postOffice.addObserver(alice);

        postOffice.smthNew(first);
        postOffice.smthNew(second);
        postOffice.smthNew(third);
        postOffice.smthNew(fourth);
    }
}
