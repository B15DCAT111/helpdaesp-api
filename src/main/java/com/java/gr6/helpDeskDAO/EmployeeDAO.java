package com.java.gr6.helpDeskDAO;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.gr6.ObjectParam.AccountLogin;
import com.java.gr6.common.BaseDAO;
import com.java.gr6.constant.Contants;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@Transactional
@Repository
public class EmployeeDAO extends BaseDAO {

	@Autowired
	private AccountDAO accountDAO;

	@Autowired
	private static EmployeeDAO emDao;

	/*
	 * Tìm kiếm thằng user đăng nhập
	 * 
	 * @param Account return Employee
	 */

	public EmployeeDTO findEmployeebyAcc(String userName, String pass) {
		EmployeeDAO empdao = new EmployeeDAO();
		AccountDTO accountDTO = accountDAO.findAccountByUserPass(userName, pass);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		if (accountDTO.getEmpCode() != null) {
			employeeDTO = findEmployeeByCode(accountDTO.getEmpCode());
			employeeDTO.setMessageFromServer(Contants.OK);
		} else {
			employeeDTO.setMessageFromServer(Contants.NOT_OK);
		}

		return employeeDTO;
	}

	/*
	 * Tim kiem nhan vien theo code
	 */
	public EmployeeDTO findEmployeeByCode(String empCode) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(employeeDAO.getQuery());
		// Tim kiem theo ten nhan vien
		if (empCode != null || !empCode.isEmpty()) {
			strBuilder.append(" AND emp.employee_code = " + "'" + empCode + "'");
		}
		strBuilder.append(employeeDAO.getGroupBy());

		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());

		employeeDAO.addScalar(query);
		List<EmployeeDTO> list = query.list();
		EmployeeDTO employeeDTO = new EmployeeDTO();
		if (list != null && list.size() > 0) {
			employeeDTO = list.get(0);
		}
		return employeeDTO;
	}

	public List<EmployeeDTO> findEmployees(EmployeeDTO obj) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(employeeDAO.getQuery());
		// Tim kiem theo ten nhan vien
		if (null != obj.getEmpFullName() && !obj.getEmpFullName().isEmpty()) {
			strBuilder.append(" AND emp.full_name LIKE " + " '%" + obj.getEmpFullName() + "%' ");
		}
		if (null != obj.getEmpCode() && !obj.getEmpCode().isEmpty()) {
			strBuilder.append(" AND emp.employee_code = " + " '" + obj.getEmpCode() + "' ");
		}if (null != obj.getRoleCode() && !obj.getRoleCode().isEmpty()) {
			strBuilder.append(" AND emp.role_code = " + " '" + obj.getRoleCode() + "' ");
		}
		
		strBuilder.append(employeeDAO.getGroupBy());
		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
		employeeDAO.addScalar(query);
		return query.list();
	}

	public List<EmployeeDTO> getAllEmp() {
		StringBuilder strBuilder = new StringBuilder();
		EmployeeDAO empdao = new EmployeeDAO();

		strBuilder.append(empdao.getQuery());
		strBuilder.append(empdao.getGroupBy());
		String query1 = strBuilder.toString();
		SQLQuery query = getSession().createSQLQuery(query1);
		empdao.addScalar(query);
		return query.list();
	}

	public void addScalar(SQLQuery query) {
		query.addScalar("empId", LongType.INSTANCE);
		query.addScalar("empFullName", StringType.INSTANCE);
		query.addScalar("empEmail", StringType.INSTANCE);
		query.addScalar("empGender", IntegerType.INSTANCE);
		// query.addScalar("createDate", DateType.INSTANCE);
		query.addScalar("empAddress", StringType.INSTANCE);
		query.addScalar("empAvatar", StringType.INSTANCE);
		query.addScalar("empBirthDay", DateType.INSTANCE);
		query.addScalar("departmentName", StringType.INSTANCE);
		query.addScalar("roleName", StringType.INSTANCE);
		query.addScalar("haveAcc", IntegerType.INSTANCE);
		query.addScalar("numberPhone", StringType.INSTANCE);
		query.addScalar("depCode", StringType.INSTANCE);
		query.addScalar("roleCode", StringType.INSTANCE);
		query.addScalar("empCode", StringType.INSTANCE);

		query.setResultTransformer(Transformers.aliasToBean(EmployeeDTO.class));

	}

	public String getQuery() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" SELECT ");
		strBuilder.append(" emp.employee_id as empId, ");
		strBuilder.append(" emp.full_name as empFullName, ");
		strBuilder.append(" emp.email as empEmail, ");
		strBuilder.append(" emp.gender as empGender, ");
		strBuilder.append(" emp.address as empAddress, ");
		strBuilder.append(" emp.avatar as empAvatar, ");
		strBuilder.append(" emp.birthday as empBirthDay, ");
		strBuilder.append(" dep.department_name as departmentName, ");
		strBuilder.append(" ro.role_name as roleName, ");
		strBuilder.append(" emp.have_account as haveAcc, ");
		strBuilder.append(" emp.number_phone as numberPhone, ");
		strBuilder.append(" emp.department_code as depCode, ");
		strBuilder.append(" emp.employee_code as empCode, ");
		strBuilder.append(" emp.role_code as roleCode ");

		strBuilder.append(" FROM employee emp ");
		strBuilder.append(" INNER JOIN department dep ON emp.department_code = dep.department_code ");
		strBuilder.append(" INNER JOIN Role ro on emp.role_code = ro.role_code ");
		strBuilder.append(" WHERE 1 =1 AND emp.employee_code IS NOT NULL  ");
		return strBuilder.toString();
	}

	public String getGroupBy() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" GROUP BY ");
		strBuilder.append(" 	emp.employee_id, ");
		strBuilder.append(" 	emp.full_name, ");
		strBuilder.append(" 	emp.email, ");
		strBuilder.append(" 	emp.gender, ");
		// strBuilder.append(" ac.create_date, ");
		strBuilder.append(" 	emp.address, ");
		strBuilder.append(" 	emp.avatar, ");
		strBuilder.append(" emp.birthday , ");
		strBuilder.append(" dep.department_name , ");
		strBuilder.append(" ro.role_name , ");
		strBuilder.append(" emp.have_account, ");
		strBuilder.append(" emp.number_phone, ");
		strBuilder.append(" emp.department_code, ");
		strBuilder.append(" emp.employee_code, ");
		strBuilder.append(" emp.role_code ");

		return strBuilder.toString();
	}

}
