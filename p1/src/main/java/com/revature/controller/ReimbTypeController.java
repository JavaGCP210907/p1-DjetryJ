package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.ReimbType;
import com.revature.services.ReimbTypeService;
import io.javalin.http.Handler;

public class ReimbTypeController {

ReimbTypeService rts = new ReimbTypeService();
	
	public Handler getAllReimbTypeHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			List<ReimbType> allReimbType = rts.getAllReimbType();
			
			Gson gson = new Gson();
			
			String JSONUser = gson.toJson(allReimbType);
			
			ctx.result(JSONUser);
			
			ctx.status(200);
			
		}else {
			ctx.status(403);
		}
	};
}
