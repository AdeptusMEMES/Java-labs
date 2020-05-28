package com.company;

public abstract class SingleFile implements Component {

    private String name;

    protected String type;

    public SingleFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public int getCount() {
        return 1;
    }

    public void prnt(int n) {
        for(int i=0; i< n; i++)
            System.out.print("\t");
        System.out.print(getName() + "." +getType());
        System.out.print("\n");
    }
}