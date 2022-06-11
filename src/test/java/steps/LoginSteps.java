package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

/**
 * @Author: Lulu
 * @Description: Login Action Step
 * @DateTime: 2022/6/11 22:28
 **/
public class LoginSteps implements En{
    public LoginSteps() {
        Given("^User is on Home Page$", () -> {
            System.out.println("User is on Home Page");
        });

        When("^User Navigate to LogIn Page$", () -> {
            System.out.println("User Navigate to LogIn Page");
        });

        Then("^Message displayed Login Successfully$", () -> {
            System.out.println("Message displayed Login Successfully");
        });

        When("^User LogOut from the Application$", () -> {
            System.out.println("User LogOut from the Application");
        });

        Then("^Message displayed LogOut Successfully$", () -> {
            System.out.println("Message displayed LogOut Successfully");
        });

        And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$", (String username, String password) -> {
            System.out.println("username:" + username);
            System.out.println("password:" + password);
        });

        And("^User enters username and password$", () -> {
            String username = "test";
            String password = "123456";
            System.out.println("username: " + username);
            System.out.println("password: " + password);
        });

        And("^User enters Credentials to LogIn$", (DataTable usercredentials) -> {
            List<List<String>> data = usercredentials.cells();
            System.out.println(data.get(0).get(0));
            System.out.println(data.get(0).get(1));
        });

        And("^User enters Credentials to LogIn Use map$", (DataTable usercredentials) -> {
            for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
                System.out.println(data.get("username"));
                System.out.println(data.get("password"));
            }
        });
    }
}
