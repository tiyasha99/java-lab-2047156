import java.util.*;
//Inmporting packages
public class Indigo //Declaring class
{
	String [] b_seat_id=new String [20]; /* Declaring string arrays for economy and business classes */
	String [] e_seat_id=new String [20];
	private int n; //Variable n accessible only within the class Indigo
	public void seats()
	{
		int i,s1,s2,ch,te,tb,c1,c2;
		n=40; //Total number of seats
		s1=20; //seats for economy class
		s2=s1; //seats for business class
		c1=0; //keeping track of array indexes
		c2=0;
		String se,sb; //booking ids
		int c=0;
		while(n>0)
		{
			System.out.println("Hello!!");
			System.out.println("Please select your class:");
			System.out.println("Press 1 for Economy Class");
			System.out.println("Press 2 for Business Class");
			Scanner input= new Scanner(System.in);
			ch=input.nextInt();
			//System.out.println("n="+n);
			if(ch==1)
			{
				System.out.println("Number of seats available:"+s1);
				System.out.println("How many travellers?");
				te=input.nextInt();
				
				if(te<=s1)
				{
					se= Integer.toString(c);
					se="E00"+se;
					s1-=te;
				
					
					n=n-te;
					while(te>0)
					{
						e_seat_id[c1]=se;
						te--;
						c1++;
					}
					System.out.println("Your booking id is:"+se);
					c++;
					
					
				}
				else
				{
					System.out.println("SORRY! All Economy seats are BOOKED");
				}
			}
			else if(ch==2)
			{
				System.out.println("Number of seats available:"+s2);
				System.out.println("How many travellers?");
				tb=input.nextInt();
				if(tb<=s2)
				{
					sb= Integer.toString(c);
					sb="B00"+sb;
					s2-=tb;
					
					n=n-tb;
					
					while(tb>0)
					{
						b_seat_id[c2]=sb;
						tb--;
						c2++;
					}
					c++;
					System.out.println("Your booking id is:"+sb);
					
				}
				else
				{
					System.out.println("SORRY! All Business seats are BOOKED");
				}
			}
			else
			{
				System.out.println("Invalid input");
			} 
		} //End of while loop
		System.out.println("ALL SEATS ARE BOOKED.");
		System.out.println("Please check your ids for Business class");
		for(i=0;i<20;i++)
			System.out.println(b_seat_id[i]);
		System.out.println("Please check your ids for Economy class");
		for(i=0;i<20;i++)
			System.out.println(e_seat_id[i]);
		
	}
	public static void main(String args[]) //main function
	{
		Indigo obj1= new Indigo(); // Creating object
		obj1.seats(); //Calling function
	} // End of main
} //End of class

				
 
					

		
		