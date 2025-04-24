public class string {
    public static void main(String[] args) {
      /*  String names[]= {"chinmai","yaswath","teja","saba","nana","mom","sis"};
        System.out.println(names [0]);
        System.out.println(names[2]);
        System.out.println(names[1]);
        System.out.println(names[3]);
        int numbers[] = {1,4,8,7,0};
    for(int i=0; i<=5; i++){
    System.out.println(numbers[i]);
    }*/
    int arr[] = {1,3,5,8,6,9,1,3,1,5,8,1};
    int count = 0;
    for(int i=0; i<12; i++){
        if(arr[i]==8){
            count = count + 1;
        }
    }
       System.out.println(count);
    }
    
}
