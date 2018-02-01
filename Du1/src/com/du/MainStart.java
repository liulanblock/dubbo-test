package com.du;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStart {
	private static ClassPathXmlApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext(new String[] { "dubbo-demo-provider.xml" });
		ctx.start();
		System.out.println("服务启动成功！");
		while (true) {
			try {
				Thread.sleep(60000);
				System.out.println("dgdagdg");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
