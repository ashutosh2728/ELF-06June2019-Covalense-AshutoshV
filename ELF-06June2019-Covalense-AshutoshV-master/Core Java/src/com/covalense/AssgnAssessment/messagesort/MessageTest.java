package com.covalense.assgnassessment.messagesort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class MessageTest {
public static void main(String[] args) throws ParseException {
	ArrayList<Message> arrayList = new ArrayList<Message>();
	arrayList.add(new Message("Hello Good Morning",new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("01-01-2015 06:05:55")));
	arrayList.add(new Message("Hello Good Afternoon",new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("01-01-2015 11:30:15")));
	arrayList.add(new Message("Hello Good Evening",new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("01-01-2015 17:05:55")));
	arrayList.add(new Message("Hello Good Night",new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("01-01-2015 23:05:55")));
	arrayList.add(new Message("Hello Good Morning",new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("02-01-2015 07:05:55")));
	arrayList.add(new Message("Hello Good Morning",new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("02-01-2015 05:05:55")));
	Comparator<Message> comparator = (i,j)-> i.getMessageTime().compareTo(j.getMessageTime());
	List<Message> list =arrayList.stream().sorted(comparator).collect(Collectors.toList());
	for (Message message : list) {
		log.info("Message : "+message.getMessage());
		log.info("Time : "+message.getMessageTime());
	}
	
}
}
