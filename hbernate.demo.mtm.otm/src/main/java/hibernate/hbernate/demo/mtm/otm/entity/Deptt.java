package hibernate.hbernate.demo.mtm.otm.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Deptt {

	@Id
	private int Deptid;
	private String Deptname;
	private String DeptAdd;
	@ManyToMany(mappedBy = "deptts")
	private List<Emp> emps;

	public int getDeptid() {
		return Deptid;
	}

	public void setDeptid(int deptid) {
		Deptid = deptid;
	}

	public String getDeptname() {
		return Deptname;
	}

	public void setDeptname(String deptname) {
		Deptname = deptname;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public String getDeptAdd() {
		return DeptAdd;
	}

	public void setDeptAdd(String deptAdd) {
		DeptAdd = deptAdd;
	}

	@Override
	public String toString() {
		return "Deptt [Deptid=" + Deptid + ", Deptname=" + Deptname + ", DeptAdd=" + DeptAdd + "]";
	}
}