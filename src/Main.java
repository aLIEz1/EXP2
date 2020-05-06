import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeOP op = new TreeOP();
        Vector<Tree> p = new Vector<>();
        int total = in.nextInt();
        if (total == 1) {
//            System.out.print(0 + "\n" + 0 + "\n" + 0);
//            System.out.print(1 + " " + 1);
            System.out.print(0);
        } else {
            op.tree.data = in.nextInt();
            op.tree.lChild = new Tree(in.nextInt());
            for (int i = 0; i < total - 2; i++) {
                op.creatTree(in.nextInt(), in.nextInt());
            }
//            op.PreOrderTree(op.tree);
//            System.out.println();
//            op.InOrderTree(op.tree);
//            System.out.println();
//            op.LaOrderTree(op.tree);
//            System.out.print(op.calcHeight(op.tree) + " " + op.calcWidth(op.tree));
            op.findPath(op.tree, in.nextInt(), p);
        }

    }

}
