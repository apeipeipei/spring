package com.hr.serviceImpl;

import com.hr.service.Company;
import com.hr.service.Employe;

public class CompanyImpl implements Company {

	public void department(String name, Employe employees) {
		System.out.println("部门:" + name + "员工:" + employees);
	}

}
