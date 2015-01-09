import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.summer.domain.service.IUserService;
import com.summer.domain.service.impl.UserService;

/**
 * Copyright (c) 2011-2015 All Rights Reserved.
 */

/**
 *
 *
 * @author 625289
 * @version $Id: LuncherConsumer.java 2015年1月5日 下午1:36:58 $
 * @since 1.0.0
 */
public class LuncherConsumer {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuncherConsumer luncher = new LuncherConsumer();
		luncher.start();
	}

	void start() {
		String configLocation = "spring/dubbo-consumer.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		IUserService s = (IUserService) context.getBean("userService");
		String[] names = context.getBeanDefinitionNames();
		System.out.print("Beans:");
		for (String string : names) {
			System.out.print(string);
			System.out.print(",");
		}
		System.out.println();

		System.out.println(s.getUser().getCreateTime());
	}

}
