package com.designpattern.observerImpl;

import com.designpattern.observer.CricketObserver;
import com.designpattern.subject.CricketSubject;

public class CurrentScoreObserver implements CricketObserver {

	private int runs;
	private int wickets;
	private float overs;
	private CricketSubject cricketSubject;

	public CurrentScoreObserver(CricketSubject cricketSubject) {
		super();
		this.cricketSubject = cricketSubject;
		this.cricketSubject.registerCricketObserver(this);
	}

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}

	public void display() {
		System.out.println("\nCurrent Score Display: \n" + "Runs: " + runs
				+ "\nWickets:" + wickets + "\nOvers: " + overs);
	}

}
