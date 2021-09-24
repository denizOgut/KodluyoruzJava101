package maaşhesaplayıcı;

class Employee {

    String name;
    double salary;
    int workHours, hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
       
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        
        int workingYear = 2021 - this.hireYear;
         
        if (workingYear < 9){
            return this.salary*0.05;
        }
        else if (workingYear >= 9 && workingYear < 19){
            return this.salary*0.1;
        }
        else if (workingYear > 19) {
            return this.salary*0.15;
        }
        
    return 0;

    }

     @Override
    public String toString() {
        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nVergiler ve Bonuslar ile birlikte maaş : " + (this.salary+this.bonus()-this.tax()) +
                "\nToplam Maaş : " + (this.salary+raiseSalary());
    }

}

public class MaaşHesaplayıcı {

    public static void main(String[] args) {
        Employee kemal = new Employee("kemal", 2000, 45, 1985);

        System.out.println(kemal.toString());

    }

}
