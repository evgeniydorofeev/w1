package w1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@CacheConfig(cacheNames = "t1")
public class RestService1 {

	@Autowired
	private T1Repository r1;

	@Transactional
	@Cacheable //(cacheNames = "t1")
	public T1 getById(Long id) {
		System.out.println(id + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		T1 t1 = r1.findById(id).orElseGet(() -> {
			return r1.save(new T1());
		});
		return t1;
	}

	@CachePut(key="#id")
	@Transactional
	public T1 save(T1 t1) {
		return r1.save(t1);
	}

	@CacheEvict
	public void deleteById(Long id) {
		r1.deleteById(id);
	}

}
