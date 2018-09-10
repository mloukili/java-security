package com.beesphere.products.security.binaries.provider.impl;

import java.security.CodeSource;

import com.beesphere.products.security.binaries.BinariesOwner;
import com.beesphere.products.security.binaries.impl.DefaultBinariesOwner;
import com.beesphere.products.security.binaries.provider.BinariesOwnerProvider;

public class TrustedBinariesOwnerProvider implements BinariesOwnerProvider {

	private static final long serialVersionUID = -994330717046439817L;
	
	@Override
	public BinariesOwner find (CodeSource codeSource) {
		return new DefaultBinariesOwner (BinariesOwner.DEFAULT_OWNER);
	}

}
