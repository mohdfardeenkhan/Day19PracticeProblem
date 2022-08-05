package moodAnalyser_Main;

public class Mood_analyser_Main {

	public String analyseMood(String msg) {
		if(msg.contains(("sad"))) {
			return "SAD";
		}
		else {
			return "HAPPY";
			
		}
	}
}
