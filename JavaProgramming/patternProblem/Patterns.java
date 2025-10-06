package patternProblem;

public class Patterns {
   public static void statPattern_1(int n) {
      for(int i = 1; i <= n; ++i) {
         for(int j = 1; j <= i; ++j) {
            System.out.print('*');
         }

         System.out.println();
      }

   }

   public static void statPattern_2(int n) {
      for(int i = 1; i <= n; ++i) {
         for(int j = n; j >= i; --j) {
            System.out.print('*');
         }

         System.out.println();
      }

   }

   public static void statPattern_3(int n) {
      for(int i = 1; i <= n; ++i) {
         int num = 1;

         for(int j = 1; j <= i; ++j) {
            System.out.print(num + " ");
            ++num;
         }

         System.out.println();
      }

   }

   public static void statPattern_4(int n) {
      int num = 1;

      for(int i = 1; i <= n; ++i) {
         for(int j = 1; j <= i; ++j) {
            System.out.print(num + " ");
            ++num;
         }

         System.out.println();
      }

   }

   public static void main(String[] args) {
      statPattern_1(4);
      System.out.println("-------------------");
      statPattern_2(4);
      System.out.println("-------------------");
      statPattern_3(5);
      System.out.println("-------------------");
      statPattern_4(5);
   }
}
