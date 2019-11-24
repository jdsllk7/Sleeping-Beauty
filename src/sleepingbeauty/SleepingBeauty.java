
package sleepingbeauty;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SleepingBeauty {
    
    public static void main(String[] jdslk) {
        
        //nOW iM dONE
        System.out.println("Sleeping Beauty");
        
        try{
          Thread.sleep(1620000); //1620000 = 27min
        }catch(InterruptedException e){
        }
       
       try {
            //OPEN
            FileWriter fw = new FileWriter("sleep.bat", true);
            BufferedWriter bw = new BufferedWriter(fw);
            String sleepCommand = "powercfg -hibernate off\n" +
                                  "rundll32.exe powrprof.dll,SetSuspendState 0,1,0\n";
            String exit = "exit";
            String[]command = {"cmd.exe","/C","Start","C:\\Users\\jdslk\\Documents\\NetBeansProjects\\SleepingBeauty\\sleep.bat"};
            PrintWriter writer = new PrintWriter("sleep.bat"); //create PrintWriter object to clear up entire file
            Runtime rt = Runtime.getRuntime();
            Process p;
                

                    //Open
                    fw = new FileWriter("sleep.bat", true);
                    bw = new BufferedWriter(fw);
                    writer = new PrintWriter("sleep.bat");
            
                    writer.print("");   //then just print an empty string into the entire file
                    bw.write(sleepCommand);
                    p = rt.exec(command);
                    
                    writer.print("");   //then just print an empty string into the entire file
                    bw.write(exit);
                    p = rt.exec(command);
                   
                //Close
                bw.close(); 
                fw.close();
                writer.close();
    
       } catch (IOException ex) {
               Logger.getLogger(SleepingBeauty.class.getName()).log(Level.SEVERE, null, ex);
           }//end try catch
    }//end main
    
}
