package com.beesphere.products.security.tests;

import java.security.Permission;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.binaries.provider.impl.DefaultBinariesOwnerProvider;

public class CanNotCreateThreadTest {
	
	public static void main (String[] args) {
		SecurityAgent.initilize (
			new DefaultBinariesOwnerProvider  ((Permission)null)
		);
		Thread t = new Thread ("myThread") {
			
		};
		t.setDaemon (true);
    }

	
}
