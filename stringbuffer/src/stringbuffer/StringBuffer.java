package stringbuffer;

public class StringBuffer {

	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ref;
		StringBuffer refb;
		String sb=new String("hello");
		ref=sb;
		sb+=" ashu";
		if(sb==ref)
		{System.out.println("same reference");
	
		}
		else
			System.out.println("not same reference");
		
StringBuffer as= new StringBuffer("ashu");
refb=as;
as.append(" is great");
if(as==refb)
{System.out.println("same reference");
	}
else
	System.out.println("not same reference");

}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}
}
