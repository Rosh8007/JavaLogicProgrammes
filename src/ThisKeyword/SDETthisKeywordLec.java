package ThisKeyword;

public class SDETthisKeywordLec {
	
	//this keyword always represent class
	
	int x;
	int y;
	
	SDETthisKeywordLec(int x,int y)
	{
		this.x=x;
		this.y=y; // by using this keyword we showing given variable belong to class not a loca variable.
	}
	
	 void display() {
		
		 System.out.println("X=:"+x);
		 System.out.println("Y=:"+y);

	}
	
	public static void main(String[] args) {
		
		SDETthisKeywordLec d=new SDETthisKeywordLec(9,11);
		d.display();
		
		
	}

}
