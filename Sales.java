//// ---------------------------------------------------------
// Assignment (4)
// Written by: (Ali Sher and 40255236)
// For COMP 248 Section (H 2232) – Fall 2023
// ---------------------------------------------------------





import java.util.Scanner;
	public class Sales {
		private int junior;
		private int teen;
		private int medium;
		private int big;
		private int family;
		final private static int price1 =5;;
		final private static int price2 =10;;
		final private static int price3 =12;
		final private static int price4 =15;
		final private static int price5 =20;
//Default constructor 
		public Sales() {}
//Constructor with 5 integer parameters to set the number of each meal category in the till.
		public Sales(int a,int b,int c,int d,int e) {
			this.junior=a;
			this.teen=b;
			this.medium=c;
			this.big=d;
			this.family=e;
		}
		//▪ Copy constructor with one parameter of type Sales.

		public Sales(Sales p) {
			this.junior=p.getjunior();
			this.teen = p.getteen();
			this.medium=medium =p.getmedium();
			this.big= p.getbig();
			this.family=p.getfamily();
		}
		//five accessors
		public int getjunior(){
			return this.junior;
		}
		public int getteen(){
			return this.teen;
		}
		public int getmedium(){
			return this.medium;
		}
		public int getbig(){
			return this.big;
		}
		public int getfamily(){
			return this.family;
		}
		//five mutators
		public void setjunior(int junior) {
			this.junior=junior;
		}
		public void setteen(int teen) {
			this.teen=teen;
		}
		public void setmedium(int medium) {
			this.medium=medium;
		}
		public void setbig(int big) {
			this.big=big;
		}
		public void setfamily(int family) {
			this.family=family;
		}
		public void addSales(int v,int w,int x,int y,int z) {
			this.junior=this.junior+v;
			this.teen=this.teen+w;
			this.medium=this.medium+x;
			this.big=this.big+y;
			this.family=this.family+z;
			
			
		}
		public int SalesTotal() {
			int total;
		return total =this.junior*price1+this.teen*price2+this.medium*price3+this.big*price4+this.family*price5;
		}
		public String toString() {
				return this.junior+" x " + "$"+price1+" + "+this.teen+" x "+"$"+price2+" + "+this.medium+" x "+"$"+price3+" + "+this.big+" x "+"$"+price4+" + "+this.family+" x "+"$"+price5;}

				
		public boolean equals(Sales names) {
			return this.junior==names.getjunior()&& this.teen==names.getteen()&&this.medium==names.getmedium()&&this.big==names.getbig()&&this.family==names.getfamily();}
		}


