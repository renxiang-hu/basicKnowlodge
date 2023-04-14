package com.hurenxiang.designModel.Duty.dutyDemo1;

public class JuniorManager extends LeaveRequestHandler{

    public JuniorManager(LeaveRequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandleRequest(LeaveRequest leaveRequest) {
        return leaveRequest.getLeaveDays() <= 3;
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (canHandleRequest(leaveRequest)){
            System.out.println("Junior Manager approved leave request for " + leaveRequest.getEmployeeName());
            leaveRequest.setApproved(true);
        } else {
            super.handleRequest(leaveRequest);
        }
    }
}
