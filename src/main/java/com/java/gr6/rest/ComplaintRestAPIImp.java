package com.java.gr6.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.gr6.bussiness.ComplaintBussiness;
import com.java.gr6.helpdeskDTO.ComplaintDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@RestController
@RequestMapping("complaint")
public class ComplaintRestAPIImp implements ComplaintRestAPI {

	@Autowired
	private ComplaintBussiness comBuss;
	
	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getTotalComplaint")
	public List<ComplaintDTO> getTotalComplaintDTO() {
		// TODO Auto-generated method stub
		return comBuss.getTotalComplaintDTO();
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/getTotalComplaintDTOByUser")
	public List<ComplaintDTO> getTotalComplaintDTOByUser(@RequestBody EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		return comBuss.getTotalComplaintDTOByUser(employeeDTO);
	}

}
