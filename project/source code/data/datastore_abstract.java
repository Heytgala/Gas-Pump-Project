package data;

public abstract class datastore_abstract {
	
	//get, set methods for variables common for GasPump 1 and GasPump 2  
	public abstract int getTemp_a();
	public abstract void setTemp_a(int temp_a);
	public abstract int getTemp_c();
	public abstract void setTemp_c(int temp_c);
	public abstract int getcash();
	public abstract void setcash(int cash);
	public abstract int getL();
	public abstract void setL(int l);
	public abstract int getW();
	public abstract void setW(int w);
	public abstract float getT();
	public abstract void setT(float t);
	public abstract float getprice();
	public abstract void setprice(float price);
	
	public abstract float gettemp_b();
	public abstract void settemp_b(float temp_b);
	public abstract float gettemp_a();
	public abstract void settemp_a(float temp_a);
	public abstract float gettemp_c();
	public abstract void settemp_c(float temp_c);
	public abstract int getTemp_cash();
	public abstract void setTemp_cash(int temp_cash);
	public abstract int getG();
	public abstract void setG(int g);
	public abstract float getTotal();
	public abstract void setTotal(float total);
	public abstract float getRprice();
	public abstract void setRprice(float rprice);
	public abstract float getDprice();
	public abstract void setDprice(float dprice);
	public abstract float getFprice();
	public abstract void setFprice(float fprice);
		
}
