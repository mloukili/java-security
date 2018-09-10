package com.beesphere.products.security.tests;

import java.security.Permission;
import java.util.HashMap;
import java.util.Map;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.binaries.provider.impl.DefaultBinariesOwnerProvider;
import com.beesphere.products.security.permission.PermissionUtils;
import com.beesphere.products.security.permission.ThreadGroupPermission;
import com.beesphere.products.security.permission.ThreadPermission;

public class CanCreateThreadTest {
	
	public static void main (String[] args) {
		Map<String, Permission> perms = new HashMap<String, Permission> ();
		perms.put (PermissionUtils.createKey(ThreadGroupPermission.INSTANCE), ThreadGroupPermission.INSTANCE);
		perms.put (PermissionUtils.createKey(ThreadPermission.INSTANCE), ThreadPermission.INSTANCE);
		
		SecurityAgent.initilize (
			new DefaultBinariesOwnerProvider  (perms)
		);
		Thread t = new Thread (new MyThreadGroup ("grp"), "aThread") {

			@Override
			public void run() {
				System.out.println(getName());
			}
			
		};
		t.setDaemon (true);
		t.start ();
    }
	
}
