package com.moodanalyzer;

public class MoodAnalyzer {
	
	public static void main(String[] args) {
		MoodAnalyzer mood = new MoodAnalyzer();
		System.out.println(mood.analyseMood("this is sad message"));
	}
	
	public String analyseMood(String message) {
		if(message.contains(("sad"))){
			return "SAD";
		}else {
			return "HAPPY";
		}
	}
}
