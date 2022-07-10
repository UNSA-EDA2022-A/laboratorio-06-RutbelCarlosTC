package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){

        return nodoBinario(a.root);
    }
    public <T extends Comparable<T>> boolean nodoBinario(Node<T> n1){
        if(n1.left == null && n1.right == null)
            return true;
        else if(n1.left == null || n1.right == null)
            return false;
        return (nodoBinario(n1.left) && nodoBinario(n1.right));
    }
}
