package com.design.pattern.client;

import com.designpattern.observerImpl.AverageScoreObserver;
import com.designpattern.observerImpl.CurrentScoreObserver;
import com.designpattern.subjectImpl.CricketData;

public class ObserverClient {

	public static void main(String[] args) {

		CricketData cricketData = new CricketData();

		CurrentScoreObserver currentScoreObserver = new CurrentScoreObserver(cricketData);
		AverageScoreObserver averageScoreObserver = new AverageScoreObserver(cricketData);
		cricketData.setScore(45, 2, 10.2f);
	}

}
