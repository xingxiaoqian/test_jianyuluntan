package com.webtest.xxqdemo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;
import com.webtest.zssdemo.ZSS_DataProvider;

/**
 * 我的足迹
 * @author 邢晓倩
 *
 */
public class XXQ_test extends BaseTest{
	
	@BeforeClass
	public void Login() throws IOException {
		webtest.open("/index.php/denglu.html");
		webtest.type("name=user", ReadProperties.getPropertyValue("xxquser"));
		webtest.type("name=pwd", ReadProperties.getPropertyValue("xxqpassword"));
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("版块选择"));
	}
	
    @Test(priority = 1)
    public void fangwen_test_click1(){
    	webtest.click("class=fa float-right fa-plus-square-o");
  		//点击访问过的帖子
  		webtest.click("link=访问过的帖子");
  		assertTrue(webtest.isTextPresent("浏览时间"));

	}
	 @Test(priority = 2)
    public void zhifu_test_click1(){
  		//点击支付过的帖子
  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[3]");
  		assertTrue(webtest.isTextPresent("支付时间"));
	
	 }
	 @Test(priority = 3)
    public void zan_test_click1(){
  		//点击赞过的帖子
  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[4]");
  		assertTrue(webtest.isTextPresent("点赞时间"));
	
	 }
	 @Test(priority = 4)
    public void cai_test_click1(){
  		//点击踩过的帖子
  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[5]");
  		assertTrue(webtest.isTextPresent("踩过的时间"));
	
	 }
	 @Test(priority = 5)
	    public void zan1_test_click1(){
	  		//点击赞过的跟帖
	  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[6]");
	  		assertTrue(webtest.isTextPresent("点赞时间"));
	
	 }
	 @Test(priority = 6)
	    public void cai1_test_click1(){
	  		//点击踩过的跟帖
	  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[7]");
	  		assertTrue(webtest.isTextPresent("踩过的时间"));
	
	 }
	 @Test(priority = 7)
	    public void shoucang_test_click1(){
	  		//点击我的收藏
	  		webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div/div[8]/nav/a[1]");
	  		assertTrue(webtest.isTextPresent("收藏时间"));

	}
    @Test(priority = 8)
    public void shoucang_test_click2() throws InterruptedException{
	      //点击删除按钮
    	
	      webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr/td[3]/a/i[1]");

	      webtest.click("xpath=//button[text()='取消']");
	      
    }
    @Test(priority = 9)
    public void shoucang_test_click3(){
		//  点击帖子标题链接
		    webtest.click("xpath=/html/body/div[1]/div/div[2]/div/form/table/tbody/tr[1]/td[1]/a");
		//点赞
		  webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div[2]/div/div[3]/button[1]");
        //点确认
        //    webtest.click("class=btn btn-info");
        //判断
          //  assertTrue(webtest.isTextPresent("dwejkdnle"));
    }
    @Test(priority = 10)
    public void shoucang_test_click4(){
        //点踩
  	     webtest.click("xpath=/html/body/div[1]/div/div[1]/div/div[2]/div/div[3]/button[2]");
  	     //assertTrue(webtest.isTextPresent("错误"));
  	}
    //7条用例
	@Test(priority = 11,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
	public void shoucang_test_click5(String neirong) throws InterruptedException {
	    //点击第一条评论的回复
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[2]/button");
	    //点击输入框
	    //webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]");
	    //输入
	    webtest.type("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]",neirong);
	    webtest.click("class=quxiaohuifu");
	 }
	 //7条用例
	@Test(priority = 12,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
	public void shoucang_test_click6(String neirong) throws InterruptedException {
	    //点击第一条评论的回复
	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[2]/button");
	    //点击输入框
	    //webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]");
	    //输入
	    webtest.type("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[4]/div/div[1]/div[3]",neirong);
	    webtest.click("class=huifu");
	 }
	
	 
	 @Test(priority = 13)
	    public void shoucang_test_click8(){
	        //点排序
	  	     webtest.click("class=btn btn-light btn-sm text-black-50");
	  	    //点击按时间排序
         	webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[1]/div/div/a[2]");
         	//点击第一条评论的删除
         	webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[2]");
         	//取消
         	webtest.click("xpath=//button[text()='取消']");
	  	     //assertTrue(webtest.isTextPresent("错误"));
	  }
	 //7个用例
	 @Test(priority = 14,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
		public void shoucang_test_click8(String neirong) throws InterruptedException{ 
	      //点击第一条评论的修改
      	  webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[1]");
      	  //修改
          webtest.type("class=HandyEditor_editor",neirong);
      	  //取消
      	  webtest.click("xpath=//button[text()='取消']");
	  	     //assertTrue(webtest.isTextPresent("错误"));
	  }
	 //7个用例
	 @Test(priority = 15,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
		public void shoucang_test_clic10(String neirong) throws InterruptedException{ 
	      //点击第一条评论的修改
	   	  webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[1]");
	   	  //修改
	       webtest.type("class=HandyEditor_editor",neirong);
	   	  //继续
	   	  webtest.click("xpath=//button[text()='继续']");
	  	     //assertTrue(webtest.isTextPresent("错误"));
	  }
	 @Test(priority = 16)
	    public void shoucang_test_click11(){
	        //点排序
	  	     webtest.click("class=btn btn-light btn-sm text-black-50");
	  	    //点击按时间排序
      	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[1]/div/div/a[2]");
      	    //点击第一条评论的删除
      	    webtest.click("xpath=/html/body/div[1]/div/div[1]/div/ul/li[2]/div[1]/a[2]");
      	    //继续
      	    webtest.click("xpath=//button[text()='继续']");
	  }

	 @Test(priority = 17)
	    public void shoucang_test_click12(){
			//点首页
	     	webtest.click("xpath=//a[text()='首页']");
//	     	//点击头像
     	    webtest.click("id=navbarDropdowny");
//    	    //点击用户中心
    	    webtest.click("xpath=//a[text()='用户中心']");
//    	    
    	    assertTrue(webtest.isTextPresent("版块选择"));

	 }
	 //7条
	 @Test(priority = 18,dataProviderClass = XXQ_DataProvider.class, dataProvider = "neirong")
     public void shoucang_test_click13(String neirong) throws InterruptedException{ 
     	//点击输入框
     	webtest.click("xpath=/html/body/div/div/div[1]/div/div[3]/div[2]/div[1]/div[3]");
     	//输入
     	webtest.type("xpath=/html/body/div/div/div[1]/div/div[3]/div[2]/div[1]/div[3]",neirong);
         //点击跟帖
        webtest.click("id=gentie");
     }
	 //
	
	
}
