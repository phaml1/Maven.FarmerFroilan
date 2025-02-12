package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.creatures.*;
import com.zipcodewilmington.froilansfarm.crops.*;
import com.zipcodewilmington.froilansfarm.structures.*;
import com.zipcodewilmington.froilansfarm.vehicles.*;
import org.junit.After;
import org.junit.Before;

public class BaseDayTest {
    Farmer froilan;
    Pilot froilanda;
    Field<CropRow<Crop>> field; // Do we need to include <> in each storage/dwelling?
    CropRow cropRow1, cropRow2, cropRow3, cropRow4, cropRow5;
    ChickenCoop chickenCoop1, chickenCoop2, chickenCoop3, chickenCoop4;
    Stable stable1, stable2, stable3;
    Tractor tractor;
    CropDuster<Pilot> cropDuster;
    Silo silo;

    @Before
    public void setup(){
        froilan = new Farmer<>("Froilan");
        froilanda = new Pilot("Froilanda");
        field = new Field<>();
        cropRow1 = new CropRow<CornStalk<EarCorn>>();
        cropRow2 = new CropRow<TomatoPlant<Tomato>>();
        cropRow3 = new CropRow<BeanStalk<Bean>>();
        cropRow4 = new CropRow<CornStalk<EarCorn>>();
        cropRow5 = new CropRow<BeanStalk<Bean>>();
        field.put(cropRow1, 1);
        field.put(cropRow2, 2);
        field.put(cropRow3, 3);
        field.put(cropRow4, 4);
        field.put(cropRow5, 5);
        chickenCoop1 = new ChickenCoop();
        chickenCoop2 = new ChickenCoop();
        chickenCoop3 = new ChickenCoop();
        chickenCoop4 = new ChickenCoop();
        chickenCoop1.add(new Chicken());
        chickenCoop1.add(new Chicken());
        chickenCoop1.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        stable1 = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());
        tractor = new Tractor();
        cropDuster = new CropDuster();
        silo = new Silo();
        silo.put(100, new EarCorn(true, true)); // Add a baseline amount of food?
        silo.put(10, new Tomato(true, true));
        silo.put(100, new Bean(true, true));
        silo.put(25, new Egg(true, false));
    }

    @After
    public void tearDown(){ // Should we reset after each test? Or can it carry over to the following day somehow?

    }

    // For each day we will need the following crops:
    // 33 EarCorn
    // 3 Tomato
    // 7 Egg
    // How many Bean do the Chicken eat per day? What about the Froilan & Froilanda?
        // 2 Bean per Chicken, 1 Bean for Froilan, 3 Bean for Froilanda.
        // 34 Bean per day


}
