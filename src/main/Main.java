package main;

import entities.ProjectStep;
import entities.ListPosition;
import entities.SimpleList;

public class Main {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        ProjectStep step3 = new ProjectStep("LUIZ", 300, null);
        ProjectStep step2 = new ProjectStep("VINCIUS", 200, step3);
        ProjectStep step1 = new ProjectStep("Gabriel", 100, step2);
        list.add(step1, ListPosition.FIRST);
        list.add(step2, ListPosition.LAST);
        list.add(step3, ListPosition.LAST);
        list.showAll();
        list.remove("VINICIUS");
        System.out.println("-------------------------------");
        list.showAll();
    }
}
