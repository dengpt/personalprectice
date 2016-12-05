package com.dpt.springboot.common;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class MongoPage implements Serializable, Pageable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3102999709762724562L;
	
	private int pageNumber;
	private int pageSize;
	private Sort sort;

	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOffset() {
		
		return this.pageNumber * this.pageSize;
	}

	@Override
	public int getPageNumber() {
		return pageNumber;
	}

	@Override
	public int getPageSize() {
		return pageSize;
	}

	@Override
	public Sort getSort() {
		return sort;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public MongoPage(int pageNumber, int pageSize, Sort sort) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.sort = sort;
	}

	public MongoPage() {
		super();
	}
	
	
}
