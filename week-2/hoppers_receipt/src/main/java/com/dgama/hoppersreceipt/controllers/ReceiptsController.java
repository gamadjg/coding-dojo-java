package com.dgama.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Dictionary;
import java.util.HashMap;

@Controller
public class ReceiptsController {
	@RequestMapping("/")
	public String index(Model model) {
//		String name = "Grace Hopper";
//		String itemName = "Copper wire";
//		double price = 5.25;
//		String description = "Metal strips, also an illustration of nanoseconds.";
//		String vendor = "Little Things Corner Store";

		HashMap<String, Object> receipts = new HashMap<>();
		receipts.put("name", "Grace Hopper");
		receipts.put("itemName", "Copper wire");
		receipts.put("price", 5.25);
		receipts.put("description", "Metal strips, also an illustration of nanoseconds.");
		receipts.put("vendor", "Little Things Corner Store");
		model.addAttribute("receipt", receipts);

		return "index.jsp";
	}
}
