package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class OnePlusTwo extends BaseTest {

    @Test
    public void onePlusTwo()  {


        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        Assertions.assertEquals(driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText(), "3");
        driver.findElement(By.id("com.google.android.calculator:id/clr")).click();
    }
}