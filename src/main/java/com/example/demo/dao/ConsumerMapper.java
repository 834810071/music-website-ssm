package com.example.demo.dao;

import com.example.demo.domain.Consumer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Consumer record);

    int insertSelective(Consumer record);

    Consumer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consumer record);

    int updateByPrimaryKey(Consumer record);

    int verifyPassword(@Param("0") String username, @Param("1")String password);

    int existUsername(String username);

    int addUser(Consumer consumer);

    int updateUserMsg(Consumer record);

    int updateUserAvator(Consumer record);

    int deleteUser(Integer id);

    List<Consumer> allUser();

    List<Consumer> userOfId(Integer id);

    List<Consumer> loginStatus(String username);

}
