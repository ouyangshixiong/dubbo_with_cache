package dubbo_service_cache;

import org.springframework.cache.annotation.Cacheable;


public class DemoServiceImpl implements DemoService{

	@Cacheable(value="test")
	public Long countLarge(int maxNumber) {
		// TODO Auto-generated method stub
		Long sum = 0L;
		for (int i = 0; i < maxNumber; i++) {
			sum +=i;
		}
		System.out.println("do sum " + sum);
		return sum;
	}

}
