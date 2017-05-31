package com.spring.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.Models.Member;
import com.spring.Service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("byid/{id}")
//	@ResponseBody
	public ResponseEntity<Map<String, Object>> getMemberById(@PathVariable("id") Integer id){
//		System.out.println("id: "+ id);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("result", "no data");
		Member member = memberService.findOne(id);
		model.put("result", member);			
		return new ResponseEntity<Map<String, Object>>(model,HttpStatus.OK);
	}
	
	@GetMapping("all")
//	@ResponseBody
	public ResponseEntity<Map<String, Object>> getMember(){
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("result", "no data");
		List<Member> member = memberService.findAll();
		model.put("result", member);		
		return new ResponseEntity<Map<String, Object>>(model,HttpStatus.OK);
	}
	
}
