package com.beesphere.products.security;

import java.security.Policy;

import com.beesphere.products.security.binaries.provider.BinariesOwnerProvider;
import com.beesphere.products.security.manager.RestrictiveSecurityManager;
import com.beesphere.products.security.permission.provider.PermissionProvider;
import com.beesphere.products.security.permission.provider.impl.OwnerBasedPermissionProvider;
import com.beesphere.products.security.policy.DynamicPolicy;

public class SecurityAgent {

	public static void initilize (BinariesOwnerProvider ownerProvider) {
		initilize (new OwnerBasedPermissionProvider (ownerProvider));
    }
	
	public static void initilize (SecurityManager securityManager, BinariesOwnerProvider ownerProvider) {
		initilize (securityManager, new OwnerBasedPermissionProvider (ownerProvider));
    }
	
	public static void initilize (PermissionProvider permissionProvider) {
		DynamicPolicy policy = new DynamicPolicy ();
		policy.setPermissionProvider (permissionProvider);
		Policy.setPolicy (policy);
        System.setSecurityManager (new RestrictiveSecurityManager ());
    }
	
	public static void initilize (SecurityManager securityManager, PermissionProvider permissionProvider) {
		DynamicPolicy policy = new DynamicPolicy ();
		policy.setPermissionProvider (permissionProvider);
		Policy.setPolicy (policy);
        System.setSecurityManager (securityManager);
    }

}
