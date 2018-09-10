package com.beesphere.products.security.tests;

import java.io.File;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.permission.provider.impl.ClosedDoorPermissionProvider;

public class StrongSecurityTestFilePermission {

	public static void main (String[] args) {
		SecurityAgent.initilize (new ClosedDoorPermissionProvider ());
		File[] files = new File ("/tmp").listFiles();
		System.out.println(files.length);
    }

}
