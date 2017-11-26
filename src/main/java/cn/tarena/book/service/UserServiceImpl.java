package cn.tarena.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;
import cn.tarena.book.mapper.UserMapper;
import cn.tarena.book.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;



	

	
	//登录时查找用户是否存在
	@Override
	public User findUser(String username, String password) {
		
		return userMapper.findUser(username,password);
	}
	//注册时录入信息
	@Override
	public void addUser(User user) {
		//用UUID设定用户Id,状态默认为开启（1为开启，0为禁用）
		String  userId = UUID.randomUUID().toString();
		user.setId(userId);
		user.setState(1);
		userMapper.addUser(user);
		//同时为userinfo表中插入一个用户Id，用于在用于中心更新信息
		userMapper.addUserInfoId(userId);
		
	}


	@Override
	public int updatePsw(String userId, String newPassword) {
		return userMapper.updatePsw(userId, newPassword);
	}

	@Override
	public User findUserByIdAndPsw(User user) {
		
		return userMapper.findUserByIdAndPsw(user);
	}
	//根据用户名查找用户，校验是否注册时候用了重复的用户名
	@Override
	public User findUserByUsername(String username) {
		
		return userMapper.findUserByUsername(username);
	}


}
