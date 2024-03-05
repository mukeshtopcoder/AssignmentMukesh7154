// Convert Enum to String
class EnumToString{
	enum Friends{
		Abhishek,
		Shiva,
		Shivam
	}
	public static void main(String[] args){
		System.out.println(Friends.Abhishek.toString());
		System.out.println(Friends.Shiva.toString());
		System.out.println(Friends.Shivam.toString());
	}
}