"# dubbo_with_cache" 

本项目主要演示了在dubbo的service层增加复合缓存CompositeCacheManager（集中式缓存+JVM本地缓存）的方法。
1. 集中式缓存采用了现在比较流行的Redis
2. JVM本地缓存采用了经典的java缓存技术ehcache

启动方法：
运行Provider.java 启动dubbo服务端
运行Consumer.java 启动dubbo客户端
可以发现被@Cacheable注解的方法countLarge的结果被缓存起来

注意：
1. @Cacheable注解的key需要自行设定，可能需要用到SPEL
2. Redis中的key是经过jredis序列化过的，不能简单认为是@Cacheable的key，尤其是通过redis-cli验证的时候
3. spring代理@Cacheable注解有两种内置实现方式，使用的时候请务必注意：该方法是否实现了接口，是否是public方法。欲知详情，请仔细百度。


参考文档：http://docs.spring.io/spring-data/data-redis/docs/1.2.0.RELEASE/reference/html/redis.html 
