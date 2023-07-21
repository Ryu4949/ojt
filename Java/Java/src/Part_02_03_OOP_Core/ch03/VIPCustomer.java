package Part_02_03_OOP_Core.ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentId;

    public VIPCustomer() {

        super(0, "no-name");
        bonusRatio = 0.05;
        salesRatio  = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");
    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }


    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}
