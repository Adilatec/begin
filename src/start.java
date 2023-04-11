import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        //arrays
//        int[]arr=new int[5];
//arr[2]=4;
//        System.out.println(arr[2]);
        //initializing arrays
//        String[] myNames={"A","B","C","D"};
//        System.out.println(myNames[2]);
       // String[] days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
//array length
//for ( int i = 0;i<7;i++){
//        System.out.println(days[i]);}
//    System.out.println(days.length);
        //sum for array
//        int[]numb={6,42,3,7};
//        int sum=0;
//        for(int i=0;i<numb.length;i++){
//            sum+=numb[i];}
//            System.out.println(sum);
//exercise summing array elements
//     System.out.println("enter array length");
//        Scanner arrLength=new Scanner(System.in);
//        int numb=arrLength.nextInt();// take array length
//        System.out.println("enter array inputs");
//        int[] array=new int[numb];//create it
//        for(int i=0;i<numb;i++) {
//            array[i] = arrLength.nextInt();//enter inputs
//        }
//        int sum=0;
//        for(int i=0;i<numb;i++) {
//            if(array[i]%4==0){
//                sum+=array[i];
//            }}
//            System.out.println(sum);
//end of exercise
        //enhanced for loop
//        int[]prime={2,3,5,7};
//        for (int t:prime){
//            System.out.println(t);}
            //exercise
//        System.out.println("enter number of squares");
//        Scanner squares=new Scanner(System.in);
//        int numb=squares.nextInt();
//        int[]arraySides=new int[numb];
//        System.out.println("enter sides of the squares");
//        for(int i=0;i<numb;i++) {
//            arraySides[i] = squares.nextInt();
//            System.out.println("area is "+ arraySides[i] * arraySides[i]);
//        }//end
        //multidimensional array
//        int [][]sample={{8,1,6},{3,5,7},{4,9,0}};//not all array members are of the same type
//        for(int i=0;i< sample.length;i++){
//            for(int j=0;j<sample.length;j++){
//                System.out.print(sample[i][j]);
//            }
//            System.out.println();
//        }
// EXERCISE reverse string
//        System.out.println("write your word");
//        Scanner reverse=new Scanner(System.in);
//        String character=reverse.nextLine();//take input
//        char[]arr=character.toCharArray();//CREATE
//      //  for (int i=0;i< arr.length;i++){
//       //    System.out.println(arr[i]);
//      //  }
//         String rev="";
//         for (int j= arr.length-1;j>=0;j--){
//         rev+=arr[j];
//         }
//       System.out.println(rev);
//OBJECT ORIENTATION; they have characteristics called attributes and behaviours therefore object is an instance of class
        //methods defines behaviours. a method is a collection of statement that is group together to perform an operation eg
        //System.out.println();
       // sayHello("Adila");
        //THE RETURN TYPE. we define return type before we define method for example before writing method sum eg
//    int x=   sum(2,3);
//        int y= max(70,66);
//        System.out.println(x+" "+y);
//        double s=average(6,4,5,3);
//        System.out.println(s);
//        Vehicle v1=new Vehicle();
//        Vehicle V2=new Vehicle();
//        v1.color="red";
//        V2.horn();
     /*   //very important
               System.out.println("write your first name");
        Scanner read=new Scanner(System.in);
    String firstName=read.nextLine();//take input
        System.out.println("write your last name");
        String secondName=read.nextLine();
        System.out.println("write your age");
        int age=read.nextInt();
        System.out.println("write your room number");
        int roomNumber=read.nextInt();
        Hotel users=new Hotel();
        users.firstName=firstName;
        users.secondName=secondName;
        users.age=age;
        users.roomNumber=roomNumber;
        users.saveCustomerInfo();*/
        /* getter and setter
        Vehicle v1=new Vehicle();
        v1.setColor("red");
        System.out.println(v1.getColor());*/
        Scanner student=new Scanner(System.in);
        System.out.println("enter name");
        String name=student.nextLine();
        System.out.println("enter age");
        int age=student.nextInt();
        Vehicle printInfo=new Vehicle();
        printInfo.setName(name);
      //  System.out.println("Name: " + printInfo.getName());
        printInfo.setAge(age);
        if(age<0){
            System.out.println("invalid age");
            System.out.println("Name: " + printInfo.getName());
            System.out.println("Age: 0");
        }else {
            System.out.println("Name: " + printInfo.getName());
            System.out.println("Age: "+ printInfo.getAge());
        }

    }
//    static void sayHello(String name){
//        System.out.println("hello "+ name);//has a parameter
//    }
//static int sum(int val1,int val2){
//    return val1+val2;}
//    static int max(int a,int b){
//        if(a>b){
//            return a;
//        }else {return b;}
//    }
//    static double average(double a,double b,double c,double d){
//        double x=(a+b+c+d)/4;
//        return x;
 //   }

}
