package com.java.gr6.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.gr6.helpDeskDAO.WorkDAO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;
import com.java.gr6.helpdeskDTO.WorkDTO;

@Service
public class WorkBussinessImp implements WorkBussiness {

	@SuppressWarnings("unused")
	@Autowired
	private WorkDAO wDao;

	@Override
	public List<WorkDTO> getListWork() {

		return wDao.getListWork();
	}

	@Override
	public List<WorkDTO> getListWorkByUser(EmployeeDTO obj) {
		// TODO Auto-generated method stub
		return wDao.getListWorkByUser(obj);
	}

}
