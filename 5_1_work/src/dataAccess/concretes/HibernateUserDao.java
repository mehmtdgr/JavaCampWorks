package dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();
	 
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanıcı veri tabanına eklendi " + user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı veri tabanından silindi " + user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı veri tabanından güncellendi " + user.getName());
	}

	@Override
	public List<User> getAll() {
		return users;
	}
	
	
	
}
