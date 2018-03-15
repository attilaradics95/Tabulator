public class Main {
    public static void tabulate(int tabulator){
        for(int i = 0; i <= tabulator; i++) {
            System.out.print("\t");
        }
    }

    public static void a(int tabulator){
        tabulate(tabulator);
        System.out.print("a\n");
        tabulator++;
        aa(tabulator);
        bb(tabulator);
    }
    public static void aa(int tabulator){
        tabulate(tabulator);
        System.out.print("aa\n");
        tabulator++;
        aaa(tabulator);
    }
    public static void aaa(int tabulator){
        tabulate(tabulator);
        System.out.print("aaa\n");
    }

    public static void bb(int tabulator){
        tabulate(tabulator);
        System.out.print("bb\n");
    }

    public static void c(int tabulator){
        tabulate(tabulator);
        System.out.print("c\n");
        tabulator++;
        cc(tabulator);
    }

    public static void cc(int tabulator){
        tabulate(tabulator);
        System.out.print("cc\n");
    }

    public static void main(String[] args){
        int tabulator = 0;
        a(tabulator);
        c(tabulator);
    }
}
