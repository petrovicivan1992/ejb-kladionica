package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ivan Petrovic
 */
@Embeddable
@Table(name = "tiketutakmica")
public class TiketutakmicaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "emailIgrac")
    private String emailIgrac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "sifraTiketa")
    private String sifraTiketa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "sifraUtakmice")
    private String sifraUtakmice;

    public TiketutakmicaPK() {
    }

    public TiketutakmicaPK(String emailIgrac, String sifraTiketa, String sifraUtakmice) {
        this.emailIgrac = emailIgrac;
        this.sifraTiketa = sifraTiketa;
        this.sifraUtakmice = sifraUtakmice;
    }

    public String getEmailIgrac() {
        return emailIgrac;
    }

    public void setEmailIgrac(String emailIgrac) {
        this.emailIgrac = emailIgrac;
    }

    public String getSifraTiketa() {
        return sifraTiketa;
    }

    public void setSifraTiketa(String sifraTiketa) {
        this.sifraTiketa = sifraTiketa;
    }

    public String getSifraUtakmice() {
        return sifraUtakmice;
    }

    public void setSifraUtakmice(String sifraUtakmice) {
        this.sifraUtakmice = sifraUtakmice;
    }

    @Override
    public String toString() {
        return "domain.TiketutakmicaPK[ emailIgrac=" + emailIgrac + ", sifraTiketa=" + sifraTiketa + ", sifraUtakmice=" + sifraUtakmice + " ]";
    }
    
}
