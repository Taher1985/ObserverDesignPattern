package com.designpattern.subjectImpl;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.observer.CricketObserver;
import com.designpattern.subject.CricketSubject;

public class CricketData implements CricketSubject {

	private int runs;
	private int wickets;
	private float overs;
	private List<CricketObserver> listCricketObserver;

	public CricketData() {
		super();
		listCricketObserver = new ArrayList<CricketObserver>();
	}

	@Override
	public void registerCricketObserver(CricketObserver cricketObserver) {
		listCricketObserver.add(cricketObserver);
	}

	@Override
	public void removeCricketObserver(CricketObserver CricketObserver) {

	}

	@Override
	public void notifyCricketObserver() {
		for (CricketObserver cricketObserver : listCricketObserver) {
			cricketObserver.update(runs, wickets, overs);
		}
	}
	
	public void setScore(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		notifyCricketObserver();
	}

}
