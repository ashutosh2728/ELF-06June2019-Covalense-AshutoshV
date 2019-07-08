package com.covalense.assgnassessment.songssort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class SongsTest {
	public static void main(String[] args) throws ParseException {
		
		  ArrayList<Songs> list = new ArrayList<>();
	      
				list.add(new Songs("Song1", new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("01-01-2015 02:05:55")));
				list.add(new Songs("Song2", new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("05-05-2019 12:05:15")));
				list.add(new Songs("Song3", new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("05-05-2019 22:05:45")));
				list.add(new Songs("Song4", new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("23-08-2009 01:05:55")));
				list.add(new Songs("Song5", new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse("30-11-1885 15:05:25")));
				
				Comparator<Songs> comparator = (i,j)-> i.getSongsTime().compareTo(j.getSongsTime());
				List<Songs> sortedSongsList =list.stream().sorted(comparator).collect(Collectors.toList());
				for (Songs songs : sortedSongsList) {
					log.info(""+songs.toString());
				}
			
	}

}
