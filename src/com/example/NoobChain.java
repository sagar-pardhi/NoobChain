package com.example;

public class NoobChain {

    public static void main(String[] args) {

        Block genesisBlock = new Block("Hi i am the first block", "0");
        System.out.println("Hash for block 1: " + genesisBlock.hash);

        Block secondBlock = new Block("Hi i am the first block", genesisBlock.hash);
        System.out.println("Hash for block 2: " + secondBlock.hash);

        Block thirdBlock = new Block("Hi i am the first block", secondBlock.hash);
        System.out.println("Hash for block 2: " + thirdBlock.hash);

    }
}
