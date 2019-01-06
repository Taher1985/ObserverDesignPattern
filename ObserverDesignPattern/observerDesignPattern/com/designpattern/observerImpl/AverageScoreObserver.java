package com.designpattern.observerImpl;

import com.designpattern.observer.CricketObserver;
import com.designpattern.subject.CricketSubject;

public class AverageScoreObserver implements CricketObserver {

	private float runRate;
	private int predictedScore;
	private CricketSubject cricketSubject;

	public AverageScoreObserver(CricketSubject cricketSubject) {
		super();
		this.cricketSubject = cricketSubject;
		this.cricketSubject.registerCricketObserver(this);
	}

	public void update(int runs, int wickets, float overs) {
		this.runRate = (float) runs / overs;
		this.predictedScore = (int) (this.runRate * 50);
		display();
	}

	public void display() {
		System.out.println("\nAverage Score Display:\n" + "Run Rate: "
				+ runRate + "\nPredictedScore: " + predictedScore);
	}

}
