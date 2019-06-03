package com.quizapplication.opi;

public interface Result_I {
	public void showResult();
	public double showPercentage(int correctAnswer , int totallQuestion);
	public String showPerformance(double percentage);
}
