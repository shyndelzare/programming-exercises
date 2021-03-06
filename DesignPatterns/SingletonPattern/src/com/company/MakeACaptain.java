package com.company;

public class MakeACaptain {
    private MakeACaptain() {}

    public static MakeACaptain getCaptain() {
        return SingletonHelper.captain;
    }

    /* When the singleton class is loaded, inner class is not loaded and hence doesn't create object when loading the class.
     * Inner class is created only when getInstance() method is called.
     * So it may seem like eager initialization but it is lazy initialization.
     * This is the most widely used approach as it doesn't use synchronization. */
    private static class SingletonHelper {
        private static final MakeACaptain captain = new MakeACaptain();
    }
}
