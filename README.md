N11 Opportunity Check Automation Project
Project Overview
This project provides an automated test suite specifically designed to verify the display and content of "Opportunity" (Fırsat) messages or badges on product listings and detail pages on the N11 e-commerce website. It automates the process of searching for a product, navigating to its details, and asserting the presence and value of the opportunity message. Developed using Java, Selenium WebDriver, and TestNG, it utilizes the Page Object Model (POM) for structured test code and Log4j for comprehensive logging.

Project Goal
The main objectives of this project are to:

Automate the search for a specific product on the N11 website.

Simulate user interaction by scrolling through product results.

Verify that product images with opportunity indicators are correctly displayed.

Navigate to the product details page of a selected product.

Assert the presence and content (e.g., discount percentage like "30") of the "Opportunity" message on the product details page.

Showcase proficiency in Java, Selenium WebDriver, and TestNG for e-commerce test automation, with a specific focus on validating promotional messages.

Technologies Used
Programming Language: Java

Test Automation Framework: Selenium WebDriver

Testing Framework: TestNG

Logging: Log4j (org.apache.logging.log4j.LogManager)

Design Pattern: Page Object Model (POM)

Setup and Run Instructions
To set up and run this project locally, follow these steps:

Clone the Repository:

git clone https://github.com/BoraSari/N11OpportunityCheckAutomationProject.git
cd N11OpportunityCheckAutomationProject

(Note: Replace BoraSari with your actual GitHub username if different. Adjust the repository name if it's different in your actual GitHub setup.)

Prerequisites:

Ensure Java Development Kit (JDK) 8 or higher is installed.

Have Maven (or Gradle) installed and configured for dependency management.

Download the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) for your browser and ensure it's accessible by your test environment (e.g., via WebDriverManager or system PATH).

Ensure BaseTest class correctly initializes the WebDriver.

Configure Log4j (e.g., log4j2.xml or log4j2.properties in src/main/resources or src/test/resources) for logging output.

Build the Project:

mvn clean install

(If using Gradle, replace mvn commands with gradle commands.)

Run the Tests:
Tests are configured with TestNG priorities. You can run them via a TestNG XML suite or directly from your IDE (e.g., IntelliJ IDEA, Eclipse).

Example testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Product Opportunity Message Test Suite">
    <test name="Opportunity Message Tests">
        <classes>
            <class name="N11OpportunityCheckTest.N11OppurtunityMessageForProductsTest"/>
        </classes>
    </test>
</suite>

Run with Maven:

mvn test -DsuiteXmlFile=testng.xml

Or run directly from your IDE.

Test Coverage and Scenarios
This project covers the following key scenarios for N11's product opportunity messages:

searchProductTest (Priority 1):

Description: Verifies the functionality of searching for a product on the N11 website's main page.

Flow: Navigates to the N11 base URL and then performs a product search using the tabBarPage.searchProduct() method.

checkingImageTest (Priority 2):

Description: Checks for the display of product images on the search results page, particularly after scrolling down to load more content.

Flow: After a product search, the test waits, scrolls down the page, waits again, and then asserts that a product image (presumably one with an opportunity badge) is displayed.

navigateProductTest (Priority 3):

Description: Navigates to the product details page and verifies the presence and content of the opportunity message displayed for the product.

Flow: Clicks on a product from the search results, waits for the product details page to load, asserts that the opportunity message element is displayed, and finally asserts that the message contains the expected text (e.g., "30" for a 30% discount).

