package com.beesphere.products.security.tests;

import java.util.PropertyPermission;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.binaries.provider.impl.DefaultBinariesOwnerProvider;

public class ReadPropertyPermissionTest {
	
	public static void main (String[] args) {
		SecurityAgent.initilize (
			new DefaultBinariesOwnerProvider  (
				new PropertyPermission ("java.home", "read")
			)
		);
		System.out.println (System.getProperty("java.home"));
    }

}
