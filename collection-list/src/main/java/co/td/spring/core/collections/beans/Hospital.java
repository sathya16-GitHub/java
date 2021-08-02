package co.td.spring.core.collections.beans;

import java.util.List;

public class Hospital {
private String hospitalName;
private List<String> departments;
public String getHospitalName() {
	return hospitalName;
}
public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}
public List<String> getDepartments() {
	return departments;
}
public void setDepartments(List<String> departments) {
	this.departments = departments;
}
@Override
public String toString() {
	return "Hospital [hospitalName=" + hospitalName + ", departments=" + departments + "]";
}

}
