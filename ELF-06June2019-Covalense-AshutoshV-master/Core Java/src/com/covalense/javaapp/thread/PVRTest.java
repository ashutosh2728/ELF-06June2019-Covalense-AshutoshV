package com.covalense.javaapp.thread;

public class PVRTest {
	public static void main(String[] args) {
		PVR p = new PVR();
		Browser b = new Browser(p);
		b.start();

		Browser c = new Browser(p);
		c.start();

		Browser d = new Browser(p);
		d.start();

		p.leave();
	}
}
