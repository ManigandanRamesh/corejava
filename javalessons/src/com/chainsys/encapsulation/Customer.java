package com.chainsys.encapsulation;


	public class Customer 
	{
	//field
	    private final int customerID;    
	    private String name;
	    private String address;
	    private String city;
	    private double mobileNo;
	    
	    private String serviceProvider;
	    public String getServiceProvider() {
	        return serviceProvider;
	    }
	    public void setServiceProvider(String serviceProvider) {
	        if(serviceProvider==null)
	        {
	            System.out.println("Name must not be NULL");
	            return;
	        }
	        this.serviceProvider = serviceProvider;
	    }
	//Constructor    
	    public Customer()
	    {
	        customerID=0;
	        System.out.println("Customer Created");
	    }
	    public Customer(int id)
	    {
	        customerID=id;
	        System.out.println("Customer Created");
	    }
	//getter and setters
	    public int getCustomerID() {
	        return customerID;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        if(name==null)
	        {
	            System.out.println("Name must not be NULL");
	            return;
	        }
	        else if(name.length()<2 || name.length()>15)
	        {
	            System.out.println("Name must have atleast 2 char and "
	                    + "not more than 15 chars");
	            return;
	        }
	        char[] data=name.toCharArray();
	        for(char c:data)
	        {
	            if(c<65 && (int)c!=32)
	            {
	                System.out.println("Name has INValid char "+c);
	                return;
	            }
	            else if(c>90 && c<97)
	            {
	                System.out.println("Name has INValid char "+c);
	                return;
	            }
	            else if( c>122)
	            {
	                System.out.println("Name has INValid char "+c);
	                return;
	            }
	        }
	        this.name = name;
	    }
	    public String getAddress() {        return address;     }
	    
	    public void setAddress(String address) {
	        if(address==null)
	        {
	            System.out.println("address must not be NULL");
	            return;
	        }
	        else if(address.length()<4 )
	        {
	            System.out.println("address must have atleast 4 char");
	            return;
	        }

	        this.address = address;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        if(city==null)
	        {
	            System.out.println("city must not be NULL");
	            return;
	        }
	        else if(city.length()<3 )
	        {
	            System.out.println("city must have atleast 3 char");
	            return;
	        }this.city = city;
	    }
	    public double getMobileNo() {         return mobileNo;     }
	    
	    public void setMobileNo(double mobileNo) {
	        if(mobileNo==0)
	        {
	            System.out.println("mobileNo must not be Zero");
	            return;
	        }
	        else if(mobileNo<9000000000d || mobileNo>9999999999d )
	        {
	            System.out.println("mobileNo must be between [9000000000]"
	                    + " and [9999999999]");
	            return;
	        }
	        this.mobileNo = mobileNo;
	    }
	//Methods    
	    public void placeOrder()
	    {
	        System.out.println("Customer Order Placed");
	    }
	    public void getFeedback()
	    {
	        System.out.println("Customer Gave Feedback");
	    }
	    public void echo()
	    {
	        System.out.println(customerID+" "+name+" "+ address+" "
	    +city+" "+mobileNo);
	    }
	}


