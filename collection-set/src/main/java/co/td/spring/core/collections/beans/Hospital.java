package co.td.spring.core.collections.beans;

import java.util.List;
import java.util.Set;

public class Hospital {
private String hospitalName;
private Set<String> departments;
public String getHospitalName() {
	return hospitalName;
}
public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}
public Set<String> getDepartments() {
	return departments;
}
public void setDepartments(Set<String> departments) {
	this.departments = departments;
}
@Override
public String toString() {
	return "Hospital [hospitalName=" + hospitalName + ", departments=" + departments + "]";
}

}
