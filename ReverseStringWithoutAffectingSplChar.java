//input: a,b$c
//output: c,b$a special char not moved anywhere
class Main {  
  public static void main(String args[]) { 
    String str= "a(,bcd}" ;
    char[] arr = new char[str.length()];
    arr = str.toCharArray();
    int l=0;
    int r=str.length()-1;
    char temp;
    while(l<r){
        if(!Character.isAlphabetic(arr[l])){
            l++;
        }else if(!Character.isAlphabetic(arr[r])){
            r--;
        }else{
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    System.out.println(arr);
  }
  
}
