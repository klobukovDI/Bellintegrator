package ru.bellintegrator.eas.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by n3on on 07.03.2018.
 */
@Entity
@Table(name = "users")
public class user implements Serializable{

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String firstName;

    @Column
    private String secondName;

    @Column
    private String middleName;

    @Column
    private String position;

    @Column
    private String phone;

    @Column
    private String docName;

    @Column
    private String docNumber;

    @Column
    private String docDate;

    @Column
    private String citizenshipName;

    @Column
    private String citizenshipCode;

    @Column
    private boolean isIdentified;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getCitizenshipName() {
        return citizenshipName;
    }

    public void setCitizenshipName(String citizenshipName) {
        this.citizenshipName = citizenshipName;
    }

    public String getCitizenshipCode() {
        return citizenshipCode;
    }

    public void setCitizenshipCode(String citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
    }

    public boolean isIdentified() {
        return isIdentified;
    }

    public void setIdentified(boolean identified) {
        isIdentified = identified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        user user = (user) o;

        if (id != user.id) return false;
        if (isIdentified != user.isIdentified) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (secondName != null ? !secondName.equals(user.secondName) : user.secondName != null) return false;
        if (middleName != null ? !middleName.equals(user.middleName) : user.middleName != null) return false;
        if (position != null ? !position.equals(user.position) : user.position != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (docName != null ? !docName.equals(user.docName) : user.docName != null) return false;
        if (docNumber != null ? !docNumber.equals(user.docNumber) : user.docNumber != null) return false;
        if (docDate != null ? !docDate.equals(user.docDate) : user.docDate != null) return false;
        if (citizenshipName != null ? !citizenshipName.equals(user.citizenshipName) : user.citizenshipName != null)
            return false;
        return citizenshipCode != null ? citizenshipCode.equals(user.citizenshipCode) : user.citizenshipCode == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (docName != null ? docName.hashCode() : 0);
        result = 31 * result + (docNumber != null ? docNumber.hashCode() : 0);
        result = 31 * result + (docDate != null ? docDate.hashCode() : 0);
        result = 31 * result + (citizenshipName != null ? citizenshipName.hashCode() : 0);
        result = 31 * result + (citizenshipCode != null ? citizenshipCode.hashCode() : 0);
        result = 31 * result + (isIdentified ? 1 : 0);
        return result;
    }
}
