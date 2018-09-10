package com.beesphere.products.security.manager;

import com.beesphere.products.security.permission.AllPermissionsCollection;
import com.beesphere.products.security.permission.ThreadGroupPermission;
import com.beesphere.products.security.permission.ThreadPermission;

public class RestrictiveSecurityManager extends SecurityManager {

	@Override
	public void checkAccess (Thread t) {
		super.checkAccess (t);
		try {
			checkPermission (AllPermissionsCollection.ALL_PERMISSION);
		} catch (SecurityException sex) {
			checkPermission (ThreadPermission.INSTANCE);
		}
	}

	@Override
	public void checkAccess (ThreadGroup g) {
		super.checkAccess (g);
		try {
			checkPermission (AllPermissionsCollection.ALL_PERMISSION);
		} catch (SecurityException sex) {
			checkPermission (ThreadGroupPermission.INSTANCE);
		}
	}
	
}
