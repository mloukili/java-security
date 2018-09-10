package com.beesphere.products.security.permission.provider.impl;

import java.security.CodeSource;
import java.security.Permission;
import java.util.Map;


public class ClosedDoorPermissionProvider extends TrustBasedPermissionProvider {

	private static final long serialVersionUID = -4202455877457975277L;

	@Override
	public Map<String, Permission> findPermissions (CodeSource codeSource) {
		return null;
	}

}
