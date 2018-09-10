package com.beesphere.products.security.binaries.impl;

import java.security.Permission;
import java.util.Map;

import com.beesphere.products.security.permission.PermissionUtils;

public class DefaultBinariesOwner extends AbstractBinariesOwner {
	
	private static final long serialVersionUID = -8302781412564519085L;
	
	private Map<String, Permission> permissions;

	public DefaultBinariesOwner () {
		super ();
	}
	
	public DefaultBinariesOwner (String group, String name, boolean trusted) {
		super (group, name, trusted);
	}
	
	public DefaultBinariesOwner (String group, String name) {
		super (group, name);
	}
	
	public DefaultBinariesOwner (String name, boolean trusted) {
		super (name, trusted);
	}
	
	public DefaultBinariesOwner (String name) {
		super (name);
	}

	@Override
	public Map<String, Permission> getPermissions () {
		return permissions;
	}

	public void setPermissions (Map<String, Permission> permissions) {
		this.permissions = permissions;
	}

	public void addPermission (Permission permission) {
		if (permissions == null || permission == null) {
			return;
		}
		this.permissions.put (PermissionUtils.createKey (permission), permission);
	}
	
	public Permission getPermission (String name) {
		if (permissions == null || name == null) {
			return null;
		}
		return this.permissions.get (name);
	}
	
}
