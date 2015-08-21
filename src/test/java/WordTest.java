import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("Dictionary");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_instantiatesWithName_true() {
    Word myWord = new Word("Dictionary");
    assertEquals("Dictionary", myWord.getName());
  }
}
