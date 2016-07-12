package dubbo_service_cache;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();
 
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        Long sum = demoService.countLarge(10000); // 执行远程方法
 
        System.out.println( sum ); // 显示调用结果
    }
}
