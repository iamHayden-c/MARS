package com.project.mars.controllers;

import com.project.mars.service.IndexService;
import com.project.mars.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	IndexService indexService;
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/createuser")
	public String createUser() {
		return "ucreate";
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<User>> getAllUser() {
		List<User> userList = indexService.getAll();
		return new ResponseEntity<List<User>>(userList, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path="/postuser", consumes = {"application/json"})
	public ResponseEntity<User> createOrUpdateUser(@RequestBody User user) {
		User updatedUser = indexService.addUser(user);
		return new ResponseEntity<User>(updatedUser, new HttpHeaders(), HttpStatus.OK);
	}

}