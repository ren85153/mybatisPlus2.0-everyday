package com.happy.everyday.base;


import com.baomidou.mybatisplus.plugins.Page;
import com.happy.everyday.common.BaseResultEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class BaseResult implements Serializable{

    private String code;
    private String msg;
    private Object data;

	public BaseResult data(String code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
		return this;
	}

	public BaseResult success(Object data) {
		this.code = BaseResultEnum.SUCCESS.getCode();
		this.msg = BaseResultEnum.SUCCESS.getMsg();
		this.data = data;
		return this;
	}

	public BaseResult fail() {
		this.code = BaseResultEnum.UNKNOWN_ERROR.getCode();
		this.msg = BaseResultEnum.UNKNOWN_ERROR.getMsg();
		return this;
	}


	public BaseResult fail(String code, String msg) {
		this.code = code;
		this.msg = msg;
		return this;
	}

	public BaseResult fail(String code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
		return this;
	}

	public BaseResult message(String msg) {
		this.msg = msg;
		return this;
	}

	public BaseResult code(String code) {
		this.code = code;
		return this;
	}

}
