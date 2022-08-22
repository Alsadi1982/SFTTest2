import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args)  {
        boolean find = false;
        int momentFrequency = 0;
        List<Integer> commands = new ArrayList<>();
        Set<Integer> frequencies = new HashSet<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("01.txt"))){

            String str;
            while ((str = reader.readLine()) != null){
                int num = Integer.parseInt(str);
                commands.add(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true){

            for (Integer elem: commands){
                momentFrequency += elem;
                if (frequencies.contains(momentFrequency)){
                    find = true;
                    break;
                }else {
                    frequencies.add(momentFrequency);
                }
            }

            if (find){
                break;
            }
        }

        System.out.println(momentFrequency);

    }
}
