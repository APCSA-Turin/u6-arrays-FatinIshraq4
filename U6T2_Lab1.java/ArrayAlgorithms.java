/*public class ArrayAlgorithms {
    
    public static double average(int[] numList) {
        double s = 0;
        for (int i = 0; i<numList.length; i++) {
            s+=numList[i];
        }
        return s/numList.length;
      }

      public static int minimum(int[] numList) {
        int s = numList[0];
        for (int i=1; i<numList.length; i++) {
            if (numList[i]<s) {
                s = numList[i];
            }
        }
        return s;
      }

      public static int howManyContain(String[] strList, String target) {
        int c = 0;
        for (int i=0; i<strList.length; i++) {
            if (strList[i].indexOf(target)>=0) {
                c++;
            }
        }
        return c;
      }

      public static String[] stringToArray(String myStr) {
        String[] l = new String[myStr.length()];
        for (int i = 0; i < myStr.length(); i++) {
            String c = myStr.substring(i,i+1);
            l[i] = c;
        }
        return l;
      }

      public static void introduceAdults(Person[] people) {
        for (int i=0; i<people.length; i++) {
            if (people[i].getAge()>=18) {
                people[i].introduce();
            }
        }
      }

      public static void reversePrint(String[] wordList) {
        for (int i= wordList.length-1; i>=0; i--) {
            String cur = wordList[i];
            for (int x=cur.length()-1; x>=0; x--) {
                System.out.print(cur.substring(x,x+1));
            }
            System.out.println();
        }
      }

      public static int[] combine(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] last = new int[len];
        for (int i=0; i<arr1.length; i++) {
            last[i]=arr1[i];
        }
        for (int i=arr1.length; i<len; i++) {
            last[i]=arr2[i-arr1.length];
        }
        return last;        
      }
  
      public static void bookEnd(int[] nums, int num) {
        nums[0]=num;
        nums[nums.length-1]=num;
      }

      public static void multiplyBy(int[] numList, int multiplier) {
        for (int i=0; i<numList.length; i++) {
          numList[i]=numList[i]*multiplier;
        }
      }

      public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] list = new int[numList.length];
        for (int i=0; i<numList.length; i++) {
          list[i]=numList[i]*multiplier;
        }
        return list;
      }  

      public static void addExclamation(String[] wordList) {
        for (int i=0; i<wordList.length; i++) {
          String check = wordList[i];
          String c = check.substring(check.length()-1);
          if (!c.equals("!")) {
            check+="!";
            wordList[i]=check;          
          }
        }
      }

      public static boolean[] isFreezing(int[] tempList) {
        boolean[] bools = new boolean[tempList.length];
        for (int i=0; i<tempList.length; i++) {
          int c = tempList[i];
          if (c<=32) {
            bools[i] = true;                      
          } else {bools[i]=false;}
        }
        return bools;
      }
    
      public static void shiftLeft(int[] numList) {
        int x = numList[0];
        for (int i=1; i<numList.length; i++) {
          numList[i-1] = numList[i];
        }
        numList[numList.length-1] = x;
      } 

      public static void shiftRight(int[] numList) {
        int x = numList[numList.length-1];
        for (int i=numList.length-1; i>=1; i--) {
          numList[i] = numList[i-1];
        }
        numList[0] = x;
      } 
   
      
      public static void reverse(int[] numList) {
        int[] x = new int[numList.length];
        for (int i = 0; i<numList.length; i++) {
          x[i] = numList[i];
        } 
        for (int i = 0; i<numList.length; i++) {
          numList[i] = x[numList.length-i-1];
        } 
      } 
      
    
      public static void reverse(int[] numList) {
        for (int i=0; i<numList.length/2; i++) {
          int x = numList[i];
          numList[i]=numList[numList.length-i-1];
          numList[numList.length-i-1]=x;
        }
      }
    
   


      
}
*/