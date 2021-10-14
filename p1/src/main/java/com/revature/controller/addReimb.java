package com.revature.controller;

import com.google.gson.Gson;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;
import io.javalin.http.Handler;

public class addReimb {

	ReimbursementService rs = new ReimbursementService();
	
	public Handler addReimbHandler = (ctx) -> {
		String body = ctx.body();
		
		Gson gson = new Gson();
		
		Reimbursement reimb = gson.fromJson(body, Reimbursement.class);
		
		if(ctx.req.getSession(false) != null) {
			

			String JSONUser = gson.toJson(rs);
			
			ctx.result(JSONUser);
			
			ctx.status(200);
			
		}else {
			ctx.status(403);
		}
		};
}
