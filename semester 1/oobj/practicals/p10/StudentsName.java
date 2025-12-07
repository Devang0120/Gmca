public class StudentsName {
    public static void main(String []args){
        System.err.println("Number of Argument : "+ args.length);
        if(args.length==0){
            System.err.println("Please Enter Students Name");
            return;
        }
        for(int i=0;i<args.length;i++){
            String prefix;
            switch(i+1){
                case 1 :
                prefix = "First";
                break;
                case 2 :
                prefix = "Second";
                break;
                case 3 :
                prefix = "Third";
                break;
                default : 
                prefix = (i+1)+"th";
            }
            System.err.println(prefix+" Student Name is :"+args[i]);
            } 
        }
    }
