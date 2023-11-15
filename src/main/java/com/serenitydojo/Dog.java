package com.serenitydojo;

import java.sql.SQLOutput;

public class Dog {
    public String name;
    public String favoriteToy;
//    public static String makeNoise;
    public int age;
    public boolean isFed;

    public static String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age, String makeNoise, boolean isFed) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
//        this.DOG_NOISE = makeNoise;
        this.isFed = isFed;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge(){
        return age;
    }

//    //public String getMakeNoise(){
//        return makeNoise;
//    }

    public boolean getIsFed() {
        return isFed;
    }

//    public boolean feed() {
//        return isFed;
//    }

//    public String makeNoise() {
//        return DOG_NOISE;
//    }

    public void feed(boolean isFed) {
        System.out.println(name + " is fed: " + isFed );
    }

    public void makeNoise() {
        System.out.println(name + " make noise: " + DOG_NOISE);
    }
}
