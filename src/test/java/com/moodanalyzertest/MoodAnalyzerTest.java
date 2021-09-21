package com.moodanalyzertest;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;
import com.moodanalyzer.MoodAnalyzerException;

import junit.framework.Assert;

public class MoodAnalyzerTest {
	
	@Test
	public void sadCheck() {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("this is sad message");
			String message = moodAnalyzer.analyseMood();
			Assert.assertEquals(message, "SAD");
		}catch(MoodAnalyzerException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void happyCheck() {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("this is happy message");
			String message = moodAnalyzer.analyseMood();
			Assert.assertEquals(message, "HAPPY");
		}catch(MoodAnalyzerException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void nullCheck() {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
			String message = moodAnalyzer.analyseMood();
			
		}catch(MoodAnalyzerException e) {
			Assert.assertEquals(e.getMessage(), "NULL");
		}
	}
}
