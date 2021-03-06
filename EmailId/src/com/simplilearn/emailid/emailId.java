package com.simplilearn.emailid;

import java.util.regex.*;
import java.util.*;

public class emailId {
	public static void main(String args[]) {
		ArrayList<String> emails = new ArrayList<String>();

		emails.add("sravan@simplilearn.co.in");
		emails.add("kumar@simplilearn.com");
		emails.add("raju@simplilearn.com");
		emails.add("anil@simplilearn.co.in");
		emails.add("vinay@simplilearn.com");
		// Add invalid emails in list
		emails.add(".mani@simplilearn.com");
		emails.add("javid@simplilearn.com.");
		emails.add("hemanth#simplilearn.com");
		emails.add("vivek*simplilearn.com");
		// Regular Expression
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		// Compile regular expression to get the pattern
		Pattern pattern = Pattern.compile(regex);
		// Iterate emails array list
		for (String email : emails) {
			// Create instance of matcher
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches() + "\n");
		}
	}

}
