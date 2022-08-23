package com.nseit.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static java.util.Arrays.binarySearch;

@Configuration
@ComponentScan
public class SpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(SpringApplication.class);
		BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);
		int result = binarySearch.binarySearch(new int[]{11,4,7,8}, 7);
		System.out.println(binarySearch);
		System.out.println(result);

	}

}
