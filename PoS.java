//// ---------------------------------------------------------
// Assignment (4)
// Written by: (Ali Sher and 40255236)
// For COMP 248 Section (H 2232) – Fall 2023
// ---------------------------------------------------------





import java.util.Scanner;
public class PoS {
	private Sales salesclass;
	private PrePaiCard[] prepaicardclass;
	//▪ Default constructor 

	public PoS(){}

//Constructor with 2 parameters to set the initial value of each attribute
	public PoS(Sales x,PrePaiCard[] y) {
		this.salesclass=x;
	     this.prepaicardclass=y;
	}
//A method which will return true if the total $ value of sales of two PoS objects are equal, and
	//false otherwise. 
	
	public boolean method1(PoS p) {
	return	this.salesclass.SalesTotal()==p.salesclass.SalesTotal();
		
	}
	//
	//
	public boolean method2(PoS m) {
		return this.salesclass.getjunior()==m.salesclass.getjunior()&&
				this.salesclass.getteen()==m.salesclass.getteen()&&
				this.salesclass.getmedium()==m.salesclass.getmedium()&&
				this.salesclass.getbig() ==m.salesclass.getbig()&&
						this.salesclass.getfamily() ==m.salesclass.getfamily();
		   
	}
	//A method which will return the total $ sales of a PoS. `
	public int method3() {
		return this.salesclass.SalesTotal();
		
	}
	//A method which will return the number of prepaid cards in a PoS. 
	public int method4() {
		return this.prepaicardclass.length;
	}
	//A method which will add a new PrePaiCard to the PoS.
	public int method5(PrePaiCard k) {
		if(this.prepaicardclass.length>0) {
		PrePaiCard [] temp= new PrePaiCard[this.prepaicardclass.length+1];
		for(int i=0;i<this.prepaicardclass.length;i++) {
			temp[i]=this.prepaicardclass[i];
			
		}
		temp[temp.length-1]=k;
		this.prepaicardclass=temp;
		return this.prepaicardclass.length;}
		else {
			this.prepaicardclass = new PrePaiCard[1];
			this.prepaicardclass[0]=k;
			return this.prepaicardclass.length;
		}
	}
//A method which will remove a pre-paid card from the PoS
	public boolean method6(int index) {
		
		if (this.prepaicardclass.length==0 || index<0 ||index>=this.prepaicardclass.length) {
			return false;
		}
		else {
			PrePaiCard []temp1=new PrePaiCard[this.prepaicardclass.length-1];
			for(int i=0;i<this.prepaicardclass.length;i++) {
				if(i<index) {
					temp1[i]=this.prepaicardclass[i];
					
				}
				else if(i>index) {
					temp1[i-1]=this.prepaicardclass[i];
					
				}
			}
			this.prepaicardclass=temp1;
			return true;
		}
		
	}
	//A method which will update the expiry day and month of a prepaid card.
	public void method7(int index,int day,int month) {
		this.prepaicardclass[index].setDay(day);
		this.prepaicardclass[index].setMonth(month);
	}
	//A method which will add meals sales to the PoS
	public int method8(int j,int t,int m,int b,int f) {
	this.salesclass.setjunior(j+this.salesclass.getjunior());
	this.salesclass.setteen(t+this.salesclass.getteen());
	this.salesclass.setmedium(m+this.salesclass.getmedium());
	this.salesclass.setbig(b+this.salesclass.getbig());
	this.salesclass.setfamily(f+this.salesclass.getfamily());
	return this.salesclass.SalesTotal();
	}
	//method which will return true if the total $ amount sales value and the number
	//of pre-paid card of two PoS objects are equal, and false otherwise.
	
	public boolean equals(PoS l) {
		if(this.salesclass.SalesTotal()==l.salesclass.SalesTotal()&& this.prepaicardclass.length==l.prepaicardclass.length) {
			return true;}
			else {
				return false;}
		
		
		
	} 

//which will return a string clearly indicating the number
	public String toString() {
		String name;
		name="";
		if(this.prepaicardclass.length>0) {
			
	 name=	this.salesclass.toString()+"\n";
	 for(int i=0;i<this.prepaicardclass.length;i++){
	 name =name+this.prepaicardclass[i].toString() + "\n";
	 
	 }
	 return name;
	 
		}else {
			String nocard=this.salesclass.toString()+"\n"+"No PrePaiCards"+"\n";
			return nocard;
		}
		
		
	}
	//A method which will return a string with just the breakdown of the sales
	public String method10() {
		String hello="";
		hello=this.salesclass.toString();
		return hello;
	}
}
