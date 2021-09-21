package com.moodanalyzer;

public class MoodAnalyzer {
	String message;
	
	public static void main(String[] args) {
		MoodAnalyzer mood = new MoodAnalyzer();
		System.out.println(mood.analyseMood());
	}
	
	public MoodAnalyzer() {
		this.message = null;
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		try {
			if(message.contains(("sad"))){
				return "SAD";
			}else{
				return "HAPPY";
			}
		}catch(NullPointerException e) {
			return "HAPPY";
		}
	}
}
