package com.nju.role;

public class HighMonster implements Role{
    private String name = "gama";
    private int life = 150;
    private int attack = 30;
    private int defend = 15;


    public void attack() {
        System.out.println(name+"造成"+attack+"点伤害");
    }
}
