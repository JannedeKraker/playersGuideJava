package codereview;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {
    public static void main(String[] args) {
        System.out.println(addSpacesBefore("hallo hoe gaat het", 'a','e', ' '));
        System.out.println(removeUnnecessarySpaces("hallo hoe gaat het er mee? "));
    }
    public static String addSpacesBefore(String str,char... characters){
        String res=str;
        for(char c:characters){
            String regex="";
            regex=String.valueOf(c);
            res=res.replace(regex," "+c);

        }

        return  res;
    }
    public static String addSpacesAfter(String str,char... characters){
        String res=str;
        for(char c:characters){
            String regex="";
            regex=String.valueOf(c);
            res=res.replace(regex,c+" ");
        }
        return  res;
    }

    public static String removeUnnecessarySpaces(String in){

        return in.trim().replaceAll(" {2,}"," ");
    }
    public static  String recognizePackageDeclaration(String input){


        String[] contents=input.replaceAll("\\s*\\.\\s*",".").split(" ");
        if(contents[0].trim().equals( "package")){
            return contents[0]+" "+contents[1];
        }
        else return "";

    }
    public static String recognizeClassDeclaration(String input){
        // TODO: 19/06/2023
        return " ";
    }
    public  static String recognizeFieldDeclarations(String input){
        // TODO: 19/06/2023
        return " ";
    }
    public static void loadFile(String path){
        BufferedReader buffer;
        FileReader reader;
        try {
            reader=new FileReader(path);
            buffer=new BufferedReader(reader);

            String line = "";

            while ((line=buffer.readLine())!=null) {

                line=removeUnnecessarySpaces(line);
                line=addSpacesBefore(line,'{','}','[',']');
                line=addSpacesAfter(line,'{','}','[',']',';');

                if(line.length()>1){System.out.print(line);}
            }

            reader.close();
            buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
