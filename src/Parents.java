public class Parents extends Family{
    public Parents(int peopleInTheFamily, String name, House house, AgeFamily ageFamily) {
        super(peopleInTheFamily, name, house, ageFamily);
    }

    public void parents(String name, int peopleInTheFamily) {
        super.getName();
        super.getPeopleInTheFamily();
    }

    public void parents(String name){
        super.getName();
    }
    public final void parents(String name,int peopleInTheFamily,House house){
        super.getName();
        super.getPeopleInTheFamily();
        super.getHouse(house);
    }
}

