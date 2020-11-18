import java.util.*;
import hello.welcome;

//Importing packages
class Indigo extends Customer// Declaring class
{
    final String a="Good Morning";
    public char seat = (char) 0;
    private int n; // Variable n accessible only within the class Indigo
    public String e_food,b_food;
    public int yes_no;
    public void greeting()
{
	  System.out.println(a);
}
    public void seats(String b_seat_id[], String e_seat_id[]) {
	
        int i, s1, s2, ch, te, tb, c1, c2;
        n = 4; // Total number of seats
        s1 = 2; // seats for economy class
        s2 = s1; // seats for business class
        c1 = 0; // keeping track of array indexes
        c2 = 0;
        String se, sb, seatno_economy, seatno_business; // booking ids an
        int c = 0;
        while (n > 0) {
		try{
            //System.out.println("Hello!!");
            System.out.println("Please select your class:");
            System.out.println("Press 1 for Economy Class");
            System.out.println("Press 2 for Business Class");
            Scanner input = new Scanner(System.in);
            ch = input.nextInt();
            // System.out.println("n="+n);
            if (ch == 1) {
                System.out.println("Number of seats available:" + s1);
		
                System.out.println("How many travellers?");
                te = input.nextInt();
		
                if (te <= s1) {
                    se = Integer.toString(c);
                    se = "E00" + se;
                    s1 -= te;

                    n = n - te;
                    while (te > 0) {
                        e_seat_id[c1] = se;
                        te--;
                        c1++;

                    }
                    System.out.println("Your booking id is:" + se);
		    super.readName();
		    super.phone();
                    c++;
		}
		else {
                    System.out.println("SORRY! All Economy seats are BOOKED");

                } 
                }
            else if (ch == 2) {
                System.out.println("Number of seats available:" + s2);
                System.out.println("How many travellers?");
                tb = input.nextInt();
                if (tb <= s2) {
                    sb = Integer.toString(c);
                    sb = "B00" + sb;
                    s2 -= tb;

                    n = n - tb;

                    while (tb > 0) {
                        b_seat_id[c2] = sb;
                        tb--;
                        c2++;

                    }
                    c++;
                    System.out.println("Your booking id is:" + sb);
		    super.readName();
		    super.phone();

                } else {
                    System.out.println("SORRY! All Business seats are BOOKED");
                }
            } else {
                System.out.println("Invalid input");
            }
	}
	catch(InputMismatchException e)
	{
		System.out.println("Invalid Input! Please enter again.");
		System.out.println(e);
	}
        } // End of while loop
    }// end of function

    // public char seat="A";
    Indigo(char s) {
        this.seat = s;							
    }
   Indigo(String e_foodtype,String b_foodtype,int food_avail)
	{
		
		this.e_food=e_foodtype;
		this.b_food=b_foodtype;
		this.yes_no=food_avail;
	}
   public void food_avail(int ans,int arr[])
	{
		int i=0;
		arr[i++]=ans;
	}
  public void food_avail(String ans,String arr[])
	{
		int i=0;
		arr[i++]=ans;
	}
  

}
public class Main{
	
