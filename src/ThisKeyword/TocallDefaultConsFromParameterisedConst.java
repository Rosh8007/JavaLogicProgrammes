package ThisKeyword;

public class TocallDefaultConsFromParameterisedConst {


	TocallDefaultConsFromParameterisedConst() {

		System.out.println("Defalut Constructor");
	}

	public	TocallDefaultConsFromParameterisedConst(int x)
	{
		this();//calling Default constructor from parameterized
        System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		TocallDefaultConsFromParameterisedConst con=new TocallDefaultConsFromParameterisedConst(10);
		
	}

}
