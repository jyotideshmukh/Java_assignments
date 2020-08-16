package Assignment;
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes >= 0){

            int megaBytes = Math.round(kiloBytes/1024);

            int kilobytes = kiloBytes - (megaBytes * 1024);

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "+ kilobytes + " KB");
        
        }
        else
        {
            System.out.println("Invalid Value");
        }

    }
 
}