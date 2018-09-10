package com.beesphere.products.security.permission;

import java.security.Permission;

public class PermissionUtils {
	
	private static final String DOT = ".";
	
	public static String createKey (Permission permission) {
		if (permission.getName () != null) {
			return permission.getClass ().getName () + DOT + permission.getName ();
		}
		return permission.getClass ().getName ();
	}
	
}
