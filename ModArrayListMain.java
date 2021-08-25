package com.anjanacodes;

public class ModArrayListMain {
    public static void main(String[] args) {
        ModArrayList obj = new ModArrayList();
        obj.add(19);
        obj.add(20);
        obj.add(30);
        System.out.println(obj.getUsingMod(1));
        System.out.println(obj.getUsingMod(-2));
    }
}