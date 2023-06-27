package dao;

import model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    //Main methods
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(MobileContact mobileContact);
    void delete(long id);
    MobileContact get(long id);
    List<MobileContact> getAll();

//secondary methods
    MobileContact get(String phoneNumber);
    void delete(String phoneNumber);
    boolean phoneNumberExists(String phoneNumber);
    boolean userIdExists(long id);
}
