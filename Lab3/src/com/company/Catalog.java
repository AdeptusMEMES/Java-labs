package com.company;


import java.util.ArrayList;

public class Catalog implements Component {
    private ArrayList<Component> files;
    private String name;

    public Catalog(String name) {
        this.name = name;
        files = new ArrayList<Component>();
    }

    public void add(Component file)
    {
        files.add(file);
    }

    public void remove(Component file)
    {
        files.remove(file);
    }

        public int getCount() {
            int count = 0;
            for (int i=0; i<files.size();i++) {
                count += files.get(i).getCount();
            }
            return count;
        }

        public void prnt(int n) {
            for(int i=0; i< n; i++)
                System.out.print("\t");
            System.out.print("\"" + name + "\"(" + files.size() + " elements, " + getCount() + " files):{\n");
            for (int i=0; i<files.size(); i++) {
                files.get(i).prnt(n+1);
            }
            for(int i=0; i< n; i++)
                System.out.print("\t");
            System.out.print("}\n");
        }
}

