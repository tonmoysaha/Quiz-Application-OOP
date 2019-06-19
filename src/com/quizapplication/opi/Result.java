package com.quizapplication.opi;

public class Result implements Result_I{
    private int correctAnswer;
    private int totallQuestion;
    private double wrongAnswer;
    
	public Result(int correctAnswer, int totallQuestion, double wrongAnswer) {
		super();
		this.correctAnswer = correctAnswer;
		this.totallQuestion = totallQuestion;
		this.wrongAnswer = wrongAnswer;
	}

	@Override
	public void showResult() {
		System.out.println("Your rResult");
		System.out.println("Totall Questions: "+ totallQuestion);
		System.out.println("Totall Wrong Answer: "+ wrongAnswer);
		System.out.println("Your Percentage: "+ showPercentage(correctAnswer, totallQuestion));
		System.out.println("Your Performance: "+showPerformance(showPercentage(correctAnswer, totallQuestion)));
		
	}

	@Override
	public double showPercentage(int correctAnswer, int totallQuestion) {
		// TODO Auto-generated method stub
		return ((double)(correctAnswer/totallQuestion))*100;
	}

	@Override
	public String showPerformance(double percentage) {
		// TODO Auto-generated method stub
		String performance = "";
		if (percentage > 80) {
			performance = "very good";
		}else if (percentage < 50) {
			performance = "good";
		}else {
			performance = "average";
		}
		return performance;
	}

}
