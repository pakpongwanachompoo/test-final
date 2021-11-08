import java.io.*;


public class listdirectory {


    public static void main(String[] args){
        
        String path = "/home/ryu_pakpong/Desktop/Test";
        System.out.println("Path: " + path + "\n");
        String[] listpath = path.split("/");       //split tha path with \\ into array of string
        System.out.println(listpath[listpath.length-1]);         //print the root name
        printtree(path,0);
        
    }

    public static void printtree(String path,int count){
        File files = new File(path);              //get all file/directory in the path and add them to array of file
        File[] listFile = files.listFiles();
        for (int i = 0 ; i < listFile.length ; i++){
            if ( count > 0 ) {
                for ( int j = -1 ; j < count ; j++){
                    System.out.println();                       //if count is more than 0 then print blank depends on count to make an indent for tree
                }
            }
            System.out.print("L");
            System.out.print("_____"); 
            File f = listFile[i];                         //get seperate file/directory depends on index of files
            System.out.print(f.getName());                      //print that file/directory name
            if (listFile[i].isDirectory()) {
                path = listFile[i].toString();
                printtree(path,count+1);                 //if that file is a directory then get the path of that directory then do printtree again but with number count plus 1
            }
    }

    }

}