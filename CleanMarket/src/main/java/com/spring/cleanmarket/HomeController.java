package com.spring.cleanmarket;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.cleanmarket.item.commons.SearchVO;
import com.spring.cleanmarket.item.model.ItemVO;
import com.spring.cleanmarket.item.service.IItemService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private IItemService service;
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session,SearchVO search) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		if(session.getAttribute("location") != null) {
			System.out.println("세션있음"+(String)session.getAttribute("location"));
			
			session.setAttribute("location",session.getAttribute("location"));
			search.setLocation((String)session.getAttribute("location"));
			
			List<ItemVO> list = service.getItemList(search);
			model.addAttribute("items",list);
			
		}else {
			search.setCategory(null);
			List<ItemVO> list = service.getItemList(search);
			model.addAttribute("items",list);			
		}
		
		return "home";
	}
	
}
