package com.observedesignpattern;

public class Page {
	public void onDataReceived(String data) {
		System.out.println("Data Received in " + getClass().getSimpleName() +data);
	}
}
