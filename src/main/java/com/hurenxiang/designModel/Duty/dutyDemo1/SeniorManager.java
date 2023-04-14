package com.hurenxiang.designModel.Duty.dutyDemo1;

public class SeniorManager extends LeaveRequestHandler{

    public SeniorManager(LeaveRequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandleRequest(LeaveRequest leaveRequest) {
        return leaveRequest.getLeaveDays() > 3 && leaveRequest.getLeaveDays() <= 7;
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (canHandleRequest(leaveRequest)){
            System.out.println("SeniorManager Manager approved leave request for " + leaveRequest.getEmployeeName());
            leaveRequest.setApproved(true);
        } else {
            super.handleRequest(leaveRequest);
        }
    }
}
