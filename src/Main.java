public class Main {
    public static void main(String[] args) {

        Parents objectA = new Parents(7,"Baha magistral ",new House("Bekboev","TSUM"), AgeFamily.THIRTY);
        Parents objectB = new Parents(6,"Maha kol",new House("Japarov","Bishkek"), AgeFamily.TWENTY);
        Children objectC = new Children(8,"Kuba naryn",new House("Jonguchkaev","Alamedin"), AgeFamily.TEN);
        System.out.println(objectA.getInfo1());
        System.out.println(objectB.getInfo1());
        System.out.println(objectC.getInfo1());
    }
}