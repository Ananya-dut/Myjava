public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("break and continue using loops!");
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//        }
//        System.out.println("loop ends here!");
//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("loop ends here!");
//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }
//        while(i<5);
//        System.out.println("loop ends here!");
//        for(int i=0;i<5;i++){
//            if(i==2){
//                System.out.println("ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//        }
//        System.out.println("loop ends here!");
//        int i=-1;
//        while(i<4){
//i++;
//            if(i==2){
//                System.out.println("ending the loop");
//                continue;
//            }
//
//            System.out.println(i);
//            System.out.println("java is great");
//
//        }
//        System.out.println("loop ends here!");
        int i=-1;
        do{
            i++;
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }while(i<4);
        System.out.println("loop ends here!");
    }
}
