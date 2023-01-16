package java_standar_clases.javaFileio;

import java.io.*;

public class JavaUtilIO {
    public static void main(String[] args) {
        String conten="ini adalah text contoh yaaaa";
        String urlFile="alamatFileKu.txt";
        Boolean status=menulisFile(urlFile,conten);
        System.out.println(status);

    }

    public static String membacaFile (String url){
        String isiFile=null;

        try{
            FileReader fileReader=new FileReader(url);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            StringBuffer stringBuffer=new StringBuffer();
            String baris;

            while ((baris = bufferedReader.readLine()) != null){
                stringBuffer.append(baris);
            }
            fileReader.close();
            bufferedReader.close();
            isiFile=stringBuffer.toString();
        }catch(IOException exception){
            System.out.println(exception);
        }
        return isiFile;
    }
    public static Boolean menulisFile(String url,String isiFile){
        Boolean status=false;
        try {
            FileWriter fileWriter=new FileWriter(url);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(isiFile);
            bufferedWriter.close();
            fileWriter.close();
            status=true;
        }catch (IOException exception){
            System.out.println(exception);
        }
        return status;
    }

}
