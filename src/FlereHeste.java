public class FlereHeste {
        public static void main(String[] args){
            String[][] heste = { //Her fortæller vi programmet, at vi går i gang med et multidimnesional array
                    {"Nokotahest", "Slesvigsk Koldblod", "Pampa Porse",
                            "Mustang", "Islandsk hest"}, //Her har vi hestens race i første del af arrayet
                    {"Sort","Brun","Hvid", "Plettet"}} //Her har vi hestens farve i anden del af arrayet
            ;

            System.out.println(heste[0][0] + " " + heste[1][0]); //Vi finder først race og så farve

            System.out.println(heste[0][2] + " " + heste[1][1]); //Vi finder først race og så farve
        }
}
