package moodAnalyser_Main;

public class Mood_analyser_Main {
	private String msg;

    //Default Constructor
    public Mood_analyser_Main() {
    }

    //Parameterized Constructor
    public Mood_analyser_Main(String msg) {
        this.msg = msg;
    }

    public String analyseMood() {
        if (msg.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}