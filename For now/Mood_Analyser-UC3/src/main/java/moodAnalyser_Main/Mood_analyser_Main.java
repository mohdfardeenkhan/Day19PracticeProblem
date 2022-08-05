package moodAnalyser_Main;

public class Mood_analyser_Main {
	private String msg;
	 public Mood_analyser_Main() {
	    }
	 public Mood_analyser_Main(String msg) {
	        this.msg = msg;
	    }
	 public String analyseMood() throws Mood_Excep {
	        try {
	            if(msg.contains("SAD")){
	                return "SAD";
	            }
	            return "HAPPY";
	        }catch (NullPointerException p){
	            return "HAPPY";
         }

	 }
}
