package com.imooc.service;

import com.imooc.dao.MessageDao;

public class MaintainService {
	
	public void deleteOne(String id) {
		if (null != id && !"".equals(id)) {
			MessageDao messageDao = new MessageDao();
			messageDao.deleteOne(Integer.valueOf(id));
		}
	}

}
