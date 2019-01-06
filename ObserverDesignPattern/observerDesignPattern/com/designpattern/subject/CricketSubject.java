package com.designpattern.subject;

import com.designpattern.observer.CricketObserver;

public interface CricketSubject {

	public void registerCricketObserver(CricketObserver cricketObserver);

	public void removeCricketObserver(CricketObserver cricketObserver);

	public void notifyCricketObserver();

}
