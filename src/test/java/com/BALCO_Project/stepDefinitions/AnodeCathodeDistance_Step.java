package com.BALCO_Project.stepDefinitions;

import com.BALCO_Project.base.BaseClass;
import com.BALCO_Project.pom.AnodeCathodeDistance;

import io.cucumber.java.en.When;

public class AnodeCathodeDistance_Step extends BaseClass {

    AnodeCathodeDistance acd;

    @When("User clicks Entry Forms")
    public void user_clicks_entry_forms() {
        acd = new AnodeCathodeDistance(driver);
        acd.clickEntryForms();
    }

    @When("User clicks Process Control")
    public void user_clicks_process_control() {
        acd.clickProcessControl();
    }

    @When("User clicks Anode Cathode Distance")
    public void user_clicks_anode_cathode_distance() {
        acd.clickACD();
    }
    
    @When("User selects ACD date")
    public void user_selects_acd_date() {

        acd.selectDate();
    }

    @When("User selects shift")
    public void user_selects_shift() {

        acd.selectShift();
    }

    @When("User selects plant")
    public void user_selects_plant() {

        acd.selectPlant();
    }
    
    
    @When("User selects room")
    public void user_selects_room() {

        acd.selectRoom();
    }

    @When("User selects section")
    public void user_selects_section() {

        acd.selectSection();
    }
    
    
    @When("User selects measurement time {string} and {string}")
    public void user_selects_measurement_time(String hour, String minute) {

        acd.selectMeasurementTime(hour, minute);
    }

    @When("User selects pot number {string}")
    public void user_selects_pot_number(String pot) {

        acd.selectPot(pot);
    }

    @When("User enters ACD value {string}")
    public void user_enters_acd_value(String value) {

        acd.enterACDValue(value);
    }
    
    
    @When("User submits the form")
    public void user_submits_the_form() {

        acd.submitForm();
    }
}