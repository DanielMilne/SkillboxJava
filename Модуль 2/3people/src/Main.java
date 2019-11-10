public class Main {

    public static void main(String[] args) {

        Integer vasyaAge = 25;
        Integer katyaAge = 22;
        Integer mishaAge = 25;

        int youngest = -1 ;
        int middle = -1 ;
        int oldest = -1 ;

        if (katyaAge > mishaAge) {
            oldest = katyaAge;
            youngest = mishaAge;
        } else {
            oldest = mishaAge;
            youngest = katyaAge;
        }

        if (vasyaAge > oldest) {
            middle = oldest;
            oldest = vasyaAge;
        } else if(vasyaAge < youngest) {
            middle = youngest;
            youngest = vasyaAge;
        } else {
            middle = vasyaAge;
        }
        System.out.println(oldest + " " + middle + " " + youngest);
    }

}
