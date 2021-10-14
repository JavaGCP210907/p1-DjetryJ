import java.sql.Connection;
import java.sql.SQLException;

import com.revature.controller.LoginController;
import com.revature.controller.ReimbStatusController;
import com.revature.controller.ReimbTypeController;
import com.revature.controller.ReimbursementController;
import com.revature.controller.UserController;
import com.revature.controller.UserRolesController;
import com.revature.controller.addReimb;
import com.revature.utils.ConnectionUtil;

import io.javalin.Javalin;

public class Launcher {

	public static void main(String[] args) {
		
		UserController uc = new UserController();
		UserRolesController urc = new UserRolesController();
		ReimbursementController rc = new ReimbursementController();
		ReimbTypeController rtc = new ReimbTypeController();
		ReimbStatusController rsc = new ReimbStatusController();
		LoginController lc = new LoginController();
		addReimb ar = new addReimb();
		
		try(Connection con = ConnectionUtil.getConnection()){
			System.out.println("Neo, you are....... THE ONE!!! and you CONNECTED TO YOUR DATABASE");
		}catch(SQLException e) {
			System.out.println("YOU FAILED!!");
			e.printStackTrace();
		}
		
		Javalin app = Javalin.create(
				config -> {
					config.enableCorsForAllOrigins();
				}
				).start(8090);
		
		app.get("/Users", uc.getAllUserHandler);
		app.post("addUsers", uc.getAllUserHandler);
		app.get("/UserRoles", urc.getAllUserRolesHandler);
		app.get("/Reimbursement", rc.getAllReimbursementHandler);
		app.post("/addReimbursement", ar.addReimbHandler);
		app.get("/ReimbType", rtc.getAllReimbTypeHandler);
		app.post("/addReimbType", rtc.getAllReimbTypeHandler);
		app.get("/ReimbStatus", rsc.getAllReimbStatusHandler);
		app.post("/addReimbStatus", rsc.getAllReimbStatusHandler);
		app.post("/login", lc.loginHandler);
	}
}
