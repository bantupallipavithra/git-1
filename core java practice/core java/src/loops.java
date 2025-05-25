
public class loops {
	public boolean isprime(int num) {
		if(num==1) {
			return false;
		}
		for (int i=2;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		loops obj=new loops();
		System.out.println(obj.isprime(46)?"prime":"not prime");
	}

}
