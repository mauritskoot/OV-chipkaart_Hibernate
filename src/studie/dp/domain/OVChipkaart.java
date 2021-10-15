package studie.dp.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "OVChipkaart")
@Table (name = "ov_chipkaart")
public class OVChipkaart {
    @Id
    @Column(name = "kaart_nummer")
    private int kaartNummer;
    @Column(name = "geldig_tot")
    private Date geldigTot;
    private int klasse;
    private double saldo;
    @ManyToOne
    private Reiziger reiziger;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ov_chipkaart_product", joinColumns = {@JoinColumn(referencedColumnName = "kaart_nummer")},
    inverseJoinColumns = {@JoinColumn(referencedColumnName = "product_nummer")})
    private ArrayList<Product> producten = new ArrayList<>();

    public OVChipkaart(int kaartNummer, Date geldigTot, int klasse, double saldo, Reiziger reiziger) {
        this.kaartNummer = kaartNummer;
        this.geldigTot = geldigTot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reiziger = reiziger;
    }

    public OVChipkaart() {
    }


    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        OVChipkaart ovChipkaart = (OVChipkaart) o;
        return Objects.equals(reiziger, ovChipkaart.reiziger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reiziger);
    }

    public int getKaartNummer() {
        return kaartNummer;
    }
    public void setKaartNummer(int kaartNummer) {
        this.kaartNummer = kaartNummer;
    }
    public Date getGeldigTot() {
        return geldigTot;
    }
    public void setGeldigTot(Date geldigTot) {
        this.geldigTot = geldigTot;
    }
    public int getKlasse() {
        return klasse;
    }
    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Reiziger getReiziger() {
        return reiziger;
    }
    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

    public ArrayList<Product> getProducten() {
        return producten;
    }

    public void setProducten(ArrayList<Product> producten) {
        this.producten = producten;
    }

    @Override
    public String toString() {
        return "OVChipkaart{" +
                "kaartNummer=" + kaartNummer +
                ", geldigTot=" + geldigTot +
                ", klasse=" + klasse +
                ", saldo=" + saldo +
                '}';
    }
}
