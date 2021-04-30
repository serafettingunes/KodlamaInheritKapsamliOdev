
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor(1, "Engin", "Demiröð", "Yönetici", "C# kursu");
	/*	instructor.setAd("Engin");
		instructor.setSoyad("Demiröð");
		instructor.setDersEkleme("C# kursu");
		instructor.setId(1);
		instructor.setKullaniciTipi("Yönetici");
		*/
		
		Instructor instructor2=new Instructor(2, "Engin", "Demiröð", "Yönetici", "Java kursu");
		Instructor instructor3=new Instructor(3, "Kaan", "Can", "Yönetici", "Phyton kursu");
		
		Instructor[] dizi=new Instructor[] {instructor,instructor2,instructor3};
		InstructorManager instructorManager=new  InstructorManager();
		
		System.out.println("Eðitmen ve Verdiði Eðitimler");
		
		System.out.println("-----------------------------");
		
		for (Instructor instructor4 : dizi) {
			instructorManager.add(instructor4);
		}
		
		
		StudentManager studentManager=new StudentManager();
		
		Student student1=new Student();
		student1.setAd("Þerafettin");
		student1.setSoyad("Güneþ");
		student1.setDersBitirmeOrani(48);
		student1.setId(40);
		student1.setKullaniciTipi("Öðrenci");
		
		Student student2=new Student();
		student2.setAd("Ali");
		student2.setSoyad("Güneþ");
		student2.setDersBitirmeOrani(58);
		student2.setId(34);
		student2.setKullaniciTipi("Öðrenci");
		
		Student[] students=new Student[] {student1,student2};
		System.out.println("----------------------------");
		System.out.println("Eðitim Alan Öðrenciler");
		System.out.println("--------------------");
		
		for (Student studentYazdir : students) {
			studentManager.list(studentYazdir);
		}
		
		
		
		
	}

}
