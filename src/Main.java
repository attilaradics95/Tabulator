public class Main {
    public static void tabulate(int tabulator){
        for(int i = 0; i <= tabulator; i++) {
            System.out.print("\t");
        }
    }

    public static void a(int tabulator, int number){
        number++;
        tabulate(tabulator);
        System.out.print(number + "." + "a\n");
        tabulator++;
        aa(tabulator,number);
        bb(tabulator,number);
    }
    public static void aa(int tabulator, int number){
        number++;
        tabulate(tabulator);
        System.out.print(number + "." + "aa\n");
        tabulator++;
        aaa(tabulator,number);
    }
    public static void aaa(int tabulator, int number){
        number++;
        tabulate(tabulator);
        System.out.print(number + "." + "aaa\n");
    }

    public static void bb(int tabulator, int number){
        tabulate(tabulator);
        System.out.print(number + "." + "bb\n");
    }

    public static void c(int tabulator, int number){
        tabulate(tabulator);
        System.out.print(number + "." + "c\n");
        tabulator++;
        cc(tabulator,number);
    }

    public static void cc(int tabulator, int number){
        tabulate(tabulator);
        System.out.print(number + "." + "cc\n");
    }

    public static void main(String[] args){
        int tabulator = 0;
        int number = 0;
        a(tabulator, number);
        c(tabulator, number);
    }
}
