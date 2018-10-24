
package com.ps.springmvc.psbankapp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ps.springmvc.psbankapp.model.Account;

@Controller
public class AccountController {

	//Add the method to Root
	@RequestMapping("/")
	//Controller method
	public String showHomePage() {
		return "index";
		
	}
	
	@RequestMapping("/new")
	public String newAccount(Model model) {
		model.addAttribute("account",new Account());
		return "newAccount";
	}
	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}
		@RequestMapping(value="/saveAccount",method=RequestMethod.POST)
		//public String showAccount(Model model,HttpServletRequest request) {
		public String showAccount(Model model,
				Account account )
		/*		@RequestParam("accountNo") String acNo,
				@RequestParam("accountHolderName") String customerName,
						@RequestParam("balance") String balance)*/
						 {
		/*	String acNo = request.getParameter("accountNo");
			String customerName = request.getParameter("accountHolderName");
			String balance = request.getParameter("balance");*/
			
			/*model.addAttribute("accountNumber",acNo);
			model.addAttribute("accountHolderName", customerName);
			model.addAttribute("balance",balance);*/
			
			/*create an object for model class*/
			/*Account account = new Account();
			account.setAccountNo(Integer.parseInt(acNo));
			account.setAccountHolderName(customerName);
			account.setBalance(Integer.parseInt(balance));*/
			
			model.addAttribute("account",account);
			return "showAccount";
		}
	
}
	