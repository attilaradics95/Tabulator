public class Main {
    public static int number;
    public static void tabulate(int tabulator){
        for(int i = 0; i <= tabulator; i++) {
            System.out.print("\t");
        }
    }

    public static void a(int tabulator){
        number++;
        tabulate(tabulator);
        System.out.print(Main.number + "." + "a\n");
        tabulator++;
        aa(tabulator);
        bb(tabulator);
    }
    public static void aa(int tabulator){
        number++;
        tabulate(tabulator);
        System.out.print(Main.number + "." + "aa\n");
        tabulator++;
        aaa(tabulator);
    }
    public static void aaa(int tabulator){
        number++;
        tabulate(tabulator);
        System.out.print(Main.number + "." + "aaa\n");
    }

    public static void bb(int tabulator){
        number++;
        tabulate(tabulator);
        System.out.print(Main.number + "." + "bb\n");
    }

    public static void c(int tabulator){
        number++;
        tabulate(tabulator);
        System.out.print(Main.number + "." + "c\n");
        tabulator++;
        cc(tabulator);
    }

    public static void cc(int tabulator){
        number++;
        tabulate(tabulator);
        System.out.print(Main.number + "." + "cc\n");
    }

    public static void main(String[] args){
        int tabulator = 0;
        number = 0;
        a(tabulator);
        c(tabulator);
    }
}
