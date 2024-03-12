package day_22_arrays_introduction;

public class WhatIsArrays {
    public static void main(String[] args) {
        //What is Array??
        //--->Single object that holds multiple value of some type.
        // In arrays, we can store multiple values of same
        //Each value/element will have an index.
        //Arrays allow duplicate values.
        //Arrays remember/keep the sequence of values.
        //If we use index that is not available , in run time it will throw ArrayIndex out of bounds exception.
        //We can use arrayName.length to read the size of the array.
        //Arrays are fixed size, we cannot change the array size after declaration.
        //If you want to a resizeable array, you need to use ArrayList instead.We will learn later.
        //In programming when we store multiple values in one object, we call it DATA STRUCTURE or DATA COLLECTION.
        //Some DATA STRUCTURES in java:Arrays, ArrayList,LinkedList,Hashset,Stack,ect...
        int[] num = new int[4];
        num[0] = 100;
        num[1] = 200;
        num[2] = 700;
        num[3] = -5;
        System.out.println("Number at index0: " +num[0]);
        System.out.println("Number at index1: "+num[1]);
        System.out.println("Number at index2: "+num[2]);
        int third=num[3];
        System.out.println("Number at index1: "+third);
        int i=0;
        System.out.println(num[i]);
        i++;
        System.out.println(num[i]);
        System.out.println(num.length); //number of elements
        int length=num.length;
        System.out.println(length);

    }
}
