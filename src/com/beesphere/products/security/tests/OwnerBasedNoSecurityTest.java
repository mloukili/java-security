package com.beesphere.products.security.tests;

import com.beesphere.products.security.SecurityAgent;
import com.beesphere.products.security.binaries.provider.impl.TrustedBinariesOwnerProvider;

public class OwnerBasedNoSecurityTest {
	
	public static void main (String[] args) {
		SecurityAgent.initilize (new TrustedBinariesOwnerProvider ());
		System.out.println (System.getProperty("java.home"));
    }

}
