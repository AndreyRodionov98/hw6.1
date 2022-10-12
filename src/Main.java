public class Main {
    public static void main(String[] args) {


// Задание 1.1
        System.out.println("Задание 1.1");

        int [] weight = new int [3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
        for (int i = 0; i < 3; i++) {System.out.println(weight[i]);

        }

        // Задание 1.2
        System.out.println("Задание 1.2");


        double [] mass = {1.57, 7.654, 9.986};
        for (int a = 0; a <mass.length ; a++) {
            System.out.println(mass[a]);

        }

        // Задание 1.3
        System.out.println("Задание 1.3");


        int [] years = {2014,2015,2016,2017};
        for (int e = 0; e < years.length; e++) {
            System.out.println(years[e]);
        }



// Задание 2
        System.out.println("Задание 2");

        for (int i = 0;i< weight.length;i++){
            System.out.print(weight[i]);{
            if (i!= weight.length-1)
                System.out.print(", ");
            }

        }



        System.out.println();

        for (int a = 0;a< mass.length;a++){
            System.out.print(mass[a]);
            if (a!= mass.length-1)
                System.out.print(", ");}


        System.out.println();
        for (int e = 0;e< years.length;e++){
            System.out.print(years[e]);
            if (e!= years.length-1)
                System.out.print(", ");}


        System.out.println();



// Задание 3
        System.out.println("Задание 3");
        int i = weight.length-1;

        for (; i  >= 0;  i--){
            System.out.print(weight[i]);{
                if (i!= 0)
                    System.out.print(", ");}}


        System.out.println();

        int a = mass.length-1;

        for (; a >= 0;  a--){
            System.out.print(mass[a]);{
                if (a!= 0)
                    System.out.print(", ");}}



        System.out.println();

        int e = years.length-1;

        for (; e >= 0;  e--){
            System.out.print(years[e]);{
                if (e!= 0)
                    System.out.print(", ");}}



        System.out.println();



// Задание 4
        System.out.println("Задание 4");


        for (int i1 =0; i1< weight.length; i1++) {

            System.out.println(weight[i1]%2!=0? weight[i1]+1+", ":weight[i1]+", ");

        }
        


    }
}