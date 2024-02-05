package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=13;
for (int i = 2; i < num-1; i++) {
	if (num%i==0) {
	System.out.println("Prime Number");
	break;
	} else {
System.out.println("Non-Prime Number");
break;
	}
}
	}

}
