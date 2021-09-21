package com.moodanalyzer;

public class MoodAnalyzer {
	String message;
	
	
	public static void main(String[] args) throws MoodAnalyzerException {
		MoodAnalyzer mood = new MoodAnalyzer("This is sad message");
		System.out.println(mood.analyseMood());
	}
	
	public MoodAnalyzer() {
		this.message = null;
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalyzerException{
		try {
			if(message.contains(("sad"))){
				return "SAD";
			}else{
				return "HAPPY";
			}
		}catch(NullPointerException e) {
			return "NULL";
		}
	}
}
