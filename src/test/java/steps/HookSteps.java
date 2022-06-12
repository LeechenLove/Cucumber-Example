package steps;

import io.cucumber.java8.En;

/**
 * @Author: Lulu
 * @Description: HookSteps
 * @DateTime: 2022/6/12 14:51
 **/
public class HookSteps implements En {
    public HookSteps() {

        Given("^this is the first step$", () -> {
            System.out.println("This is the first step");
        });

        When("^this is the second step$", () -> {
            System.out.println("This is the second step");
        });

        Then("^this is the third step$", () -> {
            System.out.println("This is the third step");
        });

        Given("^this is the background step$", () -> {
            System.out.println("this is the background step");
        });
    }
}
