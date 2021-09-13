package com.techment.service;

import com.techment.entity.LoanApplication;

public interface ILoanApplicationService {

	LoanApplication saveLoanApplication(LoanApplication loanApplication) throws Exception;
	LoanApplication approveLoanApplication(long loanId);
	LoanApplication rejectLoanApplication(long loanId);
}
