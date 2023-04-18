//Recursive code for printing numbers from o to 5
class HelloWorld {
    static int cnt=0;
    public static void main(String[] args) {
        print();
    }
    
    static void print()
    {
        //base condition
        if(cnt==6){
            return;
        }
        System.out.println(cnt);
        //count incremented
        cnt++;
        print();
    }
}

