package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 
 * Title:Demo
 * Description:JPA映射实体类案例
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月3日
 */
@Entity(name="demo")
public class Demo {
	@Id
 
	private long id;// 主键.
	@Column(name = "name")
	private String name;// 测试名称.

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