    public static void main(String args[]) // main function
    {
	welcome obj5=new welcome();
	obj5.msg();
	Cargo obj3=new Cargo();
	for(int i=0;i<args.length;i++)
	{
		System.out.println(args[i]);
		
	}
        int j = 0, k = 0,ans_food;
        char s = (char) 0;
	String ans_type;
        Indigo obj1 = new Indigo(s); // Creating object
	Indigo obj2=new Indigo("Veg/Nonveg","Veg/Nonveg",0);
	//Cargo obj3=new Cargo();
        Indigo[] b = new Indigo[20];
        Indigo[] e = new Indigo[20];
        String[] b_seat_id = new String[2]; /* Declaring string arrays for economy and business classes */
        String[] e_seat_id = new String[2];
	String [] b_foodtype=new String[2];
	String [] e_foodtype=new String[2];
	int [] b_classfood=new int[2];
	int [] e_classfood=new int[2];
	obj1.greeting();
        obj1.seats(b_seat_id, e_seat_id); // Calling function
        while (j < 2) {
            for (char i = 65; i < 70; i++) {

                b[j] = new Indigo(i);
                e[j] = new Indigo(i);
                j++;
            }
        }
        System.out.println("ALL SEATS ARE BOOKED.");
	System.out.println("Hello Business Passengers!");
        System.out.println("Please check your ids and seat numbers for Business class");
        for (int i = 0; i < 2; i++) {
	    //b[i].readName();
            System.out.print(b_seat_id[i] + "-");
            System.out.println(b[i].seat);
	    System.out.println("Do you want to avail food?\n1-yes\n 2-no");
	    Scanner input=new Scanner(System.in);
	    ans_food=input.nextInt();
	    b[i].food_avail(ans_food,e_classfood);
	    if(ans_food==1)
	    {
		System.out.println("Options:"+obj2.b_food);
	    	ans_type=input.next();
	    	b[i].food_avail(ans_type,b_foodtype);
	    }
		//System.out.println("Enter luggage weight
        }
	System.out.println("Hello Economy Passengers!");
        System.out.println("Please check your ids for Economy class");
        for (int i = 0; i < 3; i++) {
	    
	    
            System.out.print(e_seat_id[i] + "-");
            System.out.println(e[i].seat);
	    System.out.println("Do you want to avail food?\n1-yes\n 2-no");
	    Scanner input=new Scanner(System.in);
	    ans_food=input.nextInt();
	    e[i].food_avail(ans_food,e_classfood);
	    if(ans_food==1)
	    {
		System.out.println("Options:"+obj2.e_food);
	    	ans_type=input.next();
	    	e[i].food_avail(ans_type,e_foodtype);
	    }
		
	
	}
	
	Cargo.luggage();
	obj3.cargo();
	Date obj=new Select();
	obj.dates();
	Cost obj4=new Cost();
	obj4.b_price();
	obj4.e_price();

		
	
	

    } // End of main
} // End of class
class Cargo extends Customer
{
	static int cg,w;
	static
	{
		cg=1000;
		System.out.println("The total wait taken by flight Indigo is "+cg+" tons");
		
	}
	static void luggage()
	{
		System.out.println("Enter luggage weight:");
		Scanner input=new Scanner(System.in);
		w=input.nextInt();
	        cg=cg-w;
		System.out.println("Balance weight:"+cg);
	}
	static void cargo()
	{
		System.out.println("Enter cargo weight:");
		Scanner input=new Scanner(System.in);
		w=input.nextInt();
	        cg=cg-w;
		System.out.println("Balance weight:"+cg);
	}
	
}
class Customer
{
	Scanner input=new Scanner(System.in);
	//final String a="WELCOME";
	void readName()
	{
		System.out.print("Enter your first name:");
		String fname=input.next();
		StringBuffer sb=new StringBuffer(fname);
		sb.append(" ");
		System.out.print("Enter your last name:"); 
		String lname=input.next();
		sb.append(lname);
		
	}
	void phone()
	{
		System.out.print("Enter your phone number:");
		int num=input.nextInt();
	}
}

abstract class Date{
	abstract void dates();
}
class Select extends Date
{
	Scanner input=new Scanner(System.in);
	void dates()
	{
		System.out.print("Enter date of departure in dd/mm/yyyy format:");
		String date=input.next();
	}
}
interface Price
{
	float convenient_fee=500;
	public void b_price();
	public void e_price();
}
class Cost implements Price
{
	public void b_price()
	{
		float business_price=5678;
		float gst=564;
		float total=business_price + gst;
		System.out.println("Price of each seat of business class:"+total);
	}
	public void e_price()
	{
		float economy_price=2678;
		float gst=564;
		float total=economy_price + gst;
		System.out.println("Price of each seat of economics class:"+total);
	}
}
	