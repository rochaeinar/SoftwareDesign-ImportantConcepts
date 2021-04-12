package com.patterns.optional;

import java.util.Date;

public class Form {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String address;
	private Date dob;
	private String email;
	private String backupEmail;
	private String spouseName;
	private String city;
	private String state;
	private String country;
	private String language;
	private String passwordHint;
	private String securityQuestion;
	private String securityAnswer;
	

	
	public Form(FormBuilder formBuilder){
		
		this.firstName = formBuilder.firstName;
		this.lastName = formBuilder.lastName;
		this.userName = formBuilder.userName;
		this.password = formBuilder.password;
		this.address = formBuilder.address;
		this.dob = formBuilder.dob;
		this.email = formBuilder.email;
		this.backupEmail = formBuilder.backupEmail;
		this.spouseName = formBuilder.spouseName;
		this.city = formBuilder.city;
		this.state = formBuilder.state;
		this.country =  formBuilder.country;
		this.language = formBuilder.language;
		this.passwordHint = formBuilder.passwordHint;
		this.securityQuestion = formBuilder.securityQuestion;
		this.securityAnswer = formBuilder.securityAnswer;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(" First Name: ");
		sb.append(firstName);
		sb.append("\n Last Name: ");
		sb.append(lastName);
		sb.append("\n User Name: ");
		sb.append(userName);
		sb.append("\n Password: ");
		sb.append(password);
		
		if(this.address!=null){
			sb.append("\n Address: ");
			sb.append(address);
		}
		if(this.dob!=null){
			sb.append("\n DOB: ");
			sb.append(dob);
		}
		if(this.email!=null){
			sb.append("\n Email: ");
			sb.append(email);
		}
		if(this.backupEmail!=null){
			sb.append("\n Backup Email: ");
			sb.append(backupEmail);
		}
		if(this.spouseName!=null){
			sb.append("\n Spouse Name: ");
			sb.append(spouseName);
		}
		if(this.city!=null){
			sb.append("\n City: ");
			sb.append(city);
		}
		if(this.state!=null){
			sb.append("\n State: ");
			sb.append(state);
		}
		if(this.country!=null){
			sb.append("\n Country: ");
			sb.append(country);
		}
		if(this.language!=null){
			sb.append("\n Language: ");
			sb.append(language);
		}
		if(this.passwordHint!=null){
			sb.append("\n Password Hint: ");
			sb.append(passwordHint);
		}
		if(this.securityQuestion!=null){
			sb.append("\n Security Question: ");
			sb.append(securityQuestion);
		}
		if(this.securityAnswer!=null){
			sb.append("\n Security Answer: ");
			sb.append(securityAnswer);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Form form = new FormBuilder("Dave", "Carter", "DavCarter", "DAvCaEr123")
				.passwordHint("MyName")
				.city("NY")
				.language("English")
				.build();
		System.out.println(form);
	}

}
