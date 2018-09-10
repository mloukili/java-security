package com.beesphere.products.security.tests;

import java.io.File;
import java.io.IOException;

public abstract class BasicTest {

	public static void main (String [] args) throws IOException {
		System.out.print (new File ("/projects/work").toURI ().getRawPath ());
	}

}
