package com.hurenxiang.designModel.Duty.dutyDemo1;

public abstract class LeaveRequestHandler {

    private  LeaveRequestHandler next;

    public LeaveRequestHandler(LeaveRequestHandler nextHandler){
        this.next = nextHandler;
    }

    public void handleRequest(LeaveRequest leaveRequest){
        if (next != null){
           next.handleRequest(leaveRequest);
        }
    }

    protected abstract boolean canHandleRequest(LeaveRequest leaveRequest);
}
