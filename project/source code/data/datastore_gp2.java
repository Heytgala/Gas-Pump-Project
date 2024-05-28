package data;

public class datastore_gp2 extends datastore_abstract {
	float temp_a;
	float temp_b;
	float temp_c;
	int temp_cash;
	float Dprice;
	float Rprice;
	float FPrice;
	float total;
	int G;
	float price;
	
	@Override
	public float gettemp_a() {
		return temp_a;
	}
	@Override
	public void settemp_a(float temp_a) {
		this.temp_a = temp_a;
	}
	@Override
	public float gettemp_b() {
		return temp_b;
	}
	@Override
	public void settemp_b(float temp_b) {
		this.temp_b = temp_b;	
	}
	@Override
	public float gettemp_c() {
		return temp_c;
	}
	@Override
	public void settemp_c(float temp_c) {
		this.temp_c = temp_c;
	}
	@Override
	public int getTemp_cash() {
		return temp_cash;
	}
	@Override
	public void setTemp_cash(int temp_cash) {
		this.temp_cash = temp_cash;
	}
	
	@Override
	public float getDprice() {
		return Dprice;
	}
	@Override
	public void setDprice(float dprice) {
		this.Dprice = dprice;
	}
	@Override
	public float getRprice() {
		return Rprice;
	}
	@Override
	public void setRprice(float rprice) {
		this.Rprice = rprice;
	}
	public float getFprice() {
		return FPrice;
	}
	@Override
	public void setFprice(float fprice) {
		this.FPrice = fprice;
	}
	@Override
	public float getTotal() {
		return total;
	}
	@Override
	public void setTotal(float total) {
		this.total = total;
	}
	
	@Override
	public float getprice() {
		return price;
	}
	
	@Override
	public void setprice(float price) {
		this.price = price;
	}
	
	@Override
	public int getG() {
		return G;
	}
	
	@Override
	public void setG(int g) {
		this.G = g;
	}
	
	@Override
	public int getTemp_a() {
		return 0;
	}
	
	@Override
	public void setTemp_a(int temp_a) {
	}
	
	@Override
	public int getTemp_c() {
		return 0;
	}
	
	@Override
	public void setTemp_c(int temp_c) {
		this.temp_c = temp_c;
	}
		
	
	@Override
	public int getW() {
		return 0;
	}
	
	@Override
	public void setW(int w) {
	}
	
	@Override
	public int getL() {
		return 0;
	}
	
	@Override
	public void setL(int l) {
	}
	
	@Override
	public float getT() {
		return 0;
	}
	
	@Override
	public void setT(float t) {
	}
	
	@Override
	public int getcash() {
		return temp_cash;
	}
	
	@Override
	public void setcash(int cash) {
		this.temp_cash=cash;
	}
	
}
