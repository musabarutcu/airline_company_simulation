package model;

public class Passenger {
    private String id;
    private String name;
    private int age;

    public Passenger(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId(){
        return id; 
    }

    public String getName(){
        return name; 
    }

    public int getAge(){
        return age; 
    }

    @Override
    public String toString(){
        return name + " (ID: " + id + ", Age: " + age + ")";
    }
}

