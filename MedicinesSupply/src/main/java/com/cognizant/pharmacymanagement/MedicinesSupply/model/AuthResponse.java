package com.cognizant.pharmacymanagement.MedicinesSupply.model;

public class AuthResponse {
	public AuthResponse(String string, String string2, boolean b) {
		// TODO Auto-generated constructor stub
		uid=string;
		name=string2;
		isValid=b;
	}
	private String uid;
	private String name;
	private boolean isValid;
}
