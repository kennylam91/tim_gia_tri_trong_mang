import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] ars){
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isFound=false;
        Scanner input= new Scanner(System.in);
        System.out.println("Input student's name: ");
        String nameInput=input.nextLine();
        for(int i=0;i<students.length;i++){
            if(students[i].equals(nameInput))
            {
                System.out.println("Found student "+nameInput+" at position "+ (i+1) );
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Cannot find students " +nameInput);
        }
    }
}
