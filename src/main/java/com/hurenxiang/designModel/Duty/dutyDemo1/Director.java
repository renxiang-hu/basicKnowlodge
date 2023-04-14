package com.hurenxiang.designModel.Duty.dutyDemo1;

public class Director extends LeaveRequestHandler{

    public Director(LeaveRequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandleRequest(LeaveRequest leaveRequest) {
        return leaveRequest.getLeaveDays() > 7;
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (canHandleRequest(leaveRequest)) {
            System.out.println("Director approved leave request for " + leaveRequest.getEmployeeName());
            leaveRequest.setApproved(true);
        } else {
            System.out.println("Leave request for " + leaveRequest.getEmployeeName() + " denied.");
            leaveRequest.setApproved(false);
        }
    }
}
