package homework.collection.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Organization
implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orgId;
    private String orgName;

    List<Department> deptList =
            new ArrayList<Department>();

    public Organization(int orgId,
                        String orgName) {

        this.orgId = orgId;
        this.orgName = orgName;
    }

    public int getOrgId() {
        return orgId;
    }

    public void addDepartment(Department d) {

        deptList.add(d);
    }

    @Override
    public String toString() {

        return orgId + " " +
                orgName + " " +
                deptList;
    }
}
