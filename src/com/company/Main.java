package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Clock c1 = new Clock();
        Clock c2 = new Clock();

        c2.setHour(14);
        c2.setMinute(23);
        c2.setSecond(34);

        System.out.println(c2.getHour() + ":" + c2.getMinute() + ":" + c2.getSecond());

        System.out.println(c2.displayTime());
        System.out.println(c1.displayTime());

        AlarmClock c3 = new AlarmClock(12, 13, 14, 5, 30);
        AlarmClock c4 = new AlarmClock();

        System.out.println("Alarm Clock c3 : " + c3.displayTime());
        System.out.println("Alarm Clock c4 : " + c4.displayTime());

//              MAKING ALARMS
                Clock GranPaClock = new Clock();
                Clock WallClock = new Clock();
                AlarmClock WristWatch = new AlarmClock();
                AlarmClock DeskClock = new AlarmClock();




        Clock[] a1 = {GranPaClock, WallClock, WristWatch, DeskClock};

//        a1.add(GranPaClock);
//        a1.add(WallClock);
//        a1.add(WristWatch);
//        a1.add(DeskClock);

        for (Clock o : a1) {
            System.out.println(o.displayTime());
        }

//      CIRCLES
        Circle circ1 = new Circle();
        System.out.println(circ1.getArea());

//      SET RADIUS to 3
        circ1.setRadius(3);
        System.out.println(circ1);


        Circle circ2 = new Circle(9);
        System.out.println(circ2.getArea());

        Cylinder cyl1 = new Cylinder();
        System.out.println(cyl1.getArea());
        cyl1.setRadius(2);
        cyl1.setLength(5);
        System.out.println(cyl1.getArea());

        Cylinder cyl4 = new Cylinder(3, 9);
        System.out.println(cyl4.getArea());







    }
}
