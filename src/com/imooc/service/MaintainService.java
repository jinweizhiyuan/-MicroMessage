package com.imooc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.imooc.dao.MessageDao;

public class MaintainService {
	
	public void deleteOne(String id) {
		if (null != id && !"".equals(id)) {
			MessageDao messageDao = new MessageDao();
			messageDao.deleteOne(Integer.valueOf(id));
		}
	}
	
	public void deleteBatch(String[] ids) {
		MessageDao messageDao = new MessageDao();
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : ids) {
			idList.add(Integer.valueOf(id));
		}
		messageDao.deleteBatch(idList);
	}
	
	public void add(Map param) {
		MessageDao messageDao = new MessageDao();
		if (!param.isEmpty()) {
			Map map = new HashMap();
			Set keys = param.keySet();
			for (Object key : keys) {
				map.put(key, ((String[])param.get(key))[0]);
			}
			messageDao.add(map);
		}
	}

}
