public class CalculosDP3 
{
	public float gradosCF(float centigrados) 
	{
		float farenheit=(float)9/5*centigrados+32;
		
		return farenheit;
	}	
	
	public float gradosFC(float farenheit)
	{
		float centigrados= (float)5/9*(farenheit - 32);
		
		return centigrados;
	}
	
	public double factorial(double fac)
	{
			double i=fac-1;
			while (i>=1)
			{	
			fac=fac*i;
			i--;	
			}
			
			return fac;
	}
	
	public int exponencial(int base, int exp)
	{
		int n = base;
		for(int i=1;i<=exp-1;i++)
		{
			n= n*base;	
		}
		
		return n;
	}
	
	public float exponencialNeg(int base, int exp)
	{
		float n = 1;
		for (int i=1;i<=exp;i++)
		{
			n=n/base;
		}
		return n;
	}
	
		public double ecuacionU(double C, double B)
	{
			double X=(-(C)/B);
			return X;
	}
	
	public double ecuacionI(double B, double A, double C)
	{
			double I= ((B*B)-(4*A*C));
			return I;
	}
	
	public double ecuacionXu(double B,double I, double A)
	{
		double Xu=((-(B)+Math.sqrt(I))/(2*A));
		return Xu;
	}
	
	public double ecuacionXd(double B, double I, double A)
	{
		double Xd=((-(B)-Math.sqrt(I))/(2*A));
		return Xd;
	}
	
	public int tabla(int n, int i)
	{
		int num=n*i;
		return num;
	}
	
}