Screenshots/GIFs
(Lütfen buraya test yürütmesini, arama sonuçları sayfasını ve ürün bulunamadığında görüntülenen hata mesajlarını gösteren ekran görüntüleri veya GIF'ler ekleyerek projenin işlevselliğini görsel olarak sergileyin.)

License
This project is licensed under the MIT License - see the LICENSE file for details.

N11 Ürünler İçin Fırsat Mesajı Otomasyon Projesi
Projeye Genel Bakış
Bu proje, N11 e-ticaret web sitesindeki ürün listelemeleri ve detay sayfalarındaki "Fırsat" mesajlarının veya rozetlerinin görüntülenmesini ve içeriğini doğrulamak için özel olarak tasarlanmış otomatik bir test paketi sunar. Bir ürün arama, detaylarına gitme ve fırsat mesajının varlığını ve değerini doğrulama sürecini otomatize eder. Java, Selenium WebDriver ve TestNG kullanılarak geliştirilen bu proje, yapılandırılmış test kodu için Page Object Model (POM) ve kapsamlı günlük kaydı için Log4j kullanır.

Proje Amacı
Bu projenin temel hedefleri şunlardır:

N11 web sitesinde belirli bir ürün aramasını otomatikleştirmek.

Ürün sonuçları arasında kaydırma yaparak kullanıcı etkileşimini simüle etmek.

Fırsat göstergeleri olan ürün görsellerinin doğru görüntülendiğini doğrulamak.

Seçilen bir ürünün detay sayfasına gitmek.

Ürün detay sayfasında "Fırsat" mesajının varlığını ve içeriğini (örn: "30" gibi indirim yüzdesi) doğrulamak.

Promosyon mesajlarını doğrulamaya özel odaklanarak e-ticaret test otomasyonu için Java, Selenium WebDriver ve TestNG'deki yetkinliği sergilemek.

Kullanılan Teknolojiler
Programlama Dili: Java

Test Otomasyon Çerçevesi: Selenium WebDriver

Test Çerçevesi: TestNG

Günlük Kaydı: Log4j (org.apache.logging.log4j.LogManager)

Tasarım Deseni: Page Object Model (POM)

Kurulum ve Çalıştırma Talimatları
Bu projeyi yerel olarak kurmak ve çalıştırmak için aşağıdaki adımları izleyin:

Depoyu Klonlayın:

git clone https://github.com/BoraSari/N11OpportunityCheckAutomationProject.git
cd N11OpportunityCheckAutomationProject

(Not: BoraSari yerine gerçek GitHub kullanıcı adınızı yazın. GitHub'daki gerçek kurulumunuz farklıysa depo adını ayarlayın.)

Ön Koşullar:

Java Development Kit (JDK) 8 veya daha yüksek bir sürümün yüklü olduğundan emin olun.

Maven (veya Gradle) yüklü ve bağımlılık yönetimi için yapılandırılmış olmalıdır.

Tarayıcınız için uygun WebDriver'ı (örn: ChromeDriver, GeckoDriver) indirin ve test ortamınız tarafından erişilebilir olduğundan emin olun (örn: WebDriverManager veya sistem PATH aracılığıyla).

BaseTest sınıfının WebDriver'ı doğru bir şekilde başlattığından emin olun.

Günlük kaydı çıktısı için Log4j'yi yapılandırın (örn: src/main/resources veya src/test/resources içinde log4j2.xml veya log4j2.properties).

Projeyi Derleyin:

mvn clean install

(Gradle kullanıyorsanız, mvn komutlarını gradle komutlarıyla değiştirin.)

Testleri Çalıştırın:
Testler TestNG öncelikleriyle yapılandırılmıştır. Testleri bir TestNG XML paketi aracılığıyla veya doğrudan IDE'nizden (örn: IntelliJ IDEA, Eclipse) çalıştırabilirsiniz.

Örnek testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Ürün Fırsat Mesajı Test Paketi">
    <test name="Fırsat Mesajı Testleri">
        <classes>
            <class name="N11OpportunityCheckTest.N11OppurtunityMessageForProductsTest"/>
        </classes>
    </test>
</suite>

Maven ile çalıştırma:

mvn test -DsuiteXmlFile=testng.xml

Veya doğrudan IDE'nizden çalıştırın.

Test Kapsamı ve Senaryoları
Bu proje, N11'in ürün fırsat mesajları için aşağıdaki temel senaryoları kapsar:

searchProductTest (Öncelik 1):

Açıklama: N11 web sitesinin ana sayfasında bir ürün arama işlevselliğini doğrular.

Akış: N11 temel URL'sine gider ve ardından tabBarPage.searchProduct() yöntemini kullanarak bir ürün araması yapar.

checkingImageTest (Öncelik 2):

Açıklama: Arama sonuçları sayfasındaki ürün görsellerinin, özellikle daha fazla içerik yüklemek için aşağı kaydırıldıktan sonra, görüntülendiğini kontrol eder.

Akış: Bir ürün aramasından sonra, test bekler, sayfayı aşağı kaydırır, tekrar bekler ve ardından bir ürün görselinin (muhtemelen bir fırsat rozeti olan) görüntülendiğini doğrular.

navigateProductTest (Öncelik 3):

Açıklama: Ürün detay sayfasına gider ve ürün için görüntülenen fırsat mesajının varlığını ve içeriğini doğrular.

Akış: Arama sonuçlarından bir ürüne tıklar, ürün detay sayfasının yüklenmesini bekler, fırsat mesajı öğesinin görüntülendiğini doğrular ve son olarak mesajın beklenen metni (örn: "30" for a 30% discount) içerdiğini doğrular.

Ekran Görüntüleri/GIF'ler
![image](https://github.com/user-attachments/assets/cb19385b-8e4b-40a7-8bb3-fc4d93682f56)


License
This project is licensed under the MIT License - see the LICENSE file for details.
