package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.UserRoles;
import com.revature.services.UserRoleService;
import io.javalin.http.Handler;

public class UserRolesController {

UserRoleService urs = new UserRoleService();
	
	public Handler getAllUserRolesHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			List<UserRoles> allUsersRole = urs.getAllUserRoles();
			
			Gson gson = new Gson();
			
			String JSONUser = gson.toJson(allUsersRole);
			
			ctx.result(JSONUser);
			
			ctx.status(200);
			
		}else {
			ctx.status(403);
		}
	};
}
