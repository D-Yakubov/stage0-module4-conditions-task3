package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(float salary) {
        if (salary < 0){
            System.out.println("wrong input!");
        }else if (salary <= 10_000){
            System.out.println(salary-salary*15/100);
        }else if (10_000 < salary && salary <= 20_000){
            System.out.println(salary-salary*18/100);
        }else if (salary > 20_000){
            System.out.println(salary-salary*20/100);
        }
    }
}
