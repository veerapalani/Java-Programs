//public class forloopstar {
//
//  public static void main(String[] args) {
//    int rows = 5;
//
//    for (int i = 1; i <= rows; ++i) {
//      for (int j = 1; j <= i; ++j) {
//        System.out.print("* ");
//      }
//      System.out.println();
//    }
//  }
//}

//public class forloopstar {
//
//	  public static void main(String[] args) {
//	    int rows = 5;
//
//	    for (int i = 1; i <= rows; ++i) {
//	      for (int j = 1; j <= i; ++j) {
//	        System.out.print(j + " ");
//	      }
//	      System.out.println();
//	    }
//	  }
//	}

//public class forloopstar {
//
//	  public static void main(String[] args) {
//	    char last = 'E', alphabet = 'A';
//
//	    for (int i = 1; i <= (last - 'A' + 1); ++i) {
//	      for (int j = 1; j <= i; ++j) {
//	        System.out.print(alphabet + " ");
//	      }
//	      ++alphabet;
//
//	      System.out.println();
//	    }
//	  }
//	}
//
//public class Main {
//
//	  public static void main(String[] args) {
//	    int rows = 5;
//
//	    for (int i = rows; i >= 1; --i) {
//	      for (int j = 1; j <= i; ++j) {
//	        System.out.print("* ");
//	      }
//	      System.out.println();
//	    }
//	  }
//	}
//
public class forloopstar {

	  public static void main(String[] args) {
	    int rows = 5;

	    for (int i = rows; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	  }
	}

//public class Main {
//
//	  public static void main(String[] args) {
//	    int rows = 5, k = 0;
//
//	    for (int i = 1; i <= rows; ++i, k = 0) {
//	      for (int space = 1; space <= rows - i; ++space) {
//	        System.out.print("  ");
//	      }
//
//	      while (k != 2 * i - 1) {
//	        System.out.print("* ");
//	        ++k;
//	      }
//
//	      System.out.println();
//	    }
//	  }
//	}
//
//public class Main {
//
//	  public static void main(String[] args) {
//	    int rows = 5, k = 0, count = 0, count1 = 0;
//
//	    for (int i = 1; i <= rows; ++i) {
//	      for (int space = 1; space <= rows - i; ++space) {
//	        System.out.print("  ");
//	        ++count;
//	      }
//
//	      while (k != 2 * i - 1) {
//	        if (count <= rows - 1) {
//	          System.out.print((i + k) + " ");
//	          ++count;
//	        } else {
//	          ++count1;
//	          System.out.print((i + k - 2 * count1) + " ");
//	        }
//
//	        ++k;
//	      }
//	      count1 = count = k = 0;
//
//	      System.out.println();
//	    }
//	  }
//	}
//
//public class Main {
//
//	  public static void main(String[] args) {
//	    int rows = 5;
//
//	    for(int i = rows; i >= 1; --i) {
//	      for(int space = 1; space <= rows - i; ++space) {
//	        System.out.print("  ");
//	      }
//
//	      for(int j=i; j <= 2 * i - 1; ++j) {
//	        System.out.print("* ");
//	      }
//
//	      for(int j = 0; j < i - 1; ++j) {
//	        System.out.print("* ");
//	      }
//
//	      System.out.println();
//	    }
//	  }
//	}
//
//public class Main {
//
//	  public static void main(String[] args) {
//	    int rows = 6, coef = 1;
//
//	    for(int i = 0; i < rows; i++) {
//	      for(int space = 1; space < rows - i; ++space) {
//	        System.out.print("  ");
//	      }
//
//	      for(int j = 0; j <= i; j++) {
//	        if (j == 0 || i == 0)
//	          coef = 1;
//	        else
//	          coef = coef * (i - j + 1) / j;
//
//	        System.out.printf("%4d", coef);
//	      }
//
//	      System.out.println();
//	    }
//	  }
//	}
//
//public class Main {
//
//	  public static void main(String[] args) {
//	    int rows = 4, number = 1;
//
//	    for(int i = 1; i <= rows; i++) {
//
//	      for(int j = 1; j <= i; j++) {
//	        System.out.print(number + " ");
//	        ++number;
//	      }
//
//	      System.out.println();
//	    }
//	  }
//	}