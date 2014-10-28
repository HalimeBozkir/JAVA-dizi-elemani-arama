
public class strdizii {

	public static void main(String args[])
	{
		String a[]={"fatma","busra","ahsen","firdevs","sule"};
		String kelime="firdevs";
		ara(a,kelime);
	}
	
	public static void ara(String dizii[],String a)
	{
		for(int i=0;i<dizii.length;i++)
		{
			if(dizii[i]==a)
				System.out.println(i+1);
		}
	}
}
