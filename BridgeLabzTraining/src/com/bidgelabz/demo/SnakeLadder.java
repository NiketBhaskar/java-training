package com.bidgelabz.demo;

public class SnakeLadder {
	int position;
	static void Player(){
		int position = (int)((Math.random()*6)+1);
		System.out.println(position);
	}
	public static void main(String[] args) {
		Player();
	}
}
