@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {

    //new FirefoxDriver()
    go 'file:///D:/Temp/handson/introWork/introWork_ラジオボタン.html'
    
    //ラジオボタン（あり）押下
    
    
    sleep(1000)
    
    //ラジオボタン（ない）押下
    
    

}