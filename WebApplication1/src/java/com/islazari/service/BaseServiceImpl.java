/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.islazari.service;

import com.islazari.dao.BaseDao;
import com.islazari.dao.BaseDaoImpl;
import com.islazari.pojo.User;

public class BaseServiceImpl implements BaseService {

 private BaseDao loginDao = new BaseDaoImpl();

 @Override
 public boolean login(String username, String password) {
  return loginDao.login(username, password);
 }

 @Override
 public String registration(User user) {
  return loginDao.register(user);
 }

}