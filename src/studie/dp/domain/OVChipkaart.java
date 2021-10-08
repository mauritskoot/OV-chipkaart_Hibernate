package studie.dp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.sql.Date;

@Entity
public class OVChipkaart {
    @Id
    @Column(name = "kaart_nummer")
    private int kaartNummer;
    @Column(name = "geldig_tot")
    private Date geldigTot;
    private int klasse;
    private double saldo;
    @Transient
    private Reiziger reiziger;

}

//    public OVChipkaart(int kaartNummer, Date geldigTot, int klasse, double saldo, Reiziger reiziger) {
//        this.kaartNummer = kaartNummer;
//        this.geldigTot = geldigTot;
//        this.klasse = klasse;
//        this.saldo = saldo;
//        this.reiziger = reiziger;
//    }
//
//    public int getKaartNummer() {
//        return kaartNummer;
//    }
//    public void setKaartNummer(int kaartNummer) {
//        this.kaartNummer = kaartNummer;
//    }
//    public Date getGeldigTot() {
//        return geldigTot;
//    }
//    public void setGeldigTot(Date geldigTot) {
//        this.geldigTot = geldigTot;
//    }
//    public int getKlasse() {
//        return klasse;
//    }
//    public void setKlasse(int klasse) {
//        this.klasse = klasse;
//    }
//    public double getSaldo() {
//        return saldo;
//    }
//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }
//    public Reiziger getReiziger() {
//        return reiziger;
//    }
//    public void setReiziger(Reiziger reiziger) {
//        this.reiziger = reiziger;
//    }
//
//    @Override
//    public String toString() {
//        return "OVChipkaart{" +
//                "kaartNummer=" + kaartNummer +
//                ", geldigTot=" + geldigTot +
//                ", klasse=" + klasse +
//                ", saldo=" + saldo +
//                '}';
//    }
//}
