package com.company.sikuli_demo;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

/**
 * 参考:http://www.cnblogs.com/fnng/archive/2012/12/15/2819367.html
 *
 */
public class SikuliTest {

	public static void main(String[] args) throws FindFailed {
		 Screen screen = new Screen();

	     screen.click("/img/start.jpg");
	     screen.click("/img/computer.jpg");
	}
	
}
