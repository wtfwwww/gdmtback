package com.hubt.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageBean<T> {
	private int pageNumber;
	private int pageSize;
	private int total;
	private int offset;
	private List<T> rows;
	private Map<String, Object> queryParams = new HashMap<String, Object>();

	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageBean(int pageNumber, int pageSize) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public Map<String, Object> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(Map<String, Object> queryParams) {
		this.queryParams = queryParams;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	

}
