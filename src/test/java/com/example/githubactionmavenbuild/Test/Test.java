package com.example.githubactionmavenbuild.Test;

import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void oneplusoneistwo(){
        Assertions.assertEquals(2,1+1);
    }



    @org.junit.jupiter.api.Test
    public void oneplustwoisthree(){
        Assertions.assertEquals(3,1+2);
    }
}
