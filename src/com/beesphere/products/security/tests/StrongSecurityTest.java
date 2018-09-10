package com.beesphere.products.security.tests;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.permission.provider.impl.ClosedDoorPermissionProvider;

public class StrongSecurityTest {

	public static void main (String[] args) {
		SecurityAgent.initilize (new ClosedDoorPermissionProvider ());
		System.out.println (System.getProperty("user.home"));
    }

}
