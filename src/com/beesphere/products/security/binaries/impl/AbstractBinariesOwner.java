package com.beesphere.products.security.binaries.impl;

import com.beesphere.products.security.binaries.BinariesOwner;

public abstract class AbstractBinariesOwner implements BinariesOwner {
	
	private static final long serialVersionUID = -8302781412564519085L;

	private String group;
	private String name;
	private boolean trusted;
	
	public AbstractBinariesOwner () {
	}
	
	public AbstractBinariesOwner (String group, String name, boolean trusted) {
		setGroup (group);
		this.name = name;
		this.trusted = trusted;
	}
	
	public AbstractBinariesOwner (String group, String name) {
		this (group, name, true);
	}
	
	public AbstractBinariesOwner (String name, boolean trusted) {
		this (null, name, trusted);
	}
	
	public AbstractBinariesOwner (String name) {
		this (null, name);
	}
	
	public String getGroup () {
		return group;
	}
	public void setGroup (String group) {
		if (group == null) {
			group = DEFAULT_GROUP;
		}
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTrusted() {
		return trusted;
	}
	public void setTrusted(boolean trusted) {
		this.trusted = trusted;
	}

}
