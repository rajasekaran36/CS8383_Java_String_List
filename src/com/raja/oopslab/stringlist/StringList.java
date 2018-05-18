package com.raja.oopslab.stringlist;

import java.util.ArrayList;

public class StringList {
ArrayList<String> listOfStrings;
public StringList() {
	listOfStrings = new ArrayList<String>();
}

public boolean addString(String aString){
	boolean result = listOfStrings.add(aString);
	return result;
}
public void insertStringAt(int position, String aString){
	int list_size = listOfStrings.size();
	int cur_pos = 0;
	ArrayList<String> templist = new ArrayList<String>();
	if(position>list_size)
		System.out.println("Sorry Position is not in the list limit");
	else {
		for(String elememt:listOfStrings){
			
			if(cur_pos == position)
				templist.add(aString);
			
			templist.add(elememt);
			cur_pos++;
		}
	}
	listOfStrings = templist;
}
public void displayList(){
	for(String element:listOfStrings)
		System.out.println(element);
}
public void searchString(String aString){
	int cur_pos = 0;
	int foundAt = -1;
	for(String element:listOfStrings){
		if(element.equalsIgnoreCase(aString))
			foundAt = cur_pos;
		else
			cur_pos++;
	}
	if(foundAt>=0)
		System.out.println("Your string"+aString+" found at position "+cur_pos);
	else
		System.out.println("String not found in the list");
}
public void displayStringsBeginWith(String aLetter){
	
	for (String element:listOfStrings){
		String firstLetter  = String.valueOf(element.charAt(0));
		if(aLetter.equals(firstLetter))
			System.out.println(element);
	}
}
}
