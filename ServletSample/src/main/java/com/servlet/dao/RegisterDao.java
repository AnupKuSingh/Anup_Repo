package com.servlet.dao;

import java.util.List;

public interface RegisterDao {

	 void dataInsert(RegisterModel model);
	List<RegisterModel> dataWork();
}
