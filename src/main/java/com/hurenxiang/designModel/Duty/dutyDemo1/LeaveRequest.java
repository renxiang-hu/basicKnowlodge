package com.hurenxiang.designModel.Duty.dutyDemo1;

import lombok.Data;

@Data
public class LeaveRequest {

    private String employeeName;
    private int leaveDays;
    private boolean approved;

    public LeaveRequest(String employeeName,int leaveDays){
        this.employeeName = employeeName;
        this.leaveDays = leaveDays;
        this.approved = false;
    }
}
