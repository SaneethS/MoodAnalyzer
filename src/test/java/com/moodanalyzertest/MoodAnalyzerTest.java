package com.moodanalyzertest;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;

import junit.framework.Assert;

public class MoodAnalyzerTest {
	
	@Test
	public void sadCheck() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = moodAnalyzer.analyseMood("this is sad message");
		Assert.assertEquals(message, "SAD");
	}
	
	@Test
	public void happyCheck() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = moodAnalyzer.analyseMood("this is happy message");
		Assert.assertEquals(message, "HAPPY");
	}
}
