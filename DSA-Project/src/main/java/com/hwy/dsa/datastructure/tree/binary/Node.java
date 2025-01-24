
package com.hwy.dsa.datastructure.tree.binary;

public class Node{
	int value;
        Node parent;
        Node leftChild;
        Node rightChild;
        
        public Node(int value)
        {
            this.value = value;
        }
        
        public void setValue(int value)
        {
            this.value = value;
        }
}