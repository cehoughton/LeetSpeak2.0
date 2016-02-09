import java.util.ArrayList;
// import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {


  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    Leetspeak leetSpeak = new Leetspeak();
    assertEquals("happy", Leetspeak.leetSpeak("happy"));
  }

  @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
  Leetspeak leetSpeak = new Leetspeak();
  assertEquals("3l3phant", Leetspeak.leetSpeak("elephant"));
  }
  @Test
  public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
  Leetspeak leetSpeak = new Leetspeak();
  assertEquals("b00 b00", Leetspeak.leetSpeak("boo boo"));
  }
  @Test
  public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
  Leetspeak leetSpeak = new Leetspeak();
  assertEquals("1 lik3 1k3", Leetspeak.leetSpeak("I like Ike"));
  }
  @Test
  public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
  Leetspeak leetSpeak = new Leetspeak();
  assertEquals("r0z3z ar3 r3d", Leetspeak.leetSpeak("roses are red"));
  }
  @Test
  public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
  Leetspeak leetSpeak = new Leetspeak();
  assertEquals("Suz13 Sunzh1n3", Leetspeak.leetSpeak("Susie Sunshine"));
  } 
}
