package com.beesphere.products.security.policy;

import java.security.Permission;
import java.security.PermissionCollection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import com.beesphere.products.security.permission.AllPermissionsCollection;
import com.beesphere.products.security.permission.PermissionUtils;

public class PermissionsMap extends PermissionCollection {

	private static final long serialVersionUID = 8401403643527091168L;
	
	public static final Map<String, Permission> ALL_PERMISSIONS = new HashMap<String, Permission> ();
	static {
		ALL_PERMISSIONS.put (
			PermissionUtils.createKey (AllPermissionsCollection.ALL_PERMISSION), 
			AllPermissionsCollection.ALL_PERMISSION
		);
	}
	
	private transient Map<String, Permission> permissions;
	
	public PermissionsMap (Map<String, Permission> permissions) {
		this.permissions = permissions;
	}

	public void add (Permission permission) {
	}

	public final boolean implies (Permission permission) {
		if (permissions == null) {
			return false;
		}
		
		if (permissions.containsKey (PermissionUtils.createKey (AllPermissionsCollection.ALL_PERMISSION))) {
			return true;
		}

		Permission refPermission = permissions.get (PermissionUtils.createKey (permission));

		if (refPermission == null) {
			return false;
		}

		return refPermission.implies (permission);
	}

	public final Enumeration<Permission> elements () {
		return new Enumeration<Permission> () {
			public boolean hasMoreElements () {
				return false;
			}

			public Permission nextElement() {
				return null;
			}
		};
	}

}
