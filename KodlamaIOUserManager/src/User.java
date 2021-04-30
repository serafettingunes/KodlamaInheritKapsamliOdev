
public class User {
	private int _id;
	private String _ad;
	private String _soyad;
	private String _kullaniciTipi;

	public User(int id,String ad,String soyad,String kullaniciTipi)
	{
		
		this._id=id;
		this._ad=ad;
		this._soyad=soyad;
		this._kullaniciTipi=kullaniciTipi;
	}
	
	public User() {
		
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getAd() {
		return _ad;
	}

	public void setAd(String ad) {
		this._ad = ad;
	}

	public String getSoyad() {
		return _soyad;
	}

	public void setSoyad(String soyad) {
		this._soyad = soyad;
	}

	public String getKullaniciTipi() {
		return _kullaniciTipi;
	}

	public void setKullaniciTipi(String _kullaniciTipi) {
		this._kullaniciTipi = _kullaniciTipi;
	}

}
