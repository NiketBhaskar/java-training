package com.observedesignpattern;

public class Main {
public static void main(String[] args) {
	Subject subject = new Subject();
	AboutPage aboutPage = new AboutPage();
	LoginPage loginPage = new LoginPage();
	BillPage billPage = new BillPage();
	RegistrationPage registrationPage = new RegistrationPage();
	DashboardPage dashboardPage = new DashboardPage();
	
	subject.register(aboutPage);
	subject.register(loginPage);
	subject.register(billPage);
	subject.register(registrationPage);
	subject.register(dashboardPage);
	
	subject.update("data");
	
	subject.unRegister(aboutPage);
	
	subject.update("Other data");
	
}
}
