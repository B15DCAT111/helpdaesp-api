package com.java.gr6.helpDeskDAO;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.gr6.common.BaseDAO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;
import com.java.gr6.helpdeskDTO.WorkDTO;

@Transactional
@Repository
public class WorkDAO extends BaseDAO {

	public List<WorkDTO> getListWork() {
		WorkDAO dao = new WorkDAO();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(dao.getQuery());
		strBuilder.append(dao.getFromQuery());
		strBuilder.append(dao.getGroupBy());
		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
		dao.addScalar(query);
		return query.list();
	}

	public List<WorkDTO> getListWorkByUser(EmployeeDTO obj) {
		WorkDAO dao = new WorkDAO();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(dao.getQuery());
		strBuilder.append(dao.getFromQuery());
		if (obj.getEmpCode() != null && !obj.getEmpCode().isEmpty()) {
			strBuilder.append(" AND w.employee_code =:empcode");
		}
		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
		if (obj.getEmpCode() != null && !obj.getEmpCode().isEmpty()) {
			query.setParameter("empcode", obj.getEmpCode());
		}
		dao.addScalar(query);
		List<WorkDTO> list = query.list();
		return list;
	}

	public String getGroupBy() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" GROUP BY ");
		strBuilder.append(" w.work_id, ");
		strBuilder.append(" w.complaint_code, ");
		strBuilder.append(" c.complaint_name, ");
		strBuilder.append(" w.employee_code, ");
		strBuilder.append(" e.full_name, ");
		strBuilder.append(" w.work_note, ");
		strBuilder.append(" w.work_start_date, ");
		strBuilder.append(" w.work_end_date, ");
		strBuilder.append(" w.work_status, ");
		strBuilder.append(" cc.category_complaint_name ");
		return strBuilder.toString();
	}

	public void addScalar(SQLQuery query) {
		query.addScalar("workId", LongType.INSTANCE);
		query.addScalar("comCode", StringType.INSTANCE);
		query.addScalar("comName", StringType.INSTANCE);
		// query.addScalar("createDate", DateType.INSTANCE);
		query.addScalar("empCode", StringType.INSTANCE);
		query.addScalar("empFullName", StringType.INSTANCE);
		query.addScalar("workStartDate", DateType.INSTANCE);
		query.addScalar("workStartDateEnd", DateType.INSTANCE);
		query.addScalar("WorkStatus", IntegerType.INSTANCE);
		query.addScalar("workNote", StringType.INSTANCE);
		query.addScalar("catComName", StringType.INSTANCE);
		query.setResultTransformer(Transformers.aliasToBean(WorkDTO.class));
	}

	public String getQuery() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" SELECT ");
		strBuilder.append(" w.work_id as workId, ");
		strBuilder.append(" w.complaint_code as comCode, ");
		strBuilder.append(" c.complaint_name as comName, ");
		strBuilder.append(" w.employee_code as empCode, ");
		strBuilder.append(" e.full_name as empFullName, ");
		strBuilder.append(" w.work_note as workNote , ");
		strBuilder.append(" w.work_start_date as workStartDate, ");
		strBuilder.append(" w.work_end_date as workStartDateEnd, ");
		strBuilder.append(" w.work_status as  WorkStatus, ");
		strBuilder.append(" cc.category_complaint_name as  catComName ");

		return strBuilder.toString();

	}

	public String getFromQuery() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" FROM work w ");
		strBuilder.append(" INNER JOIN complaint c ON c.complaint_code = w.complaint_code");
		strBuilder.append(" INNER JOIN employee e ON e.employee_code = w.employee_code ");
		strBuilder.append(" INNER JOIN category_complaint cc ON cc.category_complaint_code = c.category_complaint_code ");
		strBuilder.append(" WHERE 1 =1  ");
		return strBuilder.toString();
	}
}
