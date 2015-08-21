import java.util.ArrayList;

public class Word {
  private String mName;
  private static ArrayList<Word> occurence = new ArrayList<Word>();
  private int mId;

  public Word(String name) {
    mName = name;
    occurence.add(this);
    mId = occurence.size();
  }

  public String getName() {
    return mName;
  }

  public int getId() {
  return mId;
  }

  public static ArrayList<Word> all() {
  return occurence;
  }

  public static Word find(int id) {
    try {
      return occurence.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    occurence.clear();
  }

}
