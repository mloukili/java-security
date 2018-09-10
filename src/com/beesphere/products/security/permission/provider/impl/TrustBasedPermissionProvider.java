package com.beesphere.products.security.permission.provider.impl;

import java.security.CodeSource;

import com.beesphere.products.security.permission.provider.PermissionProvider;

public abstract class TrustBasedPermissionProvider implements PermissionProvider {
	
	private boolean trusted;
	
	public TrustBasedPermissionProvider () {
		this (false);
	}

	public TrustBasedPermissionProvider (boolean trusted) {
		this.trusted = trusted;
	}

	@Override
	public boolean isTrustedParty (CodeSource codeSource) {
		return trusted;
	}

	public boolean isTrusted () {
		return trusted;
	}

	public void setTrusted (boolean trusted) {
		this.trusted = trusted;
	}

}
