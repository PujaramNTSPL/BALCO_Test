package com.BALCO_Project.stepDefinitions;

import com.BALCO_Project.base.BaseClass;


import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void setup() {

        initializeDriver();          
        driver.manage().window().maximize();   
    }

    
    }
