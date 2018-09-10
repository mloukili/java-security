package com.beesphere.products.security.permission;

import java.security.AllPermission;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.util.Enumeration;

public class AllPermissionsCollection extends PermissionCollection {
	
	private static final long serialVersionUID = -8043228285935178363L;

	public static final AllPermission ALL_PERMISSION = new AllPermission ();
	
	private Permissions proxy = new Permissions ();
	
	public AllPermissionsCollection () {
		proxy.add (ALL_PERMISSION);
	}

	@Override
	public void add (Permission permission) {
		proxy.add (permission);
	}

	@Override
	public Enumeration<Permission> elements() {
		return proxy.elements();
	}

	@Override
	public boolean implies(Permission permission) {
		return proxy.implies (permission);
	}

}
