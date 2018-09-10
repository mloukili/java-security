package com.beesphere.products.security.permission;

import java.security.BasicPermission;
import java.security.Permission;

public class ThreadGroupPermission extends BasicPermission {

	private static final long serialVersionUID = -6681739695242366615L;
	
	public static final Permission INSTANCE = new ThreadGroupPermission ();

	public ThreadGroupPermission () {
		super ("< access >");
	}

}
