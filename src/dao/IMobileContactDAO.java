package dao;

import model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    //Main methods


    /**
     *
     * @param mobileContact
     * @return
     */
    MobileContact insert(MobileContact mobileContact);

    /**
     *
     * @param mobileContact
     * @return
     */
    MobileContact update(long id, MobileContact mobileContact);

    /**
     *
     * @param id
     */
    void delete(long id);

    /**
     *
     * @param id
     * @return
     */
    MobileContact get(long id);

    /**
     *
     * @return
     */
    List<MobileContact> getAll();

//secondary methods

    /**
     *
     * @param phoneNumber
     * @return
     */
    MobileContact get(String phoneNumber);

    /**
     *
     * @param phoneNumber
     */
    void delete(String phoneNumber);

    /**
     *
     * @param phoneNumber
     * @return
     */
    boolean phoneNumberExists(String phoneNumber);

    /**
     *
     * @param id
     * @return
     */
    boolean userIdExists(long id);
}
