package com.servlet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.servlet.dao.RegisterDao;
import com.servlet.dao.RegisterModel;

/**
 * Servlet implementation class Register
 */
@Controller
public class Register {
	
	@Autowired
	private RegisterDao registerDao;
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public  String doWork(@ModelAttribute("registerModel") RegisterModel registerModel) {
		registerDao.dataInsert(registerModel);
		return "showMessage";
	}
	@RequestMapping(value = "/landing")
	public ModelAndView redirect() {
		return new ModelAndView("showMessage","command",new RegisterModel());
	}
	@RequestMapping(value="/view")
	public String getUserView(Model model){
		List<RegisterModel> list = registerDao.dataWork();
		model.addAttribute("list",list);
		return "viewdata";
	}
}