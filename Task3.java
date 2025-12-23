class Main {
    public static void main(String[] args) {

        int[] n = new int[10];   // total capacity
        int cz = 0;             // current size

        // initialize first 5 values
        for (int i = 0; i < 5; i++) {
            n[i] = i + 1;
            cz++;
        }

        System.out.println("Total capacity is " + n.length);
        System.out.println("Current size is " + cz);

        System.out.println("Array contents:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(i + " index -> " + n[i]);
        }

        System.out.println("After initializing 5 values manually");
    }
}
