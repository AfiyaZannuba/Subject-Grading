import java.util.Scanner;

public class SubjectsGrading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the subject Maths: ");
        double Maths = sc.nextInt();
        System.out.println("Enter marks of the subject Science: ");
        double Science = sc.nextInt();
        System.out.println("Enter marks of the subject English: ");
        double English = sc.nextInt();

        double average = Maths + Science + English ;
        double marksObtained = average/3 ;
//System.out.println(marksObtained);
        if(marksObtained>=90){
            System.out.println("A");
        }
        else if(marksObtained>=70 && marksObtained<90){
            System.out.println("B");
        }
        else if(marksObtained>=50 && marksObtained<70){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }

    }
}
