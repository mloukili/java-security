package com.beesphere.products.security.binaries.provider;

import java.io.Serializable;
import java.security.CodeSource;

import com.beesphere.products.security.binaries.BinariesOwner;

public interface BinariesOwnerProvider extends Serializable {
	BinariesOwner find (CodeSource codeSource);
}
