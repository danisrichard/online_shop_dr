package com.project02.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//rendelés osztály, ebben majd a productok gyüjtő helye lesz
@Entity
@Table(name ="order_table")
public class OrderEntity {
	
	@Id
	@Column(name="order_id")
	Long orderid;
	
	public OrderEntity() {
		
	}
}
