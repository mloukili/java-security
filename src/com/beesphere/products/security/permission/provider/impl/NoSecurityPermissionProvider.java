package com.beesphere.products.security.permission.provider.impl;

import java.security.CodeSource;
import java.security.Permission;
import java.util.Map;

import com.beesphere.products.security.permission.provider.PermissionProvider;

public class NoSecurityPermissionProvider implements PermissionProvider {

	private static final long serialVersionUID = -4202455877457975277L;

	@Override
	public Map<String, Permission> findPermissions (CodeSource codeSource) {
		return null;
	}

	@Override
	public boolean isTrustedParty (CodeSource codeSource) {
		// grant everything to everyone
		return true;
	}

}
