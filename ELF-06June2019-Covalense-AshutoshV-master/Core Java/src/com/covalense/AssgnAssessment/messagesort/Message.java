package com.covalense.assgnassessment.messagesort;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Message {
	private String message;
	private Date messageTime;

}
