import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (c) 2011-2015 All Rights Reserved.
 */

/**
 *
 *
 * @author 625289
 * @version $Id: LuncherProvider.java 2015年1月5日 下午1:35:15 $
 * @since 1.0.0
 */
public class LuncherProvider {

	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LuncherProvider luncher = new LuncherProvider();
		luncher.start();
		Thread.sleep(1000 * 60 * 10);
	}

	void start() {
		String configLocation = "spring/dubbo-provider.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		String[] names = context.getBeanDefinitionNames();
		System.out.print("Beans:");
		for (String string : names)
			System.out.print(string + ",");
		System.out.println();
	}

}
