package moodAnalyser_Main;

public class Mood_analyser_Main {
	private String msg;
	 public Mood_analyser_Main() {
	    }
	 public Mood_analyser_Main(String msg) {
	        this.msg = msg;
	    }
public String analyseMood() {
	try {
        if (msg.contains("sad")) 
        {
            return "SAD";
        }
        else 
        {
            return "HAPPY";
         }
    } catch(Exception p) {
        return "HAPPY";
	}
}
}