package com.techment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.UserDto;
import com.techment.entity.LoanApplication;
import com.techment.entity.User;
import com.techment.exception.LoanApplicationAlreadyExist;
import com.techment.exception.LoanApplicationNotFound;
import com.techment.exception.UnAuthorisedException;
import com.techment.service.ILoanApplicationService;
import com.techment.service.IUserService;

@RestController
@RequestMapping("/api/v1")
public class LoanApplicationController {

	@Autowired
	ILoanApplicationService iLoanApplicationService;

	@Autowired
	IUserService iUserService;

	@PostMapping("/newLoanApplication")
	public ResponseEntity<LoanApplication> saveLoanApplication(@RequestBody LoanApplication loanApplication,
			@RequestHeader String token) {
		try {

			Optional<UserDto> user = iUserService.findByToken1(token);

			if (!user.isEmpty())
				throw new UnAuthorisedException("unauthorised ");
			else {
				LoanApplication newLoanApplication = iLoanApplicationService.saveLoanApplication(loanApplication);
				return new ResponseEntity<LoanApplication>(newLoanApplication, HttpStatus.CREATED);
			}

		} 
		catch(UnAuthorisedException e) {
			throw new UnAuthorisedException("unauthorised for creating new loan application");
		}
		
		catch (Exception e) {
			throw new LoanApplicationAlreadyExist("Already Exist");
		}
	}

	@PutMapping("/approveLoanApplication/{loanId}")
	public ResponseEntity<LoanApplication> approveLoanApplication(@PathVariable long loanId,
			@RequestHeader String token) {
		try {

			Optional<UserDto> user = iUserService.findByToken1(token);
			System.out.println("pk        " + user);
			if (user==null)
				throw new UnAuthorisedException("token not correct");

			else {
				LoanApplication newLoanApplication = iLoanApplicationService.approveLoanApplication(loanId);
				return new ResponseEntity<LoanApplication>(newLoanApplication, HttpStatus.OK);
			}

		} catch(UnAuthorisedException e) {
			throw new UnAuthorisedException("unauthorised for approving");
		}
		
		catch (Exception e) {
			throw new LoanApplicationNotFound("loan id not found for approve");
		}
	}

	@PutMapping("/rejectLoanApplication/{loanId}")
	public ResponseEntity<LoanApplication> rejectLoanApplication(@PathVariable long loanId,
			@RequestHeader String token) {
		try {
			Optional<UserDto> user = iUserService.findByToken1(token);
			if (user.isEmpty()) {
				throw new UnAuthorisedException("token not correct");
			}

			else {

				LoanApplication newLoanApplication = iLoanApplicationService.rejectLoanApplication(loanId);
				return new ResponseEntity<LoanApplication>(newLoanApplication, HttpStatus.OK);
			}

		} 
		catch(UnAuthorisedException e) {
			throw new UnAuthorisedException("unauthorised for rejecting");
		}
		
		catch (Exception e) {
			throw new LoanApplicationNotFound("loan id  not found for reject");
		}
	}

}
