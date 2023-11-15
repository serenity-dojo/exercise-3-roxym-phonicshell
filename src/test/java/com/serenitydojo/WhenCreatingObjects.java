package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog (){
    //attributes belong to the dog
    String name = "Fido";
    String favoriteToy = "Bone";
//    String makeNoise =  "Woof";
    int age = 5;
    boolean isFed = true;


    //create the Dog object
    Dog fido = new Dog("Fido","Bone", 5, "Woof", true);

    // attributes values
    System.out.println(fido.getName());
    System.out.println(fido.getFavoriteToy());
    System.out.println(fido.getAge());
    }

    @Test
public void dog_makes_noise(){
        Dog fido = new Dog("Fido","Bone", 5, "Woof", true);

        fido.makeNoise();

        //System.out.println(fido.getMakeNoise());

}
@Test
public void dog_is_fed(){
    Dog fido = new Dog("Fido","Bone", 5, "Woof", true);
    fido.feed(true);
    //System.out.println(fido.getIsFed());

}
}
