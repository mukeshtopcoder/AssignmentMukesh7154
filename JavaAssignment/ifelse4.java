// Calculate Gross Salary Where HRA and DA is 20% 
// if basic salary is greater than or equal to 10000
class ifelse4{
	public static void main(String[] args){
		int basicSalary = 10000;
		int hra=0;
		int da=0;
		if(basicSalary>=10000)
			da=hra=basicSalary*20/100;
		else
			da=hra=basicSalary*30/100;
		int gs=basicSalary+hra+da;
		System.out.print("Gross Salary : "+gs);
	}
}