package entity;

public class User {
    private String unid;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String countryCode;
    private boolean consentForDetails;
    private boolean marketingConsent;

    public User() {
    }

    public User(String unid, String firstName, String lastName, String emailAddress, String phoneNumber, String countryCode, boolean consentForDetails, boolean marketingConsent) {
        this.unid = unid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.consentForDetails = consentForDetails;
        this.marketingConsent = marketingConsent;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isConsentForDetails() {
        return consentForDetails;
    }

    public void setConsentForDetails(boolean consentForDetails) {
        this.consentForDetails = consentForDetails;
    }

    public boolean isMarketingConsent() {
        return marketingConsent;
    }

    public void setMarketingConsent(boolean marketingConsent) {
        this.marketingConsent = marketingConsent;
    }
}
