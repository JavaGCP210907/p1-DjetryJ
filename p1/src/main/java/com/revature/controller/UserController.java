package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.User;
import com.revature.services.UserService;

import io.javalin.http.Handler;

public class UserController {

	UserService us = new UserService();
	
	public Handler getAllUserHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			List<User> allUsers = us.getallUsers();
			
			Gson gson = new Gson();
			
			String JSONUser = gson.toJson(allUsers);
			
			ctx.result(JSONUser);
			
			ctx.status(200);
			
		}else {
			ctx.status(403);
		}
	};
}
