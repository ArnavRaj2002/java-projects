package com.nit.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.Member;
import com.nit.repo.IMemberRepo;

@Controller
public class MemberController {
	@Autowired
	private IMemberRepo repo;
 
	@GetMapping("/")
	public String viewAllMembers(Map<String, Object> map) {
		List<Member> all = repo.findAll();
		map.put("listOfMembers", all);
		return "index";
	}

	@GetMapping("/add")
	public String addMemberForm(@ModelAttribute("member") Member member1) {
		return "add-member";

	}

	@PostMapping("/save")
	public String saveMember(@ModelAttribute("member") Member member1) {
		repo.save(member1);
		return "redirect:/";

	}
 
	@GetMapping("edit/{id}") //href=edit?id=
	public String openEditForm(@PathVariable Long id,Map<String, Object> map) {
	  Member member = repo.findById(id).orElseThrow(()-> new IllegalArgumentException(id+":: not exist in DB"));
	  map.put("member1", member); //This object is used only to display old values on form to edit.
		return "edit-member";
		

	}
	
//	@GetMapping("/edit/{id}")
//	public String openEditForm(@PathVariable("id") Long id, Model model) {
//	    Member member = repo.findById(id)
//	                        .orElseThrow(() -> new IllegalArgumentException(id + " :: not exist in DB"));
//	    // IMPORTANT: add the DB object using the SAME attribute name used by form: modelAttribute="member"
//	    model.addAttribute("member", member);
//	    return "edit-member";
//	}

	@PostMapping("/update")
	public String saveEditForm(@ModelAttribute("member1") Member member2) {
		repo.save(member2);         //we don't fetch it in jsp
		return "redirect:/";

		
	}

	@GetMapping("/delete/{id}") //no 
	public String deleteMember(@PathVariable Long id) {
		repo.deleteById(id);
		return "redirect:/";
	}
	@GetMapping("/expired")
	public String showExpiredMembers(Map<String , Object> map)
	{
 		List<Member> byExpiryDateBefore = repo.findByExpiryDateBefore(LocalDate.now());
 		map.put("expDate", byExpiryDateBefore);
		return "expired-members";
		
	}
}

/*
 * ✔ You do NOT need to manually set values in <form:input> using value="".
✔ Spring automatically fills the form fields from the model attribute object (editedMember).
 */
