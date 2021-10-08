package studie.dp.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "Reiziger")
@Table(name = "reiziger")
public class Reiziger {
    @Id
    @Column(name = "reiziger_id")
    private int reizigerId;
    private String voorletters;
    private String tussenvoegsel;
    private String achternaam;
    private Date geboortedatum;
    @OneToOne(
            mappedBy = "reiziger",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private Adres adres;
    @OneToMany(mappedBy = "reiziger",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<OVChipkaart> ovChipkaarten = new ArrayList<>();


    public Reiziger(int reiziger_id, String voorletters, String tussenvoegsel, String achternaam, Date geboortedatum){
        this.reizigerId = reiziger_id;
        this.voorletters = voorletters;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
    }

    public Reiziger() {
    }

    public void addAdres(Adres adres){
        adres.setAdres_id(this);
        this.adres = adres;
    }

    public void removeAdress(){
        if (adres != null){
            adres.setAdresId(null);
            this.adres = null;
        }
    }

    public void addOvChipkaart(OVChipkaart ovChipkaart){
        ovChipkaarten.add(ovChipkaart);
        ovChipkaart.setReiziger(this);
    }

    public void removeOvChipkaart(OVChipkaart ovChipkaart){
        ovChipkaarten.remove(ovChipkaart);
        ovChipkaart.setReiziger(null);
    }

    public int getReizigerId() {
        return reizigerId;
    }

    public void setReizigerId(int reizigerId) {
        this.reizigerId = reizigerId;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public List<OVChipkaart> getOvChipkaarten() {
        return ovChipkaarten;
    }

    public void setOvChipkaarten(List<OVChipkaart> ovChipkaarten) {
        this.ovChipkaarten = ovChipkaarten;
    }

    public void addOVChipkaart(OVChipkaart ovChipkaart){
        if(!ovChipkaarten.contains(ovChipkaart)){
            ovChipkaarten.add(ovChipkaart);
        }
    }

    public void removeOVChipkaart(OVChipkaart ovChipkaart){
        if(ovChipkaarten.contains(ovChipkaart)){
            ovChipkaarten.remove(ovChipkaart);
        }
    }


    public String toString() {
        String result =
                "Reiziger{" +
                "reizigerId=" + reizigerId +
                ", voorletters='" + voorletters + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboortedatum=" + geboortedatum +'\'' +
                ", adres=" + adres +'\'' +
                        ", ovkaarten= " +
                '}';
                //loopt over chipkaarten voor als er meerdere zijn
                for(OVChipkaart ovChipkaart : ovChipkaarten){
                    result += ovChipkaart;;
                    }
                return result;
    }
}
