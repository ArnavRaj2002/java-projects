package com.nit.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/checkout")
	public String CheckOut() {
		return "forward:/VerifyCart";

	}

	@RequestMapping("/VerifyCart")
	public String VerifyCart(org.springframework.ui.Model model) {
		model.addAttribute("message", "Cart Verification");
		return "redirect:/paymentSuccess";

	}

	@RequestMapping("/paymentSuccess")
	public String paymentSuccess(org.springframework.ui.Model model) {
		model.addAttribute("message", "Payment sucessfull!!");
		return "paymentSuccess";

	}
}
