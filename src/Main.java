import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 1) {
            System.out.print(0 + "\n" + 0 + "\n" + 0);
        } else {
            t.data = in.nextInt();
            t.lChild = new Tree(in.nextInt());
            for (int i = 0; i < num - 2; i++) {
                t = t.CreatTree(t, in.nextInt(), in.nextInt());
            }
            System.out.println(t.lChild.rChild.lChild.data);
//            t.PreOrderTree(t);
//            System.out.println();
//            t.InOrderTree(t);
//            System.out.println();
//            t.LaOrderTree(t);
//        System.out.println(t.lChild.lChild.data);
        }

    }
}
