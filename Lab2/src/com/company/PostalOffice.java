package com.company;

import java.util.ArrayList;

public class PostalOffice implements Observable{
        public ArrayList<Observer> observers;
        private ArrayList<Mail> mails;

        public PostalOffice() {
            mails = new ArrayList<>();
            observers = new ArrayList<>();
        }

        public ArrayList<Mail> getState() {
            return mails;
        }

        public void smthNew(Mail mail) {
            mails.add(mail);
            notifyObservers();
        }

        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        public void notifyObservers() {
            for (int i = 0; i < observers.size(); i++) {
                observers.get(i).update(this);
            }
        }
}
