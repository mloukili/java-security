package com.beesphere.products.security.tests;

import java.util.PropertyPermission;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.binaries.provider.impl.DefaultBinariesOwnerProvider;

public class WritePropertyPermissionTest {
	
	public static void main (String[] args) {
		SecurityAgent.initilize (
			new DefaultBinariesOwnerProvider  (
					new PropertyPermission ("aProp", "write")
			)
		);
		System.setProperty("aProp", "foo");
		System.out.println(System.getProperties());
    }

}
