//// ---------------------------------------------------------
// Assignment (4)
// Written by: (Ali Sher and 40255236)
// For COMP 248 Section (H 2232) – Fall 2023
// ---------------------------------------------------------





import java.util.Scanner;

public class PoSDemo {
	public static void case1(PoS [] pos) {
		for(int i=0;i<pos.length; i++) {
			System.out.println("PoS #"+i+":\n"+pos[i].toString());
		}
	}
	public static void case2(PoS[] pos) {
		
	Scanner	keyboard =new Scanner(System.in);
		System.out.print("Which PoS you want to see the content of? (Enter number 0 to 4): ");
		int case2n;
		do {
			 case2n=keyboard.nextInt()	;	
			 if (case2n<0 || case2n>4) {
				System.out.println("Sorry but there is no PoS number "+case2n);
				System.out.println("Try again: (Enter number 0 to 4):");
			 }
		}while(case2n<0 || case2n>4);
		System.out.println(pos[case2n].toString());

		
	}
	public static void case3(PoS [] pos) {
		System.out.println("List of PoSs with same total $ Sales:");
		for(int i=0;i<pos.length;i++) {
			for(int j=i+1;j<pos.length;j++) {
				if (pos[i].method3()==pos[j].method3()){
					System.out.println("PoSs "+i+" and "+j+" both have "+pos[i].method3());
				}
	
			}
		}
		
	}
	public static void case4(PoS [] pos) {
		System.out.println("List of PoSs with same Sales categories:");
		
		for(int i=0;i<pos.length;i++) {
			for(int j=i+1;j<pos.length;j++) {
				if (pos[i].method2(pos[j])){
					System.out.println("PoSs "+i+" and "+j+" both have "+pos[i].method10());
				}
	
			}
		}
		
	}
	public static void case5(PoS [] pos) {
		System.out.println("List of PoSs with same $ amount of sales and same number of PrePaiCards :");
		
		for(int i=0;i<pos.length;i++) {
			for(int j=i+1;j<pos.length;j++) {
				if (pos[i].equals(pos[j])){
					System.out.println("PoSs "+i+" and "+j);
				}
	
			}
		}
		
	}
	public static void case6(PoS[] pos) {
		System.out.println("Which PoS to you want to add an PrePaiCard to? (Enter number 0 to 4):");
		Scanner	keyboard =new Scanner(System.in);
		int case2n;
		do {
			 case2n=keyboard.nextInt()	;	
			 if (case2n<0 || case2n>4) {
				System.out.println("Sorry but there is no PoS number "+case2n);
				System.out.println("Try again: (Enter number 0 to 4):");
			 }
		}while(case2n<0 || case2n>4);
		System.out.println("Please enter the following information so that we may complete the PrePaiCard-\r\n"
				+ "--> Type of PrePaiCard (Carnivore, Halal, Kosher, Pescatarian, Vegetarian, Vigan):");
		String name = keyboard.next();
		System.out.print("Id of the prepaid card owner:");
		String id=keyboard.next();
		System.out.println(" Expiry day number and month (seperate by a space): ");
		int day =keyboard.nextInt();	
		int month =keyboard.nextInt();
	PrePaiCard cardprepai = new PrePaiCard(name,id,day,month);
	pos[case2n].method5(cardprepai);
	}
	public static void case7(PoS[] pos) {
		System.out.println("Which PoS you want to remove an PrePaiCard from? (Enter number 0 to 4): ");
		Scanner	keyboard =new Scanner(System.in);
		int case2n;
		do {
			 case2n=keyboard.nextInt()	;	
			 if (case2n<0 || case2n>4) {
				System.out.println("Sorry but there is no PoS number "+case2n);
				System.out.println("Try again: (Enter number 0 to 4):");
			 }
		}while(case2n<0 || case2n>4);
		
		if(pos[case2n].method4()>0) {
			System.out.println("(Enter number 0 to"+(pos[case2n].method4()-1)+"):");
int index;
do {
	 index= keyboard.nextInt();

if (index<0 || index>(pos[case2n].method4()-1)) {
	System.out.println("invaloid try again");
}
	}while(index<0||index>(pos[case2n].method4()-1));
pos[case2n].method6(index);
			
		System.out.println("PrePaiCard was removed successfully");
	
	}
		else 
			System.out.println("Sorry that PoS has no PrePaiCards");
	}
	
	
	public static void case8(PoS[] pos) {
		System.out.println("Which PoS do you want to update an PrePaiCard from? (Enter number 0 to 4): ");
		Scanner	keyboard =new Scanner(System.in);
		int case2n;
		do {
			 case2n=keyboard.nextInt()	;	
			 if (case2n<0 || case2n>4) {
				System.out.println("Sorry but there is no PoS number "+case2n);
				System.out.println("Try again: (Enter number 0 to 4):");
			 }
		}while(case2n<0 || case2n>4);
		if(pos[case2n].method4()>0) {
			System.out.println("Which PrePaiCard do you want to update? (Enter number 0 to "+(pos[case2n].method4()-1)+"):");
			int index;
			do {
				 index= keyboard.nextInt();

			if (index<0 || index>(pos[case2n].method4()-1)) {
				System.out.println("invalid try again");
			}
				}while(index<0||index>(pos[case2n].method4()-1));
			System.out.println("Enter new expiry date day number and month (seperate by a space):");
			int m=keyboard.nextInt();
			int n=keyboard.nextInt();
			pos[case2n].method7(index, m, n);
			System.out.println("Expiry Date updated.");
		}
		else {
		System.out.println("it does not have prepaid card");
		}
		
	}
	public static void case9(PoS[] pos){System.out.println("Which PoS do you want to add Sales to? (Enter number 0 to 4):");
	Scanner	keyboard =new Scanner(System.in);
	int case2n;
	do {
		 case2n=keyboard.nextInt()	;	
		 if (case2n<0 || case2n>4) {
			System.out.println("Sorry but there is no PoS number "+case2n);
			System.out.println("Try again: (Enter number 0 to 4):");
		 }
	}while(case2n<0 || case2n>4);
		System.out.println("How many junior, teen ,medium,big and family meal menu do you want to add? ");
		System.out.println("Enter 5 numbers seperated by a space): ");
		int m=keyboard.nextInt();
		int n=keyboard.nextInt();
		int k=keyboard.nextInt();
		int h=keyboard.nextInt();
		int o=keyboard.nextInt();
System.out.println("you now have "+(double)(pos[case2n].method8(n, k, m, h, o)));	}
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("| Welcome to Concordia CostLessBites Catering Sales Counter Application ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
Sales sales1=new Sales(2,1,0,4,1);

Sales sales2=new Sales(2,1,0,4,1);
Sales sales3=new Sales(0,1,5,2,0);
Sales sales4=new Sales(3,2,4,1,2);

Sales sales5=new Sales(3,2,4,1,2);

PrePaiCard[] card1=new PrePaiCard[2];
PrePaiCard[] card2=new PrePaiCard[2];
		PrePaiCard[] card3=new PrePaiCard[3];
				PrePaiCard[] card4=new PrePaiCard[0];
	PrePaiCard[] card5=new PrePaiCard[0];
	card1[0]=new PrePaiCard("Vegetarian" , "40825164" ,25,12);
	card1[1]=new PrePaiCard("Carnivore" ,"21703195" , 03,12);
	card2[0]=new PrePaiCard("Vigan" ,"40825164" ,07,12);
	card2[1]=new PrePaiCard("Vegetarian ","21596387" ,24,8);
			card3[0]=new PrePaiCard("Pescatarian" ,"95432806" , 01,06);
			card3[1]=new PrePaiCard("Halal" ,"42087913" ,18,12);
			card3[2]=new PrePaiCard("Kosher" ,"40735421" ,05,04);
			
	PoS[] pos = new PoS[5];
	pos[0] = new PoS(sales1, card1);
	pos[1] = new PoS(sales2, card2);
	pos[2] = new PoS(sales3, card3);
	pos[3] = new PoS(sales4, card4);
	pos[4] = new PoS(sales5, card5);
	boolean flag = true;
do {
	System.out.println("What would you like to do?");
System.out.println("1 >> See the content of all PoSs |\r\n"
		+ "| 2 >> See the content of one PoS |\r\n"
		+ "| 3 >> List PoSs with same $ amount of sales |\r\n"
		+ "| 4 >> List PoSs with same number of Sales categories |\r\n"
		+ "| 5 >> List PoSs with same $ amount of Sales and same number of prepaid cards |\r\n"
		+ "| 6 >> Add a PrePaiCard to an existing PoS |\r\n"
		+ "| 7 >> Remove an existing prepaid card from a PoS |\r\n"
		+ "| 8 >> Update the expiry date of an existing Prepaid card |\r\n"
		+ "| 9 >> Add Sales to a PoS |\r\n"
		+ "| 0 >> To quit ");
System.out.print("Please enter your choice and press <Enter>: ");
int n=keyboard.nextInt();
if (n>=0 && n<=9) {
switch(n) {
case 0:
	flag=false;
	break;
case 1:
case1(pos);
break;

case 2:
case2(pos);
	break;
case 3:
case3(pos);
	break;
case 4:
case4(pos);
	break;
case 5:
case5(pos);
	break;
case 6:
case6(pos);
break;
case 7:
case7(pos);
break;

case 8:
case8(pos);
break;

case 9 :
case9(pos);
break;

	default:
	
}
}else {
	System.out.println("Sorry that is not a valid choice. Try again.");
}

	

}while(flag);
System.out.println("Thank you for using Concordia CostLessBites Catering Sales Counter Application!");

	
		
	}}


