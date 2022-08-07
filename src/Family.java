public class Family {
    private int peopleInTheFamily;
    private String name;
    private House house;
    private AgeFamily ageFamily;
    public int getPeopleInTheFamily() {
        return peopleInTheFamily;
    }

    public Family(int peopleInTheFamily, String name, House house, AgeFamily ageFamily) {
        this.peopleInTheFamily = peopleInTheFamily;
        this.name = name;
        this.house = house;
        this.ageFamily = ageFamily;
    }
    public String getName() {
        return name;
    }
    public House getHouse(House house) {
        return house;
    }

    public House getHouse() {
        return house;
    }

    public AgeFamily getAgeFamily() {
        return ageFamily;
    }

    public String getInfo1() {
        return  "\nWelcome to our family : " + "\nNumber of people in the family : " + peopleInTheFamily + "\nYour name : " + name
                + "\nYour Address : " + house.getAddress() + "\nThe name of your house : " + house.getName() + "\nYour age : " + ageFamily;
    }
}

