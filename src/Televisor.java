class Televisor {
    int turnOff = a;
    int turnOn = b;

    boolean telewizorJestWlaczony = a>b; //true

    System.out.println("Czy telewizor jest wlączony? " + telewizorJestWlaczony);

    showStatus() {
        System.out.println(telewizorJestWlaczony);
    }

}
