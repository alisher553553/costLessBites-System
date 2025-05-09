//// ---------------------------------------------------------
// Assignment (4)
// Written by: (Ali Sher and 40255236)
// For COMP 248 Section (H 2232) – Fall 2023
// ---------------------------------------------------------



import java.util.Scanner;

	public class PrePaiCard {
		private String type;
		private String ID;
		private int day;
		private int month;
		//▪ Default constructor 
public PrePaiCard() {}
//Constructor with 4 parameters to set the initial value of each attribute

		public PrePaiCard(String v,String w,int x,int y) {
			this.type=v;
			this.ID =w;
			this.day=x;
			this.month=y;
			//if day is leess than zero setting it to zero
			if (x<1 || x>31) {
				day=0;
			}
			//if month is less than zero setting it to zero
		 if (y<1 || y>12) {
				month=0;
			}
				
		}
		//▪ Copy constructor with one parameter of type PrePaiCard. 

		public PrePaiCard(PrePaiCard p) {
			this.type=p.gettype();
			this.ID=p.getID();
			this.day=p.day;
			this.month=p.getMonth();
		}
		
		//creating gettors
		public String gettype() {
			return this .type;
		}public String getID() {
			return this.getID();
		}
		public int getDay() {
			return this.day;
		}
		public int getMonth() {
			return this.month;
		}
//creating setters

		public void settype(String type) {
			 this.type=type;
		}public void setID(String ID) {
			this.ID=ID;
		}
		public void setDay(int day) {
			 this.day=day;
			 if (this.day<1 || this.day>31) {
					this.day=0;
				}
		}
		public void setMonth(int month) {
			 this.month=month;
			 if (this.month<1 || this.month>12) {
					this.month=0;
				}
		}
		//which will return a string indicating the type of the pre-paid card
		public String toString() {
			String date;
			if(this.day<10)
				date = "0"+this.day+"/"+this.month;
			if (this.month<10)
				date=this.day+"/0"+this.month;
			if(this.day<10&&this.month<10)
				date="0"+this.day+"/0"+this.month;
			else date= this.day+"/"+this.month;
			String dateoutput;
			dateoutput=this.type+" - "+this.ID+" - "+date;
			return dateoutput;
				
		}
		//which will return true if the two objects of type PrePaiCard
		public boolean equals(PrePaiCard names) {
			return this.type==names.gettype() &&this.ID==names.getID() && this.day==names.getDay() && this.month==names.getMonth();}

		}


