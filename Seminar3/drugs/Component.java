package Homework.Seminar3.drugs;

public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Component component = (Component) obj;
        return this.name.equals(component.getName())
                && this.weight.equals(component.getWeight())
                && this.power == component.getPower();
    }
    @Override
    public int hashCode() {
        int res = name == null ? 0 : name.hashCode();
        res += weight == null ? 0 : weight.hashCode();
        res += power;
        return res;
    }
    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Component o) {
        int result = 0;
        if (this.power == o.power) {
            result = this.name.compareTo(o.name);
        } else if (this.power > o.power) result = 1;
        else result = -1;
        return result;
    }

}
