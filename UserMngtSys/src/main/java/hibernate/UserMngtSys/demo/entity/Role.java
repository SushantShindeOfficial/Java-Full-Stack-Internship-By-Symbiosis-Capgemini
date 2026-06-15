package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	private int RoleID;
	private String roleName;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int roleID, String roleName) {
		super();
		RoleID = roleID;
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "Role [RoleID=" + RoleID + ", roleName=" + roleName + "]";
	}
	public int getRoleID() {
		return RoleID;
	}
	public void setRoleID(int roleID) {
		RoleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
