package com.happy.everyday.base;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Data;

import java.util.List;

@Data
public class BasePage<T> extends Page<T> {
	
	private List<T> pageData;

	public BasePage(int current, int size, String orderByField, boolean isAsc) {
		super(current, size, orderByField, isAsc);
		// TODO Auto-generated constructor stub
	}

	public BasePage(int current, int size, String orderByField) {
		super(current, size, orderByField);
		// TODO Auto-generated constructor stub
	}

	public BasePage(int current, int size) {
		super(current, size);
		// TODO Auto-generated constructor stub
	}

	public BasePage(List<T> pageData) {
		super();
		this.pageData = pageData;
	}
	
	
	public BasePage() {
		super();
	}
	
    
    
    

}
