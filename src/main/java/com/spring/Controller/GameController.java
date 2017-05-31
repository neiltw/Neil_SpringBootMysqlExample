package com.spring.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.DAO.GameCrudRepo;
import com.spring.Models.Game;

@Controller()
@RequestMapping("game")
public class GameController {
	
	
	@Autowired
	private GameCrudRepo gameCrudRepo;
	
	@GetMapping("all")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> GameAll(){
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("result", "no data");
		List<Game> games = gameCrudRepo.findAll();
		model.put("result", games);
		return new ResponseEntity<Map<String, Object>>(model, HttpStatus.OK);
	}

}
