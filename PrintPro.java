class PrintPro{  //class that holds all methods
  public void b(){  //method to print a new line
    System.out.print("\n");  //prints a new line
  }  //public void b() - new line
  
  public void o(String... w){  //method to print on one line
    for(String x : w){  //foreach loop that uses w as the holder of all and z as the holder of one
      System.out.print(x);  //prints the current arg
    }  //for(String x : w) - foreach printer of args
  }  //public void o(String... w) - same line with print with args

  public void n(){  //method to println without args
    b();  //prints a new line
  }  //public void n() - new line with println no args
  
  public void n(String... y){  //method to println
    for(String z : y){  //foreach loop that uses y as the holder of all and z as the holder of one
      System.out.print(z);  //prints the current arg
    }  //for(String z : y) - foreach printer of args
    b();  //prints a new line
  }  //public void n(String... y) - println with args
}  //class PrintPro
