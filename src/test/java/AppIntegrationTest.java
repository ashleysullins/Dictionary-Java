import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.SECONDS;

import static org.assertj.core.api.Assertions.assertThat;

public class AppIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
  goTo("http://localhost:4567/");
  assertThat(pageSource()).contains("Suburban Dictionary");
  }

  @Test
  public void wordIsAddedTest() {
    goTo("http://localhost:4567/");
    fill("#newWord").with("Dictionary");
    submit(".btn");
    assertThat(pageSource()).contains("Dictionary");
  }

  @Test
  public void definitionIsAddedToWord() {
    goTo("http://localhost:4567/");
    fill("#newWord").with("Dictionary");
    submit(".btn");
    assertThat(pageSource()).contains("Dictionary");
  //  click("a", withText("Dictionary"));
  //  fill("#newDefinition").with("A resource that lists words and their meanings");
  //  submit(".btn");
  //  assertThat(pageSource()).contains("A resource that lists words and their meanings");
  //  click("a", withText("A resource that lists words and their meanings"));
  //  assertThat(pageSource()).contains("A resource that lists words and their meanings");
  }
  
}
