package com.beesphere.products.security.permission.provider;

import java.io.Serializable;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.util.Map;

import com.beesphere.products.security.permission.AllPermissionsCollection;

public interface PermissionProvider extends Serializable {
	
	PermissionCollection 	NO_PERMISSIONS = new Permissions ();
	PermissionCollection	FULL_PERMISSIONS = new AllPermissionsCollection ();
	
	boolean isTrustedParty (CodeSource codeSource);
	Map<String, Permission> findPermissions (CodeSource codeSource);
}
