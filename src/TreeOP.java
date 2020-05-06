import java.util.Vector;

public class TreeOP {
    Tree tree = new Tree();

    public void creatTree(int father, int child) {
        Tree work = findNode(tree, father);
        if (work != null) {
            if (work.lChild != null) {
                work.rChild = new Tree(child);
            } else {
                work.lChild = new Tree(child);
            }
        } else {
            System.out.println("未找到父亲结点");
        }
    }

    private Tree findNode(Tree t, int data) {
        Tree p;
        if (t != null) {
            if (t.data == data) {
                return t;
            }
            if (t.lChild != null) {
                p = findNode(t.lChild, data);
                if (p != null) {
                    return p;
                }
            }
            if (t.rChild != null) {
                p = findNode(t.rChild, data);
                if (p != null) {
                    return p;
                }
            }

        }
        return null;
    }

    public void PreOrderTree(Tree t) {
        if (t != null) {
            System.out.print(t.data + " ");
            PreOrderTree(t.lChild);
            PreOrderTree(t.rChild);
        }

    }

    public void InOrderTree(Tree t) {
        if (t != null) {
            InOrderTree(t.lChild);
            System.out.print(t.data + " ");
            InOrderTree(t.rChild);
        }
    }

    public void LaOrderTree(Tree t) {
        if (t != null) {
            LaOrderTree(t.lChild);
            LaOrderTree(t.rChild);
            System.out.print(t.data + " ");
        }
    }

    public int calcHeight(Tree b) {
        if (b == null) {
            return 0;
        } else {
            return Math.max(calcHeight(b.lChild), calcHeight(b.rChild)) + 1;
        }

    }

    public int calcWidth(Tree b) {
        if (b == null) {
            return 0;
        } else {
            int maxWidth = 0;
            if (b.lChild == null && b.rChild == null) {
                return 1;
            } else {
                maxWidth = Math.max(calcWidth(b.lChild) + calcWidth(b.rChild), maxWidth);
            }
            return maxWidth;
        }

    }

    public void findPath(Tree tree,
                         int data,
                         Vector<Tree> path) {
        if (tree == null) {
            return;
        }
        path.add(tree);
        if (tree.data == data) {
            printPath(path);
            return;
        }
        if (tree.lChild != null) {
            findPath(tree.lChild, data, path);
        }
        if (tree.rChild != null) {
            findPath(tree.rChild, data, path);
        }
        path.remove(path.lastElement());
    }

    private void printPath(Vector<Tree> path) {
        for (Tree t: path){
            System.out.print(t.data+" ");
        }
    }
}
