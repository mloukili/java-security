package com.beesphere.products.security.permission.provider.impl;

import java.security.CodeSource;
import java.security.Permission;
import java.util.Map;

import com.beesphere.products.security.binaries.BinariesOwner;
import com.beesphere.products.security.binaries.provider.BinariesOwnerProvider;
import com.beesphere.products.security.policy.PermissionsMap;

public class OwnerBasedPermissionProvider extends TrustBasedPermissionProvider {

	private static final long serialVersionUID = 5268794322991874862L;
	
	protected BinariesOwnerProvider binariesOwnerProvider;
	
	public OwnerBasedPermissionProvider () {
		super ();
	}

	public OwnerBasedPermissionProvider (BinariesOwnerProvider binariesOwnerProvider) {
		super ();
		this.binariesOwnerProvider = binariesOwnerProvider;
	}

	@Override
	public Map<String, Permission> findPermissions (CodeSource codeSource) {
		if (binariesOwnerProvider == null) {
			return null;
		}
		
		BinariesOwner binariesOwner = binariesOwnerProvider.find (codeSource);
		
		if (binariesOwner == null) {
			return null;
		}
		
		if (binariesOwner.isTrusted ()) {
			return PermissionsMap.ALL_PERMISSIONS;
		}
		
		return binariesOwner.getPermissions ();
	}

	public BinariesOwnerProvider getBinariesOwnerProvider() {
		return binariesOwnerProvider;
	}

	public void setBinariesOwnerProvider(BinariesOwnerProvider binariesOwnerProvider) {
		this.binariesOwnerProvider = binariesOwnerProvider;
	}
	
}
