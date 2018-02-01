package com.du;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        int count=0;
        while(true) {
        	try {
				Thread.sleep(1000);
				System.out.println(demoService.sayHello("world"));
				count++;
				System.out.println(count);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        
	}

}
