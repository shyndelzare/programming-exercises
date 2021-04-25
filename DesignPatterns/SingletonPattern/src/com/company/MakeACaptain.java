package com.company;

public class MakeACaptain {

    //private static MakeACaptain _captain = new MakeACaptain(); /* Eager initialization but class is always instantiated*/
    private static MakeACaptain captain;

    private MakeACaptain() {}

    //public static synchronized MakeACaptain getCaptain() /* Performance cost with synchronized method */
    public static MakeACaptain getCaptain() {
        //lazy initialization
        if (captain == null) {
            captain = new MakeACaptain();
            System.out.println("New captain selected.");
        } else {
            System.out.println("You already have a captain");
            System.out.println("Send him/her for the toss.");
        }
        return captain;
    }
}
