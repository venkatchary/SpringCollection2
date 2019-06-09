package com.app.bean;

import java.util.List;
import java.util.Set;

public class Products {
	private List<String> prodModel;
	private Set<String> prodCode;
	public Products() {
		super();
	}
	public List<String> getProdModel() {
		return prodModel;
	}
	public void setProdModel(List<String> prodModel) {
		this.prodModel = prodModel;
	}
	public Set<String> getProdCode() {
		return prodCode;
	}
	public void setProdCode(Set<String> prodCode) {
		this.prodCode = prodCode;
	}
	@Override
	public String toString() {
		return "Products [prodModel=" + prodModel + ", prodCode=" + prodCode + "]";
	}
	

}
