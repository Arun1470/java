public class Main{
    public static void main(String[] args){
        for(char c='a';c<='z';c++){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.print(c);
            }
        }
        System.out.println();
        for(char c='a';c<='z';c++){
            if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')){
                System.out.print(c);
            }
        }
    }
}
