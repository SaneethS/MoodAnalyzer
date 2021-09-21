package com.moodanalyzertest;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;

import junit.framework.Assert;

public class MoodAnalyzerTest {
	
	@Test
	public void sadCheck() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("this is sad message");
		String message = moodAnalyzer.analyseMood();
		Assert.assertEquals(message, "SAD");
	}
	
	@Test
	public void happyCheck() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("this is happy message");
		String message = moodAnalyzer.analyseMood();
		Assert.assertEquals(message, "HAPPY");
	}
	
	@Test
	public void nullCheck() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = moodAnalyzer.analyseMood();
		Assert.assertEquals(message, "HAPPY");
	}
}
