
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32572.1470", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32572.1472", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32572.1474", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32572.1476", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32572.1478", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32572.1480", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32572.1482", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32572.1484", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32572.1486", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32572.1488", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32572.1490", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32572.1492", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32572.1494", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32572.1496", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32572.1498", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32572.1500", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32572.1502", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32572.1504", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32572.1506", "" ) );


objectMap.put( "32572.1470", bC );


bC = new ByFactoryCollection("pass", "32572.1510", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "32572.1512", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "32572.1514", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32572.1516", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32572.1518", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-pass']", "AttributeRule", "32572.1520", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-pass']", "AttributeRule", "32572.1522", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Password']", "AttributeRule", "32572.1524", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Password']", "AttributeRule", "32572.1526", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Password']", "AttributeRule", "32572.1528", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Password']", "AttributeRule", "32572.1530", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"pass\"]", "IDRule", "32572.1532", "" ) );
bC.add( new ByFactory( ById.class, "pass", "IDRule", "32572.1534", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"pass\"]", "IDRule", "32572.1536", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"pass\"]", "NameRule", "32572.1538", "" ) );
bC.add( new ByFactory( ByName.class, "pass", "NameRule", "32572.1540", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"pass\"]", "NameRule", "32572.1542", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32572.1544", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32572.1546", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32572.1548", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32572.1550", "" ) );


objectMap.put( "32572.1510", bC );


bC = new ByFactoryCollection("login", "32572.1554", "");
bC.add( new ByFactory( ByXPath.class, "//button[@type='submit']", "AttributeRule", "32572.1556", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "32572.1558", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']", "AttributeRule", "32572.1560", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']", "AttributeRule", "32572.1562", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@data-testid='royal-login-button']", "AttributeRule", "32572.1564", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-login-button']", "AttributeRule", "32572.1566", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@value='1']", "AttributeRule", "32572.1568", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='1']", "AttributeRule", "32572.1570", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"u_0_5_tK\"]", "IDRule", "32572.1572", "" ) );
bC.add( new ByFactory( ById.class, "u_0_5_tK", "IDRule", "32572.1574", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"u_0_5_tK\"]", "IDRule", "32572.1576", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@name=\"login\"]", "NameRule", "32572.1578", "" ) );
bC.add( new ByFactory( ByName.class, "login", "NameRule", "32572.1580", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"login\"]", "NameRule", "32572.1582", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@class='_9vtf']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1584", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_9vtf']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1586", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@data-testid='royal_login_form']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1588", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal_login_form']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1590", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@action='/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQzNTg4MjY1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1592", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQzNTg4MjY1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1594", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@method='post']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1596", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@method='post']/div[2]/button[1]", "ParentRule[AttributeRule]", "32572.1598", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@id=\"u_0_2_dp\"]/div[2]/button[1]", "ParentRule[IDRule]", "32572.1600", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"u_0_2_dp\"]/div[2]/button[1]", "ParentRule[IDRule]", "32572.1602", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form/div[2]/button[1]", "ParentRule[TagRule]", "32572.1604", "" ) );


objectMap.put( "32572.1554", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
