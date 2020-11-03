public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusComissionEmployee(String firstName, String lastName, String cpf, double grossSales, double comissionRate, double baseSalary) {
        super(firstName, lastName, cpf, grossSales, comissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){
            throw new IllegalArgumentException("O valor de salário (baseSalary) deve ser > 0");
        }
        this.baseSalary = baseSalary;
    }
    //ganho semanal do funcionario
    @Override
    public double earnings(){
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s: R$ %.2f",
            "Salário base e", super.toString(), "Salário base", getBaseSalary()
        );
    }
}
