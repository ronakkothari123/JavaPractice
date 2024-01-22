package Polymorphism;

class Bird {
    public void sing() {
        System.out.println("Tweet Tweet Tweet");
    }
}

class Robin extends Bird {
    public void sing(){
        System.out.println("Twiddledeedee");
    }
}

class Pelican extends Bird {
    public void sing(String song){
        System.out.println("KWAAH " + song);
    }
}

public class Main {
    public static void main(String[] args) {
        Pelican b = new Pelican();
        b.sing("Something");
    }
}
