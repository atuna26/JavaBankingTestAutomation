Feature: Login

     Scenario: Login on same device already valid credentials
        Given Ziraat Mobil banking app is opened
        When clicks "Giriş Yap" button
        And fills password input
        Then directs account summary screen