import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  
  @Rule
  public ClearRule clearRule = new ClearRule();

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

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Dictionary");
    Word secondWord = new Word("Engineering");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void newId_WordInstantiateWithAnID_true() {
    Word myWord = new Word("Dictionary");
    assertEquals(Word.all().size(), myWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("Dictionary");
    Word secondWord = new Word("Engineering");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

  @Test
  public void find_returnsNullWhenNoWordFound_null() {
    assertTrue(Word.find(999) == null);
  }

  @Test
  public void clear_emptiesAllWordsFromArrayList() {
    Word myWord = new Word("Dictionary");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

}
