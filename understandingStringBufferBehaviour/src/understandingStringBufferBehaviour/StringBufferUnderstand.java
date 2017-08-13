package understandingStringBufferBehaviour;

public class StringBufferUnderstand {
public static void main(String[] args) {
	StringBuffer as=new StringBuffer("h");
	System.out.println(as.capacity());
	System.out.println(as.length());
	as.append("java is great ashu is also");
	System.out.println(as.capacity());
	System.out.println(as.length());
as.append("kurkure");
System.out.println(as.capacity());
System.out.println(as.length());
}
}
