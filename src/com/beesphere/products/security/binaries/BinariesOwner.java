package com.beesphere.products.security.binaries;

import java.io.Serializable;
import java.security.Permission;
import java.util.Map;

public interface BinariesOwner extends Serializable {
	String DEFAULT_GROUP = "BSGroup";
	String DEFAULT_OWNER = "BSOwner"; 

	String getName ();
	String getGroup ();
	boolean isTrusted ();
	Map<String, Permission> getPermissions ();

}
