
public class Instructor extends User {
	
	private String _dersEkleme;
	
	public Instructor(int id,String ad,String soyad,String kullaniciTipi,String dersEkleme)
	{
		super(id,ad,soyad,kullaniciTipi);
		
		this._dersEkleme=dersEkleme;
		
		
	}
	
	public Instructor()
	{
		
	}
	
	public String getDersEkleme() {
		return _dersEkleme;
	}

	public void setDersEkleme(String _dersEkleme) {
		this._dersEkleme = _dersEkleme;
	}
}
