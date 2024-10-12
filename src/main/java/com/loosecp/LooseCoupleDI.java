package com.loosecp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;

public class LooseCoupleDI {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Traveler traveler = context.getBean(Traveler.class);
        traveler.startJourney();

        Vehicle car = context.getBean("car", Vehicle.class);
        Vehicle bike = context.getBean("bike", Vehicle.class);
        Vehicle cycle = context.getBean("cycle", Vehicle.class);

        System.out.println("\nDemonstrating different vehicles:");
        car.move();
        bike.move();
        cycle.move();

        ((AnnotationConfigApplicationContext) context).close();
    }
}