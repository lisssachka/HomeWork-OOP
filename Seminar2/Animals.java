package Homework.Seminar2;
public abstract class Animals {
    private String name;
    private String color;
    private int pawsCount;

    private static int animalCount = 0;

    public String getType(){
        return this.getClass().getSimpleName();
    }

    public Animals(String name, String color, int pawsCount) {
        this.name = name ;
        this.color = color;
        this.pawsCount = pawsCount;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public Animals(String name) {
        this(name, null, 0);
    }
    
    public void wakeUp(){
        System.out.println("Wake Up!");
    }

    public void findFood(){
        System.out.println("Found food...");
    }

    public void eat(){
        System.out.println("Ate..");
    }
    
    public void toPlay(){
        System.out.println("Played...");
    }
    
    public void goToSleep(){
        System.out.println("Found food...");
    }

    public abstract void speak();
    public  abstract void hunt();
    public abstract void toGo();
    @Override
    public String toString() {
        return String.format("Имя: %s\nЦвет: %s", this.name, this.color);
    }

    public static int getAnimalCount(){
        return animalCount;
    }
}


