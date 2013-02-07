package com.yogi.data;

import java.util.Date;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;

import com.yogi.data.connection.ConnectionFactory;
import com.yogi.data.dao.CustomerMapper;
import com.yogi.data.dao.CustomerPromotionsMapper;
import com.yogi.data.dao.OrderLineMapper;
import com.yogi.data.dao.OrdersMapper;
import com.yogi.data.dao.ProductMapper;
import com.yogi.data.dao.PromotionsMapper;
import com.yogi.data.model.*;

public class MyBatisDataOperationTest {
	
	
	public static void main(String arg[])
	{
		SqlSession session = ConnectionFactory.getSession().openSession();
		
		for(int i=1;i<=10;i++){
	      insertOrder(session, new Integer(i));
		}
		
		session.commit();
		session.close();
	}
	
	public static void insertCustomer(SqlSession session,Integer customerId){
		CustomerMapper dao =session.getMapper(CustomerMapper.class);
		Customer record=new Customer();
		record.setId(customerId);
		record.setEmailaddress("emailaddress"+customerId);
		dao.insert(record);
		
	}
	
	public static void insertOrder(SqlSession session,Integer i){
		OrdersMapper dao =session.getMapper(OrdersMapper.class);
		Orders record=new Orders();
		Random rand=new Random();
		Integer orderId=rand.nextInt(99999999);
		
		record.setId(orderId);
		Integer customerId=i;
		insertCustomer(session, customerId);
		record.setCustomerId(customerId);
		record.setOrderDate(new Date());
		dao.insert(record);
		
		insertOrderLine(session, customerId, orderId);
		
	}
	

	
	public static void insertOrderLine(SqlSession session,Integer i,Integer orderId){
		OrderLineMapper dao =session.getMapper(OrderLineMapper.class);
		OrderLine record=new OrderLine();
		record.setLineNumber(i);
		record.setOrderId(orderId);
		record.setPrice(0L);
		record.setQuantity(1L);
		dao.insert(record);	
		insertProduct(session, i, i);
		
	}

	public static void insertProduct(SqlSession session,Integer i,Integer orderLine){
		ProductMapper dao =session.getMapper(ProductMapper.class);
		Product record=new Product();
		Random rand=new Random();
		record.setCode(rand.nextInt(99999999));
		record.setDescription("description");
		record.setOrderLine(orderLine);
		dao.insert(record);
	}
	
	public static void insertPromotions(SqlSession session,int i){
		PromotionsMapper dao =session.getMapper(PromotionsMapper.class);
		Promotions record=new Promotions();
		dao.insert(record);
	}
	
	public static void insertCustomerPromotions(SqlSession session,Integer i){
		CustomerPromotionsMapper dao =session.getMapper(CustomerPromotionsMapper.class);
		CustomerPromotions record=new CustomerPromotions();
		dao.insert(record);
	}
	
}
