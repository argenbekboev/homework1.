public final class Children extends Parents {

    public Children(int peopleInTheFamily, String name, House house, AgeFamily ageFamily) {
            super(peopleInTheFamily, name, house, ageFamily);
        }

        @Override
        public String getInfo1() {
            return super.getInfo1()+ "\nМетод успешно перезаписан: ";
        }
    }

