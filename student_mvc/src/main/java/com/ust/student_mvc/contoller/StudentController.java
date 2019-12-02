package com.ust.student_mvc.contoller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


import com.ust.student_mvc.dto.StudentBean;
import com.ust.student_mvc.service.StudentService;

public class StudentController {

	@Autowired
	private StudentService service ;

	@InitBinder
	public void inItBinder(WebDataBinder binder) {

		SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(formate, true);

		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/login")     
	public String loginPage() {

		return "login";
	}//end of login

	@PostMapping("/login")
	public String login(int id , String password , HttpServletRequest request) {
		StudentBean bean = service.login(id, password);
		if(bean == null) {

			request.setAttribute("msg", "Inavlid Creditals");
			return "login";
		}else {

			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);	
			return "home";
		}
	}// end of login

	@GetMapping(value = "/register")
	public String registerPage() {

		return "register";
	}

	@PostMapping("/register")
	public String register(StudentBean bean , ModelMap map) {

		int check = service.register(bean);

		if(check > 0) {

			map.addAttribute("map", "registered your ID : " + check);

		}else {
			map.addAttribute("msg", "not registered");

		}
		return "login";

	}//end of register

	@GetMapping("/home")
	public String homePage(@SessionAttribute(name = "bean" ,required = false ) StudentBean bean , ModelMap map) {

		if(bean == null) {

			map.addAttribute("msg", "login first!!!!!!!!!!");
			return "login";
		}else {

			map.addAttribute("msg", "Home Page");
			return "home";
		}
	}

	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {

		HttpSession session = request.getSession(false);

		if(session != null) {

			return "changepassword";
		}else {

			return "home";
		}
	}

	@PostMapping("/changepassword")
	public String changepassword(String password,String cpassword,@SessionAttribute(name = "bean") StudentBean bean , ModelMap map) {

		if(password.equals(cpassword)) {
			service.changePassword(bean.getId(), cpassword);
			map.addAttribute("msg", "password changed successfully");
			return "login";


		}else {

			map.addAttribute("msg", "not matching");
			return "home";
		}
	}

	@GetMapping("/update")
	public String update(HttpServletRequest request ,ModelMap map) {

		HttpSession session = request.getSession(false);

		if(session != null) {

			return "update";
		}else {

			map.addAttribute("msg","register first!!!!!!");
			return "register";
		}

	}
	@PostMapping("/update")	
	public String update(HttpSession session ,ModelMap map, StudentBean bean) {

		StudentBean stbean = (StudentBean) session.getAttribute("bean");

		stbean.setName(bean.getName());
		stbean.setEmail(bean.getEmail());
		stbean.setGender(bean.getGender());
		stbean.setDoj(bean.getDoj());
		boolean check = service.updateProfile(stbean);
		if(check) {

			map.addAttribute("msg", "updated successfully");
			return "home";
		}else {

			map.addAttribute("msg", "not updated");
			return "home";
		}


	}
	@GetMapping("/delete")
	public String delete(HttpSession session) {

		StudentBean bean = (StudentBean)session.getAttribute("bean");
		try {

			service.deleteProfile(bean.getId());

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}//end of delete

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "login";

	}









}
