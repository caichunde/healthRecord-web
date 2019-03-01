/*package com.dchb.redis.imp;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.dchb.model.Users;
import com.dchb.util.JsonMapper;

@Component
public class UserRedis {
	private static final String key = "myUsers";
	
	private JsonMapper mapper = new JsonMapper();
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	public List<Users> list() {
		List<Users> result = new ArrayList<Users>();
		List list =redisTemplate.opsForHash().values(key);
		for(Object obj: list){
			List users = mapper.fromJson(obj.toString(), List.class);
			for (Object object : users) {
				Users user = new Users();
				try {
					BeanUtils.populate(user, (Map<String, Object>)object);
				} catch (IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}
				result.add(user);
			}
		}
		return result;
	}
	
}
*/