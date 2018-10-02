package linuxmantra.Auth;
import java.util.ArrayList;
import java.util.List;

import linuxmantra.Auth.beans.Role;
import linuxmantra.Auth.controller.RoleController;
public class App {
	public static void main(String[] args) {
		Role role=new Role();
		List<String> privileges = new ArrayList<String>();;
		privileges.add("admin->user");
		privileges.add("admin->role");
		RoleController rolecontroller =new RoleController();
		role.setRoleName("admin");
		role.setRoleDescription("role with admin privileges");
		role.setPrivileges(privileges);
		rolecontroller.saveRole(role);
		
	}
}
