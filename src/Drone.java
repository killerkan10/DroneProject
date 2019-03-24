import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


class Drone{

    static void finalPosition() throws IOException
    {
        //String st = "r+-+l++r++l--r--";
        String st;
        String right = "R";
        String left = "L";
        String plus = "+";
        String minus = "-";
        int baring = 1;
        int longitude = 0;
        int latitude =0;

        File file = new File("C:\\Users\\Adam\\IdeaProjects\\Drone\\src\\problem-basic-input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((st = br.readLine()) != null){

            // String[] splitArray = st.split("");
            // System.out.print(st);


            String[] splitArray = st.split("");
            System.out.println(Arrays.toString(splitArray));
            //System.out.println("start"+baring);


            for (int i = 0; i <= splitArray.length - 1; i++) {
                //System.out.println(i);


                if(baring == 0){
                    baring = 4;
                    System.out.println("baring reset to 4");
                }else if(baring == 5){
                    baring = 1;
                    System.out.println("baring reset to 0");
                }


                if (splitArray[i].equals(right)){
                    baring++;
                    System.out.println("baring right "+baring);

                }else if(splitArray[i].equals(left)){
                    baring--;
                    System.out.println("baring left "+ baring);
                }


                else if(splitArray[i].equals(plus) && baring == 1){
                    longitude++;
                    System.out.println("1 + longitude ="+longitude);

                } else if(splitArray[i].equals(plus) && baring == 2){
                    latitude++;
                    System.out.println("1 + latitude ="+latitude);
                }
                else if(splitArray[i].equals(plus) && baring == 3){
                    longitude--;
                    System.out.println("1 - longitude ="+longitude);

                } else if(splitArray[i].equals(plus) && baring == 4){
                    latitude--;
                    System.out.println("1 - latitude ="+latitude);
                }



                else if(splitArray[i].equals(minus) && baring == 1){
                    longitude--;
                    System.out.println("1 - longitude ="+longitude);

                } else if(splitArray[i].equals(minus) && baring == 2){
                    latitude--;
                    System.out.println("1 - latitude ="+latitude);
                }
                else if(splitArray[i].equals(minus) && baring == 3){
                    longitude++;
                    System.out.println("1 + longitude ="+longitude);

                } else if(splitArray[i].equals(minus) && baring == 4){
                    latitude++;
                    System.out.println("1 + latitude ="+latitude);
                }


                System.out.printf("(%s,%s)\n",latitude,longitude);



            }
            //System.out.printf("(%s,%s)\n",two,one);

        }
    }


    public static void main(String[] args) throws IOException
    {

        finalPosition();


    }
} 