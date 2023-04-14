package com.hurenxiang.designModel.Duty.dutyDemo1;

public class Main {
    public static void main(String[] args) {
        LeaveRequestHandler juniorManager = new JuniorManager(null);
        LeaveRequestHandler seniorManager = new SeniorManager(juniorManager);
        LeaveRequestHandler directorManager = new Director(seniorManager);

        LeaveRequest request1 = new LeaveRequest("John", 2);
        juniorManager.handleRequest(request1);
        System.out.println("Request 1 approved? " + request1.isApproved());

        LeaveRequest request2 = new LeaveRequest("Mary", 5);
        seniorManager.handleRequest(request2);
        System.out.println("Request 2 approved? " + request2.isApproved());

        LeaveRequest request3 = new LeaveRequest("David", 10);
        directorManager.handleRequest(request3);
        System.out.println("Request 3 approved? " + request3.isApproved());
    }
}

