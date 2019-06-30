package com.covalense.filecreationutilnew;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.filecreationutilnew.util.CreateFileUtil;

public class CreateFileuUtilTest {

	private CreateFileUtil cf = new CreateFileUtil();

	@Test
	public void createFileTest() {
		boolean actual = cf.createFile("createFile.txt", "Hello sir");
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
