import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //Test your methods

    char[] arr = {'h', 'e', 'l', 'l', 'o'};
    
    System.out.println(subArray(arr, 2));
    System.out.println(subArray(arr, 4));
    System.out.println(subArray(arr, 0));
     System.out.println(subArray(arr,0,2));
    System.out.println(subArray(arr,1,5));
    System.out.println(subArray(arr,1,2));
    System.out.println((subArray(arr,1,1)));
    
  }
  public static char[]subArray(char[]arr,int beginIndex){
    char[]newArr = new char [arr.length - beginIndex];
      for(int i=0; i < arr.length - beginIndex; i++){
      newArr[i] = arr[i+beginIndex];
      }
    return newArr;
}
    public static char[]subArray(char[]arr,int beginIndex,int endIndex){
       char[]newArr = new char [endIndex - beginIndex];
      for(int i=0; i<endIndex - beginIndex; i++){
        newArr[i] = arr[i + beginIndex];
      }
      return newArr;
    }
}