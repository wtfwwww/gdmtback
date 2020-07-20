package com.hubt.model;

import java.util.List;

public class Left {
	private String id;
	private String name;
	private String pid;
	private boolean hasChildren = true;
	private List<Left> children;

	public Left() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Left(String id, String name, String pid, boolean hasChildren, List<Left> children) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.hasChildren = hasChildren;
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public List<Left> getChildren() {
		return children;
	}

	public void setChildren(List<Left> children) {
		this.children = children;
	}

}
