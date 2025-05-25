public class Book{
	public String displayInfo(String libraryname, String title, String author){
	return "Library name: "+libraryname +"\nBook title: "+title + "\nAuthor " +author;	
}
	public static void main (String[]args){
		Book cherry=new Book();
		String details1=cherry.displayInfo("City Public Library","The Great Gatsby","F.scott Fitzgerald");
		String details2=cherry.displayInfo("City public library","1984","George orwell");
		System.out.println(details1);
		System.out.println(details2);

}
}