package Homework.Seminar3.drugs.impl.components;

import Homework.Seminar3.drugs.Component;

public class Azitronit extends Component {
    public Azitronit(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Azitronit(String weight, int power) {
        this("Азитромицин", weight, power);
    }
}
