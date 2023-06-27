package model;

import dao.IMobileContactDAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MobileContactDAOImplementation implements IMobileContactDAO {
    private static final List<MobileContact> contacts = new ArrayList<>();



    @Override
    public MobileContact insert(MobileContact mobileContact) {
        if(mobileContact == null )return null;
        contacts.add(mobileContact);
        return mobileContact;
    }

    @Override
    public MobileContact update(long id,MobileContact mobileContact) {
        if(id != mobileContact.getId() || mobileContact == null) return null;

        //If we have implemented the .equals method on the MobileContact class,
        //we dont need the helper method and we can use the .indexOf() method of
        //the array list.
        //int positionToUpdate = contacts.indexOf(mobileContact);
        //We would need another signature, which will contain the old contact and the new contact.
        int positionToUpdate = getIndexById(id);
       return contacts.set(positionToUpdate,mobileContact);

    }


    @Override
    public MobileContact get(long id) {
         int position = getIndexById(id);
        return position == -1 ? null : contacts.get(position);
    }

    @Override
    public void delete(long id) {
        contacts.removeIf((contact -> contact.getId() == id));
    }


    @Override
    public MobileContact get(String phoneNumber) {
        int position = getIndexByPhoneNumber(phoneNumber);
        return position == -1 ? null : contacts.get(position);
    }

    @Override
    public void delete(String phoneNumber) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }

    @Override
    public List<MobileContact> getAll() {
        //return a copy of the contacts to protect it.
        //return new ArrayList<>(contacts);
        //OR:
        return Collections.unmodifiableList(contacts);
    }





    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return getIndexByPhoneNumber(phoneNumber) != -1;
    }

    @Override
    public boolean userIdExists(long id) {
       return getIndexById(id) != -1;
    }




    private int getIndexById(long id){
        int pos = -1;

        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getId()== id){
                pos = 1;
                break;
            }
        }
        return pos;
    }

    private int getIndexByPhoneNumber(String phoneNumber){
        int position = -1;

        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getPhoneNumber().equals(phoneNumber)){
                position = i;
                break;
            }
        }
        return position;
    }
}
