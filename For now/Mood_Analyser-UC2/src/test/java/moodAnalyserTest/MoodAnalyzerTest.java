package moodAnalyserTest;

import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import moodAnalyser_Main.Mood_analyser_Main;

public class MoodAnalyzerTest {
	    @Test
	    public void testMood_MoodIsSad() {
	    	Mood_analyser_Main ma = new Mood_analyser_Main("I am in sad mood ");
	        String mood = ma.analyseMood();
	        assertEquals(mood,"SAD");
	    }
	    @Test
	    public void testMood_MoodIsHappy() {
	    	Mood_analyser_Main ma = new Mood_analyser_Main("I am in any mood ");
	        String mood1 = ma.analyseMood();
	        assertEquals(mood1,"HAPPY");
	    }

      @Test
      public void Null() {
    	  Mood_analyser_Main ma = new Mood_analyser_Main(null);
      String mood2 = ma.analyseMood();
    assertEquals(mood2,"HAPPY");

}
}