package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;
import io.javalin.http.Handler;

public class ReimbursementController {

ReimbursementService rs = new ReimbursementService();
	
	public Handler getAllReimbursementHandler = (ctx) ->{
		
		if(ctx.req.getSession(false) != null) {
			
			List<Reimbursement> allReimbursement = rs.getAllReimburesment();
			
			Gson gson = new Gson();
			
			String JSONUser = gson.toJson(allReimbursement);
			
			ctx.result(JSONUser);
			
			ctx.status(200);
			
		}else {
			ctx.status(403);
		}
	};
}
