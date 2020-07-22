package com.spring.context;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.stereotype.Component;

import com.spring.entities.WishEntity;

@Component
public class MyContext implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sc) {

		List<WishEntity> allWish = new ArrayList<WishEntity>();

		ServletContext context = sc.getServletContext();

		context.setAttribute("allWish", allWish);

	}

	public void contextDestroyed(ServletContextEvent sc) {
	}
}
