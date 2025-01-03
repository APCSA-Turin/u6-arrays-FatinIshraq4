public class ArrayAlgorithms {
    
    public static String longestString(String[] stringList) {
        int largest=0;
        String large="";
        
        for (String i : stringList) {
            if (i.length()>=largest) {largest=i.length(); large=i;}
        }
        return large;
      }

    public static boolean containsPositive(int[] numList) {
        for (int i : numList) {
          if (i>0) {return true;}
        }
        return false;
      }
    
    public static String[] makeLowercase(String[] wordList) {
            String[] low = new String[wordList.length];
            for (int i=0; i<wordList.length; i++) {
                low[i]=wordList[i].toLowerCase();
            }
            return low;
          }
        
    public static int endsInExclamations(String[] stringList) {
      int count=0;
      for (String i : stringList) {
        if ((i.substring(i.length()-1)).equals("!")) {
          count++;
        }
      }    
      return count;
    }

    public static void makeUppercase(String[] wordList) {
      for (int i=0; i<wordList.length; i++) {
        wordList[i]=wordList[i].toUpperCase();
      }    
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
      int[] res = new int[intArr1.length];
      for (int i=0; i<intArr1.length; i++) {
        if(intArr1[i]>intArr2[i]) {res[i]=intArr1[i];}
        else {res[i]=intArr2[i];}
      }
      return res;
    }
  
    public static int countConsecutiveDoubles(int[] numList) {
      int count=0;
      for (int i = 0; i<numList.length-1; i++) {
        if (numList[i]==numList[i+1]) {count++;}
      }
      return count;
    }
  
    public static int longestStreak(int[] nums) {
      int max=0;
      for (int i=0; i<nums.length; i++) {
        int streak=1;
        int cur=i;
        while(cur<nums.length-1 && nums[cur]==nums[cur+1]) {
          streak++;
          cur++;
        }
        if (streak>max) {max=streak;}
      }
      return max;
    }
  
        
    
      
}



