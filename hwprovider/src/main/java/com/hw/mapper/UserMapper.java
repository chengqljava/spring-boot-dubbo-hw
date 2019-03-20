package com.hw.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hw.entity.User;
@Repository
public interface UserMapper {
	//long countByExample(UserExample example);

	//int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	//int insertSelective(User record);

	List<User> selectByExample();

	User selectByPrimaryKey(@Param("id")Integer id);

	//int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	//int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

}
