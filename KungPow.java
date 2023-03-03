import java.util.Scanner;

public class KungPow {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      TinyNet tn = new TinyNet();

      System.out.println("\nLing calls out to you from across the field:\n");

      for (int i = 0; i < 4; i++) {
         int c = imComing(sc);

         if (c == 2) {
            System.exit(0);
         }
      }

      System.out.print("A net falls onto your head, how big is it?\n(1 - Tiny, 2 - Not tiny) ");
      int choice = sc.nextInt();
      System.out.println(tn.captureMethod(choice));
      System.out.println("\n-------------------------------------------------\n");

      System.out.print("Will you let a tiny net stop you?\n(1 - Yes, 2 - No) ");
      choice = sc.nextInt();
      System.out.println(tn.reverseCaptureMethod(choice));
   }

   public static int imComing(Scanner sc) {
      int choice = 0;

      System.out.println("\"CHOSEN ONE!\"");

      while (choice < 1 || choice > 2) {
         System.out.print("\nDo you run to her?\n(1 - Yes, 2 - No) ");
         choice = sc.nextInt();
      }

      if (choice == 1) {
         System.out.println("\nI'M COMING!\n");
         System.out.println("-------------------------------------------------\n");
         return 1;
      } else {
         System.out.println("\nThat's not very Chosen One of you.");
         return 2;
      }
   }
}

class TinyNet {
   private boolean isChosenOne = true;
   private boolean isCaptured = false;
   private boolean deathSentence = true;
   private String netSize = "";

   public TinyNet() {
   }

   public String captureMethod(int net) {
      if (net == 1) {
         this.netSize = "Tiny";
      }

      if (this.netSize.equals("Tiny") && this.isChosenOne) {
         this.isCaptured = true;
         this.deathSentence = true;

         return "\nYou begin to rot in a field like a papaya.";
      } else {
         return "\nA tiny net would have been sure-fire.";
      }
   }

   public String reverseCaptureMethod(int choice) {
      if ( choice == 2 ) {
         this.deathSentence = false;
         this.isCaptured = false;

         return "\nYou've reversed the capture method and... YEAH!\nNow you should go find Ling.\n";
      } else {
         return "\nThe Evil Council takes over the world, stinky pits and all.\n";
      }
   }
}
