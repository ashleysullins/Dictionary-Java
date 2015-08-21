import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

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

  // @Test
  // public void categoryIsCreatedTest() {
  //   goTo("http://localhost:4567/");
  //   click("a", withText("Add a New Category"));
  //   fill("#name").with("Household chores");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Your category has been saved.");
  // }
  // 
  // @Test
  // public void categoryIsDisplayedTest() {
  //   goTo("http://localhost:4567/categories/new");
  //   fill("#name").with("Household chores");
  //   submit(".btn");
  //   click("a", withText("View all"));
  //   assertThat(pageSource()).contains("Household chores");
  // }
  // 
  // @Test
  // public void categoryTasksFormIsDisplayed() {
  //   goTo("http://localhost:4567/categories/new");
  //   fill("#name").with("Shopping");
  //   submit(".btn");
  //   click("a", withText("View all"));
  //   click("a", withText("Shopping"));
  //   click("a", withText("Add a new task"));
  //   assertThat(pageSource()).contains("Add a task to Shopping");
  // }
  // 
  // @Test
  // public void tasksIsAddedAndDisplayed() {
  //   goTo("http://localhost:4567/categories/new");
  //   fill("#name").with("Banking");
  //   submit(".btn");
  //   click("a", withText("View all"));
  //   click("a", withText("Banking"));
  //   click("a", withText("Add a new task"));
  //   fill("#description").with("Deposit paycheck");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Deposit paycheck");
  // }
}
