package com.beesphere.products.security.binaries.provider.impl;

import java.security.CodeSource;
import java.security.Permission;
import java.util.HashMap;
import java.util.Map;

import com.beesphere.products.security.binaries.BinariesOwner;
import com.beesphere.products.security.binaries.impl.DefaultBinariesOwner;
import com.beesphere.products.security.binaries.provider.BinariesOwnerProvider;
import com.beesphere.products.security.permission.PermissionUtils;

public class DefaultBinariesOwnerProvider implements BinariesOwnerProvider {

	private static final long serialVersionUID = -994330717046439817L;
	
	private Map<String, Permission> permissions;
	
	public DefaultBinariesOwnerProvider (Map<String, Permission> permissions) {
		this.permissions = permissions;
	}

	public DefaultBinariesOwnerProvider (Permission permission) {
		permissions = new HashMap<String, Permission> ();
		if (permission == null) {
			return;
		}
		permissions.put (PermissionUtils.createKey (permission), permission);
	}

	@Override
	public BinariesOwner find (CodeSource codeSource) {
		DefaultBinariesOwner owner = 
			new DefaultBinariesOwner (BinariesOwner.DEFAULT_OWNER, false);
		owner.setPermissions (permissions);
		return owner;
	}

}
