package linuxmantra.Auth.beans;

import java.util.*;

public class Role {
	private long roleId;
	private String roleName;
	private String roleDescription;
	private List<String> privileges;
	private String createdBy;
	private Date creationDate;
	
	public Role() {
		
	}
	public Role(String roleName, String roleDescription) {
		super();
		this.roleName = roleName;
		this.roleDescription = roleDescription;
		this.creationDate = new Date();
	}
	public void setRoleId(long roleId) {
		this.roleId=roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public long getRoleId() {
		return roleId;
	}
	public List<String> getPrivileges() {
		return this.privileges;
	}
	public void addPrivileges(String privilege) {
		this.privileges.add(privilege);
	}
	public void setPrivileges(List<String> privileges) {
		this.privileges=privileges;
	}
	public String getCreatedBy() {
		return this.createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy=createdBy;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate=creationDate;
	}
	public Date getCreationDate() {
		return this.creationDate;
	}
}
