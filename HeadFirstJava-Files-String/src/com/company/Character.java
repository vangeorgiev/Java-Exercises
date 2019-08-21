package com.company;

public class Character {
    private int power;
    private String type;
    private Weapon weapon;

    public Character (int power, String type, Weapon weapon){
        this.power = power;
        this.type = type;
        this.weapon = weapon;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
