package com.ldt.table.dao;

import java.util.List;

import com.ldt.item.entity.User;

public interface UsersDao {
	public void insertUsers(User user);
	public List<User> selectUsers(User user);
}
