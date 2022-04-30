import java.io.*;

public class Tom extends Human{


    public void speak () {
        super.speak();
        System.out.println("However, Tom does not have the ability to speak.\n");
    }

    public static void main(String[] args) throws IOException {
        Human human1 = new Human();
        human1.breathe();

        Tom tom1 = new Tom();
        tom1.speak();

        String path = "/Users/azharul/IdeaProjects/HW 4/text";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(path);

        } catch (FileNotFoundException e) {
            System.out.println("File path error");
        }

        try {
            br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        finally {
            if (fr !=null){
                fr.close();
            }
            if (br !=null){
                br.close();
            }
        }


    }



}
