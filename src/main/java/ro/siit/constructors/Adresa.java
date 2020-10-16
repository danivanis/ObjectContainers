package ro.siit.constructors;

public class Adresa {

    private String address;
    private String cityName;
    private Tara tara;
    private String locatiiHobby;

    public Adresa(String locatiiHobby, Tara tara){
        this.locatiiHobby = locatiiHobby;
        this.tara = tara;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setTara(Tara tara) {
        this.tara = tara;
    }

    public Tara getTara() {
        return tara;
    }

    public void setLocatiiHobby(String locatiiHobby) {
        this.locatiiHobby = locatiiHobby;
    }

    public String getLocatiiHobby() {
        return locatiiHobby;
    }
}
