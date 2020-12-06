
package com.webtest.xxqdemo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

/**
 * 
我的足迹
 *
 */

public class SignInTest extends BaseTest {

	@BeforeClass
	public void Login_footmark() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("username"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("password"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("版块选择"));
	}

               //我的收藏
                 @Test(priority = 0)
                 public void test_click1(){
                           webtest.click("link=我的收藏");
//                     删除按钮
                           webtest.click("class=fafa-trash-o");
//                     确认删除
                            webtest.click("class=btn btn-info");
                 }
                @Test(priority = 1)
                 public void test_click2(){
                           webtest.click("link=我的收藏");
//                     删除按钮
                           webtest.click("class=fafa-trash-o");
//                     取消删除
                            webtest.click("class=btn btn-default");
                 }
                 @Test(priority = 2)
                  public void test_click3(){
                           webtest.click("link=我的收藏");
//                   点击帖子 
                           webtest.click("class=text-info");
//                   点赞
                           webtest.click("class=fa fa-thumbs-o-up")
                  }
                  @Test(priority = 3)
                  public void test_click4(){
                           webtest.click("link=我的收藏");
//                   点击帖子 
                           webtest.click("class=text-info");
//                   踩
                            webtest.click("id=postcai");
                  }   
                 @Test(priority = 4)
                  public void test_click5(){
                           webtest.click("link=我的收藏");
//                   点击帖子 
                           webtest.click("class=text-info");
//                   收藏
                            webtest.click("id=postshoucang");
                  }  
                 @Test(priority = 5)
                 public void test_click1(){
                           webtest.click("link=赞过的帖子");
//                     删除按钮
                           webtest.click("class=fafa-trash-o");
//                     确认删除
                            webtest.click("class=btn btn-info");
                 }
                  @Test(priority = 6)
                 public void test_click1(){
                           webtest.click("link=踩过的帖子");
//                     删除按钮
                           webtest.click("class=fafa-trash-o");
//                     确认删除
                            webtest.click("class=btn btn-info");
                 }
                   @Test(priority = 7)
                          public void test_click1(){
                           webtest.click("link=赞过的跟帖");
//                     删除按钮
                           webtest.click("class=fafa-trash-o");
//                     确认删除
                            webtest.click("class=btn btn-info");
                 }
                    @Test(priority = 8)
                          public void test_click1(){
                           webtest.click("link=踩过的跟帖");
//                     删除按钮
                           webtest.click("class=fafa-trash-o");
//                     确认删除
                            webtest.click("class=btn btn-info");
                 }


}





