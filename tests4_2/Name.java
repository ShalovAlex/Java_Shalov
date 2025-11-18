class Name {
    String personalName = "Pete";
    String familyName = "";
    String patronomyc = "";

    public Name(String personalName, String familyName,
                String patronomyc) {
        if (personalName != null)
            this.personalName = personalName;
        if (familyName != null)
            this.familyName = familyName;
        if (patronomyc != null)
            this.patronomyc = patronomyc;
    }

    public static Name ofPersonalNameAndFamilyName(String personalName, String familyName){
        return new Name(personalName, familyName, "");
    }

    public static Name ofPersonalNameAndPatronomyc(String personalName, String patronomyc){
        return new Name(personalName, "", patronomyc);

    }

    public Name(String personalName) {
        this(personalName, "", "");
    }

    @Override
    public String toString() {
        return "Name{" +
                "personalName='" + personalName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", patronomyc='" + patronomyc + '\'' +
                '}';
    }
}