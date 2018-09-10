package com.beesphere.products.security.tests;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.permission.provider.impl.NoSecurityPermissionProvider;

public class NoSecurityTest {
	
	public static void main (String[] args) {
		SecurityAgent.initilize (new NoSecurityPermissionProvider ());
		System.out.println (System.getProperty("java.home"));
    }
	
}
