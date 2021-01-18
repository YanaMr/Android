package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ThemeChanging extends BaseTest {

    @Test
    public void onePlusTwo()  {


        driver.findElementByAccessibilityId("More options").click();
        driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
        driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")).click();
        driver.findElement(By.id("android:id/button1")).click();

    }
}