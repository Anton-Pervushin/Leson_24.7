public enum StudyProfile {

    MEDICINE ("Медицина"),
    TECHNICAL ("Технический");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName=profileName;

    }

    public String getProfileName() {
        return profileName;
    }

    @Override
    public String toString() {
        return "StudyProfile{" +
                "profileName='" + profileName + '\'' +
                '}';
    }
}
