
public class InstructorManager extends UserManager {
	public void add (Instructor instructor)
	{
		System.out.println(instructor.getAd()+" "+ instructor.getSoyad()+ " e�itmeni "+ instructor.getDersEkleme()+" dersini ekledi");
	}
	
	public void delete (Instructor instructor)
	{
		System.out.println(instructor.getAd()+" "+ instructor.getSoyad()+ " e�itmeni "+ instructor.getDersEkleme()+" dersini Sildi");
	}
}
