class BSTInsertion{
    
    Node root;

    class Node {
        int value;
        Node leftchild, rightchild;
 
        public Node(int item)
        {
            this.value = item;
            leftchild = rightchild = null;
        }
    }
 

	BSTInsertion() {
		
	}
 

    public Node insert(Node node, int value)
    {
 
        if (node == null) {
            return new Node(value);
        }
		
        else if (value < node.value)
            node.leftchild = insert(node.leftchild, value);
        else if (value > node.value)
            node.rightchild = insert(node.rightchild, value);
 
        return node;
    }
 
    void inorder(Node node)
    {
        if (node != null) {
            inorder(node.leftchild);
            System.out.println(node.value);
            inorder(node.rightchild);
        }
    }
	
	
    public static void main(String[] args)
    {
        BSTInsertion bstree = new BSTInsertion();
		Node root = bstree.root;
		
        root = bstree.insert(root, 55);
        root = bstree.insert(root,32);
        root = bstree.insert(root,29);
        root = bstree.insert(root,44);
        root = bstree.insert(root,71);
        root = bstree.insert(root,68);
        root = bstree.insert(root,89);
		
        bstree.inorder(root);
    }
}
