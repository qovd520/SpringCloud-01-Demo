package indi.jsees.springcloud.system.service;

import java.util.List;

import indi.jsees.springcloud.domain.User;

public interface SystemService {
	
	public boolean add(User user);
	
	public User get(Long userId);
	
	public List<User> list();
	 
}
