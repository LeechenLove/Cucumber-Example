package steps;

import io.cucumber.java.*;

/**
 * @Author: Lulu
 * @Description: Hooks
 * @DateTime: 2022/6/12 15:13
 **/
public class Hooks {
    @Before("@testbefore")
    public void beforeScenario(Scenario scenario){
        System.out.println("Run this method before scenario");
    }

    @After("@testafter")
    public void afterScenario(Scenario scenario){
        System.out.println("Run this method after scenario");
    }

    @Before(order = 0)
    public void beforeScenario0(){
        System.out.println("Run this method before scenario order 0 ");
    }

    @After(order = 0)
    public void afterScenario0(){
        System.out.println("Run this method after scenario order 0 ");
    }

    @Before(order = 1)
    public void beforeScenario1(){
        System.out.println("Run this method before scenario order 1");
    }

    @After(order = 1)
    public void afterScenario1(){
        System.out.println("Run this method after scenario order 1");
    }

    @BeforeAll()
    public static void beforeAllScenario(){
        System.out.println("Run this method before all scenario");
    }

    @AfterAll
    public static void afterAllScenario(){
        System.out.println("Run this method after all scenario");
    }

    @BeforeStep(order=0)
    public void beforeStepScenario0(Scenario scenario){
        System.out.println("Run this method before step order 0");
    }

    @AfterStep(order=0)
    public void afterStepScenario0(Scenario scenario){
        System.out.println("Run this method after step order 0");
    }

    @BeforeStep(order=1)
    public void beforeStepScenario1(Scenario scenario){
        System.out.println("Run this method before step order 1");
    }

    @AfterStep(order=1)
    public void afterStepScenario1(Scenario scenario){
        System.out.println("Run this method after step order 1");
    }

    @BeforeStep("@testBeforeStep")
    public void beforeStepScenarioTag(Scenario scenario){
        System.out.println("Run this method before step");
    }

    @AfterStep("@testAfterStep")
    public void afterStepScenarioTag(Scenario scenario){
        System.out.println("Run this method after step");
    }
}
