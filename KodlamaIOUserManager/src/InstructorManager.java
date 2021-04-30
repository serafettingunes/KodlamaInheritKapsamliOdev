
public class InstructorManager extends UserManager {
	public void add (Instructor instructor)
	{
		System.out.println(instructor.getAd()+" "+ instructor.getSoyad()+ " eðitmeni "+ instructor.getDersEkleme()+" dersini ekledi");
	}
	
	public void delete (Instructor instructor)
	{
		System.out.println(instructor.getAd()+" "+ instructor.getSoyad()+ " eðitmeni "+ instructor.getDersEkleme()+" dersini Sildi");
	}
}
