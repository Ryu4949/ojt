package Part_02_03_OOP_Core.ch02;

public class VIPCustomer extends Customer{

    double salesRatio;
    private int agentId;

    public VIPCustomer() {

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }
}
