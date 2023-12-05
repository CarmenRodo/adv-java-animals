package us.rodolfocarmen;

public class Animal extends Pet implements Talkable {
    public Animal(String name) {
        super(name);
    }
    @Override
    public String talk(){
        return "Bark";
    }
}
