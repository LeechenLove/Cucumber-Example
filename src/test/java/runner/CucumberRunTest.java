package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/6/11 22:32
 **/
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("feature") // feature目录
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps") // step目录
@CucumberOptions(
        monochrome = true,
        stepNotifications = true
)
public class CucumberRunTest {
}
