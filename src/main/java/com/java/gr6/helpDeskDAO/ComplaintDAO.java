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

import com.java.gr6.common.BaseDAO;
import com.java.gr6.helpdeskDTO.ComplaintDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@Transactional
@Repository
public class ComplaintDAO extends BaseDAO {

	@Autowired
	private static EmployeeDAO emDao;

	public List<ComplaintDTO> getTotalComplaintDTOByUser(EmployeeDTO employeeDTO) {
		ComplaintDAO comDao = new ComplaintDAO();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(comDao.getQuery());
		strBuilder.append(comDao.getFromQuery());
		if(employeeDTO.getEmpCode()!=null && !employeeDTO.getEmpCode().isEmpty()) {
			strBuilder.append(" AND copm.employee_code =:empcode");
		}
		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
		if(employeeDTO.getEmpCode()!=null && !employeeDTO.getEmpCode().isEmpty()) {
			query.setParameter("empcode", employeeDTO.getEmpCode());
		}
		comDao.addScalar(query);
		List<ComplaintDTO> list = query.list();
		return list;
	}

	public List<ComplaintDTO> getTotalComplaintDTO() {
		ComplaintDAO comDao = new ComplaintDAO();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(comDao.getQuery());
		strBuilder.append(comDao.getFromQuery());
		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
		comDao.addScalar(query);
		List<ComplaintDTO> list = query.list();
		return list;
	}

	public String getGroupBy() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" GROUP BY ");
		strBuilder.append(" copm.complaint_id, ");
		strBuilder.append(" copm.category_complaint_code, ");
		strBuilder.append(" catcom.category_complaint_name, ");
		strBuilder.append(" copm.complaint_code, ");
		strBuilder.append(" copm.complaint_content, ");
		strBuilder.append(" copm.complaint_create_date, ");
		strBuilder.append(" copm.complaint_img, ");
		strBuilder.append(" copm.complaint_name, ");
		strBuilder.append(" copm.complaint_status, ");
		strBuilder.append(" copm.employee_code,");
		strBuilder.append(" emp.full_name, ");
		strBuilder.append(" emp.email, ");
		strBuilder.append(" emp.gender, ");
		strBuilder.append(" emp.address, ");
		strBuilder.append(" emp.avatar, ");
		strBuilder.append(" emp.birthday, ");
		strBuilder.append(" dep.department_name, ");
		strBuilder.append(" ro.role_name, ");
		strBuilder.append(" emp.have_account, ");
		strBuilder.append(" emp.number_phone, ");
		strBuilder.append(" emp.department_code, ");
		strBuilder.append(" emp.role_code as roleCode ");
		return strBuilder.toString();
	}

	public String getQuery() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" SELECT ");
		strBuilder.append(" copm.complaint_id as comId, ");
		strBuilder.append(" copm.category_complaint_code as catComCode, ");
		strBuilder.append(" catcom.category_complaint_name as catComName, ");
		strBuilder.append(" copm.complaint_code as comCode, ");
		strBuilder.append(" copm.complaint_content as comContent, ");
		strBuilder.append(" copm.complaint_create_date as comCreateDate, ");
		strBuilder.append(" copm.complaint_img as comImg, ");
		strBuilder.append(" copm.complaint_name as comName, ");
		strBuilder.append(" copm.complaint_status as comStatus, ");
		strBuilder.append(" copm.employee_code as empCode, ");
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
		strBuilder.append(" emp.role_code as roleCode ");
		return strBuilder.toString();

	}

	@SuppressWarnings("deprecation")
	public void addScalar(SQLQuery query) {
		query.addScalar("comId", LongType.INSTANCE);
		query.addScalar("catComCode", StringType.INSTANCE);
		query.addScalar("catComName", StringType.INSTANCE);
		// query.addScalar("createDate", DateType.INSTANCE);
		query.addScalar("comCode", StringType.INSTANCE);
		query.addScalar("comContent", StringType.INSTANCE);
		query.addScalar("comCreateDate", DateType.INSTANCE);
		query.addScalar("comImg", StringType.INSTANCE);
		query.addScalar("comName", StringType.INSTANCE);
		query.addScalar("comStatus", IntegerType.INSTANCE);
		query.addScalar("empCode", StringType.INSTANCE);
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

		query.setResultTransformer(Transformers.aliasToBean(ComplaintDTO.class));

	}

	public String getFromQuery() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" FROM complaint copm ");
		strBuilder.append(
				" INNER JOIN category_complaint catcom ON copm.category_complaint_code = catcom.category_complaint_code");
		strBuilder.append(" INNER JOIN employee emp ON emp.employee_code = copm.employee_code ");
		strBuilder.append(" INNER JOIN department dep ON emp.department_code = dep.department_code ");
		strBuilder.append(" INNER JOIN Role ro on emp.role_code = ro.role_code ");
		strBuilder.append(" WHERE 1 =1  ");
		return strBuilder.toString();
	}

}
