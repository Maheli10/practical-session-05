class t{
		int length;
		int width;
		String text;
		
}

class Document{
	String name;
	Paper p; 
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a document object d");
		
		d.name="My first Document";
		System.out.println("Name of the document d is "+d.name);
		
		d.p=new Paper();
		//set the length and width of the paper object pof the document object d
		d.p.length=20;
		d.p.width=10;
		d.p.text="This is the text in the paper of the document in my first document";
		System.out.println("Size(l*w) of the paper of the document d is "+d.p.length+"*"+d.p.width);
		System.out.println("Text value of the document d is "+d.p.text);
		
		
		Document d2=new Document();
		System.out.println("Created a document object d2");
		
		d2.name="My second Document";
		System.out.println("Name of the document d2 is "+d2.name);
		
	}
}