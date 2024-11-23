package w1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class RestService1 {

	@Autowired
	private T1Repository r1;

	@Transactional
	@Cacheable("cache1")
	public T1 getT1(Long id) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		T1 t1 = r1.findById(id).orElseGet(() -> {
			T1 t = new T1();
			return r1.save(t);
		});
		return t1;
	}

	@CacheEvict("cache1")
	public void evict(Long id) {
	}

}

