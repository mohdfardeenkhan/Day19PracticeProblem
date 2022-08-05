package moodAnalyserTest;

import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import moodAnalyser_Main.Mood_Excep;
import moodAnalyser_Main.Mood_analyser_Main;

public class MoodAnalyzerTest {
	
	    @Test
	    public void testMood_MoodIsSad(){
	    	Mood_analyser_Main ma = new Mood_analyser_Main("I am in Sad Mood");
	        String mood = null;
	        try {
	            mood = ma.analyseMood();
	        }catch (Mood_Excep p){
	            System.out.println(p);
		    assertEquals("SAD",mood);
	        }
	        
	    }

	    @Test
	    public void testMood_MoodIsHappy(){
	    	Mood_analyser_Main ma = new Mood_analyser_Main("I am in Happy Mood");
	        String mood1 = null;
	        try{
	            mood1 = ma.analyseMood();
	            assertEquals("HAPPY",mood1);
	        }catch (Mood_Excep p){
	            System.out.println(p);
	        }
	    }

	    @Test
	    public void Null() {
	        String mood2 = null;
	        Mood_analyser_Main ma = new Mood_analyser_Main(null);
	        try{
	            mood2 = ma.analyseMood();
	            assertEquals("HAPPY",mood2);
	        }catch (Mood_Excep p){
	            System.out.println(p);
	        }
	    }

	    @Test
	    public void givenEmptyMood(){
	        String mood3 = null;
	        Mood_analyser_Main ma = new Mood_analyser_Main();
	        try{
	            mood3 = ma.analyseMood();
	            assertEquals("HAPPY",mood3);
	        }catch (Mood_Excep p){
	            System.out.println(p);
	        }
	    }
	}