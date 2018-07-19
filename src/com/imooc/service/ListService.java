/**
 * 
 */
/**
 * @author hqlip
 *
 */
package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

public class ListService {
	
	public List<Message> queryMessageList(String command, String description) {
		MessageDao dao = new MessageDao();
		return dao.queryMessage(command, description);
	}
	
}