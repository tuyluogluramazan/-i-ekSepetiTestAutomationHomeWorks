from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys



class HomePage():
    def __init__(self, driver):
        self.driver = driver
        self.searchBox_css = "*[data-test=\"search-input\"]"


    def login(self, param, param1):
        self.driver.get("https://www.dsdamat.com/")
        self.driver.find_element(By.LINK_TEXT, "Üye Girişi").click()
        self.driver.find_element(By.NAME, "email").send_keys(param)
        self.driver.find_element(By.NAME, "password").send_keys(param1)
        self.driver.find_element(By.ID, "pw-search-input").send_keys("ayakkabı")
        self.driver.find_element(By.ID, "pw-search-input").send_keys(Keys.ENTER)
        self.driver.close()
        pass
