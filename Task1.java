class Main {
    public static void main(String[] args) {

        // TYPE 1: Declaration only (INT)
        int[] a;
        a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // TYPE 2: Declaration + Allocation (STRING)
        String[] b = new String[2];
        b[0] = "jeet";
        b[1] = "ram";

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // TYPE 3: Declaration + Initialization (static)
        int[] c = {1, 2, 3};
        String[] d = {"ajay", "sridhar"};

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
