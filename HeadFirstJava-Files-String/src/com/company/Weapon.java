package com.company;

public class Weapon {

    private String name;
    private int strenght;

    public Weapon(String name, int strenght){
        this.name = name;
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", strenght=" + strenght +
                '}';
    }
}
