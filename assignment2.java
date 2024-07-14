import java.util.Scanner;

public class assignment2 {
  static void reportCard() {
    int Sst, Science, maths, english, hindi;
    String grade;
    Scanner sc = new Scanner(System.in);
    System.out.println("********************REPORT CARD**********************");
    System.out.println("Enter your marks obt in Social Science:             ");
    Sst = sc.nextInt();
    System.out.println("Enter your marks obt in  Science:                   ");
    Science = sc.nextInt();
    System.out.println("Enter your marks obt in  Maths:                     ");
    maths = sc.nextInt();
    System.out.println("Enter your marks obt in English:                    ");
    english = sc.nextInt();
    System.out.println("Enter your marks obt in Hindi:                      ");
    hindi = sc.nextInt();

    int TotalMarks = Sst + Science + maths + english + hindi;
    System.out.println("=====================================");
    System.out.println("|Total Marks Obtained: " + TotalMarks + "          |");
    float Avg = (TotalMarks / 5);

    System.out.println("|Average Percentage Obtained: " + Avg + "% |");
    System.out.println("=====================================");
    if (Avg >= 85) {
      System.out.println("Grade: A+");
      System.out.println("Congratulations,Outstanding Performance!!");
    }

    else if (Avg < 85 || Avg > 75) {
      System.out.println("Grade: B+;");
      System.out.println("Well done!!");

    } else if (Avg < 75 || Avg > 65) {
      System.out.println("Grade: C+;");
      System.out.println("Good Job!!");

    } else if (Avg < 65 || Avg > 55) {
      System.out.println("Grade: D+;");
      System.out.println("Work hard!!");

    }

    else if (Avg < 55 || Avg > 33) {
      System.out.println("Grade: E+;");
      System.out.println("Better Luck Next Time!!");

    }

    else if (Avg == 33 || Avg < 33) {
      System.out.println("Grade:F ");
      System.out.println("Sorry!!You have failed");
    }
    System.out.println("*****************************************************");
  }

  public static void main(String args[]) {
    reportCard();
  }
}
