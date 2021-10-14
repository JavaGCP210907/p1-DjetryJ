package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.ReimbStatus;
import com.revature.services.ReimbStatusService;
import io.javalin.http.Handler;

public class ReimbStatusController {

ReimbStatusService rss = new ReimbStatusService();
	
	public Handler getAllReimbStatusHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			List<ReimbStatus> allReimbStatus = rss.getAllReimbStatus();
			
			Gson gson = new Gson();
			
			String JSONUser = gson.toJson(allReimbStatus);
			
			ctx.result(JSONUser);
			
			ctx.status(200);
			
		}else {
			ctx.status(403);
		}
	};
}
