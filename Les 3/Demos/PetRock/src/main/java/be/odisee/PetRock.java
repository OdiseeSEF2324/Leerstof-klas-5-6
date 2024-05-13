package be.odisee;

public class PetRock {

    private String name;
    private boolean happy;

    public PetRock(String name) {
        this.name = name;
        this.happy = false;
    }

    public String getName() {
        return name;
    }

    public boolean IsHappy(){
        return happy;
    }

    public void play(){
        this.happy = true;
    }
}
