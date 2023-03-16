package Homework.Seminar3.drugs.impl;

import Homework.Seminar3.drugs.Component;
import Homework.Seminar3.drugs.Drug;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CatDrug extends Drug {
    public CatDrug(List<Component> components) {
        super(components, 0);
    }


}
