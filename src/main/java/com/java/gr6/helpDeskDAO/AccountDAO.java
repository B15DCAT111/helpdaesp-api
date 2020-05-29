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

import com.java.gr6.ObjectParam.AccountLogin;
import com.java.gr6.common.BaseDAO;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@Transactional
@Repository
public class AccountDAO extends BaseDAO {
	private static AccountDAO accountDAO = new AccountDAO();

	public AccountDTO findAccountByEmpcode(EmployeeDTO obj) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(accountDAO.getQuery());
		strBuilder.append(accountDAO.getFromQuery());
		if (obj != null && !obj.getEmpCode().isEmpty()) {
			strBuilder.append("AND acc.employee_code =:empCode ");
		}
		strBuilder.append(accountDAO.getGroupBy());
		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
		if (obj != null && !obj.getEmpCode().isEmpty()) {
			query.setParameter("empCode", obj.getEmpCode());
		}
		accountDAO.addScalar(query);
		List<AccountDTO> list = query.list();
		AccountDTO accountDTO = new AccountDTO();
		if (list != null && list.size() > 0) {
			accountDTO = list.get(0);
		} else {
			System.out.println("Danh sach acc tra ve co so luong la " + list.size() + " ban ghi");
		}

		return accountDTO;
	}

	public List<AccountDTO> getTotalAcc() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(accountDAO.getQuery2());
		strBuilder.append(accountDAO.getFromQuery2());
		strBuilder.append(accountDAO.getGroupBy2());
		SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
		accountDAO.addScalar2(query);
		return query.list();
	}

	public AccountDTO findAccountByUserPass(String userName, String pass) {
		StringBuilder strBuilder = new StringBuilder();
		if (userName != null && !userName.isEmpty() && pass != null && !pass.isEmpty()) {
			strBuilder.append(accountDAO.getQuery());
			strBuilder.append(accountDAO.getFromQuery());
			if (userName != null && !userName.isEmpty() && pass != null && !pass.isEmpty()) {
				strBuilder.append("AND acc.username =:userName ");
				strBuilder.append("AND acc.password =:password ");
			}
			strBuilder.append(accountDAO.getGroupBy());
			SQLQuery query = getSession().createSQLQuery(strBuilder.toString());
			if (userName != null && !userName.isEmpty() && pass != null && !pass.isEmpty()) {
				query.setParameter("userName", userName);
				query.setParameter("password", pass);
			}
			accountDAO.addScalar(query);
			List<AccountDTO> list = query.list();
			AccountDTO accountDTO = new AccountDTO();
			if (list != null && list.size() > 0) {
				accountDTO = list.get(0);
			} else {
				System.out.println("Danh sach acc tra ve co so luong la " + list.size() + " ban ghi");
			}

			return accountDTO;
		}
		return null;
	}

	public String getQuery() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" SELECT ");
		strBuilder.append(" acc.account_id as accountId, ");
		strBuilder.append(" acc.create_date as createDate, ");
		strBuilder.append(" acc.employee_code as empCode, ");
		strBuilder.append(" acc.is_activared as isActivated, ");
		strBuilder.append(" acc.password as password, ");
		strBuilder.append(" acc.role_code as roleCode, ");
		strBuilder.append(" acc.status as status, ");
		strBuilder.append(" acc.username as userName ");
		return strBuilder.toString();
	}

	public String getQuery2() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" SELECT ");
		strBuilder.append(" acc.account_id as accountId, ");
		strBuilder.append(" acc.create_date as createDate, ");
		strBuilder.append(" acc.employee_code as empCode, ");
		strBuilder.append(" acc.is_activared as isActivated, ");
		strBuilder.append(" acc.password as password, ");
		strBuilder.append(" acc.role_code as roleCode, ");
		strBuilder.append(" acc.status as status, ");
		strBuilder.append(" acc.username as userName, ");
		strBuilder.append(" e.full_name as fullName, ");
		strBuilder.append(" e.have_account as haveAcc ");
		return strBuilder.toString();
	}

	public String getGroupBy2() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" GROUP BY ");
		strBuilder.append(" acc.account_id, ");
		strBuilder.append(" acc.create_date, ");
		strBuilder.append(" acc.employee_code, ");
		strBuilder.append(" acc.is_activared, ");
		strBuilder.append(" acc.password, ");
		strBuilder.append(" acc.role_code, ");
		strBuilder.append(" acc.status, ");
		strBuilder.append(" acc.username, ");
		strBuilder.append(" e.full_name, ");
		strBuilder.append(" e.have_account ");
		return strBuilder.toString();
	}

	public String getGroupBy() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" GROUP BY ");
		strBuilder.append(" acc.account_id, ");
		strBuilder.append(" acc.create_date, ");
		strBuilder.append(" acc.employee_code, ");
		strBuilder.append(" acc.is_activared, ");
		strBuilder.append(" acc.password, ");
		strBuilder.append(" acc.role_code, ");
		strBuilder.append(" acc.status, ");
		strBuilder.append(" acc.username ");
		return strBuilder.toString();
	}

	public void addScalar(SQLQuery query) {
		query.addScalar("accountId", LongType.INSTANCE);
		query.addScalar("createDate", DateType.INSTANCE);
		query.addScalar("empCode", StringType.INSTANCE);
		query.addScalar("isActivated", IntegerType.INSTANCE);
		// query.addScalar("createDate", DateType.INSTANCE);
		query.addScalar("password", StringType.INSTANCE);
		query.addScalar("roleCode", StringType.INSTANCE);
		query.addScalar("status", IntegerType.INSTANCE);
		query.addScalar("userName", StringType.INSTANCE);

		query.setResultTransformer(Transformers.aliasToBean(AccountDTO.class));

	}

	public void addScalar2(SQLQuery query) {
		query.addScalar("accountId", LongType.INSTANCE);
		query.addScalar("createDate", DateType.INSTANCE);
		query.addScalar("empCode", StringType.INSTANCE);
		query.addScalar("isActivated", IntegerType.INSTANCE);
		// query.addScalar("createDate", DateType.INSTANCE);
		query.addScalar("password", StringType.INSTANCE);
		query.addScalar("roleCode", StringType.INSTANCE);
		query.addScalar("status", IntegerType.INSTANCE);
		query.addScalar("userName", StringType.INSTANCE);
		query.addScalar("fullName", StringType.INSTANCE);
		query.addScalar("haveAcc", IntegerType.INSTANCE);

		query.setResultTransformer(Transformers.aliasToBean(AccountDTO.class));

	}

	public String getFromQuery() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" FROM account acc ");
		strBuilder.append(" WHERE acc.status = 1  ");
		strBuilder.append(" AND 1 =1  ");
		return strBuilder.toString();
	}

	public String getFromQuery2() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(" FROM account acc INNER JOIN employee e on acc.employee_code = e.employee_code  ");
		strBuilder.append(" WHERE  ");
		strBuilder.append(" 1 =1  ");
		return strBuilder.toString();
	}

}
