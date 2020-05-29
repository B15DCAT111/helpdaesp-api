package com.java.gr6.bussiness;

import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.common.MailCommon;
import com.java.gr6.common.MailTemplate;
import com.java.gr6.common.RandomString;
import com.java.gr6.common.ResponseCommon;
import com.java.gr6.constant.Contants;
import com.java.gr6.helpDeskDAO.EmployeeDAO;
import com.java.gr6.helpdeskBO.AccountBO;
import com.java.gr6.helpdeskBO.EmployeeBO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;
import com.java.gr6.repo.EmployeeJPA;

@Service
public class EmployeeBussinessImp implements EmployeeBussiness {

	@SuppressWarnings("unused")
	@Autowired
	private EmployeeDAO empDAO;

	@Autowired
	private EmployeeJPA empJPA;

	private ModelMapper mapper = new ModelMapper();

	@Override
	public List<EmployeeDTO> findEmployees(EmployeeDTO obj) {
		List<EmployeeDTO> listObj = empDAO.findEmployees(obj);
		return listObj;
	}

	@Override
	public List<EmployeeDTO> getAllEmp() {
		List<EmployeeDTO> listObj = empDAO.getAllEmp();
		return listObj;
	}

	@Override
	public ReponseMessage createEmployee(EmployeeDTO obj) {
		if (obj != null) {
			EmployeeBO employeeBO = mapper.map(obj, EmployeeBO.class);
			Long maxId = empJPA.getMaxEmpId() + 1;
			employeeBO.setEmpCode("EMPCODE" + maxId);
			employeeBO.setHaveAcc(0);
			empJPA.save(employeeBO);

			return ResponseCommon.success();
		}
		return ResponseCommon.fail(Contants.ERROR_OBJ);
	}

	@Override
	public ReponseMessage upDateEmployee(EmployeeDTO obj, String empCode) {
		
		EmployeeDTO objDb = empDAO.findEmployeeByCode(empCode);
			obj.setEmpId(objDb.getEmpId());
			EmployeeBO employeeBO = mapper.map(obj, EmployeeBO.class);

			empJPA.save(employeeBO);

			return ResponseCommon.success();

	}

	@Override
	public ReponseMessage deleteEmployee(String empCode) {

		EmployeeDTO employeeDTO = empDAO.findEmployeeByCode(empCode);
		EmployeeBO employeeBO = mapper.map(employeeDTO, EmployeeBO.class);
		employeeBO.setEmpCode(null);
		empJPA.save(employeeBO);

		return ResponseCommon.success();

	}

}
