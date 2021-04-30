
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor(1, "Engin", "Demir��", "Y�netici", "C# kursu");
	/*	instructor.setAd("Engin");
		instructor.setSoyad("Demir��");
		instructor.setDersEkleme("C# kursu");
		instructor.setId(1);
		instructor.setKullaniciTipi("Y�netici");
		*/
		
		Instructor instructor2=new Instructor(2, "Engin", "Demir��", "Y�netici", "Java kursu");
		Instructor instructor3=new Instructor(3, "Kaan", "Can", "Y�netici", "Phyton kursu");
		
		Instructor[] dizi=new Instructor[] {instructor,instructor2,instructor3};
		InstructorManager instructorManager=new  InstructorManager();
		
		System.out.println("E�itmen ve Verdi�i E�itimler");
		
		System.out.println("-----------------------------");
		
		for (Instructor instructor4 : dizi) {
			instructorManager.add(instructor4);
		}
		
		
		StudentManager studentManager=new StudentManager();
		
		Student student1=new Student();
		student1.setAd("�erafettin");
		student1.setSoyad("G�ne�");
		student1.setDersBitirmeOrani(48);
		student1.setId(40);
		student1.setKullaniciTipi("��renci");
		
		Student student2=new Student();
		student2.setAd("Ali");
		student2.setSoyad("G�ne�");
		student2.setDersBitirmeOrani(58);
		student2.setId(34);
		student2.setKullaniciTipi("��renci");
		
		Student[] students=new Student[] {student1,student2};
		System.out.println("----------------------------");
		System.out.println("E�itim Alan ��renciler");
		System.out.println("--------------------");
		
		for (Student studentYazdir : students) {
			studentManager.list(studentYazdir);
		}
		
		
		
		
	}

}
