public class Tree {
    int data;
    Tree lChild = null;
    Tree rChild = null;

    public Tree(int data) {
        this.data = data;
    }

    public Tree() {
    }

    public Tree CreatTree(Tree tree, int flag, int child) {
        Tree t;
        t = find(tree, flag);
        if (t.lChild != null) {
            t.rChild = new Tree(child);
        } else {
            t.lChild = new Tree(child);
        }
        return tree;
    }

    private Tree find(Tree t, int data) {
        Tree temp;
        if (t != null) {
            if (t.data == data) {
                return t;
            } else {
                if (t.lChild != null) {
                    temp = find(t.lChild, data);
                    return temp;
                }
                if (t.rChild != null) {
                    temp = find(t.rChild, data);
                    return temp;
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
}
