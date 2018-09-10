package com.beesphere.products.security.policy;

import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Map;

import com.beesphere.products.security.permission.provider.PermissionProvider;

public class DynamicPolicy extends Policy {
	
	private PermissionProvider permissionProvider;
	
	@Override
	public PermissionCollection getPermissions (CodeSource codeSource) {
		if (permissionProvider != null) {
			if (permissionProvider.isTrustedParty (codeSource)) {
				return PermissionProvider.FULL_PERMISSIONS;
			}
			Map<String, Permission> permissions = permissionProvider.findPermissions (codeSource);
			if (permissions == null) {
				return PermissionProvider.NO_PERMISSIONS;
			} else {
				return new PermissionsMap (permissions);
			}
		}
        return PermissionProvider.NO_PERMISSIONS;
    }

	@Override
    public boolean implies (ProtectionDomain domain, Permission permission) {
		return getPermissions (domain.getCodeSource()).implies (permission);
    }

	@Override
    public PermissionCollection getPermissions (ProtectionDomain domain) {
        return getPermissions (domain.getCodeSource());
    }

	@Override
    public void refresh () {
    	// no refresh
    }

	public PermissionProvider getPermissionProvider() {
		return permissionProvider;
	}

	public void setPermissionProvider(PermissionProvider permissionProvider) {
		this.permissionProvider = permissionProvider;
	}

}
