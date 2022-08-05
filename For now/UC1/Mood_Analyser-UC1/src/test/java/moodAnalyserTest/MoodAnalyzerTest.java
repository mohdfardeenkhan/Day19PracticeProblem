package moodAnalyserTest;

	import static org.junit.Assert.*;
	import org.assertj.core.api.Assertions;
	import org.junit.Test;
    import moodAnalyser_Main.Mood_analyser_Main;

	public class MoodAnalyzerTest {
		    @Test
		    public void testMood_MoodIsSad() {
		    	Mood_analyser_Main ma = new Mood_analyser_Main();
		        String mood = ma.analyseMood("I am in sad mood");
		        assertEquals(mood,"SAD");
		    }
	
		    @Test
		    public void testMood_MoodIsHappy() {
		    	Mood_analyser_Main ma = new Mood_analyser_Main();
		        String mood1 = ma.analyseMood("I am in any mood");
		        assertEquals(mood1,"HAPPY");    
	}
	}

