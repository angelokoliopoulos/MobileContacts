package dto;

public class MobileContactDTO {
    private long id;
    private UserDetailsDTO userDetails;

    public MobileContactDTO(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDetailsDTO getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetailsDTO userDetails) {
        this.userDetails = userDetails;
    }
}
