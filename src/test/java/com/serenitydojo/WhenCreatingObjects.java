package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog (){
    //attributes belong to the dog
    String name = "Fido";
    String favoriteToy = "Bone";
    int age = 5;

    //create the Dog object
    Dog fido = new Dog();

    // actual attributes values
    fido.setName("Fido");
    System.out.println(fido.getName());

    fido.setFavoriteToy("Bone");
    System.out.println(fido.getFavoriteToy());

    fido.setAge(5);
    System.out.println(fido.getAge());

    }


//        Assert.assertEquals(fido.getName(), "Fido");
//        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
//        Assert.assertEquals(fido.getAge(), 5);
}
